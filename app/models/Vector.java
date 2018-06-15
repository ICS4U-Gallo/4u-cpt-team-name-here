package models;

public class Vector {
    public int x1;
    public int y1;
    public int z1;
    public int x2;
    public int y2;
    public int z2;
    public int dotAnswer = 0;
    public String crossAnswer = "0";

    public Vector (){}
    public Vector (int x1, int y1, int z1, int x2, int y2,int z2){
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
