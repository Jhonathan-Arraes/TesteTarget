package Fibonacci;

public class TestePreDefinido {
	
	public static boolean isFibonacci(int numero) {
        int a = 0;
        int b = 1;
        while (b < numero) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == numero || numero == 0;
    }

public static void main(String[] args) {
	
   int numero = 0;

    if (isFibonacci(numero)) {
        System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
    } else {
        System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        
    }
}

}
