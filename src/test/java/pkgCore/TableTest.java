package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableTest {

	@Test
	public void test() 
	{
		Table table = new Table();
		Player p1 = new Player("Emily", 1);
		Player p2 = new Player("Elliot", 2);
		
		table.AddPlayerToTable(p1);
		table.AddPlayerToTable(p2);
		assertEquals(table.GetPlayerFromTable(p1), p1);
		
		table.RemovePlayerFromTable(p1);
		assertEquals(table.GetPlayerFromTable(p1), null);
		
		table.ClearTable();
		assertEquals(table.GetPlayerFromTable(p2), null);
		
	}

}
