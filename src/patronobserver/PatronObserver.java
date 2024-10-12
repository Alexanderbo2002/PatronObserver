/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronobserver;

import logica.ObservadorConcreto1;
import logica.ObservadorConcreto2;
import logica.Observer;
import logica.Sujeto;

/**
 *
 * @author Alexander
 */
public class PatronObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sujeto sujeto = new Sujeto();

        Observer observador1 = new ObservadorConcreto1();
        Observer observador2 = new ObservadorConcreto2();

        sujeto.agregarObservador(observador1);
        sujeto.agregarObservador(observador2);

        // Cambiar el estado del sujeto y notificar a los observadores
        sujeto.setMensaje("Primera actualización de estado.");
        sujeto.setMensaje("Segunda actualización de estado.");
    }
    
}
