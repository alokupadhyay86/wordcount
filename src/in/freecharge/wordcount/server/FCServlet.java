package in.freecharge.wordcount.server;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

public class FCServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException
    {
        String word = httpServletRequest.getParameter("query");

        System.out.println("Word : " + word);

        WordCount wc = new WordCount(word);
        int count = wc.getCount();
        
        JSONObject json = new JSONObject();
        json.put(word, count);
        
        httpServletResponse.setContentType("text/x-json;charset=UTF-8");
        json.write(httpServletResponse.getWriter());
        
        
        
    
    
    
    }
    
    
}