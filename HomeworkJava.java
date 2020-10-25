import java.util.Scanner;

public class HomeworkJava
{
    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);

    //  Getting size for the array
        System.out.println("enter the length of your name: ");
        int size = ob.nextInt();
        String array[] = new String[size];

    //  Getting characters from user
        String name = "";
        for(int x=0; x<array.length; x++)
        {
            System.out.print("type in letter "+(x+1)+": ");

            array[x] = ob.next();

            name+=array[x].substring(0,1);
            //[a] String ch = ob.next();
            //[/a] array[x] = ch.substring(0,1);
        }
        System.out.println("the name is: "+name);
        
        //Reading array and showing name
            //[b] String name = "";
            // for(int i= 0; i<array.length; i++)
            // {
            //     name+=array[i];
            // }
            //[/b] System.out.println("the name is: "+name);

    }
}