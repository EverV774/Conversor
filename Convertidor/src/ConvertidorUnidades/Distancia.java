/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertidorUnidades;

/**
 *
 * @author aless
 */
public class Distancia {
    //Kilometro a...
        public static double convertirKilometro(double kilometro, String medida){
        medida=medida.toLowerCase();
        double d=0;
        switch(medida){
            case "km":
                d=kilometro;
            break;
            case "hm":
                d=kilometro*10;
            break;
            case "dam":
                d=kilometro*100;
            break;
            case "m":
                d=kilometro*1000;
            break;
            case "dim":
                d=kilometro*10000;
            break;
            case "cm":
                d=kilometro*100000;
            break;
            case "mm":
                d=kilometro*1000000;
            break;
            case "in":
                d=kilometro*39370.1;
            break;
            case "pie":
                d=kilometro*3280.84;
            break;
            case "yd":
                d=kilometro*1093.61;
            break;
            case "mi":
                d=kilometro*0.621371;
            break;
            default:
                d=-1;
            break;
        }
        return d;
    }
    
    //Hectometro a...
    public static double convertirHectometro(double hectometro, String medida){
        medida=medida.toLowerCase();
        double d=0;
        switch(medida){
            case "km":
                d=hectometro/10;
            break;
            case "hm":
                d=hectometro;
            break;
            case "dam":
                d=hectometro*10;
            break;
            case "m":
                d=hectometro*100;
            break;
            case "dim":
                d=hectometro*1000;
            break;
            case "cm":
                d=hectometro*10000;
            break;
            case "mm":
                d=hectometro*100000;
            break;
            case "in":
                d=hectometro*3937.01;
            break;
            case "pie":
                d=hectometro*328.084;
            break;
            case "yd":
                d=hectometro*109.361;
            break;
            case "mi":
                d=hectometro*0.0621371;
            break;
            default:
                d=-1;
            break;
        }
        return d;
    }
    
    //Decametro a...
    public static double convertirDecametro(double decametro, String medida){
        medida=medida.toLowerCase();
        double d=0;
        switch(medida){
            case "km":
                d=decametro/100;
            break;
            case "hm":
                d=decametro/10;
            break;
            case "dam":
                d=decametro;
            break;
            case "m":
                d=decametro*10;
            break;
            case "dim":
                d=decametro*100;
            break;
            case "cm":
                d=decametro*1000;
            break;
            case "mm":
                d=decametro*10000;
            break;
            case "in":
                d=decametro*393.701;
            break;
            case "pie":
                d=decametro*32.8084;
            break;
            case "yd":
                d=decametro*10.9361;
            break;
            case "mi":
                d=decametro*0.00621371;
            break;
            default:
                d=-1;
            break;
        }
        return d;
    }
    
    //Metro a...
    public static double convertirMetro(double metro, String medida){
        medida=medida.toLowerCase();
        double d=0;
        switch(medida){
            case "km":
                d=metro/1000;
            break;
            case "hm":
                d=metro/100;
            break;
            case "dam":
                d=metro/10;
            break;
            case "m":
                d=metro;
            break;
            case "dim":
                d=metro*10;
            break;
            case "cm":
                d=metro*100;
            break;
            case "mm":
                d=metro*1000;
            break;
            case "in":
                d=metro*39.3701;
            break;
            case "pie":
                d=metro*3.28084;
            break;
            case "yd":
                d=metro*1.09361;
            break;
            case "mi":
                d=metro*0.000621371;
            break;
            default:
                d=-1;
            break;
        }
        return d;
    }
    
    //Decimetro a...
    public static double convertirDecimetro(double decimetro, String medida){
        medida=medida.toLowerCase();
        double d=0;
        switch(medida){
            case "km":
                d=decimetro/10000;
            break;
            case "hm":
                d=decimetro/1000;
            break;
            case "dam":
                d=decimetro/100;
            break;
            case "m":
                d=decimetro/10;
            break;
            case "dim":
                d=decimetro;
            break;
            case "cm":
                d=decimetro*10;
            break;
            case "mm":
                d=decimetro*100;
            break;
            case "in":
                d=decimetro*3.93701;
            break;
            case "pie":
                d=decimetro*0.328084;
            break;
            case "yd":
                d=decimetro*0.109361;
            break;
            case "mi":
                d=decimetro*0.0000621371;
            break;
            default:
                d=-1;
            break;
        }
        return d;
    }
    
