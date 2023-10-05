import java.util.Scanner;

public class WhatToWear {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // prompt for the weather conditions
        System.out.println("Please input a descriptor of the day: i.e. rainy, sunny, cloudy, snowy");
        String weather = reader.nextLine();
        // to lower to make the user input case insensitive.
        weather = weather.toLowerCase();

        // prompt for and get the average temperature
        System.out.println("Please enter the average temperature for the day: ");
        int temperature = reader.nextInt();

        String isSunny = weather.equals("sunny") ? "Wear some sunscreen if you go outside" : "You probably don't need to wear sunscreen";
        System.out.println(isSunny);


        if (temperature > 40){
            if (weather.equals("rainy")) {
                System.out.println("Wear a thin waterproof if you have too!");
            }
            System.out.println("It is not safe to go outside! stay inside or in shaded areas if you have to go outside");
        }

        if ((temperature < 10) && (weather.equals("rainy") || weather.equals("cloudy") || weather.equals("snowy"))){
            System.out.println("You should probably wear a coat if you go out");
        }
        else if (temperature > 10 && temperature < 20){
            if (weather.equals("rainy")){
                System.out.println("You should wear a waterproof coat!");
            }
            else if (!weather.equals("sunny")){
                System.out.println("The weather is pretty mild, wear regular clothing!");
            }
        }
    }

}
