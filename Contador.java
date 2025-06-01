import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroUm, numeroDois;
        System.out.println("Informe o primeiro parâmetro: ");
        numeroUm = sc.nextInt();
        System.out.println("Informe o segundo parâmetro: ");
        numeroDois = sc.nextInt();
        sc.close();

        try{
            contar(numeroUm, numeroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException{
        int rep = numeroDois - numeroUm;
        if (numeroUm > numeroDois){
            throw new ParametrosInvalidosException();
        }
        for (int i = 1; i <= rep; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
