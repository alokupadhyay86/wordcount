package in.freecharge.wordcount.server;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.mortbay.http.SocketListener;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.ServletHttpContext;

public class FCHttpServer 
{

    public static void main(String[] args) 
    {
        try 
        {
            Server server = new Server();
            SocketListener listener = new SocketListener();      

            System.out.println("Max Thread :" + listener.getMaxThreads() + " Min Thread :" + listener.getMinThreads());

            listener.setHost("localhost");
            listener.setPort(8070);
            listener.setMinThreads(5);
            listener.setMaxThreads(250);
            server.addListener(listener);            

            ServletHttpContext context = (ServletHttpContext) server.getContext("/");
            context.addServlet("/", "in.freecharge.wordcount.server.FCServlet");

            server.start();
            server.join();

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

} 


