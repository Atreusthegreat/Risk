package Risk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Territory {
	
	
	private int troops;
	private boolean hasPlayer;
	
	private String name;
	private Player owner;
	private ArrayList<Territory> adjacencies;
	
	public Territory(int troops, boolean hasPlayer, String name) {
		this.troops = troops;
		this.hasPlayer = hasPlayer;
		this.name = name;
	}
	/**
	 * call only when building Territory never after
	 * @param adjacencies
	 */
	public void addadjacencies(ArrayList<Territory> adjacencies) {
		
		this.adjacencies = adjacencies;
	}
	
	/**
	 * when a player conquers a territory the player object changes hands
	 * @param setowner
	 */
	public void setOwner(Player owner) {
		hasPlayer = true;
		this.owner = owner;
	}
	
	public Player getOwner() {
		return owner;
	}
	/**
	 * 
	 * @return the number of troops currently stationed
	 */
	public int getTroops() {
		return troops;
	}
	
	/**
	 * 
	 * @return list of the territory objects that are adjacent to this territory
	 */
	public ArrayList<Territory> getAdjancencies(){
		return adjacencies;
	}
	
	public boolean hasPlayer() {
		return hasPlayer;
	}
	
	public String getName() {
		return name;
	}
	
}

