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
*Clase para convertir la energía a diferentes unidades de medida 
*/
public class Energia {
    
/**
*Convierte Jules a otras unidades
* @param jul es el número ingresado
* @param energia es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
        public static double convertirJules(double jul, String energia){
        energia=energia.toLowerCase();
        double e=0;
        switch(energia){
            case "j":
                e=jul;
            break;
            case "cal":
                e=jul/4.184;
            break;
            case "kcal":
                e=jul/4184;
            break;
            default:
                e=-1;
            break;
        }
        return e;
    }
    
/**
*Convierte Calorias a otras unidades
* @param cal es el número ingresado
* @param energia es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
        public static double convertirCalorias(double cal, String energia){
        energia=energia.toLowerCase();
        double e=0;
        switch(energia){
            case "j":
                e=cal*4.184;
            break;
            case "cal":
                e=cal;
            break;
            case "kcal":
                e=cal/1000;
            break;
            default:
                e=-1;
            break;
        }
        return e;
    }
    
/**
*Convierte Kilocalorias a otras unidades
* @param kcal es el número ingresado
* @param energia es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
        public static double convertirKiloCal(double kcal, String energia){
        energia=energia.toLowerCase();
        double e=0;
        switch(energia){
            case "j":
                e=kcal*4184;
            break;
            case "cal":
                e=kcal*1000;
            break;
            case "kcal":
                e=kcal;
            break;
            default:
                e=-1;
            break;
        }
        return e;
    }
    
}
