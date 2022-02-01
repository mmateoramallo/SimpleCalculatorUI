/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author mateo
 */
public class Numbers {
    /*
    Clase con Los atributos de numeros a ingresar en la calculadora
    */ 
    private float numberOne;
    private float SecondNumber;
    private String operador;
    private boolean punto = true;

    public boolean isPunto() {
        return punto;
    }

    public void setPunto(boolean punto) {
        this.punto = punto;
    }

    public double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(float numberOne) {
        this.numberOne = numberOne;
    }

    public double getSecondNumber() {
        return SecondNumber;
    }

    public void setSecondNumber(float SecondNumber) {
        this.SecondNumber = SecondNumber;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }


}
