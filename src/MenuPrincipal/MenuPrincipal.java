package MenuPrincipal;

import ConversorDeMonedas.Funciones;
import ConversorDeTemperatura.FuncionesTemperatura;
import ConversorMonedasAPesos.FuncionesMonedasAPesos;

import javax.swing.*;

public class MenuPrincipal {
    public static void main(String[] args) {
        Funciones monedas = new Funciones();
        FuncionesMonedasAPesos monedasAPesos = new FuncionesMonedasAPesos();
        FuncionesTemperatura temperaturas = new FuncionesTemperatura();

        boolean flag = true;

        while (flag){

            String opciones = (JOptionPane.showInputDialog(null,"selecciones una opcion","Menu",JOptionPane.QUESTION_MESSAGE,null,new Object[]{"conversor de moneda", "conversor moneda a pesos", "conversor de temperatura"}, "Seleccion")).toString();

            switch (opciones){
                case "conversor de moneda":
                    String input = JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir");
                    if(validarNumero(input)){
                        double Minput = Double.parseDouble(input);
                        monedas.convertirMonedas(Minput);

                        int respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
                        if (JOptionPane.OK_OPTION == respuesta){
                            System.out.println("Selecciona opcion Afirmativa");
                        }else {
                            flag = false;
                            JOptionPane.showMessageDialog(null, "Programa Terminado");
                        }
                    }else {
                        JOptionPane.showMessageDialog(null,"Valor invalido");
                    }
                    break;
                case "conversor moneda a pesos":
                    input = JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir");
                    if(validarNumero(input)){
                        double Pinput = Double.parseDouble(input);
                        monedasAPesos.convertirMonedas(Pinput);

                        int respuestaP = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
                        if (JOptionPane.OK_OPTION == respuestaP){
                            System.out.println("Selecciona opcion Afirmativa");
                        }else {
                            flag = false;
                            JOptionPane.showMessageDialog(null, "Programa Terminado");
                        }
                    }else {
                        JOptionPane.showMessageDialog(null,"Valor invalido");
                    }
                    break;
                case "conversor de temperatura":
                    input = JOptionPane.showInputDialog("Ingrese el valor de la temperatura que desea convertir");
                    if(validarNumero(input) == true){
                        double Tinput = Double.parseDouble(input);
                        temperaturas.convertirTemperaturas(Tinput);

                        int respuesta = 0;
                        respuesta = JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
                        if ((respuesta == 0)&&(validarNumero(input) == true)){

                        }else {
                            flag = false;
                            JOptionPane.showMessageDialog(null, "Programa Terminado");
                        }
                    }else {
                        JOptionPane.showMessageDialog(null,"Valor invalido");
                    }
                    break;
            }
        }
    }

    public static boolean validarNumero(String input){
        try {
            double x =Double.parseDouble(input);
            if (x >= 0 || x <= 0)
                return true;
        }catch (NumberFormatException exception) {
            System.out.println("false");
        }
        return false;
    }
}
