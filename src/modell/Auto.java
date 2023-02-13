package modell;

public class Auto extends Jarmu {
    private boolean defekt;
    
    public Auto() {
    
    }
    
    public void kereketCserel() {
        int szam = (int)(Math.random() * 4) + 1;
        
        if(szam == 1) defekt = true;
        else defekt = false;
    }
    
    public boolean halad() {
        return true;
    }
}