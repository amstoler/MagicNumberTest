package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping("/")
    public String MagicNumber() {


        //Initializing variables

        String display = " ";
        double valueCheck;
        int userValueResult;


        Scanner keyboard = new Scanner(System.in); //Invoking scanner function called keyboard for future user input
        System.out.println("Enter a positive integer greater than 0");
        int userValue = keyboard.nextInt(); // Stores number for problem start

        do {
            valueCheck = userValue % 2;

            if (valueCheck == 0) {
                userValueResult = (userValue / 2);
                display = userValue + " " + display + " " + userValueResult + " ";
                userValue = userValueResult;

            }

            if (valueCheck != 0) {
                userValueResult = ((userValue * 3) + 1);
                display = userValue + " " + display + " " + userValueResult + " ";
                userValue = userValueResult;
            }


            }while (userValue != 1);

        //display = "Your webpage prints" + display + userValue;
        System.out.println(display);
        return display;

        }

    }

