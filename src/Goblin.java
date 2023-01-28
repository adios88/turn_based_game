public class Goblin extends CharacterBase {
    int energyPoints;
    public Goblin(){
        this.healthPoints = 100;
        this.armor = 1;
        this.critChance = 10;
        this.evasionChance = 10;
        this.name = "Gobbo";
        this.energyPoints = 100;
        this.baseAttackValue = 10;
    }
    public Goblin(String name, int healthPoints, int armor, int critChance, int evasionChance, int energyPoints, int baseAttakValue){
        this.healthPoints = healthPoints;
        this.armor = armor;
        this.critChance = critChance;
        this.evasionChance = evasionChance;
        this.name = name;
        this.energyPoints = energyPoints;
        this.baseAttackValue = baseAttakValue;
    }



}
