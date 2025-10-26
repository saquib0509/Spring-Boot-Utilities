package com.nt.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "BANK_ACC_DETAILS")
public class BankAccount {

	@Id
	@SequenceGenerator(name="gen1", sequenceName = "ACNO_GEN", initialValue = 1000000, allocationSize = 1)
	@GeneratedValue(generator ="gen1", strategy = GenerationType.SEQUENCE )
	@Column(name = "ACCOUNT_NO")
	public Long accno;
	@Column(name = "HOLDER_NAME")
	public String holdername;
	@Column(name="ACCOUNT_BALANCE")
	public Double balance;
}
