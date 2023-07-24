package Risk;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

@SuppressWarnings("deprecation")
public class TerritoryLabel extends JLabel implements Observer {

	private int troops;
	private String name;
	private String display;
	private ArrayList<String> stringList;
	private GameManager model;
	private Territory territory;
	
	public TerritoryLabel (GameManager model, Territory territory) {
		
		super();
		this.model = model;
		this.territory = territory;
		name = territory.getName();
		setText(name);
	}
	
	public void update(Observable obs, Object obj) {
		
		display = (String) obj;
		
		if(display.equals("countryA")) {
			if(territory.getOwner() == null) {
				setText(name);
			}else {
				setText(name + ": " + territory.getTroops() + ", " + territory.getOwner().getName());
			}
		}
	}
}
