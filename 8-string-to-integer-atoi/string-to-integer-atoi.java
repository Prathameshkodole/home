class Solution {
    public int myAtoi(String s) {
        int i=0;
        if(s=="")return 0;
        char[] c = s.toCharArray();
        
        //ignore space
        while(i<c.length && c[i]==' ')++i;
        if(i==c.length)return 0;
        //sign
        int sign=1;
        if(c[i]=='+' || c[i]=='-'){
            sign=44-c[i];
            ++i;
        }
        long num =0;
        
        while(i<c.length && c[i]=='0')++i;

        while(i<c.length && c[i]>='0' && c[i]<='9'){
            int digit= c[i] - '0';
            num = num*10 + digit;

            if(sign*num>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(sign*num<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (sign*num);
        
    }
}