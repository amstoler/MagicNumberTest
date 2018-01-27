package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping("/")
    public String MagicNumber(@RequestParam("userValue") int userValue) {


        String display = " ";
        double valueCheck;
        int userValueResult;
        String message_First = " ";

        // Next 3 lines used in Part 1 of Magic Number pattern. User is entering to console.
        //  Scanner keyboard = new Scanner(System.in); //Invoking scanner function called keyboard for future user input
        //  System.out.println("Enter a positive integer greater than 0");
        // int userValue = keyboard.nextInt(); // Stores number for problem start

        message_First = "Your web page prints:" + "<br>" + "Starting Number:" + userValue + "<br>" + "<br>";


        do {
            valueCheck = userValue % 2;

            if (valueCheck == 0) {
                userValueResult = (userValue / 2);
                display += userValue + "<br>";
                userValue = userValueResult;

            } else if (valueCheck != 0) {
                userValueResult = ((userValue * 3) + 1);
                display += userValue + "<br>";
                userValue = userValueResult;


            }


        } while (userValue != 1);

        display += userValue + "<br>";

        return message_First + display;

    }
}




