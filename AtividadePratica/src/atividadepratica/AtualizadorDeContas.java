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
public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    
    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
    
    public void roda(Conta c){
        System.out.println("Saldo Anterior " + c.getSaldo());
        c.atualiza(selic);
        double total = c.getSaldo() + saldoTotal;
        System.out.println("Saldo Final " + total);
    }
    
    public double getSaldoTotal(){
        return saldoTotal;
    }
}
