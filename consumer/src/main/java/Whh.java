public class Whh {
    public static void main(String[] args) throws InterruptedException{
        int count=0;
        for (float y=2.5f;y>-2.0f;y-=0.12f){
            for (float x=-2.3f;x<2.3f;x+=0.041f){
                float a =x*x+y*y-4f;
                if((a*a*a-x*x*y*y*y)<-0.0f){
                    String str="飞";
                    int num =count%str.length();
                    System.err.print(str.charAt(num));
                    count++;
                }
                else{
                    System.err.print(" ");
                }
            }
            System.err.println();
            Thread.sleep(100);
        }
        System.out.println("如果能好好被爱！");
        System.out.println("谁不想呆在一个人身边一年有一年呢！");
    }
}
//if(ci == 700) {
//        String[] f = zi.split(",");
//        for(int i = 0 ; i < f.length ; i++) {
//        g.setColor(new Color(255,255,255));
//        g.setFont(new Font("宋体",Font.BOLD,20));
//        g.drawString(f[i], c, d);
//        c+=20;
//        }
//        }
//        if(ci == 1000) {
//        c -= 20;
//        d += 50;
//        String zi1 = "一个超级大吃货";
//        String[] f1 = zi1.split(",");
//        for(int i = 0 ; i < f1.length ; i++) {
//        g.setColor(new Color(255,255,255));
//        g.setFont(new Font("宋体",Font.BOLD,20));
//        g.drawString(f1[i], c, d);
//        c+=20;
//        }
//        }
//        //ci1+=20;
//        if(ci == 1300) {
//        d += 100;
//        c -= 30;
//        String zi2 = "爱财如命,见钱眼开";
//        String[] f2 = zi2.split(",");
//        for(int i = 0 ; i < f2.length ; i++) {
//        g.setColor(new Color(255,255,255));
//        g.setFont(new Font("宋体",Font.BOLD,20));
//        g.drawString(f2[i], c, d);
//        c+=20;
//        }
//        }
//        if(ci == 1500) {
//        d += 150;
//        c -= 30;
//        String zi2 = "打麻将特别喜欢输钱";
//        String[] f2 = zi2.split(",");
//        for(int i = 0 ; i < f2.length ; i++) {
//        g.setColor(new Color(255,255,255));
//        g.setFont(new Font("宋体",Font.BOLD,20));
//        g.drawString(f2[i], c, d);
//        c+=20;
//        }
//        }
//        if(ci == 1700) {
//        d += 150;
//        c -= 30;
//        String zi2 = "哈哈哈哈哈哈哈哈";
//        String[] f2 = zi2.split(",");
//        for(int i = 0 ; i < f2.length ; i++) {
//        g.setColor(new Color(255,255,255));
//        g.setFont(new Font("宋体",Font.BOLD,20));
//        g.drawString(f2[i], c, d);
//        c+=20;
//        }
//        }
