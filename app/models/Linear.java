package models;

public class Linear {
    public double x = 0;
    public double y = 0;
    public double b = 0;
    public double m = 0;

    public Linear(){}
    public Linear(double x, double y, double b, double m){
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

    public void solveB(){
        this.b = this.y - this.m * this.x;
    }

}