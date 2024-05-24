package com.exchange;

import com.exchange.services.*;

import java.util.Scanner;

public class Main {
    private static CustomerService customerService = new CustomerService();
    private static EmployeeService employeeService = new EmployeeService();
    private static CompanyReserveService reserveService = new CompanyReserveService();
    private static TransactionService transactionService = new TransactionService();
    private static PaymentService paymentService = new PaymentService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Currency Exchange System");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Employee");
            System.out.println("3. Add Company Reserve");
            System.out.println("4. Add Transaction");
            System.out.println("5. Add Payment");
            System.out.println("6. View Customers");
            System.out.println("7. View Employees");
            System.out.println("8. View Reserves");
            System.out.println("9. View Transactions");
            System.out.println("10. View Payments");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addCustomer(scanner);
                    break;
                case 2:
                    addEmployee(scanner);
                    break;
                case 3:
                    addReserve(scanner);
                    break;
                case 4:
                    addTransaction(scanner);
                    break;
                case 5:
                    addPayment(scanner);
                    break;
                case 6:
                    viewCustomers();
                    break;
                case 7:
                    viewEmployees();
                    break;
                case 8:
                    viewReserves();
                    break;
                case 9:
                    viewTransactions();
                    break;
                case 10:
                    viewPayments();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void addCustomer(Scanner scanner) {
        System.out.print("Enter customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter join date: ");
        String joinDate = scanner.nextLine();
        System.out.print("Enter status: ");
        String status = scanner.nextLine();
        System.out.print("Enter visit count: ");
        int visitCount = scanner.nextInt();

        Customer customer = new Customer(customerId, name, email, joinDate, status, visitCount);
        customerService.addCustomer(customer);
        System.out.println("Customer added successfully.");
    }

    private static void addEmployee(Scanner scanner) {
        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter role: ");
        String role = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter hire date: ");
        String hireDate = scanner.nextLine();

        Employee employee = new Employee(employeeId, name, role, email, phone, hireDate);
        employeeService.addEmployee(employee);
        System.out.println("Employee added successfully.");
    }

    private static void addReserve(Scanner scanner) {
        System.out.print("Enter currency ID: ");
        int currencyId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter currency name: ");
        String currencyName = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter last updated: ");
        String lastUpdated = scanner.nextLine();

        CompanyReserve reserve = new CompanyReserve(currencyId, currencyName, amount, lastUpdated);
        reserveService.addReserve(reserve);
        System.out.println("Reserve added successfully.");
    }

    private static void addTransaction(Scanner scanner) {
        System.out.print("Enter transaction ID: ");
        int transactionId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter from currency: ");
        String fromCurrency = scanner.nextLine();
        System.out.print("Enter to currency: ");
        String toCurrency = scanner.nextLine();
        System.out.print("Enter date: ");
        String date = scanner.nextLine();
        System.out.print("Enter status: ");
        String status = scanner.nextLine();
        System.out.print("Enter KYC status: ");
        String kycStatus = scanner.nextLine();

        Transaction transaction = new Transaction(transactionId, customerId, amount, fromCurrency, toCurrency, date, status, kycStatus);
        transactionService.addTransaction(transaction);
        System.out.println("Transaction added successfully.");
    }

    private static void addPayment(Scanner scanner) {
        System.out.print("Enter payment ID: ");
        int paymentId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter transaction ID: ");
        int transactionId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter payment method ID: ");
        int paymentMethodId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter payment date: ");
        String paymentDate = scanner.nextLine();
        System.out.print("Enter status: ");
        String status = scanner.nextLine();

        Payment payment = new Payment(paymentId, transactionId, paymentMethodId, amount, paymentDate, status);
        paymentService.addPayment(payment);
        System.out.println("Payment added successfully.");
    }

    private static void viewCustomers() {
        for (Customer customer : customerService.getAllCustomers()) {
            System.out.println(customer);
        }
    }

    private static void viewEmployees() {
        for (Employee employee : employeeService.getAllEmployees()) {
            System.out.println(employee);
        }
    }

    private static void viewReserves() {
        for (CompanyReserve reserve : reserveService.getAllReserves()) {
            System.out.println(reserve);
        }
    }

    private static void viewTransactions() {
        for (Transaction transaction : transactionService.getAllTransactions()) {
            System.out.println(transaction);
        }
    }

    private static void viewPayments() {
        for (Payment payment : paymentService.getAllPayments()) {
            System.out.println(payment);
        }
    }
}
