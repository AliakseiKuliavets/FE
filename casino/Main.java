package casino;

import casino._21.*;


public class Main {
    public static void main(String[] args) {
        Bankir bankir = new Bankir(10_000, "Bankir");
        Gamer gamer = new Gamer("Gamer",1000,null,0);
        GameManagment gameManagment = new GameManagment(gamer,bankir);
        LogicGame logicGame = new LogicGame();
        logicGame.startGame(gamer,bankir);
    }
}
