/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import Dao.ProductoDaoImpl;
import Interface.IProducto;
import Model.Productos;
import java.util.List;

/**
 *
 * @author Adriano
 */
public class Test_Producto {

    public static IProducto dao = new ProductoDaoImpl();

    public static void main(String[] args) {
        Test_Producto t = new Test_Producto();
        t.UpdateStock();
        //t.delete();
        //t.update();
        //t.insert();
        t.listar();
        //t.searchById();
    }

    public static void listar() {
        List<Productos> lista = dao.lista();
        if (lista != null && !lista.isEmpty()) {
            System.out.println("ID\tNombre\t\tPrecio\tStock");
            for (Productos p : lista) {
                System.out.println(p.getId_producto() + "\t" + p.getNombre() + "\t$" + p.getPrecio() + "\t" + p.getStock());
            }
        } else {
            System.out.println("No hay productos");
        }
    }

    public static void insert() {
        Productos p = new Productos();
        p.setNombre("Teclado mecanico");
        p.setDescripcion("RGB");
        p.setPrecio(300);
        p.setStock(20);
        p.setImagen("/resources/img/teclado.jpg");

        boolean result = dao.insert(p);
        if (result) {
            System.out.println("success!!!");
        } else {
            System.out.println("error");
        }
    }

    public static void update() {
        Productos p = new Productos();
        p.setNombre("Arroz añejo");
        p.setDescripcion("Es mas agradable");
        p.setPrecio(1);
        p.setStock(20);
        p.setImagen("/resources/img/arroz.jpg");
        p.setId_producto(1);

        boolean result = dao.update(p);
        if (result) {
            System.out.println("update success!!!");
        } else {
            System.out.println("error");
        }
    }

    public static void searchById() {
        Productos pr = dao.SearchById(1);

        if (pr != null) {
            System.out.println("Producto encontrado!!!");
            System.out.println("ID: " + pr.getId_producto());
            System.out.println("Nombre: " + pr.getNombre());
            System.out.println("Descripcion: " + pr.getDescripcion());
            System.out.println("Precio: " + "$" + pr.getPrecio());
            System.out.println("Stock: " + pr.getStock());
            System.out.println("Imagen: " + pr.getImagen());
        } else {
        }
    }

    public static void delete() {

        boolean result = dao.delete(6);

        if (result) {
            System.out.println("success delete!!!");
        } else {
            System.out.println("error");
        }

    }

    public static void UpdateStock() {

        boolean result = dao.updateStock(3, 40);
        if (result) {
            System.out.println("success update stock!!!");
        } else {
            System.out.println("error");
        }
    }

}
