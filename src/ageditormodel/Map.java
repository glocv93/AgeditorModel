/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ageditormodel;

import java.util.ArrayList;
/**
 *
 * @author
 */
public class Map {
    
    private int width; //ancho
    private int height; //alto
    private Tyle Mtyle[][];
    
    private ArrayList<Objects> objects = new ArrayList<Objects>();

    public Map(int width, int height){
        this.width = width;
        this.height = height;
        
        Mtyle = new Tyle[width][height];
        
        for(int i=0; i<width; i++)
            for(int j=0; j<height; j++)
                Mtyle[i][j] = new Tyle();
         
        for(int i=0; i<width; i++)
            for(int j=0; j<height; j++)
                Mtyle[i][j].setCharacter('.');
        
        for(int i=0; i<width; i++){
            Mtyle[i][0].setCharacter('X');
            Mtyle[i][height-1].setCharacter('X');
        }
        
        for(int j=0; j<height; j++){
            Mtyle[0][j].setCharacter('X');
            Mtyle[width-1][j].setCharacter('X');
        }
    }

    public Map() {
     
    }
    
    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }
    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }
    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }
    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }
    /**
     * @return the tyle
     */
    public Tyle[][] getTyle() {
        return Mtyle;
    }
    /**
     * @param tyle the tyle to set
     */
    public void setTyle(Tyle[][] tyle) {
        this.Mtyle = tyle;
    }
    
    @Override
    public String toString(){ //este metodo imprime el mapa 
        
        for(int x=0;x<width;x++){
            for(int y=0;y<height;y++)
                if(Mtyle[x][y]!=null)
                    Mtyle[x][y].Imprime();
            System.out.println();
        }
        return null;
    }
    
    
      public Tyle getTyle(int x,int y){

        return Mtyle[x][y];

    }

    /**
     * @return the objects
     */
    public ArrayList<Objects> getObjects() {
        return objects;
    }

    /**
     * @param objects the objects to set
     */
    public void setObjects(ArrayList<Objects> objects) {
        this.objects = objects;
    }
    
    public void agregarEstructura(String team){
        Structure structure = new Structure ();
         structure.setAttackCapacity(40);
         structure.setResistanceCapacity(20);
         structure.setStorageCapacity(15);
         structure.setEquipo(team);
         
    }
}
