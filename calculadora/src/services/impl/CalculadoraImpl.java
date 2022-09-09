package services.impl;

import Eceptions.CalculadoraExceptions;
import services.CalculadoraInterfaces;

import javax.swing.*;

public class CalculadoraImpl  implements CalculadoraInterfaces {


    @Override
    public void addition(String a, String b) {
        try{
              int resultado = Integer.parseInt(a)+ Integer.parseInt(b);
            JOptionPane.showMessageDialog(null,"El resultado de la suma es: " + resultado);
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null,"Ingrese un tipo de dato valido");
        }
    }

    @Override
    public void substraction(String a, String b) {
        try{
            int resultado = Integer.parseInt(a) - Integer.parseInt(b);
            JOptionPane.showMessageDialog(null,"El resultado de la resta es: " + resultado);
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null,"Ingrese un tipo de dato valido");
        }

    }

    @Override
    public void divide(String a, String b) {

        try{
            if(Float.parseFloat(b) != 0.0){
                float resultado = Float.parseFloat(a) / Float.parseFloat(b);
                JOptionPane.showMessageDialog(null,"El resutlado de la division es: "+ resultado);
            }else {
                throw  new CalculadoraExceptions("  Error, division por cero");
            }


        }catch (NumberFormatException err){
            JOptionPane.showMessageDialog(null,"Ingrese un tipo de dato valido");
        } catch (CalculadoraExceptions err) {
           JOptionPane.showMessageDialog(null,err);
        }

    }
}
