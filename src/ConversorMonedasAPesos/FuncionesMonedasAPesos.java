package ConversorMonedasAPesos;

import javax.swing.*;

public class FuncionesMonedasAPesos {

    ConversosMonedasAPesos monedasAPesos = new ConversosMonedasAPesos();

    public void convertirMonedas(double Pinput){
        String opciones = (JOptionPane.showInputDialog(null,
                "Elige la moneda a la que deseas converir tu dinero","MonedasAPesos",
                JOptionPane.QUESTION_MESSAGE,null,new Object[]{"De Dolar a Pesos","De Euros a Pesos",
                        "De Libras a Pesos", "De Yen a Pesos", "De Won Sur-coreano a Pesos"},
                "Seleccion")).toString();

        switch (opciones){
            case "De Dolar a Pesos":
                monedasAPesos.convertirDorlaresAPesos(Pinput);
                break;
            case "De Euros a Pesos":
                monedasAPesos.convertirEurosAPesos(Pinput);
                break;
            case "De Libras a Pesos":
                monedasAPesos.convertirLibraEsterlinaAPesos(Pinput);
                break;
            case "De Yen a Pesos":
                monedasAPesos.convertirYenAPesos(Pinput);
                break;
            case "De Won Sur-coreano a Pesos":
                monedasAPesos.convertirWonSurCoreanoAPesos(Pinput);
                break;
        }
    }
}
