import java.util.Scanner;
class Happy
{
    int num;
    //constructor
    Happy(int n)
    {
        num=n;
    }
    int sumSqDigit(int n)
    {
        int sum=0;int d=0;
        while(n>0)
        {
            d=n%10;
            sum=sum+d*d;
            //sum=sum+(n%10)*(n%10);
            n/=10;
        }
        return sum;
    }
    void checkHappy()
    {
        while(num>9)
        {
            num=sumSqDigit(num);
        }
        if(num==1)
        System.out.println("Happy Number");
        else
        System.out.println("Not Happy Number ");
        
    }
    static void main()
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number ");
        int n =in.nextInt();
        
        Happy obj=new Happy(n);
        obj.checkHappy();
        
    }
}
