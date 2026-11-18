package Practice_5;

public class Main {
    public static void main(String[] args) {
        GameSettings uno = new GameSettings("UNO", 3);
        GameSettings tennis = new GameSettings("Теннис", 2);

        GameSettings.setMaxPlayers(7);

        uno.addPlayer();

        uno.printGameStatus();
        tennis.printGameStatus();
    }
}
