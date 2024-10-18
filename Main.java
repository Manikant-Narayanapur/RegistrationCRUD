package com.dao;

import com.dao.RegistrationDAO;

public class Main {
    public static void main(String[] args) {
        RegistrationDAO dao = new RegistrationDAO();

        // Create a registration
        dao.createRegistration("Manikant", "mani@gmail.com", "2000-01-01", "1234567890");

        // Read a registration
        dao.readRegistration(1);

        // Update a registration
        dao.updateRegistration(1, "0987654321");

        // Delete a registration
        dao.deleteRegistration(1);
    }
}

