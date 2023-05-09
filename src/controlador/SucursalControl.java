/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.exception.EspacioException;
import controlador.exception.VentasException;
import modelo.EnumMes;
import modelo.Sucursal;
import modelo.Venta;

/**
 *
 * @author santiago
 */
public class SucursalControl {

    private Sucursal[] sucursales;
    private Sucursal sucursal;
    private Venta venta;

    public SucursalControl() {
        sucursales = new Sucursal[4];
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Sucursal[] getSucursales() {
        return sucursales;
    }

    public void setSucursales(Sucursal[] sucursales) {
        this.sucursales = sucursales;
    }

    public Sucursal getSucursal() {
        if (sucursal == null) {
            sucursal = new Sucursal();
        }
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public boolean registrar() throws EspacioException {
        int posicion = -1;
        int contador = -1;
        for (Sucursal s : sucursales) {
            contador++;
            if (s == null) {
                posicion = contador;
                break;
            }
        }
        if (posicion == -1) {
            throw new EspacioException();
        }

        sucursal.setVentas(new Venta[EnumMes.values().length]);
        for (int i = 0; i < EnumMes.values().length; i++) {
            Venta venta = new Venta();
            venta.setId(i + 1);
            venta.setMes(EnumMes.values()[i]);
            venta.setValor(0.0);
            sucursal.getVentas()[i] = venta;
        }

        sucursales[posicion] = sucursal;
        return true;
    }

    public boolean guardarVentas(Integer posicionVenta, Double valor) throws VentasException, EspacioException {
        /*Sucursal sucursal = getSucursal();
        int mesIndex; 
        mesIndex= posicionVenta - 1;
        if (posicionVenta == null || valor == null) {
            throw new VentasException();
        }         
        if (mesIndex < 0 || mesIndex >= sucursal.getVentas().length) {
            throw new VentasException();
        }
        Venta venta = sucursal.getVentas()[mesIndex];
        venta.setValor(valor);
        return true;*/
        
        if (this.sucursal != null){
            if(posicionVenta <= this.sucursal.getVentas().length-1)
        sucursal.getVentas()[ posicionVenta].setValor(valor);
            else
                throw new EspacioException();
        }else
            throw new NullPointerException("Debe seleccionar una suscursal");
        
        return true;
    }

}
