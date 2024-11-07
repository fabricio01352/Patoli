/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author SDavidLedesma
 */
public class Observer {

    private ArrayList<IObserver> observadores;

    public Observer() {
        observadores = new ArrayList<>();
    }

    /**
     * Notifica a todos los observadores cuando exista un cambio
     */
    public void notificar(Object arg) {
        for (IObserver o : observadores) {
            o.actualizar(this, arg);
        }
    }

    /**
     * Añade un nuevo subscritor u observador para notificarle los cambios
     *
     * @param o el nuevo observador a agregar
     */
    public void agregarObservador(IObserver o) {
        observadores.add(o);
    }

    /**
     * Quita un observador de la lista
     *
     * @param o el observador a remover de la lista
     */
    public void quitarObservador(IObserver o) {
        observadores.remove(o);
    }

}
