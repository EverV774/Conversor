/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertidorUnidades;

/**
 *
 * @author aless
 */
public class Fuerza {
    
    public static double convertirDyne(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "dyne":
                return valor;
            case "lbf":
                return valor / 444822;
            case "kgf":
                return valor / 980665;
            case "n":
                return valor / 100000;
            case "kn":
                return valor / 100000000;
            case "tf":
                return valor / 9806650000L;
            case "mn":
                return valor / 100000000000L;
            default:
                return -1;
        }
    }

    public static double convertirLbf(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "dyne":
                return valor * 444822;
            case "lbf":
                return valor;
            case "kgf":
                return valor * 0.453592;
            case "n":
                return valor * 4.44822;
            case "kn":
                return valor * 0.00444822;
            case "tf":
                return valor * 0.000444822;
            case "mn":
                return valor * 0.000000444822;
            default:
                return -1;
        }
    }

    public static double convertirKgf(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "dyne":
                return valor * 980665;
            case "lbf":
                return valor * 2.20462;
            case "kgf":
                return valor;
            case "n":
                return valor * 9.80665;
            case "kn":
                return valor * 0.00980665;
            case "tf":
                return valor * 0.001;
            case "mn":
                return valor * 0.000001;
            default:
                return -1;
        }
    }

    public static double convertirN(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "dyne":
                return valor * 100000;
            case "lbf":
                return valor * 0.22481;
            case "kgf":
                return valor * 0.10197;
            case "n":
                return valor;
            case "kn":
                return valor * 0.001;
            case "tf":
                return valor * 0.00010197;
            case "mn":
                return valor * 0.00000010197;
            default:
                return -1;
        }
    }

    public static double convertirKN(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "dyne":
                return valor * 100000000;
            case "lbf":
                return valor * 224.81;
            case "kgf":
                return valor * 101.9716;
            case "n":
                return valor * 1000;
            case "kn":
                return valor;
            case "tf":
                return valor * 0.010197;
            case "mn":
                return valor * 0.000010197;
            default:
                return -1;
        }
    }

    public static double convertirTF(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "dyne":
                return valor * 9806650000L;
            case "lbf":
                return valor * 2248.22;
            case "kgf":
                return valor * 1000;
            case "n":
                return valor * 9806.65;
            case "kn":
                return valor * 9.80665;
            case "tf":
                return valor;
            case "mn":
                return valor * 1000;
            default:
                return -1;
        }
    }

    public static double convertirMN(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "dyne":
                return valor * 100000000000L;
            case "lbf":
                return valor * 4448220000L;
            case "kgf":
                return valor * 1019700000L;
            case "n":
                return valor * 1000000;
            case "kn":
                return valor * 1000;
            case "tf":
                return valor * 1000;
            case "mn":
                return valor;
            default:
                return -1;
        }
    }
    
}
