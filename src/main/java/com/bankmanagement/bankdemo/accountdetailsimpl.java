package com.bankmanagement.bankdemo;

import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class accountdetailsimpl implements accountservice {
    accountdetailsrepo repo;
    public accountdetailsimpl(accountdetailsrepo repo) {
        this.repo = repo;
    }

    @Override
    public String createaccount(accountdetails account) {
        repo.save(account);
        return "success";
    }

    @Override
    public String updateaccount(accountdetails account) {
        repo.save(account);
        return "success";
    }

    @Override
    public String getaccount(String accountno) {
        repo.findById(accountno);
        return "success";
        
    }

    @Override
    public String deleteaccount(String accountno) {
        repo.deleteById(accountno);
        return "success";
    }

    

    @Override
    public List<accountdetails> getallaccountdetails() {
        
        return repo.findAll();
        
    }

    

    
}



