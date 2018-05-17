package ascII.main;

import java.util.Scanner;

import ascII.Decoder.asciiDecoder;
import ascII.Encoder.asciiEncoder;
import ascII.column.columnDisplacement;

public class run {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String bin = "";
		asciiDecoder salaaja = new asciiDecoder(bin);
		asciiEncoder puhuja = new asciiEncoder(bin);
		columnDisplacement colu = new columnDisplacement(bin);
		
		while(true){
		System.out.println("Hello and welcome, what would you like to do?");
		System.out.println("options are: \n1.decode 8 bit binary\n2.encode text to 8 bit binary\n3.SCRAMBLED EGGS\n4.quit");
		
		int valinta = Integer.parseInt(in.nextLine());		
		switch(valinta){
		case 1:
			System.out.println("==================================");
			System.out.println("Please input an 8 bit binary code:");
			System.out.println("==================================");
			bin = in.nextLine();
			System.out.println("");
			System.out.println(salaaja.deCoder(bin));
			System.out.println("");
			break;
		case 2:
			System.out.println("================================");
			System.out.println("Please input text to be encoded:");
			System.out.println("================================");
			bin = in.nextLine();
			System.out.println("");
			System.out.println(puhuja.enCoder(bin));
			System.out.println("");
			break;
		case 3:
			System.out.println("======================================");
			System.out.println("SCRAMBLED EGGS - give me your message:");
			System.out.println("======================================");
			bin = in.nextLine();
			System.out.println("");
			System.out.println(colu.chopBasemessage(bin));
			colu.makeParent(bin);
			System.out.println("");
			break;
		case 4:
			System.out.println("==============");
			System.out.println("Bye bye :)");
			System.out.println("==============");
			break;
		}//switch loppu
		
		//lopettaa valikon:
		if(valinta == 4){
			in.close();
			break;
		}
		//0100100001000101010011000100110001001111001000000101011101001111010100100100110001000100 
		//, pitäisi tulostaa HELLO WORLD :) *Toimii
		}//while loppu
	}
}
