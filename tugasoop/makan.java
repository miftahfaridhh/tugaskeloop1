package tugasoop;


/**
 * Tugas Kelompok OOP-1
 *
 * @Idham Ramadito      (1806200293)
 * @M. Miftah Faridh    (1806148782)
 * @Bryan Dario         (1806199940)
 * @Nisrina Athallah    (1806148813)
 */
public class makan
{
    private String karnivora;
    private String herbivora;
    private String omnivora;
    
    public String getkarnivora()
    {
        return karnivora;
    }
    
    public String getherbivora()
    {
        return herbivora;
    }
    
    public String getomnivora()
    {
        return omnivora;
    }
    
    public void setkarnivora(String karnivora)
    {
        this.karnivora = karnivora;
    }
    
    public void setherbivora(String herbivora)
    {
        this.herbivora = herbivora;
    }
    
    public void setomnivora(String omnivora)
    {
        this.omnivora = omnivora;
    }
    
    public static void main(String [] args){
        makan jenis = new makan();
        jenis.setkarnivora("Singa");
        jenis.setherbivora("Kambing");
        jenis.setomnivora("Manusia");
        System.out.println("Termasuk Hewan Pemakan Daging: " + jenis.getkarnivora());
        System.out.println("Termasuk Hewan Pemakan Tumbuhan: " + jenis.getherbivora());
        System.out.println("Termasuk Hewan Pemakan Semuanya: " + jenis.getomnivora());
    }
}



