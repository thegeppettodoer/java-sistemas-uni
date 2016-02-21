/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.pedido.app.service;

/**
 *
 * @author Alumno
 */
public class PedidoService {
    /**
     * Retorna el impuesto
     * 
     * @param importe Importe del pedido 
     * @return Retorn el impuesto
     */
    public double calcularImpuesto(double importe){
        double impuesto;
        impuesto = importe * 0.18;
        return impuesto;
            
    }
    public double calcularTotal(double importe){
        double total;
        total = importe + calcularImpuesto(importe);
        return total;
    }
}
