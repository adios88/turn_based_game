public class Tournament {

    Player player = new Player();
    int roundCounter = 0;
    final int ROUNDS = 5;

    CharacterBaseInterface[] opponents = {new Goblin(),new Goblin(),new Goblin(),new Goblin(),new Goblin()};


    public void start(){
        while(player.getHealthPoints()>0&&roundCounter<ROUNDS){
            ++roundCounter;
            startHub(player);
            new Battle(player,opponents[roundCounter]);
        }


    }

    private void startHub(Player player) {
    }


}
