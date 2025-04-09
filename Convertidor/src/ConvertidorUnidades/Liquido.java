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
*Clase para convertir el líquido a diferentes unidades de medida 
*/
public class Liquido {
    
/**
*Convierte Mililitros a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
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
    
/**
*Convierte Centilitros a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
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
    
/**
*Convierte Decilitros a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
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
    
/**
*Convierte Litros a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
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
    
/**
*Convierte Decalitros a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
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
    
/**
*Convierte Hectalitros a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
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
    
/**
*Convierte Kilolitros a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
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
