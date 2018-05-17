package ascII.column;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class columnDisplacement {
	/*
	 * ota tietoa sisään ja pilko se, järjestele sanat uusiksi moneen listaan.
	 * Kun parent lista luotu niin uudet listat annetaan sille. Kun uudet listat luodaan
	 * niin oikeiden kirjainten paikat pitää tallentaa basenumbers avain listaan. Muuten viesti hukkuu.
	 */
	private String basemessage;
	private ArrayList baselist;
	private ArrayList basenumbers;
	private ArrayList<ArrayList<String>> parent;
	
	
	public columnDisplacement(String base){
		this.basemessage = base;
		this.baselist = new ArrayList<String>();
		this.basenumbers = new ArrayList<Integer>();
		this.parent = new ArrayList<ArrayList<String>>();
		//this.child = new ArrayList<String>();
	}
	
	public void makeSalt(ArrayList<String> hei){
		
		for(int i = 0; i < hei.size(); i++){
			int random = (int) (Math.random()*hei.size());
			//System.out.println(random);
			
			if(parent.size()<0){
				System.out.println("no swap possible");
			}else{
				Collections.swap(hei, i, random);
			}
		}
	}
	
	public String chopBasemessage(String base){
		String code = "";
		
		if(base.length() > 0){
			for(int i = 0; i < base.length(); i++){
				int a = i;
				baselist.add(base.substring(i, a + 1));
			}
		}
		System.out.println(baselist);//*Toimii
		
		return code;
	}
	
	
	//Tehdään PArent metodi joka tekee yhden taulun.
	
	
	public ArrayList<ArrayList<String>> makeParent(String xxx){
	
		for(int i = 0; i < xxx.length(); i++){
			ArrayList<String> jou = new ArrayList<String>();
			int rand = (int)(Math.random()*20 + xxx.length());
			for(int y = 0; y < rand;y++){
				String x = "X";
				if(y == i){
					jou.add(xxx.substring(y, y+1));
				}else{
					jou.add(x);
				}
			}
			parent.add(jou);
		}
		
		for(ArrayList<String> derive: parent){
			System.out.println(derive);
		}
		
		for(int u = 0; u < parent.size(); u++){
			makeSalt(parent.get(u));
			
		}
		System.out.println("-------------------------------------");
		System.out.println("SCRAMBLED EGGS");
		System.out.println("-------------------------------------");
		for(ArrayList<String> derive: parent){
			System.out.println(derive);
		}
		
		return parent;
	}
	
	

}
