 class Question1eprimeNumber
{
   public static void main (String[] args)
{
    for (int i=0; i<30; i++) 
        for (int j=2; j<i; j++)
        {
            if (i % j == 0) 
                break;
            else if (i == j+1)
                System.out.print( " "+i );
        }   
    System.out.println( "               Anshu Ganjeer");
}
}