package com.example.testcustomer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerService {
    @GetMapping("/mypage")
    public String mypage(){
        return "result";
    }
}
