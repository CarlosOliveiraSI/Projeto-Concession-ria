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
    private double contasPagar;
    private double contasReceber; 

    public double getFluxoCaixa() {
        return fluxoCaixa;
    }

    public void setFluxoCaixa(double fluxoCaixa) {
        this.fluxoCaixa = fluxoCaixa;
    }

    public double getContasPagar() {
        return contasPagar;
    }

    public void setContasPagar(double contasPagar) {
        this.contasPagar = contasPagar;
    }

    public double getContasReceber() {
        return contasReceber;
    }

    public void setContasReceber(double contasReceber) {
        this.contasReceber = contasReceber;
    }
    
}
