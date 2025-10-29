package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="Table_politician")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Politician {
	
	@Id
	@Column(name = "PID")
//	@SequenceGenerator(initialValue = 100, allocationSize = 1, name = "seq")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NonNull
	@Column(name="PNAME", length = 30)
	private String name;
	
	@NonNull
	@Column(name="PAREA", length = 30)
	private String area;
	
	@NonNull
	@Column(name="PINCOME")
	private Double income;
	
	@NonNull
	@Column(name="PPARTY", length=30)
	private String party;
	
	@NonNull
	@Column(name = "PCATEGORY", length =20)
	private String category;
	
	@Transient
	@NonNull
	@Column(name = "SEATS")
	private Integer seats;
}
