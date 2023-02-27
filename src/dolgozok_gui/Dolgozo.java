package dolgozok_gui;

public class Dolgozo {
    private String nev, neme;
    private int kor, munkToltEv;

    public Dolgozo(String sor, String sep) {
        String[] s = sor.split(sep);
        this.nev = s[0];
        this.kor = Integer.parseInt(s[1]);
        this.neme = s[2];
        this.munkToltEv = Integer.parseInt(s[3]);
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }
    
    public String getNeme() {
        return neme;
    }

    public int getMunkToltEv() {
        return munkToltEv;
    }
    
    
}
