/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpattiempoapp1;

public class MonitorTiempo {
    private float temperatura;
    private Pantalla pantalla;
    
    public MonitorTiempo(Pantalla pantalla, float temperatura){
     this.pantalla = pantalla;
     this.temperatura = temperatura;
    }
        public float getTemperatura() {
    return temperatura;
}
        public void mostrar(){
            pantalla.imprimir(temperatura);
        }
}