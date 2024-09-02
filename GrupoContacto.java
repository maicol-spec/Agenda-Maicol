package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class GrupoContacto {
    private String nombre;
    private Categoria categoria;
    private LinkedList<Contacto> contactos;

    public GrupoContacto(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.contactos = new LinkedList<>();
    }

    public void agregarContacto(Contacto contacto) {
        if (validarContacto(contacto)) {
            mostrarMensaje("Error, el contacto con nombre " + contacto.getNombre() +
                           " y número de teléfono " + contacto.getTelefono() + " ya está en el grupo.");
        } else {
            contactos.add(contacto);
        }
    }

    public boolean validarContacto(Contacto contacto) {
        for (Contacto c : contactos) {
            if (c.getTelefono().equals(contacto.getTelefono()) || c.getNombre().equals(contacto.getNombre())) {
                return true;
            }
        }
        return false;
    }

    public boolean tieneMinimoContactos() {
        return contactos.size() >= 5;
    }

    public void minimoContacto(Contacto contacto) {
        if (contactos.size() < 5) {
            contactos.add(contacto);
        } else {
            System.out.println("El grupo ya tiene el mínimo de 5 contactos.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public LinkedList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(LinkedList<Contacto> contactos) {
        this.contactos = contactos;
    }

    @Override
    public String toString() {
        return "" + nombre + ", categoria:" + categoria + ", contactos:" + contactos + "";
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

