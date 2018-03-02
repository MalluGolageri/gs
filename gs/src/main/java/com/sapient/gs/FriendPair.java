package com.sapient.gs;

import java.util.HashSet;
import java.util.Set;

public class FriendPair {

	public static void main(String[] args) {
		//System.out.println("ab".hashCode());
		//System.out.println("bC".hashCode());
		//s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
		String[] friends = { "A,B", "B,A" ,"ab,bC","bC,ab","C,D","D,C","abc,def","def,abc","h,g"};
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
//		@Override
//		public int hashCode() {
//			final int prime = 31;
//			int result = 1;
//			result = prime * result + ((f1 == null) ? 0 : f1.hashCode());
//			result = prime * result + ((f2 == null) ? 0 : f2.hashCode());
//			return result;
//		}
////		
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			Pair other = (Pair) obj;
//			if (f1 == null) {
//				if (other.f1 != null)
//					return false;
//			} else if (!f1.equals(other.f1))
//				return false;
//			if (f2 == null) {
//				if (other.f2 != null)
//					return false;
//			} else if (!f2.equals(other.f2))
//				return false;
//			return true;
//		}
		
		@Override
		public int hashCode() {
			return this.f1.hashCode()+this.f2.hashCode();
		}
		@Override
		public boolean equals(Object obj) {
			 Pair pair=(Pair) obj;	 
			 return pair.f1.equals(this.f2) || pair.f2.equals(this.f1);			 
		}
	}
}
