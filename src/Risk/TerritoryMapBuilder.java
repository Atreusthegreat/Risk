package Risk;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TerritoryMapBuilder {

	String name = "territory name";
	Map<String, String> territoryMap = new HashMap<>();
	
	try(BufferedReader br = new BufferedReader(new file('res\\territory name'))){
		String terrotory; 
		while ((territory = bu.readLine()) != null) {
			territoryMap.put(terrotory, terrotory);
		}
	}catch (IOException e) {
		e.printStackTrace();
	}

	for (String territory : territoryMap.keySet()) {
		String Value = territoryMap.get(territory);
        System.out.println(territory + " => " + value);

	}
}

