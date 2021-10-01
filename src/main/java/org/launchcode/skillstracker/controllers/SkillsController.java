package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping("")
    @ResponseBody
    public String intro(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>Solidity</li>" +
                "</ol>";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "listedfavs")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name, String firstfav, String secondfav, String thirdfav) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1><br>" +
                "<ol>" +
                "<li>" + firstfav + "</li>" +
                "<li> " + secondfav + "</li>" +
                "<li>" + thirdfav + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String codeForm(){
        return "<html>" +
                    "<body>" +
                        "<form action = 'listedfavs' method = 'post'>" + // submit a request to /hello
                        "Name: <br>" +
                        "<input type = 'text' name = 'name' ><br>" +
                        "My favorite language: <br>" +
                        "<select name='firstfav'>" +
                            "<option>Java</option>" +
                            "<option>JavaScript</option>" +
                            "<option>Solidity</option>" +
                        "</select><br>" +
                        "My second favorite language: <br>" +
                        "<select name='secondfav'>" +
                            "<option>Java</option>" +
                            "<option>JavaScript</option>" +
                            "<option>Solidity</option>" +
                        "</select><br>" +
                        "My third favorite language: <br>" +
                        "<select name='thirdfav'>" +
                            "<option>Java</option>" +
                            "<option>JavaScript</option>" +
                            "<option>Solidity</option>" +
                        "</select><br>" +
                        "<input type = 'submit' value = 'submit' >" +
                        "</form>" +
                    "</body>" +
                "</html>";

    }
}
