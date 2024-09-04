package VerificarString;

import java.util.Scanner;

public class VerificaA {
	
	 public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite um texto:");
	        String input = scanner.nextLine();
	        
	        int count = 0;
	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if (c == 'a' || c == 'A') {
	                count++;
	            }
	        }
	        
	        if (count > 0) {
	            System.out.println("A letra 'a' aparece " + count + " vezes.");
	        } else {
	            System.out.println("A letra 'a' não aparece no texto.");
	        }
	        
	        scanner.close();
	    }

}
