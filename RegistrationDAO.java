package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.db.registration.*;


public class RegistrationDAO 
{

    // Method to create a new registration
    public void createRegistration(String name, String email, String dob, String phone) 
    {
        String query = "INSERT INTO registration (Name, Email, DateOfBirth, PhoneNumber) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query))
        {
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, dob);
            stmt.setString(4, phone);
            stmt.executeUpdate();
            System.out.println("Registration created successfully.");
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }

    // Method to read a registration by ID
    public void readRegistration(int id) 
    {
        String query = "SELECT * FROM registration WHERE ID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) 
        {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
            {
                System.out.println("ID: " + rs.getInt("ID"));
                System.out.println("Name: " + rs.getString("Name"));
                System.out.println("Email: " + rs.getString("Email"));
                System.out.println("Date of Birth: " + rs.getDate("DateOfBirth"));
                System.out.println("Phone Number: " + rs.getString("PhoneNumber"));
                System.out.println("Created At: " + rs.getTimestamp("CreatedAt"));
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }

    // Method to update an existing registration's phone number
    public void updateRegistration(int id, String phone)
    {
        String query = "UPDATE registration SET PhoneNumber = ? WHERE ID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) 
        {
            stmt.setString(1, phone);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            System.out.println("Registration updated successfully.");
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }

    // Method to delete a registration by ID
    public void deleteRegistration(int id)
    {
        String query = "DELETE FROM registration WHERE ID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query))
        {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Registration deleted successfully.");
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}
