/** 
 * La practica consiste en utilizar cadenas de caracteres y algunos de los metodos de dicha
   clase en la elaboracion de un programa para simular una sesion con un psicologo.
 * 
 * @author Martinez Padron Jorge Gabriel
 * @version 1a edicion
 */

import java.util.Scanner;

public class Psicologo { /** Se crea la clase Psicologo */

    public static void main (String [] args) { /** Se crea el metodo main */


        Scanner in = new Scanner (System.in); /** Se crea un objeto de la clase Scanner para leer datos desde el teclado */
        
        String nombre = new String(); /** Se crea una variable para almacenar el nombre del paciente */

        System.out.println("Bienvenido al psicologo, cual es su nombre?"); /** Se muestra muestra un mensaje bienvenida al paciente y solicita el nombre */
        nombre = in.nextLine(); /** Se lee el nombre del paciente que se ingresa por el teclado */
        nombre = nombre.trim(); /** Se eliminan los espacios en blanco del nombre del paciente */
        System.out.println("Buenas tardes " + nombre + "."); /** Se muestra un mensaje de saludo con el nombre del paciente */

        System.out.println("Digame, cual es su problema?"); /** Se  muestra un mensaje solicitando el problema del paciente */
        
        String problema = new String(); /** Se crea una variable para guardar el problema del paciente */
        

        problema = in.nextLine (); /** Se lee el problema del paciente que se ingresa por el teclado */
        problema = problema.trim(); /** Se eliminan los espacios en blanco del problema del paciente */

        System.out.println("MMMMMMMMMMMMM... ya veo"); /** Se muestra un mensaje de lo que dice el psicologo */
        System.out.println("Y digame... ");
        System.out.println("Porque dice que \"" + problema + "\" ?"); /** Se muestra un mensaje preguntando por el problema del paciente con comillas en el enunciado del problema del paciente */

        String explicacion = new String(); /** Se crea una variable para guardar la explicacion del problema del paciente aunque no se use*/
        explicacion = in.nextLine(); /** Se le la explicacion del problema del paciente que introdujo en el tecaldo  */

        System.out.println("Muy interesante, hablaremos de eso con mas detalle en la siguiente sesion ");
    }
}