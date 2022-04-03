package es.deusto.spq.server;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Main {

	public static HttpServer startServer() {
		final ResourceConfig rc = new ResourceConfig().packages("es.deusto.spq");
		return GrizzlyHttpServerFactory.createHttpServer(URI.create(getURL()), rc);
	}
	
	public static String getURL() {
		GetProperties properties = new GetProperties();
		String url = "";

		try {
			url = properties.getURL();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		return url;

	}
	public static void main(String[] args) throws IOException {
		DBManager.getInstance();

		final HttpServer server = startServer();
		System.out.println(String.format(
				"Jersey app started with WADL available at " + "%sapplication.wadl\nHit enter to stop it...",
				getURL()));
		System.in.read();
		server.stop();

	}

}
