package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void shouldTestSituationWhenFirstPlayerWin(){
        Player player1 = new Player(1, "Dylan", 100);
        Player player2 = new Player(1, "Robert", 80);
        Game game = new Game();

        game.register(player1);
        game.register(player2);

        int expected = game.round("Dylan", "Robert");
        int actual = 1;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestSituationWhenSecondPlayerWin(){
        Player player1 = new Player(1, "Dylan", 70);
        Player player2 = new Player(1, "Robert", 80);
        Game game = new Game();

        game.register(player1);
        game.register(player2);

        int expected = game.round("Dylan", "Robert");
        int actual = 2;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestSituationWhenPlayersEqual(){
        Player player1 = new Player(1, "Dylan", 100);
        Player player2 = new Player(1, "Robert", 100);
        Game game = new Game();

        game.register(player1);
        game.register(player2);

        int expected = game.round("Dylan", "Robert");
        int actual = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestSituationWhenFirstPlayersNotRegistered(){
        Player player1 = new Player(1, "Dylan", 100);
        Player player2 = new Player(1, "Robert", 100);
        Game game = new Game();

        game.register(player1);
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Din", "Robert"));
    }
    @Test
    public void shouldTestSituationWhenSecondPlayersNotRegistered(){
        Player player1 = new Player(1, "Dylan", 100);
        Player player2 = new Player(1, "Robert", 100);
        Game game = new Game();

        game.register(player1);
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Dylan", "Ric"));
    }
}
