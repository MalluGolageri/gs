package com.sapient.gs;

public class WalkingRobot {

	public static void main(String[] args) {
		int x=0,y=0;		
		String s="UDDLLRUUUDUURUDDUULLDRRRR";
		for(int i=0;i<s.length();i++) {						
			if(s.charAt(i)=='L') {
				x--;
			}else if(s.charAt(i)=='R') {
				x++;
			}else if(s.charAt(i)=='U') {
				y++;
			}else if(s.charAt(i)=='D') {
				y--;
			}
		}
		System.out.println(x+","+y);
	}

}
