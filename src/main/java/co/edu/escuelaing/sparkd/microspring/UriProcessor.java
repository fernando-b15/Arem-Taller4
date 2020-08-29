package co.edu.escuelaing.sparkd.microspring;

public interface UriProcessor {
		public void start(String componente) throws Exception;
		public String invoke(String path);
}
