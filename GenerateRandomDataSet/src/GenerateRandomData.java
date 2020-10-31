
import java.io.File;
import java.io.FileWriter;
import java.util.*;
public class GenerateRandomData {

	
	public static void main(String[] args) {
		
		
		 //the following code is generating 5000 random integers and saving it to 5000 random.csv 
       
		try
        {
        Random r = new Random();
        //System.out.println("Numbers are");
      File file = new File("5000_random.csv");
     
      FileWriter writer = new FileWriter(file);
    
      System.out.println("start");
        for(int i=1;i<=100;i++)
        {
            for(int j=1;j<=50;j++)
            {
                int value;
                value=r.nextInt(5000000);
                writer.append(Integer.toString(value));
                writer.append('\n');
            }
           
        }
        writer.flush();
        writer.close();
        System.out.println("end");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        //the code below is repeats the code above, which generates files with random values of different sizes
		
       //the following code is generating 25000 random integers and saving it to 25000 random.csv 
      /*
		try
        {
        Random r = new Random();
        //System.out.println("Numbers are");
      File file = new File("25000_random.csv");
     
      FileWriter writer = new FileWriter(file);
    
      System.out.println("start");
        for(int i=1;i<=100;i++)
        {
            for(int j=1;j<=250;j++)
            {
                int value;
                value=r.nextInt(5000000);
                writer.append(Integer.toString(value));
                writer.append('\n');
            }
           
        }
        writer.flush();
        writer.close();
        System.out.println("end");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        
        */
        //the following code is generating 80000 random integers and saving it to 80,000 random.csv 
        /*
		try
        {
        Random r = new Random();
        //System.out.println("Numbers are");
      File file = new File("80,000_random.csv");
     
      FileWriter writer = new FileWriter(file);
    
      System.out.println("start");
        for(int i=1;i<=100;i++)
        {
            for(int j=1;j<=800;j++)
            {
                int value;
                value=r.nextInt(5000000);
                writer.append(Integer.toString(value));
                writer.append('\n');
            }
           
        }
        writer.flush();
        writer.close();
        System.out.println("end");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        */
        
        
        //the following code is generating 150,000 random integers and saving it to 150,000 random.csv 
     /*
		try
        {
        Random r = new Random();
        //System.out.println("Numbers are");
      File file = new File("300,000_random.csv");
     
      FileWriter writer = new FileWriter(file);
    
      System.out.println("start");
        for(int i=1;i<=100;i++)
        {
            for(int j=1;j<=3000;j++)
            {
                int value;
                value=r.nextInt(300000);
                writer.append(Integer.toString(value));
                writer.append('\n');
            }
           
        }
        writer.flush();
        writer.close();
        System.out.println("end");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
       */ 
        
        
        
        
        
    }
	}
	
	

