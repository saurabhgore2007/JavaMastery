package Day10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {

		Map<String, Integer> cities = new HashMap<String, Integer>();
		
		cities.put("Sangli", 800000);
		cities.put("Satara", 900000);
		cities.put("Sangli", 170000);
		cities.put("Mumbai", 700000);
		cities.put("MUMBAI", 140000);

		System.out.println("HashMap Values ");
		System.out.println(cities);

		Set<String> all_keys = cities.keySet();
		System.out.println(all_keys);

		Collection<Integer> all_values = cities.values();
		System.out.println(all_values);
		
		for(String key : all_keys)
		{
			System.out.println(key + " => " + cities.get(key));
		}

		Set<Map.Entry<String, Integer>> entries =  cities.entrySet();

		for(Map.Entry item : entries)
		{
			System.out.println(item.getKey() + "  " + item.getValue());
		}

	}

}
