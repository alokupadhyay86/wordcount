package net.deepvalue.test2;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("ALOK");
        int i1[] = {1,2,3};
        int i2[] = {4,5,6};
        int i3[] = {7,8,9};
        
        System.out.println("ALOK");
        int j1[][] = {i1,i2,i3};
        
        for (int i=0; i < 3; i++ )
        {
            for (int j=0; j < 3; j++)
            {
                System.out.println(j1[i][j]);
            }
        }

    

    }
}
