import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = sc.nextInt();

        try{
            contar(parametroUm,parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }


    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroDois < parametroUm){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for(int i = 1 ; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }

    }
}
