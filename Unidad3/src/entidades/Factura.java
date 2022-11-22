package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Maria del Carmen
 * @version 1.0
 * @created 22-nov.-2022 15:35:46
 */
public class Factura {

    private int codigo;
    private String fecha;
    private Cliente m_cliente;
    private Producto m_producto;
    private Vendedor m_vendedor;
    public Vendedor m_Vendedor;
    public Producto m_Producto;
    public Cliente m_Cliente;
    private ArrayList<Producto> productos;

    public void Factura() {

    }

    public void finalize() {

    }

    /**
     *
     * @param prod
     */
    public void agregarProducto(Producto prod) {
        productos.add(prod)
    }

    /**
     *
     * @param monto
     * @param iva
     */
    public double aplicarIVA(double monto, double iva) {
        double montoFinal = monto - (monto * (iva / 100));
        return montoFinal;
    }

    /**
     *
     * @param siniva
     * @param precioFinal
     */
    public double calcMonto(double cantidad, double precio) {
        double monto = cantidad * (this.aplicarIVA(precio, 15));
        return monto;
    }

    /**
     *
     * @param lista
     */
    public double calcTotal(List<Producto> lista) {
        double total = 0;
        for (List<Producto> prod : lista) {
            total = total + prod.getPrecio;
        }
    }
}//end Factura
