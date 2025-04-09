/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertidorUnidades;

/**
 *
 * @author aless
 */
public class Masa {
    // Convierte de miligramos a otras unidades
    public static double convertirMG(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "mg": // Miligramo
                return valor;
            case "cg": // Centigramo
                return valor / 10;
            case "dg": // Decigramo
                return valor / 100;
            case "g": // Gramo
                return valor / 1000;
            case "dag": // Decagramo
                return valor / 10000;
            case "hg": // Hectogramo
                return valor / 100000;
            case "kg": // Kilogramo
                return valor / 1000000;
            case "t": // Tonelada
                return valor / 1000000000;
            default:
                return -1;
        }
    }
    
    // Convierte de centigramos a otras unidades
    public static double convertirCG(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "mg":
                return valor * 10;
            case "cg":
                return valor;
            case "dg":
                return valor / 10;
            case "g":
                return valor / 100;
            case "dag":
                return valor / 1000;
            case "hg":
                return valor / 10000;
            case "kg":
                return valor / 100000;
            case "t":
                return valor / 100000000;
            default:
                return -1;
        }
    }
    
    // Convierte de decigramos a otras unidades
    public static double convertirDG(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "mg":
                return valor * 100;
            case "cg":
                return valor * 10;
            case "dg":
                return valor;
            case "g":
                return valor / 10;
            case "dag":
                return valor / 100;
            case "hg":
                return valor / 1000;
            case "kg":
                return valor / 10000;
            case "t":
                return valor / 10000000;
            default:
                return -1;
        }
    }
    
    // Convierte de gramos a otras unidades
    public static double convertirG(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "mg":
                return valor * 1000;
            case "cg":
                return valor * 100;
            case "dg":
                return valor * 10;
            case "g":
                return valor;
            case "dag":
                return valor / 10;
            case "hg":
                return valor / 100;
            case "kg":
                return valor / 1000;
            case "t":
                return valor / 1000000;
            default:
                return -1;
        }
    }
    
    // Convierte de decagramos a otras unidades
    public static double convertirDAG(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "mg":
                return valor * 10000;
            case "cg":
                return valor * 1000;
            case "dg":
                return valor * 100;
            case "g":
                return valor * 10;
            case "dag":
                return valor;
            case "hg":
                return valor / 10;
            case "kg":
                return valor / 100;
            case "t":
                return valor / 100000;
            default:
                return -1;
        }
    }
    
    // Convierte de hectogramos a otras unidades
    public static double convertirHG(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "mg":
                return valor * 100000;
            case "cg":
                return valor * 10000;
            case "dg":
                return valor * 1000;
            case "g":
                return valor * 100;
            case "dag":
                return valor * 10;
            case "hg":
                return valor;
            case "kg":
                return valor / 10;
            case "t":
                return valor / 10000;
            default:
                return -1;
        }
    }
    
    // Convierte de kilogramos a otras unidades
    public static double convertirKG(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "mg":
                return valor * 1000000;
            case "cg":
                return valor * 100000;
            case "dg":
                return valor * 10000;
            case "g":
                return valor * 1000;
            case "dag":
                return valor * 100;
            case "hg":
                return valor * 10;
            case "kg":
                return valor;
            case "t":
                return valor / 1000;
            default:
                return -1;
        }
    }
    
    // Convierte de toneladas a otras unidades
    public static double convertirT(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "mg":
                return valor * 1000000000;
            case "cg":
                return valor * 100000000;
            case "dg":
                return valor * 10000000;
            case "g":
                return valor * 1000000;
            case "dag":
                return valor * 100000;
            case "hg":
                return valor * 10000;
            case "kg":
                return valor * 1000;
            case "t":
                return valor;
            default:
                return -1;
        }
    }
}
