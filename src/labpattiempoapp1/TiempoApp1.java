/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpattiempoapp1;

/**
 *
 * @author Márquez Diestra, Hugo
 */
public class TiempoApp1 {

    public static void main(String[] args) {
    PantallaRelojInteligente ri = new PantallaRelojInteligente();
        VentanaComputador vc = new VentanaComputador();
        PantallaLCD lcd = new PantallaLCD();
        
        MonitorTiempo mtr = new MonitorTiempo(ri,20);
        MonitorTiempo mtv = new MonitorTiempo(vc,20);
        MonitorTiempo mtl = new MonitorTiempo(lcd,20);
        
        System.out.println("SISTEMA DE MONITOREO DE LA TEMPERATURA");
        mtl.mostrar(); // Mostrar Pantalla LCD
        mtv.mostrar(); // Mostrar Ventana Computador
        mtr.mostrar(); // Mostrar Pantalla Reloj Inteligente
    }
    
}
