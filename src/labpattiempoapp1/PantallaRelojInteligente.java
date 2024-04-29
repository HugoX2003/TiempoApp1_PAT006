/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpattiempoapp1;

public class PantallaRelojInteligente implements Pantalla {
    public String mostrarPantalla(){
        return "La Temperatura en la Pantalla de Reloj Inteligente es: ";
    }
    
    @Override
    public void imprimir(float t){
        System.out.println(mostrarPantalla() + t + " Celsius");
    }
}
