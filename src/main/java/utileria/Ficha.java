/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utileria;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author SDavidLedesma
 */
public class Ficha implements Serializable {

    private Color color;
    //Se usa -2 en la posición para decir que la ficha aún no ha sido incorporada al tablero
    private int posicion, numFicha;
    private boolean comida, metaFicha;

    public Ficha(Color color, int posicion, int numFicha) {
        this.color = color;
        this.posicion = posicion;
        this.numFicha = numFicha;
        this.comida = false;
        this.metaFicha = false;
    }

    public Color getColor() {
        return color;
    }

    public int getPosicion() {
        return posicion;
    }

    public int getNumFicha() {
        return numFicha;
    }

    public boolean isComida() {
        return comida;
    }

    public boolean isMetaFicha() {
        return metaFicha;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setComida(boolean comida) {
        this.comida = comida;
    }

    public void setMetaFicha(boolean metaFicha) {
        this.metaFicha = metaFicha;
    }

}
