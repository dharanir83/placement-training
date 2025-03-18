class palindrome {
    public boolean isPalindrome(int x) {
         if(x<0){
            return false;
         }
        int a=reversed(x);
        if(x==a){
            return true;
        }
        else{
            return false;
        }
    }
    static int reversed(int x){
      
         int res=0;
         int temp=x;
         int sum=0;
       
         while(temp!=0){
            res=temp%10;
            sum=sum*10+res;
            temp/=10;
         }

return sum;
    }
}