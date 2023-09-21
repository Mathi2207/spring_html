package com.example.demo.controller;

import java.util.List;
import com.example.demo.model.Branch;
import com.example.demo.model.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class BankController {

	    @GetMapping("/branches")
	    public String getBranches() {
	    	 // Get the list of branches from the database
	        List<Branch> branches = entityManager.createQuery("SELECT b FROM Branch b", Branch.class).getResultList();

	        // Create an HTML table to display the branches
	        String table = "<table>";
	        table += "<tr><th>Branch Name</th><th>Address</th></tr>";
	        for (Branch branch : branches) {
	            table += "<tr><td>" + branch.getName() + "</td><td>" + branch.getAddress() + "</td></tr>";
	        }
	        table += "</table>";

	        // Return the HTML table
	        return table;
	    }

	    @GetMapping("/services")
	    public String getServices() {
	        // Get the list of services from a database or other source
	        List<Service> Service = entityManager.createQuery("SELECT b FROM Branch b", Service.class).getResultList();

	        // Create an HTML table to display the services
	        String table = "<table>";
	        table += "<tr><th>Service Name</th><th>Description</th></tr>";
	        for (Service service : services) {
	            table += "<tr><td>" + service.getName() + "</td><td>" + service.getDescription() + "</td></tr>";
	        }
	        table += "</table>";

	        // Return the HTML table
	        return table;
	    }
	}

