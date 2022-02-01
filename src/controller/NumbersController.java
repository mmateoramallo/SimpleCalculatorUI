/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Numbers;

/**
 *
 * @author mateo
 */
public class NumbersController {
    public void createFirstNumber(Integer firstNumber){
        Numbers numberOne = new Numbers();
        numberOne.setNumberOne(firstNumber);
    }
    public void createSecondNumber(Integer SecondNumber){
        Numbers numberTwo = new Numbers();
        numberTwo.setSecondNumber(SecondNumber);
    }
    public double adicion(Integer firstNumber, Integer SecondNumber){
        return firstNumber + SecondNumber;
    }
    
}
