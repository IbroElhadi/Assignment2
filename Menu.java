import java.util.Scanner;// import scanner class

public class Menu {

    String[] menu = { "Calculate the Average", "Schedule Check", "Hi-Lo Guessing Game", "Draw a Diamond",
            "Competition Database", "Journal", "Exit program" }; // 2 string declare (Competition databsae is custom
                                                                 // program)

    public void display() { // method display

        System.out.println("Please choose one of the following options:"); // prints
        for (int i = 0; i < 7; i++) { // loop goes through string

            System.out.println((i + 1) + (". ") + menu[i]); // it prints i+1 and the corresponding string
        }
    }

    public void choice() {// method choice

        Scanner scanner = new Scanner(System.in); // scanenr that waits for the choice of the player
        int choice = scanner.nextInt(); // choice = result of scanner

        if (choice == 1) {
            Average.average(); // If the player picks option corresponding to 1 the method average runs is
                               // class Average
        } else if (choice == 2) {

            Schedule schedule1 = new Schedule(18, 10, 2023, "1:20pm - 8:00pm", "Finish Schedule code"); // declares
                                                                                                        // object string
                                                                                                        // for day
            // and occasion
            Schedule schedule2 = new Schedule(23, 10, 2023, "6:02am - 6:02pm", "Mole day, and submit computer science");// declares
                                                                                                                        // object
            // string for day
            // and occasion

            System.out.println("What day would you like to acces?" + (" 1.") + schedule1.day + ("/") + schedule1.month
                    + (" 2.") + schedule2.day + ("/") + schedule2.month);// asks the user which day they want to acess
            Scanner scanner3 = new Scanner(System.in); // scanenr that waits for the choice of the player
            int choice3 = scanner3.nextInt(); // choice = result of scanner

            if (choice3 == 1) {
                System.out.println(("On ") + schedule1.day + ", " + schedule1.month + ", " + schedule1.year + (", ")
                        + ("you have ") + schedule1.occasion);// prints the schedule for the day chosen
            } else if (choice3 == 2) {
                System.out.println(("On ") + schedule2.day + ", " + schedule2.month + ", " + schedule2.year + (", ")
                        + ("you have ") + schedule2.occasion);// prints the schedule for the day chosen
            } else {
                System.out.println("Invalid Input");// fail safe
                return;// end code
            }

        } else if (choice == 3) {
            HiLo game = new HiLo();// creates object in HiLo
            game.hilo();// If the player picks option corresponding to 3 the method hilo runs is class
                        // HiLo
        } else if (choice == 4) {
            Diamond.draw();// If the player picks option corresponding to 4 the method draw runs is class
                           // diamond
        } else if (choice == 5) {

            while (true) {
                int choice4;

                System.out.println("1:Enter results \n2:Read entries so far \n3:End Program");
                Scanner scanner6 = new Scanner(System.in); // scanner object
                choice4 = scanner6.nextInt();// choice4 = scanner

                if (choice4 == 1) { // if player chooses to enter resu;t
                    Scanner scanner9 = new Scanner(System.in); // new scanner
                    System.out.println("Enter Compettitor's name: ");// prompting name
                    String name = scanner9.nextLine();// result of scanner is name
                    System.out.println("Enter Compettitor's result: ");// prompting result
                    double result = scanner9.nextDouble();// result of scanner is result
                    Competition.database(name, result);// contructer
                } else if (choice4 == 2) {
                    for (String[] compettitor : Competition.compettitors) {// forever till it listed all compettiots
                                                                           // from list
                        System.out.println(compettitor[0] + "," + compettitor[1]);// add competitior list add compettot
                                                                                  // infomration(from constructer)
                    }
                } else if (choice4 == 3) { // end
                    System.out.println("End");
                    break;
                } else {// inavlid failsafe
                    System.out.println("Invalid input");
                }
            }
        } else if (choice == 6) {
            while (true) {// repeat till break
                int choic;// declare choic

                System.out.println("1:Create Entry \n2:Read Entries \n3:End Program");// prompt
                Scanner scanner12 = new Scanner(System.in); // scanner object
                choic = scanner12.nextInt();// choice is scanner

                if (choic == 1) { // if player chooses create
                    Scanner entry = new Scanner(System.in); // scanner
                    System.out.println("enter entry title:");// prompt
                    String title = entry.nextLine();// title = scanner
                    System.out.println("enter entry content:");// prompt
                    String content = entry.nextLine();// content is result of scanner
                    Journal.Entry(title, content);// constructer
                } else if (choic == 2) {// if player picks read
                    System.out.println("Entry Name: " + Journal.Title); // print entries and title
                    System.out.println("Entry Content: " + Journal.Content); // print content
                } else if (choic == 3) {
                    System.out.println("End");
                    break;
                } else {
                    System.out.println("Invalid input");
                }
            }
        } else if (choice == 7) {
            System.out.println("Exit program");// just to let player know why program ended
            return;// end program
        } else {
            System.out.println("Invalid Input"); // if non of the above player did not give valid imput (Failsafe)
            return;// end
        }
    }
}
