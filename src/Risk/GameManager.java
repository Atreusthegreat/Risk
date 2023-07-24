package Risk;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GameManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private boolean canReinforce;
	private boolean canAttack;
	private boolean canFortify;
	private boolean deployPhase;
	private boolean deployed;
	
	private int current;
	private int repeat;
	private int playerCount;
	private int playerIndex;
	private int deployTurn;
	private int noArmiesCount;
	private int turnInCount;
	private int armies;
	private int attackerArmies;
	private int defenderArmies;
	private int attackerLosses;
	private int defenderLosses;
	private int attackerDice;
	private int defenderDice;
	
	private int[] attackerRolls;
	private int[] defenderRolls;
	
	private String line;
	private String input;
	private String country;
	private String territoryAName;
	private String territoryBName;
	private String territoryASelection;
	
	private String[] territoryArray;
	private String[] regionArray;
	private String[] adjacenciesArray;
	private String[] ownedterritory;
	private String[] unownedterritory;
	
	private ArrayList<String> list;
	private ArrayList<String> playerNames;
	private ArrayList<String> playerColor;
	private ArrayList<String> priorityterritoryStrings;
	
	private ArrayList<Player> players;
	
	private ArrayList<Territory> countries;
	private ArrayList<Territory> priorityCountries;
	private ArrayList<Territory> priorityTargets;
	
	private TerritoryMapBuilder board;
	private DICEROLL dice;
	private Player currentPlayer;
	private Territory countryA;
	private Territory countryB;
	
	protected void saveGame() {
		
	}
	
	/**
	 * how to exit the game
	 */
	protected void qiotGame() {
		System.exit(0);
	}
	
	/**
	 * sets the number of players
	 * @param playerCount is an integer input by the player
	 */
	protected void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}

	protected int getPlayerCount() {
		return playerCount;
	}
	
	public boolean initializeGame(ArrayList<String> playerNames, ArrayList<String> playerTypes, ArrayList<String> playerColor) throws FileNotFoundException {
		
		this.playerNames = playerNames;
		this.playerColor = playerColor;
	
		// reads territory name file
		try {
			BufferedReader reader = new BufferedReader(new FileReader("territory name"));
			StringBuilder stringBuilder = new StringBuilder();
			
			while((line = reader.readLine()) != null) {
				stringBuilder.append(line);
			}
			input = stringBuilder.toString();
			
			//split the text in the file into an array
			territoryArray = input.split("/t");
			
			//reads adjaciency file
			reader = new BufferedReader(new FileReader("adjacencies"));			
			stringBuilder = new StringBuilder();
			
			while((line = reader.readLine()) != null) {
				stringBuilder.append(line);
			}
			input = stringBuilder.toString();
			
			// Creates an array of each line from the file
			adjacenciesArray = input.split("\t");
			
			// Reads continents file
			reader = new BufferedReader(new FileReader("region"));
			stringBuilder = new StringBuilder();
						
			while((line = reader.readLine()) != null) {
				stringBuilder.append(line);
			}
			input = stringBuilder.toString();
		
			// Creates an array of each line from the file
			regionArray = input.split("\t");
			
			// Creates ArrayList of players
			System.out.println("Preparing players...");
			players = new ArrayList<Player>();
						
			// Players are created here
			for (int i = 0; i < playerNames.size(); i++) {
				players.add(new Player(playerNames.get(i), 50 - (playerNames.size() * 5)));
			}

			System.out.println("Starting deploy phase...");
			
			current = -1;
			deployTurn = -1;
			deployPhase = true;
			deployed = true;
			
			canReinforce = true;
			canAttack = false;
			canFortify = false;
			
		} catch (FileNotFoundException error) {
			System.out.println(error.getMessage());
		} catch (IOException error) {
			System.out.println(error.getMessage());
		}
		return 0;
	}

}
