package com.exchange;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String joinDate;
    private String status;
    private int visitCount;


    public Customer(int customerId, String name, String email, String joinDate, String status, int visitCount) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.joinDate = joinDate;
        this.status = status;
        this.visitCount = visitCount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", status='" + status + '\'' +
                ", visitCount=" + visitCount +
                '}';
    }
}
