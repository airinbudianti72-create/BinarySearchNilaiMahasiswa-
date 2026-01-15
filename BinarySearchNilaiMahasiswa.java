public class BinarySearchNilaiMahasiswa {

    public static int binarySearch(int[] data, int key) {
        int low = 0;
        int high = data.length - 1;
        int langkah = 0;

        while (low <= high) {
            langkah++;
            int mid = (low + high) / 2;

            if (data[mid] == key) {
                System.out.println("Indeks ditemukan : " + mid);
                System.out.println("Jumlah langkah pencarian : " + langkah);
                System.out.println("Status : Ditemukan");
                return mid;
            } else if (key < data[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Indeks ditemukan : -");
        System.out.println("Jumlah langkah pencarian : " + langkah);
        System.out.println("Status : Tidak ditemukan");
        return -1;
    }

    public static void main(String[] args) {

        // Array nilai mahasiswa (harus terurut)
        int[] nilai = {60, 65, 70, 75, 80, 85, 90};
        int cari = 80;

        binarySearch(nilai, cari);
    }
}