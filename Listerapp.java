
package listerapp;


import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
class DD //extends Listing
{
	ArrayList<File> dev=new ArrayList<>();
	
	void function() throws IOException
	{
				 String direction;
			   Scanner input=new Scanner(System.in);
		 	JOptionPane.showMessageDialog(null,"File listing app,welcomes you!!!");
		String o=JOptionPane.showInputDialog("Enter where to save abc file.Hint->D:// or E://");
		File file11 = new File(o+"abc.txt");
			file11.createNewFile();
	             System.out.println(file11.exists());
	             	FileWriter write1=new FileWriter(file11);
	             		BufferedWriter thursday=new BufferedWriter(write1);
	             			JOptionPane.showMessageDialog(null,"Enter 2 path..Hint=>D:// or E://");
	             				System.out.println("Enter 2 path..Hint=>D:// or E://");
	             					
	                for(int i=0;i<2;i++)
	                {
	                	direction=input.nextLine();
	                    thursday.write(direction);
	                    thursday.newLine();
	                }
	                thursday.close();
	            
	                new Thread () 
	                {
	                	 public void run ()
	                	 {
	                		 
	                		 	JOptionPane.showMessageDialog(null,"please wait loading.............!!!!!!!!!11");
	                     
	                	 }
	                     
	                 }.start();
	                	
	                   new Thread () 
	                   {
		                	 public void run ()
		                	 {
		                		 try
		                		 {
		                			 		Thread.sleep(2000);
								 }
                		 catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
		                		 JOptionPane.showMessageDialog(null,"Your directory may be filled.. Please wait!!!1");
		                     
		                	 }
		                     
		                 }.start();
	               
	        		FileReader rreader=new FileReader(file11);
	        		BufferedReader med=new BufferedReader(rreader);
	        		String path1=med.readLine();
	        		while(path1!=null)
	        		{
	        			File folder=new File(path1);
	        			searching(folder);
	        			path1=med.readLine();
	        		}
	        		med.close();
	                     
	                        File f2=new File("E:\\f1343.csv");
	                        
	                		FileWriter war=new FileWriter(f2);
	                		BufferedWriter sucess=new BufferedWriter(war);
	                		for(File files:dev)
	                		{
	                			sucess.write("filename= "+files.getName()+","+"address=> "+files.getPath());
	                					sucess.newLine();
	                		}
	                		  System.out.println("saved in E:// drive ");

	                		System.out.println("ohh Yess succesfully saved data to csv file");
	                           
	                							sucess.close();
	                }
		
	     
	        
	public void searching(File bigfolders)
		{
			File files[]=bigfolders.listFiles();
			if(files==null) {
				return;     }
			else
			{
					for(File chemistry:files)
						{
							if(chemistry.isDirectory()) {
									searching(chemistry);}
				else
						dev.add(chemistry);
						}
			}
		}
	
	
	
}
public class Listerapp  {

	public static void main(String[] args) throws IOException {   
         
            DD obj1=new DD();
            obj1.function();
	}
}