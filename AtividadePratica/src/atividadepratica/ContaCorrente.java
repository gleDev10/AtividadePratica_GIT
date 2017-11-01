/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepratica;

/**
 *
 * @author 71600922
 */
public class ContaCorrente extends Conta{
    public ContaCorrente(String n, String nc){
        super(n, nc);
    }
    
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }
    
    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }
}
