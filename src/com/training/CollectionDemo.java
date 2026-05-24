package com.training;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		
		Set <String>names = new TreeSet<>();
		names.add(new String("zara"));
		names.add(new String("tina"));
		names.add(new String("sayed"));
		names.add(new String("tina"));
		//names.add(23);
		Iterator it = names.iterator();
		while(it.hasNext()){
			String name = (String)it.next();
			System.out.println(name);
		}
		
		Set<User> userSet = new TreeSet<>(new NameComparator());
		//List<User> userList = new ArrayList<>();
		User user1 = new User("A101","Gaith","acx@gmail.com");
		User user2 = new User("A102","Moh","acWx@gmail.com");
		User user4 = new User("A103","DAG","WEcx@gmail.com");
		User user3 = new User("A104","EW","aQQx@gmail.com");
		User user5 = new User("A102","Moh","acWx@gmail.com");
		userSet.add(user1);
		userSet.add(user2);
		userSet.add(user3);
		userSet.add(user4);
		userSet.add(user5);
		
		//userList.add(user1);
		//userList.add(user2);
		//userList.add(user4);
		//userList.add(user3);
		//Collection.sort(userList, new NameComparator());
		for(User user:userSet) {
			System.out.println(user);
		}
		
		Map<Integer,String> namesMap = new HashMap<>(); 
		
		namesMap.put(101, "Sara");
		namesMap.put(102, "Faris");
		namesMap.put(103, "Saud");
		namesMap.put(104, "Fahar");
		
		System.out.println(namesMap.get(103));
		
		for(Entry<Integer, String> entry:namesMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		
	}

}

//Ask user to input some names and then store those name in an arraylist.
//once the names are saved in arraylist show a massage that names are saved successfully.
//then ask the user again to search for a particular name.
//If the name is in the list display: name found, else display: name not found.