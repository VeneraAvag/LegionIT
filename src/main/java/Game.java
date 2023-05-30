import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game {
    enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static void main(String[] args) {
        writeNumOfPlayersPerTeam(GameType.HOCKEY);
        writeNumOfPlayersPerTeam(GameType.SOCCER);
        writeNumOfPlayersPerTeam(GameType.RUGBY);
    }

    public static void createFile(String fileName) {
        File file = new File(fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error, can't create a new file: ");
            throw new RuntimeException(e);
        }
    }

    public static void writeToFile(String fileName, String numOfPlayers) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(numOfPlayers);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error, can't write: ");
            throw new RuntimeException(e);
        }
    }

    public static void writeNumOfPlayersPerTeam(GameType game){
        try {
            String fileName;
            switch (game) {
                case HOCKEY:
                    fileName = game.HOCKEY.toString();
                    createFile(fileName);
                    writeToFile(fileName, "11");
                    break;
                case SOCCER:
                    fileName = game.SOCCER.toString();
                    createFile(fileName);
                    writeToFile(fileName, "6");
                    break;
                case RUGBY:
                    fileName = game.RUGBY.toString();
                    createFile(fileName);
                    writeToFile(fileName, "15");
                    break;
                default:
                    System.out.println("Other game");
            }
        }
        catch (Exception err) {
            System.out.println("Something bad happened: " + err);
        }
    }
}
