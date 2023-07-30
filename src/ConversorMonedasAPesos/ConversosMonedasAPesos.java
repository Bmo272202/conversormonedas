package ConversorMonedasAPesos;

import javax.swing.*;
import java.text.DecimalFormat;

public class ConversosMonedasAPesos {

    DecimalFormat decimalFormat = new DecimalFormat();

    public void convertirDorlaresAPesos(double valor){
        double Dolarmoneda = valor * 3923.15;
        Dolarmoneda = (double) Math.round(Dolarmoneda * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tiene $ " + decimalFormat.format(Dolarmoneda) + " Dolares");
    }

    public void convertirEurosAPesos(double valor){
        double Euromoneda = valor * 4328.39;
        Euromoneda = (double) Math.round(Euromoneda * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tiene $ " + decimalFormat.format(Euromoneda) + " Euros");
    }

    public void convertirLibraEsterlinaAPesos(double valor){
        double LibraEsterlinamoneda = valor * 5047.13;
        LibraEsterlinamoneda = (double) Math.round(LibraEsterlinamoneda * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tiene $ " + decimalFormat.format(LibraEsterlinamoneda) + " Libras");
    }

    public void convertirYenAPesos(double valor){
        double Yenmoneda = valor * 27.87;
        Yenmoneda = (double) Math.round(Yenmoneda * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tiene $ " + decimalFormat.format(Yenmoneda) + " Yenes");
    }

    public void convertirWonSurCoreanoAPesos(double valor){
        double Wonmoneda = valor * 3.08;
        Wonmoneda = (double) Math.round(Wonmoneda * 100d)/100;
        JOptionPane.showMessageDialog(null,"Tiene $ " + decimalFormat.format(Wonmoneda) + " Wones");
    }
}
