public class Main {
    public static void main(String[] args) {
        int kambing = 100;
        int target = 150;
        int bulan = 0;

        while (kambing < target) {
            kambing += kambing * 0.05;
            bulan += 6;
        }

        int tahun = bulan / 12;
        System.out.println(tahun);
    }
}
