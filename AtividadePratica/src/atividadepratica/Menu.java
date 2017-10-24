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
        
	        double valor;

	        switch( opcao ){
	            case 1:    
	                    //extrato();
	                    break;
	            case 2: 
	                    //if(saques<3){
	                      //  System.out.print("Quanto deseja sacar: ");
	                      //  valor = entrada.nextDouble();
	                      //  sacar(valor);
	                   // } else{
	                     //   System.out.println("Limite de saques diários atingidos.\n");
	                  //  }
	                    break;

	            case 3:
	                  //  System.out.print("Quanto deseja depositar: ");
	                 //   valor = entrada.nextDouble();
	                 //   depositar(valor);
	                 //   break;

	            case 4: 
	                 //   System.out.println("Sistema encerrado.");
	                 //   break;

	            default:
	                    System.out.println("Opção inválida");
	        }
	    }
   public static void main(String[] args){
       
        Menu m  = new Menu();    
        m.entrada.nextLine();
    
    
}
}
    
    

    
  
