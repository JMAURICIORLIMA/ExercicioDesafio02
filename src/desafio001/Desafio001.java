package desafio001;

import java.util.Scanner;

public class Desafio001 {

    public static void main(String[] args) {
        /*
 * Que leia dois valores e realize uma das operações abaixo descritas abaixo. O programa deve 
 * ser feito usando a estrutura de controle “switch...case”, possibilitando a escolha do usuário 
 * por uma das opções. (Soma, subtração, multiplicação, divisão e comparação 
 * (informando se eles são iguais ou, no caso de diferentes, o maior entre eles e, enquanto o usuário não digitar 0 permanecer mostrando o menu com as opções)).
         */
        Scanner scan = new Scanner(System.in);

        System.out.println(" BEM VINDO \n"
                + "PARA REALIZAR UMA DAS OPERAÇÕES ABEIXO DIGITE: \n"
                + " 1 - SOMA \n"
                + " 2 - SUBTRAÇÃO \n"
                + " 3 - MULTIPLICAÇÃO \n"
                + " 4 - DIVISÃO \n"
                + " 5 - COMPARAÇÃO \n"
                + " 0 - SAIR \n"
                + "¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n");
        int op = scan.nextInt();
        //system("CLS");

        while (op != 0) {

            switch (op) {
                case 1:
                    System.out.print("SOMA \n"
                            + " DIGITE O 1º VALOR: ");
                    double n1 = scan.nextDouble();
                    System.out.print(" DIGITE O 2º VALOR: ");
                    double n2 = scan.nextDouble();
                    System.out.print(n1 + n2 + "\n");
                    break;

                case 2:
                    System.out.print("SUBTRAÇÃO \n"
                            + " DIGITE O 1º VALOR: ");
                    double n3 = scan.nextDouble();
                    System.out.print(" DIGITE O 2º VALOR: ");
                    double n4 = scan.nextDouble();
                    System.out.print(n3 - n4 + "\n");
                    break;

                case 3:
                    System.out.print("MULTIPLICAÇÃO \n"
                            + " DIGITE O 1º VALOR: ");
                    double n5 = scan.nextDouble();
                    System.out.print(" DIGITE O 2º VALOR: ");
                    double n6 = scan.nextDouble();
                    System.out.print(n5 * n6 + "\n");
                    break;

                case 4:
                    System.out.print("DIVISÃO \n"
                            + " DIGITE O 1º VALOR: ");
                    double n7 = scan.nextDouble();
                    System.out.print(" DIGITE O 2º VALOR: ");
                    double n8 = scan.nextDouble();
                    System.out.print(n7 / n8 + "\n");
                    break;

                case 5:
                    System.out.print("COMPARAÇÃO \n"
                            + " DIGITE O 1º VALOR: ");
                    double n9 = scan.nextDouble();
                    System.out.print(" DIGITE O 2º VALOR: ");
                    double n10 = scan.nextDouble();
                    if(n9 > n10){
                        System.out.println(n9+" - 1º VALOR MAIOR QUE 2º VALOR - "+n10);
                    }else 
                        if(n9 < n10){
                        System.out.println(n9+" - 1º VALOR MENOR QUE 2º VALOR - "+n10);
                    }else{
                            System.out.println(n9+" - 1º VALOR É IGUAL AO 2º VALOR - "+n10);
                        }
                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA, DIGITE UMA OPÇÃO VÁLIDA: ");

            }
            System.out.print("\nPARA REALIZAR UMA DAS OPERAÇÕES ABEIXO DIGITE: \n"
                    + " 1 - SOMA \n"
                    + " 2 - SUBTRAÇÃO \n"
                    + " 3 - MULTIPLICAÇÃO \n"
                    + " 4 - DIVISÃO \n"
                    + " 5 - COMPARAÇÃO \n"
                    + " 0 - SAIR \n"
                    + "¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n");
            op = scan.nextInt();

        }System.out.println("SAINDO...");

    }
}
