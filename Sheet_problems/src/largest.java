public class largest {
    public static void main(String[] args) {
        int[] num = {3,3,6,1};
        int max = num[0];
        for(int i = 0;i<4;i++){
            if(num[i]>max){
                max = num[i];
            }
        }

        System.out.println(max);

    }
}
