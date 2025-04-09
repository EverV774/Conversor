/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertidorUnidades;

/**
 *
 * @author aless
 */
public class Grados {
    
    //Grados a...
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
    
    //Radianes a...
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
    
    //CasoEspecial...
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
    public static double convertirGMS(double gra, double min, double seg){
        double grados=0;
        grados=gra+(min/60)+(seg/3600);
        return grados;
    }
    
}
