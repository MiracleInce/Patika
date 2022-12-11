public class DizidekiElemanlarinFrekansi{
    static boolean isFind(int[] arr, int value){
        for (int i:arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int sayac=0;
        int i;
        int [] tekrar= new int [list.length];
        int startIndex = 0;

        for (i=0;i<list.length;i++){
            for (int j=0; j <list.length;j++){
                if(list[i]==list[j]){
                    sayac++;
                }
            }
            if(!isFind(tekrar,list[i])){
                tekrar[startIndex++] = list[i];
                System.out.println(list[i] +"  "+ sayac +" kere tekrar etmiş");

            }
            sayac=0;
        }

    }

}