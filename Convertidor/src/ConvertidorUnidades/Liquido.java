/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertidorUnidades;

/**
 *
 * @author aless
 */
public class Liquido {
    // Convierte de mililitro a otras unidades
    public static double convertirML(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "ml": // Mililitro
                return valor;
            case "cl": // Centilitro
                return valor / 10;
            case "dl": // Decilitro
                return valor / 100;
            case "l": // Litro
                return valor / 1000;
            case "dal": // Decalitro
                return valor / 10000;
            case "hl": // Hectolitro
                return valor / 100000;
            case "kl": // Kilolitro
                return valor / 1000000;
            default:
                return -1;
        }
    }
    
    // Convierte de centilitros a otras unidades
    public static double convertirCL(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "ml":
                return valor * 10;
            case "cl":
                return valor;
            case "dl":
                return valor / 10;
            case "l":
                return valor / 100;
            case "dal":
                return valor / 1000;
            case "hl":
                return valor / 10000;
            case "kl":
                return valor / 100000;
            default:
                return -1;
        }
    }
    
    // Convierte de decilitros a otras unidades
    public static double convertirDL(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "ml":
                return valor * 100;
            case "cl":
                return valor * 10;
            case "dl":
                return valor;
            case "l":
                return valor / 10;
            case "dal":
                return valor / 100;
            case "hl":
                return valor / 1000;
            case "kl":
                return valor / 10000;
            default:
                return -1;
        }
    }
    
    // Convierte de litros a otras unidades
    public static double convertirL(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "ml":
                return valor * 1000;
            case "cl":
                return valor * 100;
            case "dl":
                return valor * 10;
            case "l":
                return valor;
            case "dal":
                return valor / 10;
            case "hl":
                return valor / 100;
            case "kl":
                return valor / 1000;
            default:
                return -1;
        }
    }
    
    // Convierte de decalitros a otras unidades
    public static double convertirDAL(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "ml":
                return valor * 10000;
            case "cl":
                return valor * 1000;
            case "dl":
                return valor * 100;
            case "l":
                return valor * 10;
            case "dal":
                return valor;
            case "hl":
                return valor / 10;
            case "kl":
                return valor / 100;
            default:
                return -1;
        }
    }
    
    // Convierte de hectolitros a otras unidades
    public static double convertirHL(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "ml":
                return valor * 100000;
            case "cl":
                return valor * 10000;
            case "dl":
                return valor * 1000;
            case "l":
                return valor * 100;
            case "dal":
                return valor * 10;
            case "hl":
                return valor;
            case "kl":
                return valor / 10;
            default:
                return -1;
        }
    }
    
    // Convierte de kilolitros a otras unidades
    public static double convertirKL(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "ml":
                return valor * 1000000;
            case "cl":
                return valor * 100000;
            case "dl":
                return valor * 10000;
            case "l":
                return valor * 1000;
            case "dal":
                return valor * 100;
            case "hl":
                return valor * 10;
            case "kl":
                return valor;
            default:
                return -1;
        }
    }
}
