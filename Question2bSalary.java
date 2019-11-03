class Question2bSalary
{
    public static void main(String args[])
    {
        int salary = 250000;
        System.out.print("The Salary of Empoly is " +salary );
        if(salary>500000)
        {
            System.out.print(" Giving Bounus of = 10000");
        }
        else if(salary>300000 && salary<500000)
        {
           System.out.print(" Giving Bounus of = 5000");
        } 
        else if(salary>100000 && salary<=300000)
        {
            System.out.print(" Giving Bounus of = 2500");
        }
        else if(salary<=100000)
        {
            System.out.print(" Giving Bounus of = 10000");
        }
        else
        {
            System.out.print(" No One Get This Much Salary");
        }
        System.out.print("   Anshu Ganjeer");
    }
}