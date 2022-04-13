/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author strotz
 */
public class Car {
    private String name;
    private String file;
    
    private double engine; 
    private int year;
    private boolean electric;
    
    public Car() {
        name = "Default";
        file = "/";
        year = 0001;
        electric = false;
        setEngine(5.0);
    }
    
    public Car(String n, String f, int y, double e, boolean el) {
        name = n;
        file = f;
        electric = el;
        setYear(y);
        setEngine(e);
    }
    
    public String getName() {
        return name;
    }
    
    public String getFile() {
        return file;
    }
    
    public int getYear() {
        return year;
    }
    
    public double getEngine() {
        return engine;
    }
    
    public boolean getElectric() {
        return electric;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public void setFile(String f) {
        file = f;
    }
    
    public void setYear(int y) {
        if (y > 1880 && y < 2024)
            year = y;
    }
    
    public void setEngine(double e) {
        if (e > 0.5 && e < 11.0 && !electric)
            engine = e;
        else if (e > 50.0 && e < 150.0 && electric)
            engine = e;
    }
    
    public void setElectric(boolean el) {
        electric = el;
    }
    
    public String toString() {
        return "[Car Object] \nName: " + getName() + "\nYear: " + 
                getYear() + "\nEngine: " + getEngine() + 
                "\nElectric: " + (getElectric() ? "True" : "False") + 
                "\nFile: " + getFile() + ".\n";
    }
}
