package ascII.Encoder;

import java.util.ArrayList;
import java.util.List;

public class asciiEncoder {
	
	private String teksti;
	private ArrayList<String> binary;
	private ArrayList<String> chop;
	private ArrayList<String> answer;
	
	public asciiEncoder(String teksti){
		this.teksti = teksti;
		this.binary = new ArrayList<String>();
		this.chop = new ArrayList<String>();
		this.answer = new ArrayList<String>();
	}
	
	public String enCoder(String teksti){
		String code = "";
		
		binary.add("A = 01000001");
		binary.add("B = 01000010");
		binary.add("C = 01000011");
		binary.add("D = 01000100");
		binary.add("E = 01000101");
		binary.add("F = 01000110");
		binary.add("G = 01000111");
		binary.add("H = 01001000");
		binary.add("I = 01001001");
		binary.add("J = 01001010");
		binary.add("K = 01001011");
		binary.add("L = 01001100");
		binary.add("M = 01001101");
		binary.add("N = 01001110");
		binary.add("O = 01001111");
		binary.add("P = 01010000");
		binary.add("Q = 01010001");
		binary.add("R = 01010010");
		binary.add("S = 01010011");
		binary.add("T = 01010100");
		binary.add("U = 01010101");
		binary.add("V = 01010110");
		binary.add("W = 01010111");
		binary.add("X = 01011000");
		binary.add("Y = 01011001");
		binary.add("Z = 01011010");
		binary.add("  = 00100000");
		
		if(teksti.length() > 0){
			for(int i = 0; i < teksti.length(); i++){
				int a = i;
				chop.add(teksti.substring(i, a + 1));
			}
		}
		System.out.println(chop); //*Toimii
		System.out.println(teksti.length());//*Toimii
		if(teksti.length() < 0){
			code = "could not translate to binary - returning to menu";
		}else if(teksti.length() > 0){
			for(int b = 0; b < chop.size();b++){
				
				String palikka = chop.get(b).toString();//tässä oli ongelma tuo substring.Poistin sen ni toimii.
				
				for(int c = 0; c < binary.size(); c++){
					
					if(palikka.equals(binary.get(c).toString().substring(0, 1))){
						code="match";
						answer.add(binary.get(c).toString().substring(binary.get(c).toString().length() - 8, binary.get(c).toString().length()));
						break;
					}
				}
			}
		}
		System.out.println(answer);
		binary.clear();
		answer.clear();
		chop.clear();
		return code;
	}

}
