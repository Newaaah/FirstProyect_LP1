/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import Dao.PersonaDaoImpl;
import Dao.UsuarioDaoImpl;
import Interface.IPersona;
import Interface.IUsuario;
import Model.Persona;
import Model.Rol;
import Model.Usuario;

/**
 *
 * @author Adriano
 */
public class Test_Persona {

    IPersona dao = new PersonaDaoImpl();
    IUsuario udao = new UsuarioDaoImpl();

    public static void main(String[] args) {
        Test_Persona t = new Test_Persona();
        //t.insert();//
        t.valid_user();
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

    public void valid_user() {
        Usuario u = udao.validate("adriano.manrique.c@gmail.com", "admin123");
        if (u != null && u.getPersona() != null) {
            System.out.println("Bienvenido:" + u.getPersona().getNombre());
            System.out.println("Rol:" + u.getRol());
            System.out.println("Usuario:" + u.getUsuario());
            System.out.println("User ID:" + u.getId_usuario());
            System.out.println("Person ID:" + u.getPersona().getId_persona());
            System.out.println("Password: "+ u.getPassword());
        } else {
            System.out.println("Creedenciales incorrectas");

        }

    }
}
