/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class ContactoTest {
    private static final Logger LOG = Logger.getLogger(ContactoTest.class.getName());

    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datosVacios");

        // Verificar que la creación de un contacto con datos vacíos no lanza una excepción
        assertThrows(Throwable.class, () -> new Contacto("", "", "", "", ""));

        LOG.info("Finalizando test datosVacios");
    }

    @Test
    public void validacionEmail() {
        LOG.info("Iniciado test validacionEmail");

        assertThrows(Throwable.class, ()-> new Contacto("Maicol Ochoa", "Mike Tyson", "Carrera 4d", "3216489340", "Mc"));

        LOG.info("Finalizando test validacionEmail");
    }
}

