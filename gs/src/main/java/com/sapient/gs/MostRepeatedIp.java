package com.sapient.gs;

import java.util.*;
import java.util.function.Predicate;

public class MostRepeatedIp {
	public static void main(String[] args) {
		   String[] s= { "10.0.0.1-frank [10/dec/17 10:14:27]", "10.0.0.1-frank [10/dec/17 10:14:28]","10.0.0.2-nancy [10/dec/17 10:14:28]", "10.0.0.1-frank [10/dec/17 10:14:27]" };
		    Map<String,Integer> ips=new HashMap<String,Integer>();
		    for(int i=0;i<s.length;i++){      
		        System.out.println(s[i].substring(0,8));
		        String ip=s[i].substring(0,8);
		        ips.put(ip,ips.containsKey(ip) ? ips.get(ip)+1:1);
		    }
		    		    
		    Map.Entry<String, Integer> entry=ips.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		    System.out.println("Most repeated  ip:"+entry.getKey()+" is repeated "+entry.getValue()+" number of times");
		  }
}
