import java.util.*;
import java.util.Map.Entry;

public class Registru {
	private Map<String, String> registru=new HashMap<>();
	
	public void cazare(String camera, String caine) {
		registru.put(camera,  caine);
	}
	
	public int dimensiune() {
		return registru.size();
	}

	public void entrySet() {
		for(Entry <String, String> entry : registru.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " --- " + value);
		}
	}
	
	public String getValue(String key) {
		return registru.get(key);
	}
	
	public void camera() {
		for (String key : registru.keySet()) {
			System.out.println(key);
		}
	}
	
	public void caine() {
		for (String value : registru.values()) {
			System.out.println(value);
		}
	}
	
	public void setNewCazare(String camera, String newPet) {
		registru.put(camera,  newPet);
	}
}
