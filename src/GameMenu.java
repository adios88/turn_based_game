import java.util.Scanner;

public class GameMenu {

    Scanner scanner = new Scanner(System.in);

    void displayIntro(){

        System.out.println("===WELCOME TO EPIC FIGHTER!===");
        System.out.println("press any button to continue...");

        scanner.nextLine();

    }
    void displayMenu(){


        System.out.println("===MENU===");
        System.out.println("PRESS \"1\" TO START GAME");
        System.out.println("PRESS \"2\" TO QUIT");

    }

}
