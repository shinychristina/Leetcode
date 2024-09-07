class Solution {
    public double myPow(double x, double n) {
            return binaryToExp(x,(long)n);
    }
    private double binaryToExp(double x, long n)
    {
        if(n==0)
            return 1;
        else if(n<0)
            return 1.0/binaryToExp(x, -n);
        else if(n%2!=0)
            return x*binaryToExp(x*x, (n-1)/2);
        else 
            return binaryToExp(x*x, n/2);
    }
}