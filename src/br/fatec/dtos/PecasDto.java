/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.dtos;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Felipe
 */
public class PecasDto {
    private String idPecas;
    private Date ano_Fabricacao;
    private String modelo;
    private String descricao;

    public PecasDto() {
    }

    public PecasDto(String idPecas, Date ano_Fabricacao, String modelo, String descricao) {
        this.idPecas = idPecas;
        this.ano_Fabricacao = ano_Fabricacao;
        this.modelo = modelo;
        this.descricao = descricao;
    }

    public String getIdPecas() {
        return idPecas;
    }

    public void setIdPecas(String idPecas) {
        this.idPecas = idPecas;
    }

    public Date getAno_Fabricacao() {
        return ano_Fabricacao;
    }

    public void setAno_Fabricacao(Date ano_Fabricacao) {
        this.ano_Fabricacao = ano_Fabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.idPecas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PecasDto other = (PecasDto) obj;
        if (!Objects.equals(this.idPecas, other.idPecas)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pecas{" + "idPecas=" + idPecas + ", ano_Fabricacao=" + ano_Fabricacao + ", modelo=" + modelo + ", descricao=" + descricao + '}';
    }
    
}
