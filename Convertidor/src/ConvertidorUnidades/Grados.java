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
*Clase para convertir los grados a diferentes unidades de medida 
*/
public class Grados {
    
/**
*Convierte Grados a otras unidades
* @param grado es el número ingresado
* @param grados es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
    public static double convertirGrados(double grado, String grados){
        grados=grados.toLowerCase();
        double g=0;
        switch(grados){
            case "gra":
                g=grado;
            break;
            case "rad":
                g=(grado*Math.PI)/180;
            break;
            default:
                g=-1;
            break;
        }
        return g;
    }
    
/**
*Convierte Radianes a otras unidades
* @param radian es el número ingresado
* @param grados es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
    public static double convertirRadianes(double radian, String grados){
        grados=grados.toLowerCase();
        double r=0;
        switch(grados){
            case "gra":
                r=(radian*180)/Math.PI;
            break;
            case "rad":
                r=radian;
            break;
            default:
                r=-1;
            break;
        }
        return r;
    }
    
/**
*Convierte grados a grados con minutos y segundos
* @param grados es el número a convertir 
* @return Un String con el grado transformado
*/
    public static String convertirGradosMS(double grados){
        if (grados<0){
            grados=grados*(-1);
        }
        double gra=Math.floor(grados);
        double min=grados-Math.floor(grados);
        min=min*60;
        double seg=min-Math.floor(min);
        min=Math.floor(min);
        seg=seg*60;
        return (gra+"°"+min+"'"+seg+"''");
    }
    
/**
*Convierte grados a grados con minutos y segundos
* @param gra es el grado
* @param min son los minutos 
* @param seg son los segundos
* @return La equivalencia en grados
*/
    public static double convertirGMS(double gra, double min, double seg){
        double grados=0;
        grados=gra+(min/60)+(seg/3600);
        return grados;
    }
    
}
