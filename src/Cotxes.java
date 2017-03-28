/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arnau
 */
public class Cotxes {

    private int datanaixement = 0;
    private     int pes = 0;
    int num_pilot = 0;
   
        private double minut_per_volta = 0.0;
        private char codi_pilot = ' ';
        char mirar;
        private boolean acciden_pilot; 

    public int getDatanaixement() {
        return datanaixement;
    }

    public void setDatanaixement(int datanaixement) {
        this.datanaixement = datanaixement;
    }

    public int getPes() {
        return pes;
    }

    public void setPes(int pes) {
        this.pes = pes;
    }

    public int getNum_pilot() {
        return num_pilot;
    }

    public void setNum_pilot(int num_pilot) {
        this.num_pilot = num_pilot;
    }

    public double getMinut_per_volta() {
        return minut_per_volta;
    }

    public void setMinut_per_volta(double minut_per_volta) {
        this.minut_per_volta = minut_per_volta;
    }

    public char getCodi_pilot() {
        return codi_pilot;
    }

    public void setCodi_pilot(char codi_pilot) {
        this.codi_pilot = codi_pilot;
    }

    public char getMirar() {
        return mirar;
    }

    public void setMirar(char mirar) {
        this.mirar = mirar;
    }
        boolean omplit = false;

    public boolean isAcciden_pilot() {
        return acciden_pilot;
    }

    public void setAcciden_pilot(boolean acciden_pilot) {
        this.acciden_pilot = acciden_pilot;
    }

    public boolean isOmplit() {
        return omplit;
    }

    public void setOmplit(boolean omplit) {
        this.omplit = omplit;
    }
}