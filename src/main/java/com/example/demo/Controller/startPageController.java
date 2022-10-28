package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Model.loginModel;

@Controller
public class startPageController {
    
    @GetMapping("/start") //Start the Project and copy this in your browser:-  http://localhost:8080/start 
    public String startPage(){
        return "startPage";
    }

    @PostMapping("/welcome") //the "/welcome" is mapping should be same written in the JSP page check startPage.jsp Form tag
    public String Welcome(loginModel lm)
    {
        System.out.println("Username : "+ lm.getUsername());
        System.out.println("password : "+ lm.getPassword());
        return "welcome";
    }

    @ResponseBody
    @PostMapping("/senddata") //sending Data using AJAX check Welcome.jsp page
    public String done(@RequestBody String obj){ 
        System.out.println("Object : "+ obj);
        return "Successfull";
    }

    @GetMapping("/done")
    public String done1(){
        return "donePage";
    }
}
