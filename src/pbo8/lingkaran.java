
package pbo8;

public class lingkaran implements bangundatar{
    
    public float jari_jari;

    public float getJari_jari() {
        return jari_jari;
    }

    public void setJari_jari(float jari_jari) {
        this.jari_jari = jari_jari;
    }

    @Override
    public void luas() {
       jari_jari=6;
       double luas =Math.PI*jari_jari*jari_jari;
        System.out.println("Luas Lingkaran = "+luas);
       
    }

    @Override
    public void keliling() {
    jari_jari=3;
    double keliling = 2*Math.PI*jari_jari;    
        System.out.println("Keliling = "+keliling);
    }
}


