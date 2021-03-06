package pkgCore;
import pkgEnum.eGameType;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

// oops I called this GamePlayer instead of GamePlay
public class GamePlayerTest {

	@Test
	public void test() {
				
		Player p1 = new Player("Emily", 1);
		Player p2 = new Player("Elliot", 2);
		Table t = new Table();
		t.AddPlayerToTable(p1);
		t.AddPlayerToTable(p2);
		
		ArrayList<Player> playerArray = new ArrayList<>();
		playerArray.add(p1);
		playerArray.add(p2);
		
		// This line doesn't work and idk why
		GamePlayBlackJack gpbj = new GamePlayBlackJack(t);
		
		gpbj.AddPlayersToGame(playerArray);
		
		assertEquals(gpbj.GetPlayerInGame(p1), p1); 
		
		gpbj.RemovePlayerFromGame(p1);
		assertEquals(gpbj.GetPlayerInGame(p1), null);
	}

}
