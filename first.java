public class first{
    public static void main(String[] args) {
        int a=15;
        int count = 0;
        while(a>1){
            if((a&1)==0){
                a=a>>1;
            }else{
                if(maxc(a+1)>maxc(a-1)){
                    a=a-1;
                }else{
                    a=a+1;
                }
            }
            count++;
        }
        System.out.println(count);
    }
    public static int maxc(int a){
        int c=0;
        while(a>0){
            if((a&1)==0){
                c++;
            }
            a=a>>1;
        }
        return c;
    }
}