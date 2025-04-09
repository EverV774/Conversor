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
*Clase para convertir el tiempo a diferentes unidades de medida 
*/
public class Tiempo {
    
/**
*Convierte Segundos a otras unidades
* @param segundos es el número ingresado
* @param tiempo es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
    public static double convertirSegundos(double segundos, String tiempo){
        tiempo=tiempo.toLowerCase();
        double t=0;
        switch(tiempo){
            case "seg":
                t=segundos;
            break;
            case "min":
                t=segundos/60;
            break;
            case "hrs":
                t=segundos/3600;
            break;
            case "dias":
                t=segundos/86400;
            break;
            case "sem":
                t=segundos/604800;
            break;
            case "mes":
                t=segundos/2.628e+6;
            break;
            case "año":
                t=segundos/3.154e+7;
            break;
            case "dec":
                t=segundos/3.145e+8;
            break;
            case "sig":
                t=segundos/3.145e+9;
            break;
            default:
                t=-1;
            break;
        }
        return t;
    }
        
/**
*Convierte Minutos a otras unidades
* @param minutos es el número ingresado
* @param tiempo es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
    public static double convertirMinutos(double minutos, String tiempo){
        tiempo=tiempo.toLowerCase();
        double t=0;
        switch(tiempo){
            case "seg":
                t=minutos*60;
            break;
            case "min":
                t=minutos;
            break;
            case "hrs":
                t=minutos/60;
            break;
            case "dias":
                t=minutos/1440;
            break;
            case "sem":
                t=minutos/10080;
            break;
            case "mes":
                t=minutos/43800;
            break;
            case "año":
                t=minutos/525600;
            break;
            case "dec":
                t=minutos/5256000;
            break;
            case "sig":
                t=minutos/5256000;
            break;
            default:
                t=-1;
            break;
        }
        return t;
    }
        
/**
*Convierte Horas a otras unidades
* @param horas es el número ingresado
* @param tiempo es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
    public static double convertirHoras(double horas, String tiempo){
        tiempo=tiempo.toLowerCase();
        double t=0;
        switch(tiempo){
            case "seg":
                t=horas*3600;
            break;
            case "min":
                t=horas*60;
            break;
            case "hrs":
                t=horas;
            break;
            case "dias":
                t=horas/24;
            break;
            case "sem":
                t=horas/168;
            break;
            case "mes":
                t=horas/730;
            break;
            case "año":
                t=horas/8760;
            break;
            case "dec":
                t=horas/87600;
            break;
            case "sig":
                t=horas/876000;
            break;
            default:
                t=-1;
            break;
        }
        return t;
    }
        
/**
*Convierte Días a otras unidades
* @param dias es el número ingresado
* @param tiempo es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
    public static double convertirDias(double dias, String tiempo){
        tiempo=tiempo.toLowerCase();
        double d=0;
        switch(tiempo){
            case "seg":
                d=dias*86400;
            break;
            case "min":
                d=dias*1440;
            break;
            case "hrs":
                d=dias*24;
            break;
            case "dias":
                d=dias;
            break;
            case "sem":
                d=dias/7;
            break;
            case "mes":
                d=dias/30.417;
            break;
            case "año":
                d=dias/365;
            break;
            case "dec":
                d=dias/3650;
            break;
            case "sig":
                d=dias/36500;
            break;
            default:
                d=-1;
            break;
        }
        return d;
    }
    
/**
*Convierte Semanas a otras unidades
* @param semanas es el número ingresado
* @param tiempo es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
    public static double convertirSemanas(double semanas, String tiempo){
        tiempo=tiempo.toLowerCase();
        double s=0;
        switch(tiempo){
            case "seg":
                s=semanas*604800;
            break;
            case "min":
                s=semanas*10080;
            break;
            case "hrs":
                s=semanas*168;
            break;
            case "dias":
                s=semanas*7;
            break;
            case "sem":
                s=semanas;
            break;
            case "mes":
                s=semanas/4.345;
            break;
            case "año":
                s=semanas/52.143;
            break;
            case "dec":
                s=semanas/521.4;
            break;
            case "sig":
                s=semanas/5214;
            break;
            default:
                s=-1;
            break;
        }
        return s;
    }
    
/**
*Convierte Meses a otras unidades
* @param meses es el número ingresado
* @param tiempo es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
    public static double convertirMeses(double meses, String tiempo){
        tiempo=tiempo.toLowerCase();
        double m=0;
        switch(tiempo){
            case "seg":
                m=meses*2.628e+6;
            break;
            case "min":
                m=meses*43800;
            break;
            case "hrs":
                m=meses*730;
            break;
            case "dias":
                m=meses*30.417;
            break;
            case "sem":
                m=meses*4.345;
            break;
            case "mes":
                m=meses;
            break;
            case "año":
                m=meses/12;
            break;
            case "dec":
                m=meses/120;
            break;
            case "sig":
                m=meses/1200;
            break;
            default:
                m=-1;
            break;
        }
        return m;
    }
    
/**
*Convierte Años a otras unidades
* @param años es el número ingresado
* @param tiempo es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
    public static double convertirAños(double años, String tiempo){
        tiempo=tiempo.toLowerCase();
        double a=0;
        switch(tiempo){
            case "seg":
                a=años*3.154e+7;
            break;
            case "min":
                a=años*525600;
            break;
            case "hrs":
                a=años*8760;
            break;
            case "dias":
                a=años*365;
            break;
            case "sem":
                a=años*52.143;
            break;
            case "mes":
                a=años*12;
            break;
            case "año":
                a=años;
            break;
            case "dec":
                a=años/10;
            break;
            case "sig":
                a=años/100;
            break;
            default:
                a=-1;
            break;
        }
        return a;
    }
    
/**
*Convierte Décadas a otras unidades
* @param decadas es el número ingresado
* @param tiempo es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
    public static double convertirDecadas(double decadas, String tiempo){
        tiempo=tiempo.toLowerCase();
        double d=0;
        switch(tiempo){
            case "seg":
                d=decadas*3.154e+8;
            break;
            case "min":
                d=decadas*5.265e+6;
            break;
            case "hrs":
                d=decadas*87600;
            break;
            case "dias":
                d=decadas*3650;
            break;
            case "sem":
                d=decadas*521.429;
            break;
            case "mes":
                d=decadas*120;
            break;
            case "año":
                d=decadas*10;
            break;
            case "dec":
                d=decadas;
            break;
            case "sig":
                d=decadas/10;
            break;
            default:
                d=-1;
            break;
        }
        return d;
    }
    
/**
*Convierte Siglos a otras unidades
* @param siglos es el número ingresado
* @param tiempo es la unidad en la que se quiere convertir 
* @return La equivalencia de la unidad recibida a la deseada
*/
    public static double convertirSiglos(double siglos, String tiempo){
        tiempo=tiempo.toLowerCase();
        double s=0;
        switch(tiempo){
            case "seg":
                s=siglos*3.154e+9;
            break;
            case "min":
                s=siglos*5.265e+7;
            break;
            case "hrs":
                s=siglos*876000;
            break;
            case "dias":
                s=siglos*36500;
            break;
            case "sem":
                s=siglos*5214;
            break;
            case "mes":
                s=siglos*1200;
            break;
            case "año":
                s=siglos*100;
            break;
            case "dec":
                s=siglos*10;
            break;
            case "sig":
                s=siglos;
            break;
            default:
                s=-1;
            break;
        }
        return s;
    }
    
}
