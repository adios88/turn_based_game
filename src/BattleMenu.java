import java.sql.SQLOutput;

public class BattleMenu {

    CharacterBaseInterface player;
    public BattleMenu(CharacterBaseInterface player){
        this.player = player;
    }

    void displayBattleMenu(){
        System.out.println("Actions:");
        System.out.println("1. Attack");
        System.out.println("2. Defensive Stance");
        System.out.println("3. Pass");
    }


}
