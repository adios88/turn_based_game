public class CharacterBase implements  CharacterBaseInterface{
    String name;
    int healthPoints;
    int armor;
    int critChance;
    int evasionChance;
    int baseAttackValue;

    @Override
    public int getHealthPoints() {
        return healthPoints;
    }

    @Override
    public int getBaseAttackValue() {
        return baseAttackValue;
    }

    @Override
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = Math.max(0,healthPoints);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public int getEvasion() {
        return evasionChance;
    }

    @Override
    public void setEvasion(int evasionChance) {
        this.evasionChance = evasionChance;
    }

    @Override
    public int getCtritCahnce() {
        return critChance;
    }

    @Override
    public void setCritChance(int critChance) {
        this.critChance = critChance;
    }

    @Override
    public void attackEnemy(CharacterBaseInterface enemy, int damage) {
        enemy.takeDamage(damage);
    }

    @Override
    public void setDefensiveStance() {

    }

    @Override
    public void useAbility(CharacterBaseInterface enemy, AbilityInterface ability) {

    }

    @Override
    public void takeDamage(int damage) {
        setHealthPoints(healthPoints-damage);
    }


}
