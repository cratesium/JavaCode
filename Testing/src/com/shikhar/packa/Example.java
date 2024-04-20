package com.shikhar.packa;


	import java.util.*;

	public class Example {
	    public static void main(String[] args) {
	        // Assuming you have a Map named mp
	        Map<String, Integer> mp = new HashMap<>();
	        mp.put("A", 1);
	        mp.put("B", 2);
	        mp.put("C", 1);
	        mp.put("D", 2);
	        mp.put("E", 3);

	        // Create a list of map entries
	        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(mp.entrySet());

	        // Sort the list based on values
	        entryList.sort(Comparator.comparing(Map.Entry::getValue));

	        // Create a list of lists to store map entries with the same value
	        List<List<Map.Entry<String, Integer>>> listOfLists = new ArrayList<>();

	        // Iterate through the sorted list and group entries with the same value
	        List<Map.Entry<String, Integer>> currentList = new ArrayList<>();
	        Integer currentValue = null;

	        for (Map.Entry<String, Integer> entry : entryList) {
	            if (currentValue == null || !currentValue.equals(entry.getValue())) {
	                // Start a new list for a different value
	                currentList = new ArrayList<>();
	                listOfLists.add(currentList);
	                currentValue = entry.getValue();
	            }

	            currentList.add(entry);
	        }

	        // Print the resulting list of lists
	        for (List<Map.Entry<String, Integer>> list : listOfLists) {
	            System.out.println("New List:");
	            for (Map.Entry<String, Integer> entry : list) {
	                System.out.println(entry.getKey() + " -> " + entry.getValue());
	            }
	        }
	    }
	}



