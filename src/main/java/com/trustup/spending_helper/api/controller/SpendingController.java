package com.trustup.spending_helper.api.controller;

import com.trustup.spending_helper.models.entities.Spending;
import com.trustup.spending_helper.services.SpendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/spending")
@CrossOrigin(origins = "http://localhost:3000")
public class SpendingController {

    @Autowired
    private SpendingService spendingService;

    @GetMapping("")
    public List<Spending> getSpending() {
        return spendingService.getAll();
    }

    @GetMapping("/{id}")
    public Spending getSpendingById(@PathVariable int id) {
        return spendingService.getById(id);
    }

    @GetMapping("/update")
    public Spending updateSpending(@RequestBody Spending spending) {
        return spendingService.update(spending);
    }

    @GetMapping("/delete/{id}")
    public void deleteSpending(@PathVariable int id) {
        spendingService.deleteById(id);
    }

    @GetMapping("/category/{id}")
    public List<Spending> getSpendingByCategory(@PathVariable int id) {
        return spendingService.getSpendingByCategory(id);
    }
}
