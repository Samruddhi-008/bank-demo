package com.bankmanagement.bankdemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="account_details")
public class accountdetails {
    @Id
    private String accountno;
    private String accountholdername;
    private String accountbalance;
    private String accounttype;
    public accountdetails() {
    }
    public accountdetails(String accountno, String accountholdername, String accountbalance, String accounttype) {
        this.accountno = accountno;
        this.accountholdername = accountholdername;
        this.accountbalance = accountbalance;
        this.accounttype = accounttype;
    }
    public String getAccountno() {
        return accountno;
    }
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }
    public String getAccountholdername() {
        return accountholdername;
    }
    public void setAccountholdername(String accountholdername) {
        this.accountholdername = accountholdername;
    }
    public String getAccountbalance() {
        return accountbalance;
    }
    public void setAccountbalance(String accountbalance) {
        this.accountbalance = accountbalance;
    }
    public String getAccounttype() {
        return accounttype;
    }
    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }   
}
