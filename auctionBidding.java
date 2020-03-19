package auctionBidding;

import java.util.Scanner;

public class auctionBidding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] input = s.next().split(",");
		s.close();
		
		int gebot = Integer.parseInt(input[0]);
		int aktuellerPreis = gebot;
		String hoechstbietender = input[1];
		int hoechstesGebot = Integer.parseInt(input[2]);
		for (int i = 2; i <= input.length / 2; i++) { //i*2 = Gebot, i*2-1= Bieter
			gebot = Integer.parseInt(input[i * 2]);
			if(gebot > hoechstesGebot)	{
				aktuellerPreis = hoechstesGebot + 1;
				hoechstesGebot = gebot;
				hoechstbietender = input[i * 2 - 1];
			} else if(gebot < hoechstesGebot)	{
				aktuellerPreis = gebot + 1;
			} else	{
				aktuellerPreis = gebot;
			}
		}
		System.out.println(hoechstbietender + "," + aktuellerPreis);
	}

}