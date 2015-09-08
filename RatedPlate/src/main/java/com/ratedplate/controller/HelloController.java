package com.ratedplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SteveGreen on 01/05/15.
 */

@Controller
public class HelloController {

    //the request mapping simply says, what url am i tied to?
    @RequestMapping(value = "/greeting") //defines the url and the method it is tied to
    public String sayHello(Model model){ //model is a key-value pair.

        List<String> stringList = new ArrayList<String>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");

        model.addAttribute("greeting", "Hello, World"); //greeting is key, value hello world
        //the jsp page will reference back to 'greeting' as above.
        model.addAttribute("stringList", stringList);
        model.addAttribute("stringlist2", "stringlist2");

        return "index";//this ties us to the jsp pages
    }


}
