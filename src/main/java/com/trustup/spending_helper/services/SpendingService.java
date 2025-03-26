package com.trustup.spending_helper.services;

import com.trustup.spending_helper.models.entities.Spending;
import com.trustup.spending_helper.repositories.SpendingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpendingService {

    @Autowired
    private SpendingRepository spendingRepository;

    public List<Spending> getAll() {
        return spendingRepository.findAll();
    }

    public Spending getById(int id) {
        return spendingRepository.findById(id).get();
    }

    public Spending save(Spending spending) {
        return spendingRepository.save(spending);
    }

    public void deleteById(int id) {
        spendingRepository.deleteById(id);
    }

    public Spending update(Spending spending) {
        return spendingRepository.save(spending);
    }

    public List<Spending> getSpendingByCategory(int categoryId) {
        return spendingRepository.findByCategory(categoryId);
    }
}
