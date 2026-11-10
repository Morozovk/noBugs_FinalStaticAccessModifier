package Practice_5;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(int maxPlayers, String gameName, int currentPlayers){
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayers(int newMaxPlayers){
        GameSettings.maxPlayers = newMaxPlayers;
    }

    void addPlayer(){
        currentPlayers++;
    }

    void printGameStatus(){
        System.out.println("Название: " + gameName + ", количество игроков: " + currentPlayers +
                ", максимальное количество игроков " + maxPlayers);
    }
}
