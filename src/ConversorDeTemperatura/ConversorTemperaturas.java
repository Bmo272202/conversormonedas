package ConversorDeTemperatura;

import javax.swing.*;

public class ConversorTemperaturas {

    public void convertirCelciusAFahrenheit(double valor){
        double celciusFahrenheit = (valor * (9/5.0)) + 32;
        celciusFahrenheit = (double) Math.round(celciusFahrenheit * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tiene " + celciusFahrenheit + " Grados ºF");
    }

    public void convertirFahrenheitACelcius(double valor){
        double FahrenheitCelcius = (5/9.0) * (valor - 32);
        FahrenheitCelcius = (double) Math.round(FahrenheitCelcius * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tiene " + FahrenheitCelcius + " Grados ºC");
    }
}
