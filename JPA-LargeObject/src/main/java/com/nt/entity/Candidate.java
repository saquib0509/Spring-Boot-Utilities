package com.nt.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "CANDIDATE_DETAILS")
public class Candidate {

	@Id
	@SequenceGenerator(name="gen2", sequenceName = "CID_GEN", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator ="gen2", strategy = GenerationType.SEQUENCE )
	@Column(name = "CANDIDATE_ID")
	private Integer cid;
	@Column(name = "CANDIDATE_NAME")
	private String cname;
	@Column(name="CANDIDATE_AGE")
	private Integer cage;

	@Lob
	private byte[] photo;
	@Lob
	private char[] resume;
	@Column(length = 30)
	private Boolean maritalstatus;
	
}
