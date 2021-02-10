package se.lexicon;

import se.lexicon.model.Player;
import se.lexicon.util.PlayerCharacter;

import java.util.ArrayList;
import java.util.List;


public class App 
{
    public static void main( String[] args )
    {

        List<Player> players = new ArrayList<>();

        Player kalle = new Player("Kalle", 34,"k@home.se" );
        Player pelle = new Player("Pelle", 44,"p@home.se" );
        Player nisse = new Player("Nisse", 54,"n@home.se" );

        players.add(kalle);
        players.add(pelle);
        players.add(nisse);


        PlayerCharacter.playerSerialize(players, "p");
    }
}
