package se.lexicon.util;

import se.lexicon.model.Player;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class PlayerCharacter {
    public static List<Player> playerSerialize(List<Player> input, String path){
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)
        ){
            out.writeObject(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }
}
