package javatrainning.arrays;
import java.util.Scanner;
public class ArrayExample
{
    public static void main(String[] args)
    {
        int n=4,sum=0;
        Scanner sc=new Scanner(System.in);
        int [] marks=new int[n];
        System.out.println("Enter the student name : ");
        String name = sc.next();
        for (int i = 0; i < marks.length; i++)
        {
            System.out.println("Enter subjects"+ (i+1) +"marks = ");
            marks[i]=sc.nextInt();
        }
            for (int i = 0; i < n; i++)
            {
                if (marks[i]>100)
                {
                    System.out.println("Marks cannot be 100");
                    return;
                }
            }
        for (int i:marks)
        {
          sum=sum+i;
            System.out.println("subject" +"temp" + "marks=" +i);

        }
           float avg=(float)sum/n;
        System.out.println("average mark of student : " + avg);
        if (avg<=100 && avg>=85)
        {
            System.out.println(name+ " BEST ");
        }
        else if (avg<=85 && avg>=75)
        {
            System.out.println(name+ " GOOD ");
        }
        else if (avg<=75 && avg>=55)
        {
            System.out.println(name+ " AVERAGE ");
        }
        else
            System.out.println(name+ " WORST ");

    }
}

