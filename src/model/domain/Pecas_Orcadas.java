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
public class Pecas_Orcadas {
    private Mecanicos mecanicos_cpf;
    private Pecas_Fornecedor pecas_idPecas;
    private Pecas_Fornecedor fornecedores_cnpj;
    private int quantidade;
    private double valor_unitario;

    public Pecas_Orcadas() {
    }

    public Pecas_Orcadas(Mecanicos mecanicos_cpf, Pecas_Fornecedor pecas_idPecas, Pecas_Fornecedor fornecedores_cnpj, int quantidade, double valor_unitario) {
        this.mecanicos_cpf = mecanicos_cpf;
        this.pecas_idPecas = pecas_idPecas;
        this.fornecedores_cnpj = fornecedores_cnpj;
        this.quantidade = quantidade;
        this.valor_unitario = valor_unitario;
    }

    public Mecanicos getMecanicos_cpf() {
        return mecanicos_cpf;
    }

    public void setMecanicos_cpf(Mecanicos mecanicos_cpf) {
        this.mecanicos_cpf = mecanicos_cpf;
    }

    public Pecas_Fornecedor getPecas_idPecas() {
        return pecas_idPecas;
    }

    public void setPecas_idPecas(Pecas_Fornecedor pecas_idPecas) {
        this.pecas_idPecas = pecas_idPecas;
    }

    public Pecas_Fornecedor getFornecedores_cnpj() {
        return fornecedores_cnpj;
    }

    public void setFornecedores_cnpj(Pecas_Fornecedor fornecedores_cnpj) {
        this.fornecedores_cnpj = fornecedores_cnpj;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.mecanicos_cpf);
        hash = 89 * hash + Objects.hashCode(this.pecas_idPecas);
        hash = 89 * hash + Objects.hashCode(this.fornecedores_cnpj);
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
        final Pecas_Orcadas other = (Pecas_Orcadas) obj;
        if (!Objects.equals(this.mecanicos_cpf, other.mecanicos_cpf)) {
            return false;
        }
        if (!Objects.equals(this.pecas_idPecas, other.pecas_idPecas)) {
            return false;
        }
        if (!Objects.equals(this.fornecedores_cnpj, other.fornecedores_cnpj)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pecas_Orcadas{" + "mecanicos_cpf=" + mecanicos_cpf + ", pecas_idPecas=" + pecas_idPecas + ", fornecedores_cnpj=" + fornecedores_cnpj + ", quantidade=" + quantidade + ", valor_unitario=" + valor_unitario + '}';
    }
    
}
