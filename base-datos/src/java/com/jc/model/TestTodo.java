package com.jc.model;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author campitos
 */
public class TestTodo {
                        //EQUIVALENTE AL ARGS
    public static void main(String...x)throws Exception{
        System.out.println("probando usuario");
        
             //U ES UNA VARIABLE LOCAL
        for( Usuario u:DAOUsuario.buscarTodos() ){
            System.out.println( u.getLogin() );
        }
        
       
    }
}
