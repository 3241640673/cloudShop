package com.whh;
import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Test extends JFrame implements Runnable {
    public static void main(String[] args) throws IOException {
        (new Thread(new Test())).start();
    }
    Canvas canvas = new Canvas();
    public Test() {
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        int wight = Toolkit.getDefaultToolkit().getScreenSize().width;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(wight,height);
        canvas.setSize(this.getSize().width, this.getSize().height);
        this.getContentPane().add(canvas, BorderLayout.CENTER);
        this.pack();
        canvas.setBackground(Color.BLACK);
        this.setVisible(true);
    }
    ArrayList<Rain> rainlist = new ArrayList<Test.Rain>();
    Random random = new Random();
    public void paint() throws IOException{
        Image image = createImage(this.getSize().width, this.getSize().height);
        Graphics g = image.getGraphics();
        g.setColor(Color.black);
        g.fillRect(0, 0, this.getSize().width, this.getSize().height);
        for(int i = 0; i < 10; i++){
            rainlist.add(new Rain(getSize().width/4+random.nextInt()%(getSize().width+getSize().width/4)
                    ,getSize().width/4+random.nextInt()%(getSize().width+getSize().width/4)
                    ,getSize().width/4+random.nextInt()%(getSize().width+getSize().width/4)));
        }
        for(int i = 0; i < rainlist.size(); ){
            rainlist.get(i).paint(g);
            // rr.get(i).paint(g);
            if(rainlist.get(i).y > this.getSize().height){
                rainlist.remove(i);
            } else {
                i++;
            }
        }
        canvas.getGraphics().drawImage(image, 0, 0, null);
    }
    class Rain {
        int ci = 0;
        int ci1 = 0;
        public int x, y, a, b,c,d;
        public Rain(int x,int a,int c){
            this.x = x;
            this.y = 0;
            this.a = a;
            this.b = 0;
            this.c = c;
            this.d = 0;
        }
        public void paint(Graphics g) throws IOException{
            g.setColor(Color.white);
            g.fillOval(20, 20, 60, 60);
            g.setColor(Color.BLACK);
            g.fillOval(0, 0, 60, 60);
            int R=(int)(Math.random()*255);
            int G=(int)(Math.random()*255);
            int B=(int)(Math.random()*255);
            int xing =(int)(Math.random()*50 + 1);
            int xing1 = (int)(Math.random()*50 + 1);
            int xing2 = (int)(Math.random()*50 + 1);
            if(xing == 20 && xing1 > 5) {
                g.setFont(new Font("",Font.BOLD,20));
                g.setColor(new Color(63, 208, 70));
                g.drawString("★", 30, 20);
                g.setColor(new Color(206, 33, 33));
                g.drawString("★", 30, 20);
            }

            if(xing == 1 && xing1 == 5 && xing2 == 5) {
                for(int i = 0 ; i < 10 ;i++) {
                    g.setColor(new Color(187, 56, 56));
                    g.drawString("★", 100, 100);
                    g.setColor(new Color(213, 98, 98));
                    g.drawString("★", 100, 100);

                    g.setColor(new Color(186, 19, 201));
                    g.drawString("★", 800, 34);
                    g.setColor(new Color(225, 204, 119));
                    g.drawString("★", 800, 34);
                    //
                    g.setColor(new Color(141, 194, 11));
                    g.drawString("★", 300, 20);
                    g.setColor(new Color(217, 124, 17));
                    g.drawString("★", 300, 20);
                }
            }
            g.setColor(new Color(R,G,B));
            //g.drawOval(x-2, y-3, 5, 4);
            g.setColor(Color.white);
            g.fillOval(x-2, y-2, 4, 4);
            g.setColor(new Color(47, 154, 208));
            g.drawLine(x+19,y-20, x, y);
            x-=10;
            y+=10;
            if(xing == 1 && xing1 == 5 && xing2 >= 40) {
                g.setColor(Color.white);
                g.fillOval(a-2, b-2, 4, 4);
                g.setColor(new Color(98, 198, 40));
                g.drawLine(a-850,b+1000, a, b);
                a-=10;
                b+=10;
            }
            int c = 300 ;
            int d = 100;
            String zi = "周宗飞好笨啊";
            ci = ci +20;
            if(ci == 700) {
                String[] f = zi.split(",");
                for(int i = 0 ; i < f.length ; i++) {
                    g.setColor(new Color(255,255,255));
                    g.setFont(new Font("宋体",Font.BOLD,20));
                    g.drawString(f[i], c, d);
                    c+=20;
                }
            }
            if(ci == 1000) {
                c -= 20;
                d += 50;
                String zi1 = "一个超级大吃货";
                String[] f1 = zi1.split(",");
                for(int i = 0 ; i < f1.length ; i++) {
                    g.setColor(new Color(255,255,255));
                    g.setFont(new Font("宋体",Font.BOLD,20));
                    g.drawString(f1[i], c, d);
                    c+=20;
                }
            }

            if(ci == 1300) {
                d += 100;
                c -= 30;
                String zi2 = "爱财如命见钱眼开";
                String[] f2 = zi2.split(",");
                for(int i = 0 ; i < f2.length ; i++) {
                    g.setColor(new Color(255,255,255));
                    g.setFont(new Font("宋体",Font.BOLD,20));
                    g.drawString(f2[i], c, d);
                    c+=20;
                }
            }
            if(ci == 1500) {
                d += 150;
                c -= 30;
                String zi2 = "打麻将特别喜欢输钱";
                String[] f2 = zi2.split(",");
                for(int i = 0 ; i < f2.length ; i++) {
                    g.setColor(new Color(255,255,255));
                    g.setFont(new Font("宋体",Font.BOLD,20));
                    g.drawString(f2[i], c, d);
                    c+=20;
                }
            }
        }
    }
    public void run(){
        int i =0;
        while(true){
            try {i+=20;
                if(i == 1600){File file = new File("D:\\eclipse素材库\\手指舞.mp4");
                    Process p = Runtime.getRuntime().exec("C:\\Program Files (x86)\\IQIYI Video\\QyClient.exe " +file); //.exe后面留有空格
                }
                paint();
                // paint1();
                Thread.sleep(30);
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }

}
