/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertidorUnidades;

/**
 *
 * @author aless
 */
/**
*Clase para convertir la masa a diferentes unidades de medida 
*/
public class Masa {
    
/**
*Convierte Miligramos a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
    public static double convertirMG(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "mg": 
                return valor;
            case "cg": 
                return valor / 10;
            case "dg": 
                return valor / 100;
            case "g": 
                return valor / 1000;
            case "dag": 
                return valor / 10000;
            case "hg": 
                return valor / 100000;
            case "kg": 
                return valor / 1000000;
            case "t": 
                return valor / 1000000000;
            default:
                return -1;
        }
    }
    
/**
*Convierte Centigramos a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
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
    
/**
*Convierte Decigramos a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
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
    
/**
*Convierte Gramos a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
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
    
/**
*Convierte Decagramos a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
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
    
/**
*Convierte Hectagramos a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
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
    
/**
*Convierte Kilogramos a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
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
    
/**
*Convierte Toneladas a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
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
