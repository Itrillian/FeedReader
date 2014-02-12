package itrillian.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;


public class JettyLauncher {

	public void init() {
		Server server = new Server(8080);
		WebAppContext webAppContext = new WebAppContext();
		webAppContext.setServer(server);
		webAppContext.setContextPath("/");
		webAppContext.setWar("src/main/webapp");
		server.setHandler(webAppContext);
		try {
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
