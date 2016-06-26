import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Brackets{
    static long skobki(int n){

        long [] mas = new long [n+1];//We create an array that will store all the correct sequence, depending on the number of brackets

        mas[0]=1;//The first element of the array must be 1 since 0 braces is one correct sequence

        for (int i=1; i<=n; i++)//Cycle through all the correct bracket sequence
        {

            for (int j=0; j<i; j++)//Cycle for summing the number of correct sequences
            {

                mas[i] += mas[j] * mas[i-1- j];//K existing digit of the correct sequence of adding the product of two numbers of the sequence
            }
        }
//Returns the number of array whose index is equal to the sum of pairs of brackets that we passed in this beautiful method
        return mas[n];
    }

    public static void main(String args[])throws Exception
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of pairs of brackets");
        long z=skobki(Integer.parseInt(bufferedReader.readLine()));
        System.out.println("The number of regular bracket sequence is as follows: "+z);





    }
}