package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Politician;

public interface IPoliticianRepository extends JpaRepository<Politician,Integer> {

}
