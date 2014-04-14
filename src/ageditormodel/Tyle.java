/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ageditormodel;

/**
 *
 * @author lUIGIPC
 */
public class Tyle {
    
    private char character;
    private int x;
    private int y;
    
    public void Imprime(){
        
        System.out.print(character);
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
     * @return the character
     */
    public char getCharacter() {
        return character;
    }
    /**
     * @param character the character to set
     */
    public void setCharacter(char character) {
        this.character = character;
    }
    
    
    
    
}
