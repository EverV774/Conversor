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
*Clase que contiene las validaciones de la librería
*/
public class Final {
    
/**
*Permite ingresar únicamente Números Positivos
* @param e es el número ingresado
* @return Un boolean que indica si el número es positivo
*/
    public static boolean esPositivoValido(String e) {
        return e!=null&&e.matches("^\\d+(\\.\\d+)?$");
    }
    
/**
*Permite ingresar únicamente Números
* @param e es el número ingresado
* @return Un boolean que indica si lo ingresado si es un número
*/
    public static boolean esNumeroValido(String e) {
        return e!=null&&e.matches("^-?\\d+(\\.\\d+)?$");
    }
    
}
