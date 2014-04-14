/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ageditormodel;

//import Map.Tyle;
//import java.util.ArrayList;

/**
 *
 * @author Luisp
 */
public abstract class Objects{
    
    private int x;
    private int y;
//    protected int IdObject;
    protected String Name;
    protected String Type;
    private String Equipo;
    
    //protected ArrayList<Tyle> ArrayTyle;
    protected String State;

    public Objects() {
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
        this.Type = Type;
    }


    /**
     * @return the State
     */
    public String getState() {
        return State;
    }

    /**
     * @param State the State to set
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the Equipo
     */
    public String getEquipo() {
        return Equipo;
    }

    /**
     * @param Equipo the Equipo to set
     */
    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }
}
