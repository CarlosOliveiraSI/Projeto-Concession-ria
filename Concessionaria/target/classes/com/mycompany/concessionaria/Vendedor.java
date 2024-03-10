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
public class Vendedor {
    private String nome;
    private String comissao;
    private String historicoDeVendas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComissao() {
        return comissao;
    }

    public void setComissao(String comissao) {
        this.comissao = comissao;
    }

    public String getHistoricoDeVendas() {
        return historicoDeVendas;
    }

    public void setHistoricoDeVendas(String historicoDeVendas) {
        this.historicoDeVendas = historicoDeVendas;
    }
    
}
