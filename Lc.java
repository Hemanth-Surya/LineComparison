import java.util.Scanner;
public class Lc
{
	public static void main(String arg[])

	{

             	 int x1,x2,y1,y2;

	         double dis;
		 string compareTwoLines = CompareTwoLines(line1,line2);
            	 System.out.println("compareTwoLines");

	         Scanner sc=new Scanner(System.in);

	         System.out.println("enter x1 point");

                 x1=sc.nextInt();

                 System.out.println("enter y1 point");

                 y1=sc.nextInt();

	         System.out.println("enter x2point");

                 x2=sc.nextInt();

	         System.out.println("enter y2 point");

                 y2=sc.nextInt();

		 dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

  	         System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")="+dis);

	}


	public static string CompareTwoLines(double line1,double line2)
        {
            int checkLines = line1.CompareTo(line2);
            System.println("checkLines");
            return checkLines == 0 ? "Both lines are equal" :
                   checkLines == -1 ? "First Line is less Than Second Line" :"First Line is Greater Than Second Line";
        }
        


}

