package com.lendingclub.urlencodingtest;

import org.owasp.esapi.errors.EncodingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.owasp.esapi.ESAPI;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting greeting() {
        System.out.println("==== in greeting constructor====");
        String unencodedUrl = "https://www.w3schools.com/action_page2.php?text=Hello+World";
        String encodedUrl = "notyetencoded";
        try {
            encodedUrl = ESAPI.encoder().encodeForURL(unencodedUrl);
        } catch (EncodingException e) {
            e.printStackTrace();
        }
        System.out.println("unencodedUrl="+unencodedUrl);
        System.out.println("encodedUrl"+encodedUrl);
        return new Greeting(unencodedUrl, encodedUrl);
    }

}