/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoentrepaquetes;

//imports
//import bbb.HolaMundo;
//import ccc.HolaMundo;


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
        
        /*
        // Error:
        aaa.HolaMundo().p( str );
        bbb.HolaMundo().p( str );
        ccc.HolaMundo().p( str );
        */
        
        //Solución
        aaa.HolaMundo ahm = null;
        bbb.HolaMundo bhm = null;
        ccc.HolaMundo chm = null;

        ahm.p( str );
        bhm.p( str );
        chm.p( str );
    }
    
} //class
