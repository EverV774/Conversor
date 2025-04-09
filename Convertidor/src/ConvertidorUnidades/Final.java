/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertidorUnidades;

/**
 *
 * @author aless
 */
public class Final {
    
    public static boolean esPositivoValido(String e) {
        return e!=null&&e.matches("^\\d+(\\.\\d+)?$");
    }
    
    public static boolean esNumeroValido(String e) {
        return e!=null&&e.matches("^-?\\d+(\\.\\d+)?$");
    }
    
}
