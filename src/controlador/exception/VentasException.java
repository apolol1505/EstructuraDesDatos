/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.exception;

/**
 *
 * @author santiago
 */
public class VentasException extends Exception{
        public VentasException(String message) {
        super(message);
    }
    
    public VentasException() {
        super("La posición del mes es invalida ");
    }
}
