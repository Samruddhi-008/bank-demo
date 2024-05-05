package com.bankmanagement.bankdemo;

import java.util.List;

public interface accountservice {
    public String createaccount(accountdetails account);
    public String updateaccount(accountdetails customer);
    public String getaccount(String accountno);
    public String deleteaccount(String accountno);
    public List<accountdetails> getallaccountdetails();


}
