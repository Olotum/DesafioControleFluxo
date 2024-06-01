import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int parametroUm = 0;
        int parametroDois = 0;
        while (parametroUm >= parametroDois) {
            System.out.print("\nDigite o primeiro parâmetro: ");
            parametroUm = sc.nextInt();
            System.out.print("\nDigite o segundo parâmetro: ");
            parametroDois = sc.nextInt();

            try {
                contar(parametroUm, parametroDois);

            } catch (ParametrosInvalidosException e) {
                // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.err.println(e.getMessage());
            }

        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i <= contagem; i++) {
            System.out.println(parametroUm + i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
