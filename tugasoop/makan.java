package tugasoop;

public class makan {
    public static void main(String[] args){
        hewan Hewan = new hewan();
        omnivora Beruang = new omnivora();
        karnivora Singa = new karnivora();
        herbivora Kambing = new herbivora();
        Hewan.makan();
        Hewan = Beruang;
        Hewan.makan();
        Hewan = Singa;
        Hewan.makan();
        Hewan = Kambing;
        Hewan.makan();
    }
}
