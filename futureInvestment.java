import java.util.Scanner;
import java.lang.Math;
import java.utile.*;

public class ProgAssign5
{
    public static void main(String[] args) {
    
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your investment Amount: ");
        double investmentAmount = userInput.nextDouble();

    
        System.out.print("Enter your Interest rate: ");
        double monthlyInterestRate = userInput.nextDouble();

        

        int years = 1;
        System.out.println("Years\t\tFuture Value");

        while(years <= 30)
        {
            double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
            System.out.printf("%d\t\t%.1f\n",years,futureValue);
            years=years+1;
        }
        for(;years<=30;years=years+1)
        {
            double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
            System.out.printf("%d\t\t%.1f\n",years,futureValue);
        }

        

        


    }
    public static double futureInvestmentValue( double investmentAmount, double monthlyInterestRate, int years)
    {
        double annualRate = monthlyInterestRate / 12;
        int numOfYears = years * 12;
        double monthlyInt = 1 + annualRate;
        double resultsMontlyInt = Math.pow(monthlyInt,numOfYears);
        double results = investmentAmount * resultsMontlyInt;
        return results;    
    }

}
