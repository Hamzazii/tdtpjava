package com.tdtpjava.td3;

import java.awt.*;

public class Exercice1 {
        public static void main(String[] args) {
             PointA pointA=new PointA(3,4);
                pointA.affiche();
        }
}
        class Point{
                public Point(int x, int y){
                        this.x = x;
                        this.y = y;
                }
                public void deplace(int dx, int dy){
                        x += dx;
                        y += dy;
                }
                public int getX(){
                        return x;
                }
                public int getY(){
                        return y;
                }
                private int x, y;
        }
        class PointA extends Point{
        public PointA(int x,int y){
             super(x,y);
        }
        public void affiche(){
                System.out.println("x="+getX()+" et y="+getY());
        }
        }




