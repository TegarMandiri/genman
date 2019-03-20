//Finished, will added more features++
//Ver. 1.00

import java.util.Scanner;
import java.util.Random;

public class genman{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

//Credit Tegar Mandiri 2019
//Contact email: tegarmndr@gmail.com

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("//Copyright Tegar Mandiri 2019");
		System.out.println("-Ver. 1.00");
		System.out.println(" ");
		System.out.println("--------------- Generator Mandiri (GENMAN) ---------------");
		System.out.println(" ");

		System.out.print("Enter how many names 	: ");
		int nama = Integer.parseInt(scan.nextLine());

		String janama[] = new String[nama];
		for (int i = 0; i < janama.length; i++){
			System.out.print("Name 	" + (i+1) + " : ");
			janama[i] = scan.nextLine();
		}

		System.out.println(" ");
		System.out.println("Press Enter key to generate...");
		try
		{
			System.in.read();
        }  
        catch(Exception e)
        {}

		System.out.println("------------------------------------");

		Random a = new Random();
		int randoma = a.nextInt(janama.length);
		System.out.println("Result name = " + janama[randoma]);
		System.out.println(" ");
	}
}
