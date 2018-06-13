package models;

import java.util.HashSet;
import java.util.Set;

public class Linear {
    public int x = 0;
    public int y = 0;
    public int b = 0;
    public int m = 0;

    public Linear(){}
    public Linear(int x, int y, int b, int m){
        this.x = x;
        this.y = y;
        this.b = b;
        this.m = m;
    }

    public void solveM(){
        this.m = (this.y-this.b)/this.x;
    }

    public String getEquation(){
        return "x=" + x + " y=" + y + " b=" + b + " m=" + m;
    }

}