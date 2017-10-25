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
    
    public void iniciar(){
        
	        int opcao;

	        do{
	            menu();
	            opcao = entrada.nextInt();
	            escolheOpcao(opcao);
	        }while(opcao!=5);
	    }
    public void sair(){
        
    }
  
    public void menu(){

        
	        System.out.println("\t Escolha a opção desejada");
	        System.out.println("1 - Consultar Extrato");
	        System.out.println("2 - Sacar");
	        System.out.println("3 - Depositar");
                System.out.println("4 - Saldo");
	        System.out.println("5 - Sair\n");
	        System.out.print("Opção: ");

	    }
    public void escolheOpcao(int opcao){
        
	        Scanner e = new Scanner(System.in);
                double valor = 0;
                Conta c =  new Conta();
	        switch( opcao ){
	            case 1:    
	                  
	                  break;
	            case 2: 
	                  c.setSaca(valor);
                          
                           
                           
	                  break;

	            case 3:                                                
                        c.deposita(valor);
	                  
	                  break;

	            case 4: 
                        c.atualiza(0.01);
                        System.out.println(c.getSaldo());
	                  break;
                          
                    case 5: 
                        System.out.println("Saiu");
	                 sair();
                         
	              break;

	            default:
	                    System.out.println("Opção inválida");
	        }
	    }
 
}
    

