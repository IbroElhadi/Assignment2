import java.util.Scanner;//import scanner class

public class HiLo {

    private int target;// init target int
    private int tries;// init tries int

    public HiLo() {// HiLo method

        this.target = (int) (Math.random() * 20) + 1;// random number for target number
        this.tries = (int) (Math.random() * 10) + 1;// random number for number of tries
    }

    public void hilo() {// hilo method

        System.out.println(
                "Welcome to the hilo guessing game,you have " + tries + " tries to guess a number between 1-20");// prints
                                                                                                                 // telling
                                                                                                                 // player
                                                                                                                 // what
                                                                                                                 // to
                                                                                                                 // do
                                                                                                                 // and
                                                                                                                 // number
                                                                                                                 // of
                                                                                                                 // tries

        for (int i = 0; i < tries; i++) {// loop that goes untul reaches tries number

            System.out.print("Enter guess " + (i + 1) + (":"));// promps user for number
            Scanner scanner = new Scanner(System.in);// scanner
            int guess = scanner.nextInt();// guess

            if (guess < target) {
                System.out.println("higher");// if guess is smaller than target then player must go higher
            } else if (guess > target) {
                System.out.println("lower");// if guess is bigger than target player must guess smaller
            } else {
                System.out.println("Congrats you got it the number was " + ("") + target);// player got the number
                return;
            }

        }

        System.out.println("you did not guess the number, the number was " + target);// player didnt guess number in
                                                                                     // number of tries

    }
}