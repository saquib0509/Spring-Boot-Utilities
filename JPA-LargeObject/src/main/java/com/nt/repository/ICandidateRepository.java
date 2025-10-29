package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nt.entity.Candidate;

public interface ICandidateRepository extends JpaRepository<Candidate, Long>
{

}
