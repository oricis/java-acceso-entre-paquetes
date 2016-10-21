/**
 * @file: HolaMundo.java
 * 
 * @utor: Moisés Alcocer, 2016
 */

package ccc;

/**
 * This class ...
 * 
 */
public class HolaMundo {

    /**********************************/
    /*** Properties declaration *******/

    
    /**********************************/
    /*** Methods declaration **********/
        
        /**
         * Construct
         * 
         */
        public HolaMundo() {
        
            System.out.println( "Hola mundo" );
        }
        
        public static void p( String str ) {
            
            System.out.println( "ccc.HolaMundo / p()" );
            System.out.println( "---> " + str );
        }
} //class
