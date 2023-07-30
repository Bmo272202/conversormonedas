package ConversorDeTemperatura;

import javax.swing.*;

public class FuncionesTemperatura {

    ConversorTemperaturas temperaturas = new ConversorTemperaturas();

    public void convertirTemperaturas(double Tinput){
        String opciones = (JOptionPane.showInputDialog(null,
                "Eliga a que grados desea converir","Temperaturas",
                JOptionPane.QUESTION_MESSAGE,null,new Object[]{"De Celcius a Fahrenheit","De Fahrenheit a Celcius"},
                "Seleccion")).toString();

        switch (opciones){
            case "De Celcius a Fahrenheit":
                temperaturas.convertirCelciusAFahrenheit(Tinput);
                break;
            case "De Fahrenheit a Celcius":
                temperaturas.convertirFahrenheitACelcius(Tinput);
                break;
        }
    }

}
