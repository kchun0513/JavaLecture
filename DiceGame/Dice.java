public class Dice{
	
	public static void throwDice() {
		String player1 = DiceTable.inputPlayers();
		String player2 = DiceTable.inputPlayers();
		int d1 = (int)(Math.random()*6)+1;
		int d2 = (int)(Math.random()*6)+1;
		int d3 = (int)(Math.random()*6)+1;
		int d4 = (int)(Math.random()*6)+1;
		DiceTable.resultreader(player1, player2, d1, d2, d3, d4);
		DiceController.Control(player1, player2, d1, d2, d3, d4);
	
	}


}
