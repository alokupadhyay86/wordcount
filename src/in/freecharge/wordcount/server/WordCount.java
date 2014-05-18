package in.freecharge.wordcount.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCount
{
    private final String _word;
    
    private static final String CORPUS_DIRECTORY_PATH = "/home/alok/fc";
    
    public WordCount(String word)
    {
        _word = word.trim();
    }
    
    public int calculateCount()
    {
        return 0;
    }
    
    public int getCount()
    {

        int count = 0;
        //TODO - Improve if the directory contains dorectories
        File directory = new File(CORPUS_DIRECTORY_PATH);      
        
        for (File file : directory.listFiles())
        {

               count += getWordCountFromFile(file);
               
        }
    
        return count;
    }
    
    private int getWordCountFromFile(File file)
    {
        int count = 0;
        
        try
        {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) 
            {
               String line = br.readLine();
               String[] words = line.split(" ");
               for (String word : words)
               {
                   if (word.trim().equalsIgnoreCase(_word))
                   {
                       count++;
                   }
               }
            }
            
            return count;
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            return 0;
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return 0;
        }
    }

}
