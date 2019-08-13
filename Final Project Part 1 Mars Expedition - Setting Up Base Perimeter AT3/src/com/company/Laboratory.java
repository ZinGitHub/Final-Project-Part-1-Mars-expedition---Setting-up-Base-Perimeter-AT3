package com.company;

import java.util.Scanner;

public class Laboratory
{
    // Declared public variables.
    public String N;
    public int EC;
    public String C;
    public int T;
    public int CD;
    public String CS;

    // Laboratory constructor.
    public Laboratory(String Name, String Color, int EntryCode, int Temperture, int ConstructionDuration, String ConstructionStatus)
    {
        // Variables correlating to the proper parameters.
        N = Name;
        C = Color;
        EC = EntryCode;
        T = Temperture;
        CD = ConstructionDuration;
        CS = ConstructionStatus;
    }

    // LaboratorySecurityStatusSystem() method.
    static void LaboratorySecurityStatusSystem()
    {
        Scanner userSecurityLevelInput = new Scanner(System.in);
        Scanner userLaboratoryStatusInput = new Scanner(System.in);
        // Declared variables.
        Boolean LaboratoryOpenOrClose1;
        Boolean LaboratoryOpenOrClose2;
        String LaboratoryStatus;
        String yesLaboratoryOpen = "yes";
        int LaboratorySecurityLevel;

        // Ask user if they want to open laboratory.
        System.out.println("Would you like to open the laboratory: ");
        LaboratoryStatus = userLaboratoryStatusInput.nextLine();

        // Continue to ask user if they want to open laboratory until they don't.
        while (LaboratoryStatus.equals(yesLaboratoryOpen))
        {
            // User wants to open the laboratory.
            if (LaboratoryStatus.equals(yesLaboratoryOpen))
            {
                // Ask user input their security level.
                System.out.println("Please enter your security level (1,2,3): ");
                System.out.println("* Enter 4 to exit the laboratory access menu * ");
                LaboratorySecurityLevel = userSecurityLevelInput.nextInt();

                // Switch to create a multitude of scenarios.
                switch(LaboratorySecurityLevel)
                {
                    // User typed 1 and is granted full access of the laboratory.
                    case 1:
                        LaboratoryOpenOrClose1 = true;
                        System.out.println(" * Welcome to the Laboratory *");
                        System.out.println("\t- Levi (Captain)");
                        System.out.println("\t- Nile (Scientist)");
                        System.out.println("Is Laboratory opened with full access: " + LaboratoryOpenOrClose1);
                        break;
                    // User typed 2 and is granted partial access of the laboratory.
                    case 2:
                        LaboratoryOpenOrClose2 = true;
                        System.out.println(" * Welcome to the Laboratory *");
                        System.out.println("\t- Jenny (Doctor)");
                        System.out.println("Is Laboratory opened with partial access: " + LaboratoryOpenOrClose2);
                        break;
                    // User typed 3 and has no access to the laboratory.
                    case 3:
                        LaboratoryOpenOrClose1 = false;
                        System.out.println(" * Welcome to the Laboratory *");
                        System.out.println("\t- Siraj (Engineer)");
                        System.out.println("\t- Tom (Soldier)");
                        System.out.println("Is Laboratory the laboratory opened: " + LaboratoryOpenOrClose1);
                        break;
                    // User typed 4 and did'nt want to bother with the laboratory.
                    case 4:
                        System.out.println("* Not opening laboratory *");
                        return;
                }
            }
        }
    }
}