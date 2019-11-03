public class Question2e_patten
{ 
    public static void main(String[] args)
    {
        int i,j,k,l = 20;
    for (i= 0; i<= 3; i++)
        {
            for (j=1; j<=4-i; j++)
            {
                System.out.print("  ");
            }
            for (k=0;k<=i;k++)
            {
                System.out.print(l+"");
                l--;
            } 
                System.out.println("");
        }
    System.out.println("                        Anshu Ganjeer");
}
}