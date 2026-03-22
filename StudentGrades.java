import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //variaveis
        String[] nome = new String[5];
        int soma = 0;
        int[] nota = new int[5];
        int maior = 0;
        int menor = 0;
        int[] posicao = new int[2];

        for (int i = 0; i < 5; i++) { //primeira repeticao
            System.out.println("Digite o nome:");
            nome[i] = scanner.nextLine();
            System.out.println("Digite a nota:");
            nota[i] = scanner.nextInt();
            scanner.nextLine();
            if(i == 0) {
                maior = nota[i];
                menor = nota[i];
                posicao[0] = i;
                posicao[1] = i;
            } else if (maior < nota[i]) {
                maior = nota[i];
                posicao[0] = i;
            }else if (menor > nota[i]) {
                menor = nota[i];
                posicao[1] = i;
            }
            soma += nota[i];
        }

        for(int i = 0; i < 5; i ++) { //segunda repeticao
            System.out.println("Aluno " + nome[i] +" " + nota[i] +" " + aprovacao(nota, i));
        }
            System.out.println("Media: " +(double)soma / nota.length);
            System.out.println("Maior nota e nome: " +nome[posicao[0]] +maior);
            System.out.println("Menor nota e nome: " +nome[posicao[1]] +menor);

    }
    public static String aprovacao(int[] nota, int i) { //determina se o aluno foi aprovado, reprovado ou esta em recuperacao
        String resultado = "o";
        if (nota[i] >= 7) { //se resultado = 1, entao aprovado
            resultado = "Aprovado";
        }else if (nota[i] >= 5 && nota[i] < 7) {
            resultado = "Recuperacao";
        }else if (nota[i] < 5) {
            resultado = "reprovado";
        }
        return resultado;

    }

}
