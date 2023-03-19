package org.example.Karol;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExcercise {
    public static void main(String[] args) {
        Map<String, String> party = new HashMap<>();
        party.put("Kamil", "Pączki");
        party.put("Adam", "Ciastka");
        party.put("Krzysztof", "Zupa");
        party.put("Zenek", "Pierogi");

        for (Map.Entry<String, String> entry : party.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }
        System.out.println(party);
        Set<String> keys = party.keySet();
        System.out.println(keys);
        Collection<String> values = party.values();
        System.out.println(values);
        boolean czyJest = party.containsKey("Paweł");
        System.out.println(czyJest);
        boolean czyJestWartosc = party.containsValue("Zupa");
        System.out.println(czyJestWartosc);

        String result = party.get("Zenek");
        System.out.println(result);


    }
}
