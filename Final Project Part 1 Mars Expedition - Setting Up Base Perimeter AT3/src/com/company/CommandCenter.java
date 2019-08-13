package com.company;

import java.util.Scanner;

public class CommandCenter
{
    // Declared public variables.
    public String N;
    public int EC;
    public String C;
    public int CD;
    public String CS;
    public int T;

    // Command Center constructor.
    public CommandCenter(String Name, String Color, int EntryCode, int Temperture, int ConstructionDuration, String ConstructionStatus)
    {
        // Variables correlating to the proper parameter.
        N = Name;
        C = Color;
        EC = EntryCode;
        T = Temperture;
        CD = ConstructionDuration;
        CS = ConstructionStatus;
    }

    // CommStatus() method.
    static void CommStatus()
    {
        Scanner userCommandCenterSecurityInput = new Scanner(System.in);
        Scanner userCommandCenterStatusInput = new Scanner (System.in);
        // Declared variables.
        String CommandCenterStatus;
        String yesCommandCenterOpen = "yes";
        int CommandCenterSecurityLevel;
        // Side Note: Captain order number = 501

        // Ask user if they want to open command center.
        System.out.println("Would you like to open the command center: ");
        CommandCenterStatus =  userCommandCenterStatusInput.nextLine();

        // User wants to open the command center.
        if(CommandCenterStatus.equals(yesCommandCenterOpen))
        {
            // Ask user for the captain order number.
            System.out.println("Please enter the captain order number: ");
            CommandCenterSecurityLevel = userCommandCenterSecurityInput.nextInt();

            // User put the correct number.
            if(CommandCenterSecurityLevel == 501)
            {
                // Command center opened.
                System.out.println("* [ACCESS GRANTED] * ");
                System.out.println("* Command Center Opened * ");
            }
            // User did not put the correct number.
            else if(CommandCenterSecurityLevel != 501)
            {
                // Command center not opened.
                System.out.println("* [ACCESS DENIED] * ");
            }
        }
    }
}