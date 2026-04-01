package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Csecontroller {
   @GetMapping("/home")
   public String dispo() {
	   return "WeLCOME TO OPENSHIFT DEPLOYMENT";
   }
}
