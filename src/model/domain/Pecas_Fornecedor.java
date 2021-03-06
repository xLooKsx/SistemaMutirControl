/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import java.util.Objects;

/**
 *
 * @author Felipe
 */
public class Pecas_Fornecedor {
    
    private Pecas pecas_idPecas;
    private Fornecedor fornecedor_cnpj;

    public Pecas_Fornecedor() {
    }
     
    public Pecas_Fornecedor(Pecas pecas_idPecas, Fornecedor fornecedor_cnpj) {
        this.pecas_idPecas = pecas_idPecas;
        this.fornecedor_cnpj = fornecedor_cnpj;
    }

    public Pecas getPecas_idPecas() {
        return pecas_idPecas;
    }

    public void setPecas_idPecas(Pecas pecas_idPecas) {
        this.pecas_idPecas = pecas_idPecas;
    }

    public Fornecedor getFornecedor_cnpj() {
        return fornecedor_cnpj;
    }

    public void setFornecedor_cnpj(Fornecedor fornecedor_cnpj) {
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
        final Pecas_Fornecedor other = (Pecas_Fornecedor) obj;
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
