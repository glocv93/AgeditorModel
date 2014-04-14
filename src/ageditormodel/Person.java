/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ageditormodel;

/**
 *
 * @author Luisp
 */
public class Person extends Objects {
    
    private int AttackCapacity;
    private int ResistanceCapacity;
    private int AttackRange;

    public Person() {
        
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

    /**
     * @return the AttackRange
     */
    public int getAttackRange() {
        return AttackRange;
    }

    /**
     * @param AttackRange the AttackRange to set
     */
    public void setAttackRange(int AttackRange) {
        this.AttackRange = AttackRange;
    }
    
}
