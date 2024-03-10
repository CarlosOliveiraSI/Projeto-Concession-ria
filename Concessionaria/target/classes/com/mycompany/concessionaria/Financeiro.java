/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria;

/**
 *
 * @author rulli
 */
public class Financeiro {
    private double fluxoCaixa;
    private String contasPagar;
    private  String contasReceber; 

    public double getFluxoCaixa() {
        return fluxoCaixa;
    }

    public void setFluxoCaixa(double fluxoCaixa) {
        this.fluxoCaixa = fluxoCaixa;
    }

    public String getContasPagar() {
        return contasPagar;
    }

    public void setContasPagar(String contasPagar) {
        this.contasPagar = contasPagar;
    }

    public String getContasReceber() {
        return contasReceber;
    }

    public void setContasReceber(String contasReceber) {
        this.contasReceber = contasReceber;
    }
    
}
