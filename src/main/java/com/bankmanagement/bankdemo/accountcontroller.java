package com.bankmanagement.bankdemo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accountdetails")
public class accountcontroller {
    accountservice service;
   
    public accountcontroller(accountservice service) {
        this.service = service;
    }
    @GetMapping("{accountno}")//read data for a id from db
    public String getaccountdetails(@PathVariable("accountno")String accountno){
        return service.getaccount(accountno);    
    }
    @GetMapping//reading all the datas from db
    public List<accountdetails>getallaccountdetails(){
        return service.getallaccountdetails();    
    }
    @PostMapping
    public String createaccountdetails(@RequestBody accountdetails account){
         service.createaccount(account);
         return "created successfully";
    }
    @PutMapping
    public String updateaccountdetails(@RequestBody accountdetails account){
        service.updateaccount(account);
        return"updated scuccessfully";
    }
    @DeleteMapping("{accountno}")
    public String deleteaccountdetails(@PathVariable("accountno")String accountno){
        service.deleteaccount(accountno);
        return "success";
    }
}


