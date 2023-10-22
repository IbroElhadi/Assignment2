import java.util.Scanner;//import scanner class

public class Diamond { // class diamond

    static void draw() {// method draw
        System.out.println("What is your desired height of diamond");
        Scanner scanner = new Scanner(System.in);// scanner

        int height = scanner.nextInt();// declare height with scanner
        String fill = "";// This is what prints the *
        String filler = "";// Thios is what prints a space between astericks

        for (int i = 1; i <= height; i += 2) {// this is a forever loop that goes until height , i is 1 instead of zero
                                              // as when the person picks something it will print a astericks = to the
                                              // number of loop so if player picks height of 1 it dosnt fail, then the
                                              // code continues going till it reaches height and i add 2 as with
                                              // experimenting I noticed it works better to add 2 astericks on each side
                                              // then just 1
            filler = " ".repeat((height - i) / 2);// this calculates number of spaces needed.It repeats the amount of
                                                  // time by just incrementing height as the height incrases less spaces
                                                  // are used and you divide by 2.
            fill = "*".repeat(i);// it prints the astericks that are equal to the number of loop its in

            if (fill != "") {
                System.out.println(filler + fill);// this prints the string as needed
            }
        }

        for (int i = height - 2; i > 0; i -= 2) {// this is just a invert of the previous segement however this time it
                                                 // counts down by 2 instead of up by 2
            filler = " ".repeat((height - i) / 2);
            fill = "*".repeat(i);

            if (fill != "") {
                System.out.println(filler + fill);
            }
        }
    }
}
// me and curtis giberson worked on this code side by side, he was the pioneer
// of the diamond creation code with math, i ironed out the code, used forever
// instead of whiles, and fixed a bug often seen in the creation of the diamond