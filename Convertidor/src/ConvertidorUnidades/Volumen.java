/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertidorUnidades;

/**
 *
 * @author aless
 */
public class Volumen {
    
    //Metro3 a...
    public static double convertirM3(double m3, String medida){
        medida=medida.toLowerCase();
        double m=0;
        switch(medida){
            case "m3":
                m=m3;
            break;
            case "cm3":
                m=m3*1000000;
            break;
            case "in3":
                m=m3*61020;
            break;
            case "ft3":
                m=m3*35.315;
            break;
            case "yd3":
                m=m3*1.308;
            break;
            case "l":
                m=m3*1000;
            break;
            default:
                m=-1;
            break;
        }
        return m;
    }
    
    //Centimetro3 a...
    public static double convertirCm3(double cm3, String medida){
        medida=medida.toLowerCase();
        double m=0;
        switch(medida){
            case "m3":
                m=cm3/1000000;
            break;
            case "cm3":
                m=cm3;
            break;
            case "in3":
                m=(cm3*61020)/1000000;
            break;
            case "ft3":
                m=(cm3*35.315)/1000000;
            break;
            case "yd3":
                m=(cm3*1.308)/1000000;
            break;
            case "l":
                m=cm3/1000;
            break;
            default:
                m=-1;
            break;
        }
        return m;
    }
    
    //Pulgada3 a...
    public static double convertirIn3(double in3, String medida){
        medida=medida.toLowerCase();
        double m=0;
        switch(medida){
            case "m3":
                m=(in3*16.3871)/1000000;
            break;
            case "cm3":
                m=in3*16.3871;
            break;
            case "in3":
                m=in3;
            break;
            case "ft3":
                m=in3/1728;
            break;
            case "yd3":
                m=(in3*21.4335)/1000000;
            break;
            case "l":
                m=(in3*16.3871)/1000;
            break;
            default:
                m=-1;
            break;
        }
        return m;
    }
    
    //Pie3 a...
    public static double convertirFt3(double ft3, String medida){
        medida=medida.toLowerCase();
        double m=0;
        switch(medida){
            case "m3":
                m=ft3*0.0283168;
            break;
            case "cm3":
                m=ft3*28316.8;
            break;
            case "in3":
                m=ft3*1728;
            break;
            case "ft3":
                m=ft3;
            break;
            case "yd3":
                m=ft3*0.037037;
            break;
            case "l":
                m=ft3*28.3168;
            break;
            default:
                m=-1;
            break;
        }
        return m;
    }
    
    //Yardas3 a...
    public static double convertirYd3(double yd3, String medida){
        medida=medida.toLowerCase();
        double m=0;
        switch(medida){
            case "m3":
                m=yd3*0.764555;
            break;
            case "cm3":
                m=yd3*764555;
            break;
            case "in3":
                m=yd3*46656;
            break;
            case "ft3":
                m=yd3*27;
            break;
            case "yd3":
                m=yd3;
            break;
            case "l":
                m=yd3*764.555;
            break;
            default:
                m=-1;
            break;
        }
        return m;
    }
    
    //Litros a...
    public static double convertirLitros(double l, String medida){
        medida=medida.toLowerCase();
        double m=0;
        switch(medida){
            case "m3":
                m=l*0.001;
            break;
            case "cm3":
                m=l*1000;
            break;
            case "in3":
                m=l*61.0237;
            break;
            case "ft3":
                m=l*0.0353147;
            break;
            case "yd3":
                m=l*0.00130795;
            break;
            case "l":
                m=l;
            break;
            default:
                m=-1;
            break;
        }
        return m;
    }
    
}
