package auctionBidding;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] input = s.next().split(",");
		s.close();
		
		int gebot = Integer.parseInt(input[0]);
		String bieter = input[2];
		System.out.print("-," + gebot + ",");
		int aktuellerPreis = gebot;
		int sofortPreis = Integer.parseInt(input[1]);
		boolean sofortPreisErreicht = false;
		String hoechstbietender = bieter;
		int hoechstesGebot = Integer.parseInt(input[3]);
		for (int i = 2; i < input.length / 2; i++) { //i*2 = Gebot, i*2-1= Bieter ab 4: i * 2 + 1 = gebot, i * 2 = Bieter
			gebot = Integer.parseInt(input[i * 2 + 1]);
			bieter = input[i * 2];
			if(!bieter.equals(hoechstbietender) || gebot < hoechstesGebot)	{
				System.out.print(hoechstbietender + "," + aktuellerPreis + ",");
				if(gebot > hoechstesGebot)	{
					aktuellerPreis = hoechstesGebot + 1;
					hoechstesGebot = gebot;
					hoechstbietender = bieter;
				} else if(gebot < hoechstesGebot)	{
					aktuellerPreis = gebot + 1;
				} else	{
					aktuellerPreis = gebot;
				}
			} else	{
				hoechstesGebot = gebot;
			}
			sofortPreisErreicht = sofortPreis != 0 && gebot >= sofortPreis;
			if(sofortPreisErreicht)	{
				break;
			}
		}
		System.out.print(hoechstbietender + "," + aktuellerPreis);
		if(sofortPreisErreicht)	{
			System.out.print("," + hoechstbietender + "," + sofortPreis);
		}
	}

}
