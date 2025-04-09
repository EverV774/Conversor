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
*Clase para convertir la velocidad a diferentes unidades de medida 
*/
public class Velocidad {
    
/**
*Convierte Metros sobre Segundos a otras unidades
* @param ms es el número ingresado
* @param velocidad es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
        public static double convertirMS(double ms, String velocidad){
        velocidad=velocidad.toLowerCase();
        double v=0;
        switch(velocidad){
            case "m/s":
                v=ms;
            break;
            case "mi/h":
                v=ms*2.237;
            break;
            case "pie/s":
                v=ms*3.281;
            break;
            case "km/h":
                v=ms*3.6;
            break;
            default:
                v=-1;
            break;
        }
        return v;
    }
    
/**
*Convierte Millas sobre Horas a otras unidades
* @param mih es el número ingresado
* @param velocidad es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
        public static double convertirMiH(double mih, String velocidad){
        velocidad=velocidad.toLowerCase();
        double v=0;
        switch(velocidad){
            case "m/s":
                v=mih/2.237;
            break;
            case "mi/h":
                v=mih;
            break;
            case "pie/s":
                v=mih*1.467;
            break;
            case "km/h":
                v=mih*1.609;
            break;
            default:
                v=-1;
            break;
        }
        return v;
    }
    
/**
*Convierte Pies sobre Segundos a otras unidades
* @param ps es el número ingresado
* @param velocidad es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
        public static double convertirPieS(double ps, String velocidad){
        velocidad=velocidad.toLowerCase();
        double v=0;
        switch(velocidad){
            case "m/s":
                v=ps/3.281;
            break;
            case "mi/h":
                v=ps/1.467;
            break;
            case "pie/s":
                v=ps;
            break;
            case "km/h":
                v=ps*1.097;
            break;
            default:
                v=-1;
            break;
        }
        return v;
    }
    
/**
*Convierte Kilometros sobre Horas a otras unidades
* @param kmh es el número ingresado
* @param velocidad es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
        public static double convertirKmH(double kmh, String velocidad){
        velocidad=velocidad.toLowerCase();
        double v=0;
        switch(velocidad){
            case "m/s":
                v=kmh/3.6;
            break;
            case "mi/h":
                v=kmh/1.609;
            break;
            case "pie/s":
                v=kmh/1.097;
            break;
            case "km/h":
                v=kmh;
            break;
            default:
                v=-1;
            break;
        }
        return v;
    }
    
}
