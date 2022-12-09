public class Harmonik {
    public static void main(String[] args) {
        int[] harmonik = {4,6};
        double series=0.0;
        for (double arr : harmonik) {
            series+=(1/arr);
        }
        double avarege=harmonik.length/series;
        System.out.println(avarege);
    }
}