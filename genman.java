//Finished, will added more features++
//Ver. 1.25
//Credit Tegar Mandiri 2019
//Contact email: tegarmndr@gmail.com

import java.util.Scanner;
import java.util.Random;

public class genman{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("//Copyright Tegar Mandiri 2019");
		System.out.println("-Ver. 1.25");
		System.out.println(" ");
		System.out.println("--------------- Generator Mandiri (GENMAN) ---------------");
		System.out.println(" ");

		System.out.print("Enter how many names 	: ");
		int names = Integer.parseInt(scan.nextLine());

		String allNames [] = new String [names];

			for (int i = 0; i < allNames.length; i++) {
			
				System.out.print("Name 	" + (i+1) + " : ");
				allNames[i] = scan.nextLine();
			
			}

		System.out.println(" ");
		System.out.println("Press Enter key to generate...");

			try {

				System.in.read();
    
        	}  

        		catch(Exception e) {

        	}

		System.out.println("------------------------------------");

		Random random = new Random();
		int resultRandom = random.nextInt(allNames.length);
		System.out.println("Result name = " + allNames[resultRandom]);	

		System.out.println(" ");

	}
}
