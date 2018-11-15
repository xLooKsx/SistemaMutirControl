/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.dtos;

import java.util.Objects;

/**
 *
 * @author Felipe
 */
public class PecasFornecedorDto {
    
    private PecasDto pecas_idPecas;
    private FornecedorDto fornecedor_cnpj;

    public PecasFornecedorDto() {
    }
     
    public PecasFornecedorDto(PecasDto pecas_idPecas, FornecedorDto fornecedor_cnpj) {
        this.pecas_idPecas = pecas_idPecas;
        this.fornecedor_cnpj = fornecedor_cnpj;
    }

    public PecasDto getPecas_idPecas() {
        return pecas_idPecas;
    }

    public void setPecas_idPecas(PecasDto pecas_idPecas) {
        this.pecas_idPecas = pecas_idPecas;
    }

    public FornecedorDto getFornecedor_cnpj() {
        return fornecedor_cnpj;
    }

    public void setFornecedor_cnpj(FornecedorDto fornecedor_cnpj) {
        this.fornecedor_cnpj = fornecedor_cnpj;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.pecas_idPecas);
        hash = 67 * hash + Objects.hashCode(this.fornecedor_cnpj);
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
        final PecasFornecedorDto other = (PecasFornecedorDto) obj;
        if (!Objects.equals(this.pecas_idPecas, other.pecas_idPecas)) {
            return false;
        }
        if (!Objects.equals(this.fornecedor_cnpj, other.fornecedor_cnpj)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pecas_Fornecedor{" + "pecas_idPecas=" + pecas_idPecas + ", fornecedor_cnpj=" + fornecedor_cnpj + '}';
    }
    
    
    
    
    
}
