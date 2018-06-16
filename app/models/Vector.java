package models;

public class Vector {
    public double x1;
    public double y1;
    public double z1;
    public double x2;
    public double y2;
    public double z2;
    public double dotAnswer = 0;
    public String crossAnswer = "0";

    public Vector (){}
    public Vector (double x1, double y1, double z1, double x2, double y2,double z2){
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;

    }

    public void dotProduct(){
        dotAnswer = x1*x2 + y1*y2 + z1*z2;
    }

    public void crossProduct(){
        crossAnswer = "(" + (y1*z2 - z1*y2) + ", " + (z1*x2 - x1*z2) + ", " + (x1*y2 - y1*x2) + ")";
    }

    public String getVectors(){
        return "(" + this.x1 + ", " + this.y1 + ", " + this.z1 + ") (" + this.x2 + ", " + this.y2 + ", " + this.z2 + ")";
    }
}
