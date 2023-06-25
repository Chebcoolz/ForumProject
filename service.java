import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ResourceHandler;

public class HtmlServer {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080); // Choose the desired port

        ResourceHandler resourceHandler = new ResourceHandler();
        resourceHandler.setResourceBase("path/to/html/files"); // Specify the directory where your HTML files are located

        server.setHandler(resourceHandler);

        server.start();
        server.join();
    }
}
