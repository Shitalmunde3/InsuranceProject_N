package com.insurance.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Claim;

@Repository
public interface UpdateClaimRepository extends CrudRepository<Claim, Serializable>{

	
}
