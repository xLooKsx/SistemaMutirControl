/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package br.fatec.utils;


import br.fatec.dtos.FornecedorDto;
import java.util.InputMismatchException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Felipe
 */
public class SistemaUtils {


    public static boolean validarCnpj(String CNPJ) {
// considera-se erro CNPJ's formados por uma sequencia de numeros iguais
        if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111")
                || CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333")
                || CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555")
                || CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777")
                || CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999")
                || (CNPJ.length() != 14)) {
            return (false);
        }

        char dig13, dig14;
        int sm, i, r, num, peso;

// "try" - protege o código para eventuais erros de conversao de tipo (int)
        try {
// Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 11; i >= 0; i--) {
// converte o i-ésimo caractere do CNPJ em um número:
// por exemplo, transforma o caractere '0' no inteiro 0
// (48 eh a posição de '0' na tabela ASCII)
                num = (int) (CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig13 = '0';
            } else {
                dig13 = (char) ((11 - r) + 48);
            }

// Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 12; i >= 0; i--) {
                num = (int) (CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig14 = '0';
            } else {
                dig14 = (char) ((11 - r) + 48);
            }

// Verifica se os dígitos calculados conferem com os dígitos informados.
            if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }

    public boolean validarTelefone(String telefone){
        
        return true;
    }
    
    public boolean validarEmail(String telefone){
        
        return true;
    }
    
    public boolean validarNome(String telefone){
        
        return true;
    }
    
    public boolean validarRazaoSocial(String telefone){
        
        return true;
    }
    
    public boolean validarFornecedor(FornecedorDto fornecedor) {

        return true;
    }


    private static ResourceBundle getConfig() {

        ResourceBundle bundle = ResourceBundle.getBundle("br.fatec.resources.Config");
        return bundle;
    }

    public String getConfigProperty(String key) {
        return getConfig().getString(key);
    }

    public String getMessageProperty(String key) {

        String text;
        try {
            text = getMessage().getString(key);
        } catch (MissingResourceException e) {
            text = String.format("%s não econtrado.", key);
            Logger.getLogger(SistemaUtils.class.getName()).log(Level.SEVERE, null, e);
        }
        return text;
    }

    private static ResourceBundle getMessage() {

        ResourceBundle bundle = ResourceBundle.getBundle("br.fatec.resources.Message");
        return bundle;
    }

}
