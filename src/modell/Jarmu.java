package modell;

public abstract class Jarmu {
    private boolean beinditva;
    private boolean uzemanyag;
    private boolean megerkezett;
    
    public Jarmu() {
    
    }
    
    public void beindit() {
        beinditva = true;
    }
    
    public void leallit() {
        beinditva = false;
    }
    
    public boolean tankol() {
        if(beinditva) leallit();
        if(uzemanyag != true) uzemanyag = true;
        
        return uzemanyag;
    }
    
    public boolean halad() {
        if(!beinditva) beindit();
        
        return beinditva;
    }

    public boolean isBeinditva() {
        return beinditva;
    }

    public boolean isUzemanyag() {
        return uzemanyag;
    }

    public boolean isMegerkezett() {
        return megerkezett;
    }
}
