/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author Janki Kanabar
 */
public class PartTimeStudent extends Student {
    
    private int newCourses;
    
    public PartTimeStudent(String name, int newCourses) {
        
        super(name);
        this.newCourses = newCourses;
    }

    public int getNewCourses() {
        return newCourses;
    }

    public void setNewCourses(int newCourses) {
        this.newCourses = newCourses;
    }
    
}
