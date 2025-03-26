package com.trustup.spending_helper.repositories;

import com.trustup.spending_helper.models.entities.Spending;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SpendingRepository extends JpaRepository<Spending, Integer> {
    @Query("select s from Spending s where s.category.id = ?1")
    List<Spending> findByCategory(Integer id);
}