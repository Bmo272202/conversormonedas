package ConversorDeMonedas;

import javax.swing.*;

public class ConversorMonedas {

    public void convertirPesosADorlares(double valor){
        double monedaDolar = valor / 3923.15;
        monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tiene $ " + monedaDolar + " Dolares");
    }

    public void convertirPesosAEuros(double valor){
        double monedaEuro = valor / 4328.39;
        monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tiene $ " + monedaEuro + " Euros");
    }

    public void convertirPesosALibraEsterlina(double valor){
        double monedaLibraEsterlina = valor / 5047.13;
        monedaLibraEsterlina = (double) Math.round(monedaLibraEsterlina * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tiene $ " + monedaLibraEsterlina + " Libras");
    }

    public void convertirPesosAYen(double valor){
        double monedaYen = valor / 27.87;
        monedaYen = (double) Math.round(monedaYen * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tiene $ " + monedaYen + " Yenes");
    }

    public void convertirPesosAWonSurCoreano(double valor){
        double monedaWon = valor / 3.08;
        monedaWon = (double) Math.round(monedaWon * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tiene $ " + monedaWon + " Wones");
    }
}
