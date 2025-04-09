/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertidorUnidades;

/**
 *
 * @author aless
 */
public class Energia {
    
    //Jules a...
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
    
    //Calorias a...
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
    
    //Kilocalorias a...
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
