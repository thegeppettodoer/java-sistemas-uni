/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.pedido.app.prueba;
import pe.egcc.pedido.app.service.PedidoService;

/**
 *
 * @author Alumno
 */
public class Prueba01 {
    public static void main(String[] args) {
        //Dato
        double importe = 1870.0;
        //Proceso
        PedidoService service= new PedidoService();
        double impuesto = service.calcularImpuesto(importe);
        double total = service.calcularTotal(impuesto);
        //Reporte
        System.out.println("Importe: "+ importe);
        System.out.println("Impuesto: "+impuesto);
        System.out.println("Total: "+total);
            
    }
}
