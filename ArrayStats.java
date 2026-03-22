public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[10];
        System.out.println("Digite 10 numeros:");
        for(int i = 0; i < numero.length; i ++) {
            numero[i] = scanner.nextInt();
        }
        System.out.println("Impares: " +imparParSoma(numero)[0]);
        System.out.println("Pares: " +imparParSoma(numero)[1]);
        System.out.println("Soma: " +imparParSoma(numero)[2]);
    }
    public static int[] imparParSoma(int[] numero) {
        int[] imparParSoma = new int[3];
        for (int i = 0; i < numero.length; i++) {
            if(numero[i] % 2 == 1) {
                imparParSoma[0] ++;
            } else if(numero[i] % 2 == 0) {
                imparParSoma[1] ++;
            }
            imparParSoma[2] += numero[i];
        }
        return imparParSoma;
    }
