package com.company;

import java.util.Scanner;

public class Storage
{
    // Declared public variables.
    public String N;
    public int EC;
    public String C;
    public int T;
    public int CA;
    public int CD;
    public String CS;

    // Storage constructor.
    public Storage(String Name, String Color, int EntryCode, int Temperature, int Capacity, int ConstructionDuration, String ConstructionStatus)
    {
        // Variables correlating to the proper parameters.
        N = Name;
        C = Color;
        EC = EntryCode;
        T = Temperature;
        CA = Capacity;
        CD = ConstructionDuration;
        CS = ConstructionStatus;
    }

    // Humidity() method.
    static void Humidity()
    {
        Scanner userHumidityChangeInput = new Scanner(System.in);
        Scanner userHumidityInput = new Scanner(System.in);
        Scanner userHumidityNumber = new Scanner(System.in);
        // Declared variables.
        int CurrentHumidity = 60;
        int HumidityNumberChange;
        String Humidity;
        String HumidityChange;
        String yesChangeHumidity = "yes";

        // Show user current humidity.
        System.out.println("\t - Current Humidity: " + CurrentHumidity + "%");

        // Ask user if they want to change the humidity.
        System.out.println("Would you like to change the humidity: ");
        Humidity = userHumidityInput.nextLine();

        // Continue to ask user to change humidity until they don't.
        while(Humidity.equals(yesChangeHumidity))
        {
            // User wanted to change humidity.
            if (Humidity.equals(yesChangeHumidity))
            {
                // Ask user if they want to increase or decrease humidity.
                System.out.println(" * Type exit to not change the humidity * ");
                System.out.println("Would you like to increase or decrease the humidity: ");
                HumidityChange = userHumidityChangeInput.nextLine();

                // Switch to create a multitude of scenarios.
                switch(HumidityChange)
                {
                    // User typed increase and wants to increase the humidity.
                    case "increase":
                        // Ask user how much of an increase.
                        System.out.println("By how much would you like to increase humidity: ");
                        HumidityNumberChange = userHumidityNumber.nextInt();

                        // If user types a number less than 100 then humidity changes.
                        if(HumidityNumberChange < 100)
                        {
                            System.out.println(" * Increasing humidity * ");
                            // New humidity value.
                            System.out.println("\t - Current Humidity: " + (CurrentHumidity + HumidityNumberChange) + "%");
                        }
                        // User entered a umber less than 100 so no humidity change.
                        else
                        {
                            System.out.println(" * You have inputted an illogical number * ");
                        }
                        break;
                    // User typed decrease and wants to decrease the humidity.
                    case "decrease":
                        // Ask user how much of a decrease.
                        System.out.println("By how much would you like to decrease humidity: ");
                        HumidityNumberChange = userHumidityNumber.nextInt();

                        // If user types a number less than 100 then humidity changes.
                        if(HumidityNumberChange < 100)
                        {
                            System.out.println(" * Decreasing humidity * ");
                            // New humidity value.
                            System.out.println("\t - Current Humidity: " + (CurrentHumidity - HumidityNumberChange) + "%");
                        }
                        // User entered a umber less than 100 so no humidity change.
                        else
                        {
                            System.out.println(" * You have inputted an illogical number * ");
                        }
                        break;
                    // User does not want to adjust the humidity.
                    case "exit":
                        System.out.println("* Not changing humidity *");
                        return;
                }
            }
        }
    }
}
