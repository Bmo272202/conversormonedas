package ConversorDeMonedas;

import ConversorDeMonedas.ConversorMonedas;

import javax.swing.*;

public class Funciones {

    ConversorMonedas monedas = new ConversorMonedas();

    public void convertirMonedas(double Minput){
        String opciones = (JOptionPane.showInputDialog(null,
                "Elige la moneda a la que deseas converir tu dinero","Monedas",
                JOptionPane.QUESTION_MESSAGE,null,new Object[]{"De Pesos a Dolar","De Pesos a Euros",
                        "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Sur-coreano"},
                "Seleccion")).toString();

        switch (opciones){
            case "De Pesos a Dolar":
                monedas.convertirPesosADorlares(Minput);
                break;
            case "De Pesos a Euros":
                monedas.convertirPesosAEuros(Minput);
                break;
            case "De Pesos a Libras":
                monedas.convertirPesosALibraEsterlina(Minput);
                break;
            case "De Pesos a Yen":
                monedas.convertirPesosAYen(Minput);
                break;
            case "De Pesos a Won Sur-coreano":
                monedas.convertirPesosAWonSurCoreano(Minput);
                break;
        }
    }
}
