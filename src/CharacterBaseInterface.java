public interface CharacterBaseInterface {

    int getHealthPoints();

    int getBaseAttackValue();
    void setHealthPoints(int healthPoints);

    String getName();

    int getArmor();
    void setArmor(int armor);
    int getEvasion();
    void setEvasion(int evasionChance);

    int getCtritCahnce();
    void setCritChance(int critChance);

    void attackEnemy(CharacterBaseInterface enemy, int damage);
    void setDefensiveStance();

    void useAbility(CharacterBaseInterface enemy, AbilityInterface ability);

    void takeDamage(int damage);
}
