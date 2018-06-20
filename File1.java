
import java.util.InputMismatchException;
import java.util.Scanner;
public class File1 {
     int dev[];
     private  int nextIndex;
     
           public File1(){
                   dev = new int[5];
                   System.out.println("COnstructor called initialised by size 5");
           }
           
           public boolean isEmpty() {
                   if (size()==0) {
                           return true;
                   } 
                   else
                   {
                           return false;
                   }
           }

           public int pop() {
                   if (nextIndex < 1)
                   {
                           return -1;
                   }
                   int value = dev[nextIndex - 1];
                   dev[nextIndex - 1] = 0;
                   nextIndex--;
                   return value;
           }

           public void restructure() {
                   int temp[] = dev;
                  dev = new int[(int)(dev.length * 1.5)];
                   for (int i = 0; i < temp.length; i++) {
                           dev[i] = temp[i];
                   }
           }

           public void add(int element) {
                   if (nextIndex == dev.length) {
                           restructure();
                   }
                   dev[nextIndex] = element;
                   nextIndex++;
           }

           public int size() {
                   return nextIndex;
           }

           public int get(int index) {
                   if (index < 0 || index >= nextIndex) {
                           return -1;
                   }
                   return dev[index];
           }

           public void set(int index, int element) {

                   if (index > nextIndex) {
                    throw new ArrayIndexOutOfBoundsException("Index out of bound");
                    
                   } 
                   else if (index == nextIndex) {
                           add(element);
                   } 
                   else
                   {
                           dev[index] = element;

		           }

	}

	public static void main(String[] args) throws InputMismatchException{
			File1 obj=new File1();
                Scanner input = new Scanner(System.in);
              
                System.out.println("initially "+obj.isEmpty());
                System.out.println("enter number of elements");
                int n1 = input.nextInt();
                
		for(int i=0;i<n1;i++)
                {
                    int a = input.nextInt();
                    obj.add(a);
                }
		System.out.println("now the size is");
		System.out.println(obj.size());
		
		obj.pop();
		System.out.println("After pop size is");
		System.out.println(obj.size());

                try{
                	System.out.println("if we try to get 9th element");
                    int n=obj.get(9);
                    if(n==-1)
                        throw new InputMismatchException();
                 
                }
                catch(InputMismatchException e){
                        System.out.println("THis not in array");
                }		
		
	}
}