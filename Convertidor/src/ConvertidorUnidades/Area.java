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
*Clase para convertir a diferentes unidades de medida el área de los objetos 
*/
public class Area {
/**
*Convierte milimetros cuadrados a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
    public static double convertirMm2(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "mm2":
                return valor;
            case "cm2":
                return valor / 100;
            case "m2":
                return valor / 1000000;
            case "ha2":
                return valor / 10000000000L;
            case "km2":
                return valor / 1000000000000L;
            case "ft2":
                return valor / 929.03;
            case "yd2":
                return valor / 8361.27;
            default:
                return -1;
        }
    }
    
/**
*Convierte centimetros cuadrados a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
    public static double convertirCm2(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "mm2":
                return valor * 100;
            case "cm2":
                return valor;
            case "m2":
                return valor / 10000;
            case "ha2":
                return valor / 1000000;
            case "km2":
                return valor / 10000000000L;
            case "ft2":
                return valor / 929.03;
            case "yd2":
                return valor / 8361.27;
            default:
                return -1;
        }
    }
    
/**
*Convierte metros cuadrados a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
    public static double convertirM2(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "mm2":
                return valor / 1000000;
            case "cm2":
                return valor / 10000;
            case "m2":
                return valor;
            case "ha2":
                return valor * 10000;
            case "km2":
                return valor * 1000000;
            case "ft2":
                return valor * 0.092903;
            case "yd2":
                return valor * 0.836127;
            default:
                return -1;
        }
    }
    
/**
*Convierte hectáreas cuadradas a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
    public static double convertirHa2(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "mm2":
                return valor * 10000000000L;
            case "cm2":
                return valor * 100000000;
            case "m2":
                return valor * 10000;
            case "ha2":
                return valor;
            case "km2":
                return valor / 100;
            case "ft2":
                return valor * 107639.104;
            case "yd2":
                return valor * 11959.9005;
            default:
                return -1;
        }
    }
    
/**
*Convierte kilometros cuadrados a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
    public static double convertirKm2(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "mm2":
                return valor * 1000000000000L;
            case "cm2":
                return valor * 10000000000L;
            case "m2":
                return valor * 1000000;
            case "ha2":
                return valor * 100;
            case "km2":
                return valor;
            case "ft2":
                return valor * 10763910.4;
            case "yd2":
                return valor * 1195990.05;
            default:
                return -1;
        }
    }
    
/**
*Convierte pies cuadrados a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
    public static double convertirFt2(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "mm2":
                return valor * 929.0304;
            case "cm2":
                return valor * 92.90304;
            case "m2":
                return valor * 0.09290304;
            case "ha2":
                return valor * 0.000009290304;
            case "km2":
                return valor * 0.00000009290304;
            case "ft2":
                return valor;
            case "yd2":
                return valor / 9;
            default:
                return -1;
        }
    }
    
/**
*Convierte yardas cuadradas a otras unidades
* @param valor es el número ingresado
* @param unidadDestino es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
    public static double convertirYd2(double valor, String unidadDestino){
        switch (unidadDestino.toLowerCase()){
            case "mm2":
                return valor * 8361.2736;
            case "cm2":
                return valor * 836.12736;
            case "m2":
                return valor * 0.83612736;
            case "ha2":
                return valor * 0.000083612736;
            case "km2":
                return valor * 0.00000083612736;
            case "ft2":
                return valor * 9;
            case "yd2":
                return valor;
            default:
                return -1;
        }
    }
}
