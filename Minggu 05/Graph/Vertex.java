/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasMinggu5.Graph;

/**
 *
 * @author user
 */
public class Vertex {
    public char label;
    public boolean wasVisited;
    
    public Vertex(char lab) {
        this.label = lab; 
        wasVisited = false;
    }
    
}