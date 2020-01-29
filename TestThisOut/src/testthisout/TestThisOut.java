package testthisout;

import java.util.Scanner;
public class TestThisOut
{
                public static void main(String[] args)
                {
                                Scanner keyboard = new Scanner(System.in);
                                //input variables
                                int space, length;
                                char firstInitial, lastInitial;
                                String initials, firstName, lastName, fullName;
                                System.out.println("Enter your first and last name: ");
                                fullName = keyboard.nextLine();

                                space = fullName.indexOf(" ");
                                firstName = fullName.substring(0, space);
                                lastName = fullName.substring(space + 1);
                                firstInitial = firstName.charAt(0);
                                lastInitial = lastName.charAt(0);
                                initials = "" + firstInitial + lastInitial;
                                length = fullName.length();
                                
                                System.out.println("\nFull Name: " + fullName);
                                System.out.println("Initials: " + initials);
                                System.out.println("Length of Name: " + length);
                                System.exit(0);
                }
}