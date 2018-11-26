
package pbo8;


public class persegipanjang implements bangundatar {
   
public float panjang,lebar;

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    @Override
    public void luas() {
        lebar=3;
        panjang=3;
        float luas = lebar*panjang;
        System.out.println("Luas Persegi Panjang = "+luas);
    }

    @Override
    public void keliling() {
       lebar=3;
       panjang=3;
       float keliling=2*(panjang+lebar);
        System.out.println("Keliling Persegi Panjang = "+keliling);
    }
    
}

     
    
