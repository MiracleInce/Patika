public class TekrarEdenCiftSayi {
    public static void main(String[] args) {
        int[] list = {3, 7,3,3, 2, 9, 10, 21, 1, 33, 9, 1,2,10};
        for(int i=0; i< list.length;i++){
            for (int j=0; j<list.length;j++){
                if (list[i]%2==0 && list[j]%2==0){
                    if (( i != j) && (list[i] == list[j])){
                        System.out.println("Aynı olan elemanlar==> "+ list[i]);
                    }
                }

            }

        }

    }
}