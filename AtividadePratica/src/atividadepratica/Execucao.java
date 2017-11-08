/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepratica;

import java.util.Scanner;
/**
 *
 * @author 71600922
 */
public class Execucao {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcao;
        
        Conta cc = new ContaCorrente("CC","0001");
        Conta cp = new ContaPoupanca("CP","0002");
        
        Menu m  = new Menu();
        
        //do{
            //opcao = 0;
            
            System.out.print("\t Em qual conta você deseja utilizar? \n");
            System.out.print("1 - Conta Corrente \n");
            System.out.print("2 - Conta Poupança \n");
            System.out.print("3 - Sair \n");
            System.out.println("Digite a opção desejada: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    m.iniciar(cc, cp);                     
                    break;
                case 2:
                    m.iniciar(cp, cc);
                    break;
                default: 
                    opcao = -1;
                    break;
            }
        //} while(opcao != -1);

        System.out.println("Saldo Conta Corrente: R$" + cc.getSaldo() + "\n Saldo Conta Poupança: R$" + cp.getSaldo());
    }
}