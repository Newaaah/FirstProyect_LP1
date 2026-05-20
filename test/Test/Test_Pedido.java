/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import Dao.PedidoDaoImpl;
import Interface.IPedido;
import Model.Carrito;
import Model.EstadoPedido;
import Model.Pedidos;
import Model.Persona;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adriano
 */
public class Test_Pedido {

    IPedido dao = new PedidoDaoImpl();

    public static void main(String[] args) {
        Test_Pedido t = new Test_Pedido();
        t.TestPedido();
    }

    public void TestPedido() {
        Persona p = new Persona();
        p.setId_persona(1);

        List<Carrito> listaCarrito = new ArrayList<>();

        Carrito item1 = new Carrito();
        item1.setIdProducto(1);
        item1.setPrecioCompra(20);
        item1.setCantidad(20);
        item1.setSubTotal(400);
        listaCarrito.add(item1);

        Carrito item2 = new Carrito();
        item2.setIdProducto(2);
        item2.setPrecioCompra(2);
        item2.setCantidad(10);
        item2.setSubTotal(20);
        listaCarrito.add(item2);

        double total = 20 + 400;

        Pedidos nuevoPedido = new Pedidos();
        nuevoPedido.setpersona(p);
        nuevoPedido.setTotal(total);
        nuevoPedido.setEstado(EstadoPedido.ENVIADO);
        nuevoPedido.setDetallePedido(listaCarrito);

        System.out.println("Enviando....");
        int result = dao.generarPedido(nuevoPedido);
        if (result > 0) {
            System.out.println("Pedido registrado");
            System.out.println("Total: " + total);
        } else {
            System.out.println("Error al generar el pedido");
        }
    }

}
