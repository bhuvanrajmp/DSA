class Solution {
public:
    bool isPalindrome(int x) {
        long long int temp=x;
        long long int rem,next=0;
        if(x>=0){
        while(x!=0)
        {
            
            rem=x%10;
            next=next*10+rem;
            x/=10;
        }
        if(next==temp)
        {
            return true;
        }
        else{
            return false;
        }
        }
        else
        {
            return false;
        }
    }
};