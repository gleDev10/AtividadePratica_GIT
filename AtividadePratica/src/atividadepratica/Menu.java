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
    
    public void iniciar(Conta c){
        while(this.opcao != -1) {
            menu();
            this.opcao = entrada.nextInt();
            escolheOpcao(c);
        }
    }
  
    public void menu(){
        System.out.print("\t Escolha a opção desejada \n");
        System.out.print("1 - Consultar Extrato \n");
        System.out.print("2 - Sacar \n");
        System.out.print("3 - Depositar \n");
        System.out.print("4 - Saldo \n");
        System.out.print("5 - Sair \n");
        System.out.println("Digite a opção desejada: ");
    }
    
    public void escolheOpcao(Conta c){
        double valor = 0;
        
        switch(this.opcao){
            case 1:    	                  
                  break;
            case 2:
                System.out.println("Digite o valor de saque: ");
                valor = entrada.nextDouble();
                c.saca(valor);
                System.out.println(c.getSaldo());
                break;
            case 3:
                System.out.println("Digite o valor de depósito: ");
                valor = entrada.nextDouble();
                c.deposita(valor);                
                System.out.println(c.getSaldo());
                break;
            case 4: 
                //System.out.println("saldo: "+c.getSaldo());
                break;
            default:
                this.opcao = -1;
                break;
        }
    } 
}
    

