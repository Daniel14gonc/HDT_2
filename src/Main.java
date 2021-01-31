/**
 * @author Daniel Gonzalez
 * Carné: 20293
 * Modificacion: 01/31/2021
 * Clase: Main
 *
 * Descripcion:
 *  Permite leer un archivo de texto para
 *  evaluar las expresiones postfix.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    /**Metodo que permite leer un archivo y evaluar las expresiones postfix dentro de el.*/
    public static void main(String[] args) {

        //Pre: Determinar si existe un archivo.
        //Post: Leer el archivo y evaluar cada expresion.
        try {
            //Identificacion de archivo.
            File file = new File("datos.txt");
            Scanner scan = new Scanner(file);

            Calculadora calculadora = new Calculadora();
            while(scan.hasNextLine()){
                try {
                    //Lectura de archivo
                    String exp = scan.nextLine();
                    System.out.print("\nLa expresion " + exp + " dio como resultado-> ");

                    //Evaluacion de expresion
                    String res = calculadora.Calculo(exp);
                    System.out.println(res);
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }

            }
        }
        catch (FileNotFoundException e){
            System.out.println("No se encontro el archivo");
        }

    }
}
