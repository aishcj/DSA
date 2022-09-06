package math;

public class DiffProductAndSum {
    public int subtractProductAndSum(int n) {
        int p =1;
        int sum=0;
        while(n>0){
            sum += n%10;
            p*= n%10;
            n=n/10;
        }
        return p - sum;
    }
}
