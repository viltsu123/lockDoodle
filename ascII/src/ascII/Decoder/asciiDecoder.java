package ascII.Decoder;

import java.util.ArrayList;
import java.util.List;

public class asciiDecoder {
	
	private String tieto;
	private List numerot;
	private List binary;//tieto pilkkomiseen
	private List vastaus;//jatkokehitys: voisi olla string tyyppi myös...
	
	public asciiDecoder(String binaari){
		this.tieto = binaari;
		this.numerot = new ArrayList<String>();
		this.binary = new ArrayList<String>();
		this.vastaus = new ArrayList<String>();
	}
	
	public String deCoder(String tieto){
		//this takes in binary info as numbers and translates it into ascii characters
		String code="";
		
		numerot.add("01000001 = A");
		numerot.add("01000010 = B");
		numerot.add("01000011 = C");
		numerot.add("01000100 = D");
		numerot.add("01000101 = E");
		numerot.add("01000110 = F");
		numerot.add("01000111 = G");
		numerot.add("01001000 = H");
		numerot.add("01001001 = I");
		numerot.add("01001010 = J");
		numerot.add("01001011 = K");
		numerot.add("01001100 = L");
		numerot.add("01001101 = M");
		numerot.add("01001110 = N");
		numerot.add("01001111 = O");
		numerot.add("01010000 = P");
		numerot.add("01010001 = Q");
		numerot.add("01010010 = R");
		numerot.add("01010011 = S");
		numerot.add("01010100 = T");
		numerot.add("01010101 = U");
		numerot.add("01010110 = V");
		numerot.add("01010111 = W");
		numerot.add("01011000 = X");
		numerot.add("01011001 = Y");
		numerot.add("01011010 = Z");
		numerot.add("00100000 =  ");
		
		//Tehdään pitkän luvun pilkkominen 8 symbolin mittaisiksi objekteiksi uuteen listaan.
		if(tieto.length()>=8){
			for(int i = 0; i < tieto.length();i++){
				//alustaa substringin loppuluvun:
				int a = i;
				//lisää sisäänsyötetyn 8bit binaari luvun listaan pitkästä jonosta 1 ja 0:llia:
				binary.add(tieto.substring(i, a + 8));
				//tärkeä! siirtää lukupäätä sisäänsyötetyssä tiedossa! lukee seuraavat 8 merkkiä:
				i = i + 7;
			}
			
		}
		//Tarkistaa että sisäänsyötetty string on ainakin 8 merkkiä pitkä:
		if(tieto.length() < 8){
			code = "could not make conversion.";
		}else if(tieto.length() >= 8){
		
			//ensiksi binary olio sisään tutkittavaksi:
			
			for(int i = 0; i < binary.size();i++){
				
				String palikka = binary.get(i).toString();
				
				//Sit palikka vertailuun aakkos listaa(numerot) varten:
				
				for(int b = 0; b < numerot.size();b++){
					//System.out.println(palikka);
					if(palikka.equals(numerot.get(b).toString().substring(0,8))){
						vastaus.add(numerot.get(b).toString().substring(numerot.get(b).toString().length() -1 ));
						break;
					}
				}
				code="\ndone, what next?";
			}
			
		}else{
			code ="failing";
		}
		//System.out.println(binary);
		System.out.println(vastaus);
		numerot.clear();
		binary.clear();
		vastaus.clear();
		return code;
	}

}
