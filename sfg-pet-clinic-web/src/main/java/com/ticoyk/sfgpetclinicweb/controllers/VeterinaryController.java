package com.ticoyk.sfgpetclinicweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/veterinary")
@Controller
public class VeterinaryController {
    
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String index(){
        return "veterinary/index";
    }
}
