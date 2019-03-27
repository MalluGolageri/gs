package com.sapient.gs;

import java.util.HashSet;
import java.util.Set;

public class FriendPair {

	public static void main(String[] args) {
		//System.out.println("ab".hashCode());
		//System.out.println("bC".hashCode());
		//s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
		String[] friends = { "A,B", "A,B", "B,A" ,"ab,bC","bC,ab","C,D","D,C","abc,def","def,abc","h,g"};
		Set<Pair> pairs=new HashSet<>();
		for(String pair:friends) {
			String[] s=pair.split(",");
			pairs.add(new Pair(s[0],s[1]));
		}
		pairs.forEach(e->{System.out.println(e.f1+","+e.f2);});
	}

	static class Pair {		
		String f1;
		String f2;
		Pair(String f1,String f2) {
			this.f1=f1;
			this.f2=f2;
		}
		
		@Override
		public int hashCode() {
			return this.f1.hashCode()+this.f2.hashCode();
		}
		@Override
		public boolean equals(Object obj) {
			 Pair pair=(Pair) obj;	 
			 return (pair.f1.equals(this.f2) || pair.f2.equals(this.f1))
					 || (pair.f1.equals(this.f1) || pair.f2.equals(this.f2));
		}
	}
}
