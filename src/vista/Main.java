/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import controlador.SucursalControl;
import controlador.exception.EspacioException;
import controlador.exception.VentasException;
import controlador.util.Utilidades;
import modelo.EnumMes;

/**
 *
 * @author santiago
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            SucursalControl sc = new SucursalControl();

            sc.getSucursal().setId(1);
            sc.getSucursal().setNombre("Juan Gomez");
            sc.registrar();
            sc.guardarVentas(1, 1040.0);
            //sc.guardarVentas(13, 1006.80);
            System.out.println("Se ha registrado la sucursal: " + sc.getSucursal().getNombre());
            Utilidades.imprimir(sc.getSucursal().getVentas());
            //sc.setSucursal(null);

            /*
            sc.getSucursal().setId(2);
            sc.getSucursal().setNombre("Fernando");
            sc.registrar();
            sc.guardarVentas(1, 1040.0);
            sc.guardarVentas(2, 1040.0);
            sc.guardarVentas(3, 10430.0);
            sc.guardarVentas(4, 1040.0);
            sc.guardarVentas(5, 1040.0);
            sc.guardarVentas(6, 10430.0);
            sc.guardarVentas(7, 1003.0);
            sc.guardarVentas(8, 1080.0);
            sc.guardarVentas(9, 200.0);
            sc.guardarVentas(10, 1400.0);
            sc.guardarVentas(11, 108640.0);
            sc.guardarVentas(12, 1006.80);
            System.out.println("Se ha registrado la sucursal: " + sc.getSucursal().getNombre());
            Utilidades.imprimir(sc.getSucursal().getVentas());
            //sc.setSucursal(null);

            sc.getSucursal().setId(3);
            sc.getSucursal().setNombre("Santiago");
            sc.registrar();
            System.out.println("Se ha registrado la sucursal: " + sc.getSucursal().getNombre());
            Utilidades.imprimir(sc.getSucursal().getVentas());
            sc.setSucursal(null);
            sc.getSucursal().setId(4);
            sc.getSucursal().setNombre("Mario");
            sc.registrar();
            System.out.println("Se ha registrado la sucursal: " + sc.getSucursal().getNombre());
            //sc.setSucursal(null);
            Utilidades.imprimir(sc.getSucursal().getVentas());

            sc.getSucursal().setId(5);
            sc.getSucursal().setNombre("Mateo");
            sc.registrar();
            System.out.println("Se ha registrado la sucursal: " + sc.getSucursal().getNombre());
            Utilidades.imprimir(sc.getSucursal().getVentas());
             */
        } catch (EspacioException e) {

            System.out.println(e.getMessage());
        } catch (VentasException f) {
            System.out.println(f.getMessage());
        }

    }

}
