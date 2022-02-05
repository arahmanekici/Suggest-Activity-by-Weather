import java.util.Scanner;

public class Main {
    static public void main (String  [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the temperate of the air? ");
        int temprerate = input.nextInt();
        if (temprerate<5){
            System.out.println("You might do it Ski");
        }
        if (temprerate>5 && temprerate<15){
            System.out.println("You might go to Cinema");
        }
        if (temprerate>10 && temprerate<25){
            System.out.println("You might go to Picnic");

        }

        else if (temprerate>25)
        {
            System.out.println("You might go to Swimming");
        }
        else if (temprerate>65)
        {
            System.out.println("Helloooo? Are you in the hell?");
        }

    }
}
