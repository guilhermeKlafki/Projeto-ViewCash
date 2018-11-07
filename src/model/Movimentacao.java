/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author guilherme.klafki
 */
public class Movimentacao {
    
    private int codigo_movi;
    private int codigo_tppag;
    private int codigo_tpmovi;
    private int codigo_usu;
    private String valor;
    private String data;
    private String res_des;

    public int getCodigo_movi() {
        return codigo_movi;
    }

    public void setCodigo_movi(int codigo_movi) {
        this.codigo_movi = codigo_movi;
    }

    public int getCodigo_tppag() {
        return codigo_tppag;
    }

    public void setCodigo_tppag(int codigo_tppag) {
        this.codigo_tppag = codigo_tppag;
    }

    public int getCodigo_tpmovi() {
        return codigo_tpmovi;
    }

    public void setCodigo_tpmovi(int codigo_tpmovi) {
        this.codigo_tpmovi = codigo_tpmovi;
    }

    public int getCodigo_usu() {
        return codigo_usu;
    }

    public void setCodigo_usu(int codigo_usu) {
        this.codigo_usu = codigo_usu;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getRes_des() {
        return res_des;
    }

    public void setRes_des(String res_des) {
        this.res_des = res_des;
    }
    
    
    
}
