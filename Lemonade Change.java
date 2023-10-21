class Solution {
    public boolean lemonadeChange(int[] bills) {
        int a=0;
        int b=0;
        int c=0;
        for(int i=0; i<bills.length; i++){
            if(bills[i]==5){
                a=a+1;
            }
            else if(bills[i]==10){
                if(a==0){
                    return false;
                }
                b=b+1;
                a=a-1;
            }
           else {
               if(a>=1 && b>=1){
                   a=a-1;
                   b=b-1;
               }
               
               else if(a>=3){
                   a=a-3;
               }
               else{
                   return false;
               }
              

            }
           }
        
        return true;
        
    }
}