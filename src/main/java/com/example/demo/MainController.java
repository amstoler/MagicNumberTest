package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping("/")
    public String MagicNumber(@RequestParam("userValue") int userValue) {


        //Initializing variables

        String display = " ";
        double valueCheck;
        int userValueResult;


       //  Scanner keyboard = new Scanner(System.in); //Invoking scanner function called keyboard for future user input
       //  System.out.println("Enter a positive integer greater than 0");
        // int userValue = keyboard.nextInt(); // Stores number for problem start


        do {
            valueCheck = userValue % 2;

            if (valueCheck == 0) {
                userValueResult = (userValue / 2);
                //System.out.println("A value is " + userValue);
                //display =  userValue + " " + display + " " + userValueResult + " ";
                display += userValue + "<br>";
                System.out.println("Even number display: " + display);
                userValue = userValueResult;
                //System.out.println("A value is" + userValue);

            }

            else if (valueCheck != 0) {
                userValueResult = ((userValue * 3) + 1);
                //System.out.println("A value is " + userValue);
                //display = userValue + " " + display + " " + userValueResult + " ";
                display += userValue + "<br>";
                System.out.println("Odd number display: " + display);
                userValue = userValueResult;
                //System.out.println("B value is" + userValue);

            }


            }while (userValue != 1);

        display += userValue + "<br>";
        //display = "Your webpage prints" + display + userValue;
        System.out.println(display);
        return display;

        }


//        @RequestMapping
//        public int acceptNumber(@RequestParam("number") int number )
//        {
//           /* String userNumber ="";
//            Scanner keyboard = new Scanner (System.in);
//            userNumber = keyboard.nextLine();
//           */
//
//           return number;
//
//
//        }

    }

