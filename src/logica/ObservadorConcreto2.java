/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Alexander
 */
public class ObservadorConcreto2 implements Observer {

    @Override
    public void update(String mensaje) {
        System.out.println("Observador 2 recibió el mensaje: " + mensaje);
    }
}
