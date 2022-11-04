package aulas;

import java.util.Map;
import java.util.TreeMap;

public class Aulas {

	public static void main(String[] args) {

		Map<String, String> cook = new TreeMap<>();

		cook.put("Saudação", "Olá");
		cook.put("pronome ", "seu bosta");
		cook.put("jk", "brinks");

		cook.remove("jk");

		System.out.println("Cookies ");
		for (String keys : cook.keySet()) {
			System.out.println(keys + ": " + cook.get(keys));
		}

	}

}
