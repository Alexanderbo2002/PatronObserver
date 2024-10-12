/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Alexander
 */
public class Sujeto {
    private List<Observer> observadores = new ArrayList<>();
    private String mensaje;

    public void agregarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.update(mensaje);
        }
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
        notificarObservadores();
    }
}