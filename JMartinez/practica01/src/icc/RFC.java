/** 
 * La pr ́actica consiste en utilizar cadenas de caracteres y algunos de los m ́etodos m ́as importantes de dicha clase en la elaboracion de un programa 
   para generar una clave al estilo del RFC de las personas.
 * 
 * @author Martinez Padron Jorge Gabriel
 * @version 1a edicion
 */

import java.util.Scanner;

public class RFC { /** Se crea la clase RFC */

    public static void main (String [] args) { /** Se crea el metodo main */
    
        Scanner in = new Scanner (System.in); /** Se crea un objeto de la clase Scanner para leer datos desde el teclado */


        String nombreCompleto = new String(); /** Se crea una variable para almacenar el nombre */

        System.out.println("Dame el nombre completo, solamente incluye el primer nombre, apellido paterno y apellido materno"); /** Se muestra un mensaje pidiendo el nombre completo */

        nombreCompleto = in.nextLine(); /** Se lee el nombre completo desde el teclado */
        nombreCompleto = nombreCompleto.trim(); /** Se eliminan los espacios en blanco del nombre completo */
        nombreCompleto = nombreCompleto.toUpperCase(); /** Se convierte el nombre completo a mayusculas */

        System.out.println("Dame la fecha de nacimiento en el formato dd/mm/aa"); /** Se muestra un mensaje pidiendo la fecha de nacimiento */

        String fechaNacimiento = new String(); /** Se crea una variable para almacenar la fecha de nacimiento */
        fechaNacimiento = in.nextLine(); /** Se lee la fecha de nacimiento desde el teclado */
        fechaNacimiento = fechaNacimiento.trim(); /** Se eliminan los espacios en blanco de la fecha de nacimiento */

        String LetrasApellidoPaterno, LetrasApellidoMaterno, LetraNombre, NumNacimiento; /** Se crean variables para almacenar las letras del apellido paterno, apellido materno, nombre y fecha de nacimiento */

        int posicion = nombreCompleto.indexOf(" "); /** Se busca la primera posicion del espacio en blanco en el nombre completo */
        LetraNombre = nombreCompleto.substring(0, 1); /** Se obtiene la primera letra del nombre*/
        LetrasApellidoPaterno = nombreCompleto.substring(posicion+1, posicion+3); /** Se obtiene las 2 primeras letras del apellido paterno */

        int posicion2 = nombreCompleto.indexOf(" ", posicion+1); /** Se busca la segunda posicion del espacio en blanco en el nombre completo */
        LetrasApellidoMaterno = nombreCompleto.substring(posicion2+1, posicion2+2); /** Se obtiene la primera letra del apellido materno */

        NumNacimiento = "" + fechaNacimiento.charAt(6) + fechaNacimiento.charAt(7) + fechaNacimiento.charAt(3) + fechaNacimiento.charAt(4) + fechaNacimiento.charAt(0) + fechaNacimiento.charAt(1); /** Se obtiene los 2 digitos del dia, los 2 digitos del mes y los 2 dijitos el año de la fecha de nacimiento */

        System.out.println("El RFC de " + nombreCompleto + " es: " + LetrasApellidoPaterno + LetrasApellidoMaterno + LetraNombre + NumNacimiento); /** Se muestra el RFC generado a partir del nombre completo y la fecha de nacimiento */


    
    }
}
