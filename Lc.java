import java.util.Scanner;
public class Lc
{
	public static void main(String arg[])

	{

            double line1distance = DistanceBwtTwoPoints();
            System.out.println("Distance between the two points::" + line1distance);
            double line2Distance = DistanceBwtTwoPoints();
            System.out.println("Distance between two points::" + line2Distance);
            string compareTwoLines = CompareTwoLines(line1distance,line2Distance);
            System.out.println(compareTwoLines);
         }

	 public static double GetEndPointsOfX()
         {
	    Scanner sc = new Scanner(System.in);
            System.out.println("Enter X1");
            x1 = sc.nextDouble();
            System.out.println("enter x2");
	    x2 = sc.nextDouble();
            return Math.Pow((x2 - x1), 2);
         }
	 
	 public static double GetEndPointsOfY()
         {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Y1");
            y1 = sc.nextDouble();
            System.out.println("enter Y2");
            y2 = sc.nextDouble();
            return Math.Pow((y2 - y1), 2);
         }

	 public static double DistanceBwtTwoPoints()
         {
            double xCoordinates = GetEndPointsOfX();
            double yCoordinates = GetEndPointsOfY();
            double distance=Math.Sqrt(xCoordinates + yCoordinates);
            return Math.Round(distance, 2);
         }

	 public static string CompareTwoLines(double line1,double line2)
         {
            int checkLines = line1.CompareTo(line2);
            System.out.println("Checklines");
            return checkLines == 0 ? "Both lines are equal" :
                   checkLines == -1 ? "First Line is less Than Second Line" :
                   "First Line is Greater Than Second Line";
        }
        


}

