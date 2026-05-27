public class secondLargest {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,56};
        int max = num[0];
        for(int i = 0;i<5;i++){
            if(num[i]>max){
                max = num[i];
            }
        }
        System.out.println(max);

        int max2 =num[0];
        for(int i = 0;i<5;i++){
            if(num[i]!=max && num[i]>max2){
                max2 = num[i];
            }
        }

        System.out.println(max2);
    }
}
