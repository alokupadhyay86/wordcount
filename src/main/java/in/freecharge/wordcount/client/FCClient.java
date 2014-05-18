package in.freecharge.wordcount.client;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

public class FCClient
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        String url = "http://localhost:8070";
        
        HttpClient client = new HttpClient();

        GetMethod getWordCount = new GetMethod(url);
        getWordCount.setQueryString("?query=k");

        try
        {
            client.executeMethod(getWordCount);
            byte[] responseBody = getWordCount.getResponseBody();
            System.out.println(new String(responseBody));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            getWordCount.releaseConnection();
        }

    }

}
