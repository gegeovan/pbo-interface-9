
package pbo8;


public class persegi implements bangundatar{
 
    public float sisi;

    public float getSisi() {
        return sisi;
    }

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    public void luas() {
        sisi =3;
        sisi=sisi*sisi;
        System.out.println("Luas Persegi = "+sisi);
        
    }

    @Override
    public void keliling() {
        sisi=3;
        sisi= 3*sisi;
        System.out.println("Keliling Persegi = "+sisi);
    }
}

    
    
