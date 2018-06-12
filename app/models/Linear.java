package models;

public class Linear {
    private double x;
    private double y;
    private double b;
    private double m;
    private double answer = 0.0;

    public Linear (double x, double y, double b, double m){

    }
    public void solveM(double x, double y, double b){
        x = this.x;
        y = this.y;
        b = this.b;
        this.answer = (y-b)/x;
    }
}
