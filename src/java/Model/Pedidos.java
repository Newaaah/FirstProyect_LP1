/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author Adriano
 */
public class Pedidos {
private int id_pedido;
private Persona persona;
private double total;
private EstadoPedido estado;
private Timestamp fecha;
private List<Carrito> detallePedido;

    public Pedidos() {
    }

    public Pedidos(int id_pedido, Persona id_persona, double total, EstadoPedido estado, Timestamp fecha, List<Carrito> detallePedido) {
        this.id_pedido = id_pedido;
        this.persona = id_persona;
        this.total = total;
        this.estado = estado;
        this.fecha = fecha;
        this.detallePedido = detallePedido;
    }
    
    

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Persona getpersona() {
        return persona;
    }

    public void setpersona(Persona id_persona) {
        this.persona = id_persona;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public List<Carrito> getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(List<Carrito> detallePedido) {
        this.detallePedido = detallePedido;
    }




}
