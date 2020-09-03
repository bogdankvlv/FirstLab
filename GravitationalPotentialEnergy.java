/*
 * @author Bogdan Kovalov
 * @since 2/17/2020
 * @version 1.0
 * 
**/

 
package gravitationalpotentialenergy;

//Importing a scanner that is used later in the program
import java.util.Scanner;
//Importing a PrintStream class
import java.io.PrintStream;

public class GravitationalPotentialEnergy {

    public static void promptUser() {
        System.out.print("Please enter the planet name in which ");
        System.out.print("you want to find the gravitational ");
        System.out.print("potential energy.");
        System.out.println("Enter STOP if you want to stop");
    } // end method promptUser

    public static void main(String[] args) throws Exception {

        //Declaration of variables
        String planetName;
        double planetMass, distanceFromSun, gravitationalEnergy;
        final double gravitationalConstant = (-6.67e-11);
        final double sunMass = (1.989e+30);

        // Declaration of a scanner 
        Scanner sc = new Scanner(System.in);

        // Object which sends output to the results.txt file
        PrintStream pe = new PrintStream("results.txt");

        //Calls for the promptUser method 
        promptUser();

        planetName = sc.nextLine();

        // While loop checks if the user didn't enter "STOP"
        // If not then the user will be prompted with the statements
        while (!planetName.equals("STOP")) {

            System.out.println("Please enter your planet's mass."
                    + " Please provide your input"
                    + " in exponential form such as 1.789e+33");
            planetMass = sc.nextDouble();

            System.out.println("Please enter your planet's distance from"
                    + " the sun. Please provide your input"
                    + " in exponential form such as 1.789e+33");

            distanceFromSun = sc.nextDouble();

            // formula which calculates gravitational energy
            gravitationalEnergy = (((gravitationalConstant) * planetMass
                    * sunMass)) / (distanceFromSun);

            pe.printf("THE GRAVITATIONAL POTENTIAL ENERGY BETWEEN %S"
                    + " AND THE SUN, AT"
                    + " A\nDISTANCE OF %.3e METERS IS %.3e N M^2/Kg^2%n%n",
                    planetName, distanceFromSun, gravitationalEnergy);

            // Calls for the promptUser method 
            promptUser();

            // Grabs the users input of the planet name 
            planetName = sc.next();

        } // end while loop

    } // end main class
}   // end class GravitationalPotentialEnergy
