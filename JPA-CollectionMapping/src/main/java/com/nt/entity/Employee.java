package com.nt.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Table(name="EMPLOYEE_CM")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class Employee {

	@SequenceGenerator(name="gen1", sequenceName = "EMPNO_SEQ", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	@Id
	private Integer empno; //PK
	
	@NonNull
	@Column(length=30)
	private String ename;
	
	@NonNull
	@Column(length=30)
	private String eaddrs;
	
	//3 Collection properties 
	
	@ElementCollection   // Join-> name FK column, it should refrence to -> referencedColumn
	@CollectionTable(name="FRIENDS_INFO", joinColumns = @JoinColumn(name="EMPID_FK", referencedColumnName = "EMPNO")) 
	@NonNull
	@Column(name="FRIENDS")
	private List<String> friends;
	
	@ElementCollection
	@CollectionTable(name="PHONE_INFO", joinColumns = @JoinColumn(name="EMPID_FK", referencedColumnName = "EMPNO")) 
	@Column(name="CONTACT")
	@NonNull
	private Set<Long> phones;
	
	@ElementCollection
	@CollectionTable(name="IDENTITY_INFO", joinColumns = @JoinColumn(name="EMPID_FK", referencedColumnName = "EMPNO")) 
	@Column(name="IDvalue_NUMBER")
	@MapKeyColumn(name="IDkey_NAME")
	@NonNull
	private Map<String, Integer> idDetails;
	
//	Explanation: friends List is saved to another table named FRIENDS_TAB in the Column FRIENDS,
//	that is mapped with Parent table Column EMPNO with FK named EMPID_FK,
//	4 Tables will be created, 1 Parent, 3 Child
	
}
