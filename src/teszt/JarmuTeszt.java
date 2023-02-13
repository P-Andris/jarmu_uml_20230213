package teszt;

import modell.Auto;
import modell.Jarmu;

class Hajo extends Jarmu {
    
}

public class JarmuTeszt {
    public static void main(String[] args) {
        new JarmuTeszt();
    }
    
    public JarmuTeszt() {
        // mintaSablonTeszt();
        // haladAutoBeinditasNelkulTeszt();
        // haladAutoBeinditassalTeszt();
        // haladJarmuBeinditassalTeszt();
        
        // jarmuTankolvaHalad();
        // jarmuSikeresenTankolva();
        autoDefektes();
    }
    
    private void mintaSablonTeszt() {
        int kapott = 7, vart = 4;
        
        assert kapott == vart : "Nem egyenlőek";
    }

    private void haladAutoBeinditasNelkulTeszt() {
        Auto auto = new Auto();
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart : "Beindítás nélkül is halad.";
    }

    private void haladAutoBeinditassalTeszt() {
        Auto auto = new Auto();
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart : "Nem halad.";
    }

    private void haladJarmuBeinditassalTeszt() {
        Hajo hajo = new Hajo();
        hajo.beindit();
        
        boolean kapott = hajo.halad();
        boolean vart = true;
        
        assert kapott == vart : "Nem halad";
    }
    
    
    // Saját:
    private void jarmuTankolvaHalad() {
        Hajo hajo = new Hajo();
        hajo.beindit();
        
        boolean kapott = hajo.isUzemanyag();
        boolean vart = true;
        
        assert kapott == vart : "A jármű üzemanyag nélkül is halad.";
    }
    
    private void jarmuSikeresenTankolva() {
        Hajo hajo = new Hajo();
        
        boolean kapott = hajo.tankol();
        boolean vart = true;
        
        assert kapott == vart : "A járművet nem lehet tankolni.";
    }
    
    private void autoDefektes() {
        Auto auto = new Auto();
        auto.beindit();
        
        boolean kapott = auto.isDefekt();
        boolean vart = true;
        
        assert kapott == vart : "Az autó nem defektes";
    }
}
