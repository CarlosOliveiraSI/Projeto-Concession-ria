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
public class Marca {
    private String nome;
    private String paisOrigem;
    private String modelosAssociados;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getModelosAssociados() {
        return modelosAssociados;
    }

    public void setModelosAssociados(String modelosAssociados) {
        this.modelosAssociados = modelosAssociados;
    }
    
}
