/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepratica;

import java.util.Scanner;

/**
 *
 * @author 71600124
 */
public class Menu {
    
    Scanner entrada = new Scanner(System.in);
    int opcao;
    
    public void iniciar(Conta c1, Conta c2){
        while(this.opcao != -1) {
            menu();
            this.opcao = entrada.nextInt();
            escolheOpcao(c1, c2);
        }
    }
  
    public void menu(){
        System.out.print("\t Escolha a opção desejada \n");
        System.out.print("1 - Consultar Extrato \n");
        System.out.print("2 - Sacar \n");
        System.out.print("3 - Depositar \n");
        System.out.print("4 - Saldo \n");
        System.out.print("5 - Transferência \n");
        System.out.print("6 - Sair \n");
        System.out.println("Digite a opção desejada: ");
    }
    
    public void escolheOpcao(Conta c1, Conta c2){
        double valor = 0;
        
        switch(this.opcao){
            case 1:
                c1.imprimiExtrato();
                break;
            case 2:
                System.out.println("Digite o valor de saque: ");
                valor = entrada.nextDouble();
                c1.saca(valor);
                c1.setExtrato("Saque de R$" + valor);
                break;
            case 3:
                System.out.println("Digite o valor de depósito: ");
                valor = entrada.nextDouble();
                c1.deposita(valor);                
                c1.setExtrato("Depósito de R$" + valor);
                break;
            case 4: 
                System.out.println("Saldo: " + c1.getSaldo());
                break;
            case 5:
                System.out.println("Digite o valor de Transferência: ");
                valor = entrada.nextDouble();
                c1.transferencia(c1, c2, valor);
                break;
            default:
                this.opcao = -1;
                break;
        }
    } 
}
    

