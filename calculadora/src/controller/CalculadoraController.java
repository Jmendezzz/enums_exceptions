package controller;

import services.impl.CalculadoraImpl;

import javax.swing.*;

public class CalculadoraController {
    CalculadoraImpl calculadoraServices = new CalculadoraImpl();
    public void addition(){
          String a =JOptionPane.showInputDialog("Ingrese un numero");
          String b = JOptionPane.showInputDialog("Ingrese otro numero");
            calculadoraServices.addition(a,b);
    }
    public void substraction(){
        String a =JOptionPane.showInputDialog("Ingrese un numero");
        String b = JOptionPane.showInputDialog("Ingrese otro numero");
        calculadoraServices.substraction(a,b);
    }
    public void divide(){
        String a =JOptionPane.showInputDialog("Ingrese un numero");
        String b = JOptionPane.showInputDialog("Ingrese otro numero");
        calculadoraServices.divide(a,b);
    }
}
