package com.xworkz.maptask.runner;

import java.util.LinkedHashMap;
import java.util.Map;

public class UserInfoLinked {
		public static void main(String[] args) {
			Map<Integer, String> map =new LinkedHashMap<>();
			
			map.put(23, "Naveen");
			map.put(20, "Nambiyar");
			map.put(21, "Natesh");
			map.put(50, "Narmada");
			
			System.out.println(map);
			
			
			map.put(20, "Jacky");
			System.out.println("After update  :"+map);
			
			map.remove(50);
			System.out.println("after remove  :"+map);
		}
}
