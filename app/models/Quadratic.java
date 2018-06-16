package models;
import java.lang.Math;

public class Quadratic {
    public double b = 0;
    public double a = 0;
    public double c = 0;
    public double posX = 0;
    public double negX = 0;

    public Quadratic(){}
    public Quadratic(double b, double a, double c){
        this.b = b;
        this.a = a;
        this.c = c;
    }

    public void solveX(){
        posX = (this.b*-1 + Math.sqrt(Math.pow(this.b, 2) - 4*this.a*this.c)) / (2*a);
        negX = (this.b*-1 - Math.sqrt(Math.pow(this.b, 2) - 4*this.a*this.c)) / (2*a);
    }

    public String getEquation(){
        return "b=" + b + " a=" + a + " c=" + c;
    }
}
