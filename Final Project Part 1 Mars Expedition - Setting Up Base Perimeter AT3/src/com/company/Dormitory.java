package com.company;

import java.util.Scanner;

public class Dormitory
{
    // Declared public variables.
    public String N;
    public int EC;
    public String C;
    public int T;
    public int NB;
    public int NL;
    public int NS;
    public int CD;
    public String CS;

    // Dormitory constructor.
    public Dormitory(String Name, String Color, int EntryCode, int Temperture, int NumberOfBeds, int NumberOfLavatories, int NumberOfShowers, int ConstructionDuration, String ConstructionStatus)
    {
        // Variables correlating to the proper parameters.
        N = Name;
        C = Color;
        EC = EntryCode;
        T = Temperture;
        NB = NumberOfBeds;
        NL = NumberOfLavatories;
        NS = NumberOfShowers;
        CD = ConstructionDuration;
        CS = ConstructionStatus;
    }

    // DormitoryWaterSystem() method.
    static void DormitoryWaterSystem()
    {
        Scanner userInput = new Scanner(System.in);
        // Declared variables.
        String Water;
        String yes = "yes";
        String no = "no";

        // Ask user if they want to turn on the water.
        System.out.println("Do you want to turn on the dormitory water: ");
        Water = userInput.nextLine();

        // Continue to ask user if they want to trn on water until they don't.
        while(Water.equals(yes))
        {
            // User has turned on the water.
            if (Water.equals(yes))
            {
                System.out.println("* Turning on water... * ");

                // Ask user if they want to continue running water.
                System.out.println("Do you want to continue running water in the dormitory: ");
                Water = userInput.nextLine();

                // User no longer wants to run water.
                if(Water.equals(no))
                {
                    System.out.println("* Water turning off... *");
                }
            }
        }
    }
}