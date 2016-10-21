/**
 * @file: HolaMundo.java
 * 
 * @utor: Moisés Alcocer, 2016
 */

package bbb;

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
            
            System.out.println( "bbb.HolaMundo / p()" );
            System.out.println( "---> " + str );
        }
} //class
