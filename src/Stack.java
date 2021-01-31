/**
 * @author Daniel Gonzalez
 * Carné: 20293
 * Modificacion: 01/31/2021
 * Interfaz: Stack
 *
 * Descripcion:
 *  Interfaz que permite determinar las operaciones del ADT Stack.
 */

public interface Stack <E>{

    /**Metodo que permite ingresar un objeto al stack.*/
    public void push(E data);

    /**Metodo que permite sacar un objeto del stack*/
    public E pop();

    /**Metodo que permite conocer el ultimo valor ingresado al stack*/
    public E peek();

    /**Metodo que permite saber si el stack esta vacio o no*/
    public boolean empty();

    /**Metodo que permite saber el tamaño del stack*/
    public int size();
}
