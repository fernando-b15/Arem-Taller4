/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.sparkd.microspring;

import co.edu.escuelaing.sparkd.httpserver.HttpServer;

/**
 *
 * @author dnielben
 */
public class MicroSpringBoot {
    
    public static void main(String[] args) throws Exception{
    	UriProcessor micro = new MicroSpring();
    	micro.start(args[0]);
        HttpServer server = new HttpServer(micro);
        server.start();
    }
    
}
