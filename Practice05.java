package practice97;

public class Practice05 {
	 int n = 5;
     int space = n/2;   //빈공간의 개수
     int count =1;       //*의 개수

     boolean flg = true;

for (int i = 0;i < 5 ;i++ )
{
for(int j=0; j<space; j++)
    {
         System.out.print(" ");
    }

for(int j=0; j<count; j++)
    {
         System.out.print("*");
    }
if(flg)
    {
         count+=2;
         space--;
    }
else
    {
          count-=2;
          space++;
    }
if( space == 0 )
    {
          flg = false;
    }
         System.out.println();
}
}
}