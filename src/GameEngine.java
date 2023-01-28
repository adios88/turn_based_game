import java.util.Scanner;

public class GameEngine {
    GameMenu gameMenu = new GameMenu();
    Scanner scanner = new Scanner(System.in);

    Battle battle = new Battle(new Goblin(),new Goblin());
    void runGame(){
        gameMenu.displayIntro();
        String userInput = getUserInput();
        switch(userInput){

            case "1":
                battle.startBattle();
                break;
            case "2":
                System.out.println("See you next time!");
                break;
            default:
                break;

        }
    }

    String getUserInput(){
        boolean incorrectInput;
        String userInput;

        do{

            gameMenu.displayMenu();
            userInput = scanner.next();
            incorrectInput = !userInput.equals("1") && !userInput.equals("2");

            if(incorrectInput){
                System.out.println("Please enter the correct value!");
            }
        }
        while(incorrectInput);
        return userInput;
    }



}
