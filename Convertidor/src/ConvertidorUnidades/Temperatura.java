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
*Clase para convertir la temperatura a diferentes unidades de medida 
*/
public class Temperatura {
    
/**
*Convierte Grados Celsius a otras unidades
* @param celsius es el número ingresado
* @param grados es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
        public static double convertirCelsius(double celsius, String grados){
        grados=grados.toLowerCase();
        double g=0;
        switch(grados){
            case "c":
                g=celsius;
            break;
            case "f":
                g=((celsius*9)/5)+32;
            break;
            case "k":
                g=celsius+273.15;
            break;
            default:
                g=-1;
            break;
        }
        return g;
    }
    
 /**
*Convierte Grados Fahrenheit a otras unidades
* @param fahrenheit es el número ingresado
* @param grados es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
        public static double convertirFahrenheit(double fahrenheit, String grados){
        grados=grados.toLowerCase();
        double g=0;
        switch(grados){
            case "c":
                g=((fahrenheit-32)*5)/9;
            break;
            case "f":
                g=fahrenheit;
            break;
            case "k":
                g=(((fahrenheit-32)*5)/9)+273.15;
            break;
            default:
                g=-1;
            break;
        }
        return g;
    }
        
/**
*Convierte Grados Kelvin a otras unidades
* @param kelvin es el número ingresado
* @param grados es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
        public static double convertirKelvin(double kelvin, String grados){
        grados=grados.toLowerCase();
        double g=0;
        switch(grados){
            case "c":
                g=kelvin-273.15;
            break;
            case "f":
                g=(((kelvin-273.15)*9)/5)+32;
            break;
            case "k":
                g=kelvin;
            break;
            default:
                g=-1;
            break;
        }
        return g;
    }
    
}