    //Centimetro a...
    public static double convertirCentimetro(double centimetro, String medida){
        medida=medida.toLowerCase();
        double d=0;
        switch(medida){
            case "km":
                d=centimetro/100000;
            break;
            case "hm":
                d=centimetro/10000;
            break;
            case "dam":
                d=centimetro/1000;
            break;
            case "m":
                d=centimetro/100;
            break;
            case "dim":
                d=centimetro/10;
            break;
            case "cm":
                d=centimetro;
            break;
            case "mm":
                d=centimetro*10;
            break;
            case "in":
                d=centimetro*0.393701;
            break;
            case "pie":
                d=centimetro*0.0328084;
            break;
            case "yd":
                d=centimetro*0.0109361;
            break;
            case "mi":
                d=centimetro*0.00000621371;
            break;
            default:
                d=-1;
            break;
        }
        return d;
    }
    
    //Milimetro a...
    public static double convertirMilimetro(double milimetro, String medida){
        medida=medida.toLowerCase();
        double d=0;
        switch(medida){
            case "km":
                d=milimetro/1000000;
            break;
            case "hm":
                d=milimetro/100000;
            break;
            case "dam":
                d=milimetro/10000;
            break;
            case "m":
                d=milimetro/1000;
            break;
            case "dim":
                d=milimetro/100;
            break;
            case "cm":
                d=milimetro/10;
            break;
            case "mm":
                d=milimetro;
            break;
            case "in":
                d=milimetro*0.0393701;
            break;
            case "pie":
                d=milimetro*0.00328084;
            break;
            case "yd":
                d=milimetro*0.00109361;
            break;
            case "mi":
                d=milimetro*0.000000621371;
            break;
            default:
                d=-1;
            break;
        }
        return d;
    }
    
    //Pulgada a...
    public static double convertirPulgada(double pulgada, String medida){
        medida=medida.toLowerCase();
        double d=0;
        switch(medida){
            case "in":
                d=pulgada;
            break;
            case "pie":
                d=pulgada/12;
            break;
            case "yd":
                d=pulgada/36;
            break;
            case "mi":
                d=pulgada/63360;
            break;
            case "km":
                d=pulgada*0.0000254;
            break;
            case "hm":
                d=pulgada*0.000254;
            break;
            case "dam":
                d=pulgada*0.00254;
            break;
            case "m":
                d=pulgada*0.0254;
            break;
            case "dim":
                d=pulgada*0.254;
            break;
            case "cm":
                d=pulgada*2.54;
            break;
            case "mm":
                d=pulgada*25.4;
            break;
            default:
                d=-1;
            break;
        }
        return d;
    }
    
    //Pie a...
    public static double convertirPie(double pie, String medida){
        medida=medida.toLowerCase();
        double d=0;
        switch(medida){
            case "in":
                d=pie*12;
            break;
            case "pie":
                d=pie;
            break;
            case "yd":
                d=pie/3;
            break;
            case "mi":
                d=pie/5280;
            break;
            case "km":
                d=pie*0.0003048;
            break;
            case "hm":
                d=pie*0.003048;
            break;
            case "dam":
                d=pie*0.03048;
            break;
            case "m":
                d=pie*0.3048;
            break;
            case "dim":
                d=pie*3.048;
            break;
            case "cm":
                d=pie*30.48;
            break;
            case "mm":
                d=pie*304.8;
            break;
            default:
                d=-1;
            break;
        }
        return d;
    }
    
    //Yarda a...
    public static double convertirYarda(double yarda, String medida){
        medida=medida.toLowerCase();
        double d=0;
        switch(medida){
            case "in":
                d=yarda*36;
            break;
            case "pie":
                d=yarda*3;
            break;
            case "yd":
                d=yarda;
            break;
            case "mi":
                d=yarda/1760;
            break;
            case "km":
                d=yarda*0.0009144;
            break;
            case "hm":
                d=yarda*0.009144;
            break;
            case "dam":
                d=yarda*0.09144;
            break;
            case "m":
                d=yarda*0.9144;
            break;
            case "dim":
                d=yarda*9.144;
            break;
            case "cm":
                d=yarda*91.44;
            break;
            case "mm":
                d=yarda*914.4;
            break;
            default:
                d=-1;
            break;
        }
        return d;
    }
    
    //Milla a...
    public static double convertirMilla(double milla, String medida){
        medida=medida.toLowerCase();
        double d=0;
        switch(medida){
            case "in":
                d=milla*63360;
            break;
            case "pie":
                d=milla*5280;
            break;
            case "yd":
                d=milla*1760;
            break;
            case "mi":
                d=milla;
            break;
            case "km":
                d=milla*1.60934;
            break;
            case "hm":
                d=milla*16.0934;
            break;
            case "dam":
                d=milla*160.934;
            break;
            case "m":
                d=milla*1609.34;
            break;
            case "dim":
                d=milla*16093.4;
            break;
            case "cm":
                d=milla*160934;
            break;
            case "mm":
                d=milla*1609340;
            break;
            default:
                d=-1;
            break;
        }
        return d;
    }
    
}
    
