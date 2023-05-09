/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.modeloTabla;

import controlador.util.Utilidades;
import javax.swing.table.AbstractTableModel;
import modelo.Sucursal;
import modelo.Venta;

/**
 *
 * @author santiago
 */
public class ModeloTablaVenta extends AbstractTableModel {

    private Venta[] ventas = new Venta[12];

    public Venta[] getVentas() {
        return ventas;
    }

    public Venta[] setVentas(Venta[] datos) {
        return this.ventas = datos;
    }

    
    
    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public int getRowCount() {
        return ventas.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Venta s = ventas[i];
        switch (i1) {
            case 0:
                return (s != null) ? s.getMes().toString() : "NO DEFINIDO";
            case 1:
                return (s != null) ? s.getValor() : 0.0;
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "MES";
            case 1:
                return "VALOR";
            default:
                return null;
        }
    }

}
