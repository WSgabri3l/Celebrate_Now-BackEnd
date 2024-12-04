package com.celebrate.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.celebrate.backend.models.Budget;

@Repository
public interface BudgetRepository extends JpaRepository<Budget,Integer> {

    
} 
