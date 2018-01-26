package com.example.demo;//package com.example.fizzbuzz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping("/")
    public String MagicNumber() {


        //Initializing variables

        String display = "";
        double valueCheck;



        Scanner keyboard = new Scanner(System.in); //Invoking scanner function for future user input
        System.out.println("Enter a positive integer greater than 0");
        int userValue = keyboard.nextInt(); // Stores number for problem start

        do {
            valueCheck = userValue % 2;
            if (valueCheck ==0) {
                display = (userValue/2);
            }
            if (valueCheck !=0) {
                display = ((userValue*3) + 1);

            } while (userValue !=1);
        }


        


        return display ; //"numberFizzBuzz" + " " + "numberFizz" + " " + "numberBuzz";
    }
}

