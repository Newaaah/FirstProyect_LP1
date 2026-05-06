/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import Dao.PersonaDaoImpl;
import Interface.IPersona;
import Model.Persona;
import Model.Rol;
import Model.Usuario;

/**
 *
 * @author Adriano
 */
public class Test_Persona {

    IPersona dao = new PersonaDaoImpl();

    public static void main(String[] args) {
        Test_Persona t = new Test_Persona();
        t.insert();
    }

    public void insert() {
        Persona p = new Persona();

        p.setNombre("Adriano");
        p.setEmail("adriano.manrique.c@gmail.com");
        p.setTelefono("906935320");
        p.setDireccion("Av. Peru 616");

        Usuario u = new Usuario();

        u.setPassword("admin123");
        u.setRol(Rol.CLIENTE);
        int result = dao.insert(p, u);
        if (result > 0) {
            System.out.println("Persona y Usewr creada");
            System.out.println("Usuario: " + p.getEmail());
            System.out.println("Rol asignado: " + u.getRol());
        } else {
            System.out.println("No se pudo realizar el registro...");
        }
    }
}
