/*Crie um algoritmo que ajude o DETRAN a saber, o total de recursos que foram arrecadados com a aplicação de
multas de trânsito.
O algoritmo deve ler as seguintes informações para cada motorista:
-O número da carteira de motorista (de 1 a 4327)
-Número de multas;
-Valor da cada uma das multas.
Deve ser impresso o valor da dívida de cada motorista e ao final da leitura o total de recursos arrecadados (somatório
de todas as multas). O algoritmo deverá imprimir também o número da carteira do motorista que obteve o maior
número de multas.*/



import java.util.Scanner;

public class exc1 {

    public static void main(String[] args) {

        int carteira_n,num_multas,individuos,maior_carteira = 0,guarda = 0;
        float valor_multas, arrecadamento_total = 0;
        
        Scanner entrada  = new Scanner(System.in);

        System.out.println("quantos individuos foram revistados hoje? ");
        individuos = entrada.nextInt();

        for (int i = 0; i < individuos;i++){

            System.out.println("número da carteira do motorista: ");
            carteira_n = entrada.nextInt();

            if (carteira_n > 4327 || carteira_n < 1) {
                
                System.out.print("carteira inválida! digite novamente ");
                i--;
            }else{

                System.out.println("quantas multas o individuo obteve ");
                num_multas = entrada.nextInt();


                if (num_multas > guarda ) {
                    
                    maior_carteira = carteira_n;

                    guarda = num_multas;
                }

                float multa_individuo = 0;
                
                for (int j = 1; j <= num_multas; j++){

                    System.out.format("digita o valor da %dº multa: \n",j);
                    valor_multas = entrada.nextFloat();

                    multa_individuo = valor_multas + multa_individuo;

                    arrecadamento_total = arrecadamento_total + valor_multas;
                                        
                }

                System.out.format("este individuo tem a dívida de R$%.2f \n" ,multa_individuo);

                System.out.print("proxímo ");
            
                
            }
        }

        System.out.println("Relatorio final do algoritmo !");
        System.out.println("*****************************");

        System.out.format("o total de recursos que obtemos foram R$%.2f \n", arrecadamento_total);

        System.out.println("o indivíduo que obteve maior multa e da carteira: " + maior_carteira);
     
        entrada.close();
    }
}

