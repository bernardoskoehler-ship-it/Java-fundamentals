import java.util.Scanner;

public class parImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Digite 10 numeros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        for(int i = 0; i < numeros.length; i ++) {
            System.out.println(parImpar(numeros, i));
        }
    }
    public static String parImpar(int[] numeros, int i) {
        String parImpar = null;
            if (numeros[i] % 2 == 0) {
                parImpar = "Par";
            } else {
                parImpar = "Impar";
            }
        return parImpar;
    }
}
