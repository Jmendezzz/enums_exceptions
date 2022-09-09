package application;

import controller.CalculadoraController;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        CalculadoraController calculadoraController = new CalculadoraController();

        System.out.println("Hello world!");
        System.out.println(Float.parseFloat("0"));
        int option; do {
            option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la operacion que desea realizar \n"+
                    "1. Suma \n +" +
                    "2. Resta \n +" +
                    "3. División"));
            switch (option){
                case 1:
                    calculadoraController.addition();
                    break;
                case 2:
                    calculadoraController.substraction();
                    break;
                case 3:
                    calculadoraController.divide();
                    break;
            }
        } while (option != 0);
    }
}