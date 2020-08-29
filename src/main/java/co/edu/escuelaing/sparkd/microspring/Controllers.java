package co.edu.escuelaing.sparkd.microspring;

public class Controllers {

	@RequestMapping("/hello")
    static public String hello() {
        return "Greetings from Micro Spring Boot!";
    }
	
	@RequestMapping("/pi")
    static public String pi(){
        return "PI: " + Math.PI;
    }
	
    @RequestMapping("/webapp")
    static public String webapp() {
        String outputLine = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "<meta charset=\"UTF-8\">\n"
                + "<title>Title of the document</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<h1>Constante de Euler</h1>\n" + Math.E
                + "</body>\n"
                + "</html>\n";
        return outputLine;
    }

}
