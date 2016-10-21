/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoentrepaquetes;

/**
 *
 * @author orici
 */
public class AccesoEntrePaquetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new aaa.HolaMundo();
        new bbb.HolaMundo();
        new ccc.HolaMundo();
        
        String str = "prueba";
        
        aaa.HolaMundo().p( str );
        bbb.HolaMundo().p( str );
        ccc.HolaMundo().p( str );
    }
}
