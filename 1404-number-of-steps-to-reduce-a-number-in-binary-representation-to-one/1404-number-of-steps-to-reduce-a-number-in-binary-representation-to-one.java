class Solution {
    public int numSteps(String s) {
        int n = s.length();
        int op =0;
         
int c =0 ;
 for(int i=n-1 ; i >=1 ; i-- ){
    int bit=(s.charAt(i)-'0') + c;
    if(bit %2==1){
        op +=2;
        c=1;
    }else{
        op++;
    }
 }
 return op + c;
    }
}