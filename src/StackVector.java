/**
 * @author Daniel Gonzalez
 * Carné: 20293
 * Modificacion: 01/31/2021
 * Clase: StackVector
 *
 * Descripcion:
 *  Clase que permite implementar las acciones de un stack para el
 *  almacenamiento y manejo de datos.
 */

import java.util.Vector;

public class StackVector<E> implements Stack<E>{

    private Vector<E> data;

    public StackVector(){
        data = new Vector<E>();
    }

    @Override
    public void push(E data) {
        //Pre: Validar que el valor no sea null.
        if(data != null){
            this.data.add(data);
        }
        //Post: Añadir el elemento ingresado al vector.
    }

    @Override
    public E pop() {
        //Pre: Validar que el vector no este vacio.
        if(!this.data.isEmpty()){
            E res = this.data.get(size()-1);
            this.data.remove(size()-1);
            return res;
        }
        //Post: Devolver el ultimo elemento ingresado y eliminarlo del vector.
        //En caso este vacio el vector, devolver null.

        return null;
    }

    @Override
    public E peek() {
        //Pre: Determinar si el vector esta vacio.
        if(!this.data.isEmpty()){
            return this.data.get(size()-1);
        }
        //Post: Devolver el ultimo elemento ingresado.
        //En caso este vacio el vector, devolver null.

        return null;
    }

    @Override
    public boolean empty() {
        //Post: Devolver si el stack esta vacio o no en expresion booleana.
        return this.data.isEmpty();
    }

    @Override
    public int size() {
        //Post: Devolver el tamaño del stack.
        return this.data.size();
    }
}
