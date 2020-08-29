package co.edu.escuelaing.sparkd.microspring;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MicroSpring implements UriProcessor{
	
	private Map<String, Method> metodos = new HashMap<>();

	 public void start(String componente) throws Exception {

	      int cont = 0;

	      for (Method m : Class.forName(componente).getMethods()) {
	    	 System.out.println("Revisando metodo: " + m.getName());
	         if (m.isAnnotationPresent(RequestMapping.class)) {
	        	System.out.println("Si esta la notacion @RequestMapping");  
	            try {
	               RequestMapping rm = m.getAnnotation(RequestMapping.class);
	               metodos.put(rm.value(), m);
	               m.invoke(null);
	               cont++;


	            } catch (Throwable ex) {

	               System.out.printf("Test %s failed: %s %n", m, ex.getCause());

	      }}}

	      System.out.println("el total de metodos con la notacion @RequestMapping son "+ cont);

	   }
	 public String invoke(String path) {
	        try {
	            return metodos.get(path).invoke(null).toString();
	        } catch (InvocationTargetException ex) {
	            Logger.getLogger(MicroSpring.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            Logger.getLogger(MicroSpring.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (IllegalArgumentException ex) {
	            Logger.getLogger(MicroSpring.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        return "Error ";
	    }


}
