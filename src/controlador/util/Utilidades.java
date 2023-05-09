/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.util;

import modelo.Sucursal;
import modelo.Venta;

/**
 *
 * @author santiago
 */
public class Utilidades {

    public static void imprimir(Object[] objs) {
        System.out.println("Lista de " + objs.getClass().getSimpleName());
        for (Object o : objs) {
            Venta venta = (Venta) o;
            System.out.println(venta.getMes().toString() + ": Valor= {" + venta.getValor() + "}");
        }
    }

    public static Double sumarVentas(Sucursal s) {
        if (s.getVentas() != null) {
            Double ventas = 0.0;
            for (Venta v : s.getVentas()) {
                ventas += v.getValor();
            }
            return ventas;
        }
        return 0.0;
    }

    public static Double mediaVemtas(Sucursal s) {
        Double suma = sumarVentas(s);
        if (suma == 0) {
            return suma;
        } else {
            return suma / (s.getVentas().length);
        }
    }

}
