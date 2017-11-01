/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepratica;

import java.util.ArrayList;
/**
 *
 * @author 71600922
 */
public class Conta {
    protected String nome;
    protected String numConta;
    protected double saldo;
    protected ArrayList<String> extrato = new ArrayList();
    
    public Conta(String n, String nc){
        this.nome = n;
        this.numConta = nc;;
    }
    
    public void deposita(double valor) {
        this.saldo += valor;
    }
    
    public void saca(double valor) {
        this.saldo -= valor;
    }
   
        
    public String getNome() {
        return this.nome;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public String getNumConta() {
        return this.numConta;
    }    
    
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa;
    }
    
    public double setSaca(double valor){
        this.saldo -= valor;
        return this.saldo;
    }
    
    public void setExtrato(String t){
        this.extrato.add(t);
    }
     
    public void imprimiExtrato(){
        System.out.print("----------Dados Conta----------\n");
        System.out.print("Número da Conta: " + this.numConta + "\n");
        System.out.print("Nome: " + this.nome + "\n");
        System.out.print("Saldo: " + this.saldo + "\n");
        System.out.print("------------Extrato------------\n");
        for(int i = 0; i < this.extrato.size(); i++) {
            System.out.print(this.extrato.get(i) + "\n");
        }
        System.out.println();
//        this.extrato.add("teste");
//        System.out.print(this.extrato.get(0) + "\n");
    }
}
