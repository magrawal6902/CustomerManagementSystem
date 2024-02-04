package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n**** WELCOME TO CUSTOMER MANAGEMENT SYSTEM ****\n");
        do {
            System.out.println("ENTER 1 -> FOR CREATING CUSTOMER \n" +
                    "ENTER 2 -> FOR FETCHING ALL THE CUSTOMERS \n" +
                    "ENTER 3 -> FOR FETCHING CUSTOMER BY ID \n" +
                    "ENTER 4 -> FOR UPDATE CUSTOMER BY ID \n" +
                    "ENTER 5 -> FOR DELETING CUSTOMER BY ID \n" +
                    "ENTER 6 -> FOR EXITING THE PROGRAM");
            System.out.println("---------------------------------------------");
            int n = sc.nextInt();
            System.out.println("---------------------------------------------");
            switch (n) {
                case 1 -> {
                    System.out.println("Enter customer id :");
                    int id = sc.nextInt();
                    System.out.println("Enter customer age :");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter customer name");
                    String name = sc.nextLine();
                    CustomerInfo customer = new CustomerInfo(id, age, name);  //creating object of constructor function customerinfo which is present in customerinfo class
                    try {
                        CustomerDao.createCustomer(customer);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                case 2 -> {
                    CustomerDao.getAllCustomers();
                }
                case 3 -> {
                    System.out.println("Enter id of customer which you have to fetch : ");
                    int id = sc.nextInt();
                    CustomerDao.getCustomerById(id);
                }
                case 4 -> {
                    System.out.println("Enter id of customer whose name you want to update : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter updated name : ");
                    String name = sc.nextLine();
                    CustomerDao.updateCustomerById(id, name);
                }
                case 5 -> {
                    System.out.println("Enter id of customer whom you want to delete : ");
                    int id = sc.nextInt();
                    CustomerDao.deleteCustomerById(id);
                }
                case 6 -> {
                    System.exit(0);
                }
            }
        } while (true);

    }
}
