package practice94;

public class Practice10 {
	public static void main(String[] args) {
		int cal[] = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31 };
		  for(int x=1; x<13; x++)
		  {
		   System.out.println("\n *********** "+x+"¿ù ***********");
		   if (x==1 || x==3 || x==5 || x==7 || x==8 || x==10 || x==12 )
		   {
		    for(int y=0;y<31;y++)
		       {
		     System.out.print(cal[y]+"\t");
		     if (cal[y]%7==0)
		     {
		      System.out.println();
		     }
		    }
		   } 
		   else if (x==2)
		   {
		    for(int y=0;y<28;y++)
		       {
		     System.out.print(cal[y]+"\t");
		     if (cal[y]%7==0)
		     {
		      System.out.println();
		     }
		    }
		   }
		   else
		   {
		    for(int y=0;y<30;y++)
		       {
		     System.out.print(cal[y]+"\t");
		     if (cal[y]%7==0)
		     {
		      System.out.println();
		     }
		    }
		   }
		  }
		 }
		}