package com.example.hwreciclerviewaph;

import java.io.Serializable;

/**
 * clase que define lo que llevará la card
 * implementa la interfaz Serializable para que pueda ser enviado a otra activity
 */

public class ListElement implements Serializable {
    //variables
    public int imagen;
    public String titulo;
    public String kcal;
    public String[] ingredientes;
    public String proceso;
    public String consejos;
    public String porciones;
    public String instrumentos;
    public int[] fotografias;
//constructor
    public ListElement(){
    }

    public ListElement(int imagen, String titulo, String kcal, String[] ingredientes, String proceso, String consejos, String porciones, String instrumentos, int[] fotografias) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.kcal = kcal;
        this.ingredientes = ingredientes;
        this.proceso = proceso;
        this.consejos = consejos;
        this.porciones = porciones;
        this.instrumentos = instrumentos;
        this.fotografias = fotografias;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getKcal() {
        return kcal;
    }

    public void setKcal(String kcal) {
        this.kcal = kcal;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public String getConsejos() {
        return consejos;
    }

    public void setConsejos(String consejos) {
        this.consejos = consejos;
    }

    public String getPorciones() {
        return porciones;
    }

    public void setPorciones(String porciones) {
        this.porciones = porciones;
    }

    public String getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(String instrumentos) {
        this.instrumentos = instrumentos;
    }

    public int[] getFotografias() {
        return fotografias;
    }

    public void setFotografias(int[] fotografias) {
        this.fotografias = fotografias;
    }

  /*    public ListElement(int imagen, String titulo, String kcal) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.kcal = kcal ;
    }


    //getters &setter


    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getKcal() {
        return kcal;
    }

    public void setKcal(String kcal) {
        this.kcal = kcal;
    }*/



}
