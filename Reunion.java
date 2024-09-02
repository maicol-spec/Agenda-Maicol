package co.edu.uniquindio.poo;

import java.sql.Time;
import java.util.Date;
import java.util.LinkedList;

public class Reunion {
    private String nombre;
    private String descripcion;
    private Date fecha;
    private Time hora;
    private LinkedList<Contacto> contactos;
    private LinkedList<Contacto> asistentes;

    public Reunion(String nombre, String descripcion, Date fecha, Time hora) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.contactos = new LinkedList<>();
        this.asistentes = new LinkedList<>();
    }


    public void agregarAsistente(Contacto contacto) {
        if (!asistentes.contains(contacto)) {
            asistentes.add(contacto);
        } else {
            System.out.println("El contacto ya está en la lista de asistentes.");
        }
    }


    public void eliminarContacto(String nombre, String numeroTelefono) {
        for (Contacto contacto : asistentes) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(numeroTelefono)) {
                asistentes.remove(contacto);
                return; 
            }
        }
        System.out.println("El contacto " + nombre+ " no está en la lista de asistentes.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public LinkedList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(LinkedList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public LinkedList<Contacto> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(LinkedList<Contacto> asistentes) {
        this.asistentes = asistentes;
    }

    @Override
    public String toString() {
        return "Reunion " + nombre + "," + descripcion + ", " + fecha + ", hora: " + hora + ", asistentes :" + asistentes + "";
    }
}
