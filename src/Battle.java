import java.util.Scanner;

public class Battle {

    CharacterBaseInterface player;
    CharacterBaseInterface opponent;

    BattleMenu battleMenu;
    Scanner scanner;

    public Battle(CharacterBaseInterface player, CharacterBaseInterface opponent){

        this.player = player;
        this.opponent = opponent;
        this.battleMenu = new BattleMenu(player);
        this.scanner = new Scanner(System.in);

    }


    void startBattle(){
       int userInput;
        do{

            battleMenu.displayBattleMenu();
            userInput = scanner.nextInt();
            switch (userInput){
                case 1:
                    System.out.println("Player attacks the opponent.");
                    player.attackEnemy(opponent, player.getBaseAttackValue());
                    System.out.println("Opponent has " + opponent.getHealthPoints() + " left.");
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println(player.getName()+" passes...");
                    break;
                default:
                    break;
            }
        }
        while(player.getHealthPoints()>0&&opponent.getHealthPoints()>0);
    }

}
