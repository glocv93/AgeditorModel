/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ageditormodel;

/**
 *
 * @author Luisp
 */
public class Structure extends Objects {

    private int StorageCapacity;
    private int AttackCapacity;
    private int ResistanceCapacity;

    public Structure() {
        this.StorageCapacity = 0;
        this.ResistanceCapacity = 0;
        this.AttackCapacity = 0;
        this.setX(0);
        this.setY(0);
        this.setType("undefined");
        this.setState("Intransitable");
        this.setName("Estructura sin nombre");
        this.setEquipo("SUSY");
    }
    public Structure(int sc, int rc, int ac, int x, int y, String type, String state, String name, String equipo){
        this.StorageCapacity=sc;
        this.AttackCapacity=ac;
        this.ResistanceCapacity=rc;
        this.setX(x);
        this.setY(y);
        this.setState(state);
        this.setName(name);
        this.setEquipo(equipo);
    }
    
    /**
     * @return the StorageCapacity
     */
    public int getStorageCapacity() {
        return StorageCapacity;
    }

    /**
     * @param StorageCapacity the StorageCapacity to set
     */
    public void setStorageCapacity(int StorageCapacity) {
        this.StorageCapacity = StorageCapacity;
    }

    /**
     * @return the AttackCapacity
     */
    public int getAttackCapacity() {
        return AttackCapacity;
    }

    /**
     * @param AttackCapacity the AttackCapacity to set
     */
    public void setAttackCapacity(int AttackCapacity) {
        this.AttackCapacity = AttackCapacity;
    }

    /**
     * @return the ResistanceCapacity
     */
    public int getResistanceCapacity() {
        return ResistanceCapacity;
    }

    /**
     * @param ResistanceCapacity the ResistanceCapacity to set
     */
    public void setResistanceCapacity(int ResistanceCapacity) {
        this.ResistanceCapacity = ResistanceCapacity;
    }

}
