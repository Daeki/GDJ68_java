package com.iu.study5.s1;

public class S1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worrier worrier = new Worrier();
		worrier.getItem();
		Magician magician = new Magician();
		magician.getItem();
		
		//worrier.axe.name
		Character character = magician;
		
		magician.setMp(20);
		magician=(Magician)character;
		magician.setMp(0);
		
		
		character = worrier;
		
		Character [] w = new Character[2];
		w[0]=worrier;
		w[1]=magician;
		
		magician = (Magician)w[1];
		magician.setMp(20);
		
		//----------------------
		Character ch1 = new Character();
		magician = (Magician)ch1;
		magician.setMp(20);
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		

	}

}
