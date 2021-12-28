import java.awt.*;
import java.awt.event.*;
public class projectbill implements ActionListener
{
 double m,m1,m2,m3,m4,a,b=0,c=0,d=0,e=0,f=0,sum=0,sum1=0,r1=114000,r2=15000,r3=20000,r4=18000,r5=30000,p1=100,p2=90,p3=86,p4=60,p5=30,v,v1,v2,v3,v4,gst,gst1,gst2,gst3,gst4,di=20,di1=30,di2=10,di3=15,di4=35,cp=50000,cp1=8000,cp2=11000,cp3=10000,cp4=12000,cp5=5,cp6=5,cp7=5,cp8=5,cp9=5,cmm,cmm1,cmm2,cmm3,cmm4,pa,pa1,pa2,pa3,pa4,gt=10,gt1=6,gt2=7,gt3=8,gt4=9;
 String msg="",val="",info="",password,aaa,aaa1,aaa2,aaa3,aaa4,aaa5,farm;
 TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,R1,R2,R3,R4,R5,pass,avail,avail1,avail2,avail3,avail4,tt1,tt2,rr1,rr2,rr3,rr4,rr5,tt3,cs,cs1,cs2,cs3,cs4,pf,pf1,pf2,pf3,pf4,so,so1,so2,so3,so4,cm,cm1,cm2,cm3,cm4,cm5,cm6,cm7,cm8,cm9,gs,gs1,gs2,gs3,gs4,cu,cu1,def,def1,def2,def3,def4,df,df1,df2,df3,df4;
 Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
 Label l1,l2,l3,l4,l5,rate,rate1,rate2,rate3,rate4,quan,quan1,quan2,quan3,quan4,total,total1,total2,total3,total4,av,av1,av2,av3,av4,head,ll1,ll2,dis,dis1,dis2,dis3,dis4,ll3,cost,prof,sold,nl,nl1,nl2,nl3,nl4,mobile,comson,comson1,GST,defect,defect1,defect2,defect3,defect4,defected;
 Choice cb,cb1,cb2;
 TextArea text;
 Frame ff,f1,f2,f3,f4;
 projectbill()
 {
                           ff=new Frame("LOGIN");
                           f1=new Frame("PROGRAM");
                           f2=new Frame("GUEST");
                           f3=new Frame("MORE");
                           f4=new Frame("BILL");
                           ff.setSize(320,300);
                           f2.setSize(330,300);
                           f3.setSize(760,300);
                           f4.setSize(300,300);
                           FlowLayout arm=new FlowLayout();
                           FlowLayout arm1=new FlowLayout(FlowLayout.RIGHT);
                           BorderLayout arm2=new BorderLayout();
                           f2.setLayout(arm);
                           f3.setLayout(arm1);
                           f4.setLayout(arm2);
                           ff.setLayout(arm);
                           ff.setLocation(500,270);
                           f2.setLocation(500,270);
                           f3.setLocation(500,270);
                           f4.setLocation(500,270);
		           head=new Label("~~~~~~~~~~_*_*_*_*_*_*_*_*MOBILE SHOP*_*_*_*_*_*_*_*_~~~~~~~~~~~~");
                           f1.setLayout(new FlowLayout(FlowLayout.RIGHT));
                           f1.setSize(1110,550);
                           f1.setLocation(100,100);
                           Label pass1 =new Label("Password",Label.RIGHT);
                           pass =new TextField(120);
                           pass.setEchoChar('*');
                           aaa="==============================="+"\n"+
                             "            "+"CHINA COMPANY"+"\n"+
                             "name:-"+"Arman"+"\n"+
                             "contact no:-xxxxxxxxx90"+"\n"+
                             "email add:-xxxxxx@xxxx.com"+"\n"+
                             "================================"+"\n";

                           t1=new TextField(10);
                           t2=new TextField(10);
                           t3=new TextField(10);
                           t4=new TextField(10);
                           t5=new TextField(10);
                           t6=new TextField(10);
                           t7=new TextField(10);
                           t8=new TextField(10);
                           t9=new TextField(10);
                           t10=new TextField(10);
                           t11=new TextField(10);
                           tt1=new TextField(20);
                           tt2=new TextField(20);
                           tt3=new TextField(20);                           

                           R1=new TextField(10);
                           R2=new TextField(10);
                           R3=new TextField(10);
                           R4=new TextField(10);
                           R5=new TextField(10);                           

                           avail=new TextField(5);
                           avail1=new TextField(5);
                           avail2=new TextField(5);
                           avail3=new TextField(5);
                           avail4=new TextField(5);

                           def=new TextField(5);
                           def1=new TextField(5);
                           def2=new TextField(5);
                           def3=new TextField(5);
                           def4=new TextField(5);

                           df=new TextField(8);
                           df1=new TextField(8);
                           df2=new TextField(8);
                           df3=new TextField(8);
                           df4=new TextField(8);
          
                           rr1=new TextField(5);
                           rr2=new TextField(5);
                           rr3=new TextField(5);
                           rr4=new TextField(5);
                           rr5=new TextField(5);

                           cs=new TextField(7);
                           cs1=new TextField(7);
                           cs2=new TextField(7);
                           cs3=new TextField(7);
                           cs4=new TextField(7);


                           cm5=new TextField(8);
                           cm6=new TextField(8);
                           cm7=new TextField(8);
                           cm8=new TextField(8);
                           cm9=new TextField(8);

                           cm=new TextField(8);
                           cm1=new TextField(8);
                           cm2=new TextField(8);
                           cm3=new TextField(8);
                           cm4=new TextField(8);

                           cu=new TextField(8);
                           cu1=new TextField(8);
                           gs=new TextField(8);
                           gs1=new TextField(8);
                           gs2=new TextField(8);
                           gs3=new TextField(8);
                           gs4=new TextField(8);

                           pf=new TextField(7);
                           pf1=new TextField(7);
                           pf2=new TextField(7);
                           pf3=new TextField(7);
                           pf4=new TextField(7);

                           so=new TextField(7);
                           so1=new TextField(7);
                           so2=new TextField(7);
                           so3=new TextField(7);
                           so4=new TextField(7);

                           b1=new Button("=");
                           b2=new Button("=");
                           b3=new Button("=");
                           b4=new Button("=");
                           b5=new Button("=");
	                   b6=new Button("UPDATE");
                           b7=new Button("TOTAL");
                           b8=new Button("PROCEED");
                           b9=new Button("LOG OUT");
                           b10=new Button("DISCOUNT");
                           b11=new Button("LOG IN");
                           b12=new Button("LOG IN");
                           b13=new Button("GUEST");
                           b14=new Button("PROCEED");
                           b15=new Button("MORE");
                           b16=new Button("SHOP MORE");
                           b17=new Button("PREVIEW");
                           b18=new Button("PROFIT");
                           b19=new Button("BACK");
                           b20=new Button("LOG OUT");
                           b21=new Button("COMMISSION");
                           b22=new Button("UPDATE");
                           b23=new Button("SOLD OUT");
                           b24=new Button("DEFECTED");
       
                           b1.addActionListener(this);
                           b2.addActionListener(this);
                           b3.addActionListener(this);
                           b4.addActionListener(this);
                           b5.addActionListener(this);
                           b6.addActionListener(this);
                           b7.addActionListener(this);
                           b8.addActionListener(this);
                           b9.addActionListener(this);
                           b10.addActionListener(this);
                           b11.addActionListener(this);
                           b12.addActionListener(this);
                           b13.addActionListener(this);
                           b14.addActionListener(this);
                           b15.addActionListener(this);
                           b16.addActionListener(this);
                           b17.addActionListener(this);
                           b18.addActionListener(this);
                           b19.addActionListener(this);
                           b20.addActionListener(this);
                           b21.addActionListener(this);
                           b22.addActionListener(this);
                           b23.addActionListener(this);
                           b24.addActionListener(this);
                           pass.addActionListener(this);

                           l1=new Label("IPHONE");
                           l2=new Label("REDMI");
                           l3=new Label("OPPO");
                           l4=new Label("VIVO");
                           l5=new Label("MOTO");
                           ll1=new Label("enter userid");
                           ll2=new Label("enter password");
                           ll3=new Label("enter your name");
                           rate=new Label("  Rate=");
                           rate1=new Label("   Rate=");
                           rate2=new Label("   Rate=");
                           rate3=new Label("   Rate=");
                           rate4=new Label("   Rate=");

                           dis=new Label("DISCOUNT=");
                           dis1=new Label("DISCOUNT=");
                           dis2=new Label("DISCOUNT=");
                           dis3=new Label("DISCOUNT=");
                           dis4=new Label("DISCOUNT=");

                           cost=new Label(" COST       ");
                           prof=new Label("  PROFIT     ");
                           sold=new Label("  SOLD  ");
                           comson=new Label("COMMISSION%");
                           comson1=new Label("COMMISSION       ");

                           nl=new Label("  IPHONE  ");
                           nl1=new Label("  REDMI  ");
                           nl2=new Label("  OPPO  ");
                           nl3=new Label("  VIVO  ");
                           nl4=new Label("  MOTO  ");
                           mobile=new Label(" MOBILES         ");
                           GST=new Label("GST%");
                           

                           quan=new Label("Quantity=");
                           quan1=new Label("Quantity=");
                           quan2=new Label("Quantity=");
                           quan3=new Label("Quantity=");
                           quan4=new Label("Quantity=");
                           

                           total=new Label("Total");
                           total1=new Label("Total");
                           total2=new Label("Total");
                           total3=new Label("Total");
                           total4=new Label("Total");

                           defect=new Label("DEFECTED");
                           defect1=new Label("DEFECTED");
                           defect2=new Label("DEFECTED");
                           defect3=new Label("DEFECTED");
                           defect4=new Label("DEFECTED");
                           defected=new Label("DEFECTED");
                           

                           av=new Label("Availability=");
                           av1=new Label("Availability=");
                           av2=new Label("Availability=");
                           av3=new Label("Availability=");
                           av4=new Label("Availability=");
                           cb=new Choice();
                           cb.add("*_*_*_*_*_*_*_*_*_*_*DISCOUNT*_*_*_*_*_*_*_*_*_*_");
                           cb.add("20% OFF ON IPHONE SMARTPHONES WITH GST=10%");
                           cb.add("30% OFF ON REDMI SMARTPHONES WITH GST=6%");
                           cb.add("10% OFF ON OPPO SMARTPHONES WITH GST=7%");
                           cb.add("15% OFF ON VIVO SMARTPHONES WITH GST=8%");
                           cb.add("35% OFF ON MOTO SMARTPHONES WITH GST=9%");
                           Font myFont=new Font("Serif" ,Font.BOLD,32);
                           head.setFont(myFont);
                           head.setBackground(Color.blue);

                           l1.setBackground(Color.cyan);
                           l2.setBackground(Color.cyan);
                           l3.setBackground(Color.cyan);
                           l4.setBackground(Color.cyan);
                           l5.setBackground(Color.cyan);
                          
                           rate.setBackground(Color.magenta);
                           rate1.setBackground(Color.magenta);
                           rate2.setBackground(Color.magenta);
                           rate3.setBackground(Color.magenta);
                           rate4.setBackground(Color.magenta);

                           dis.setBackground(Color.green);
                           dis1.setBackground(Color.green);
                           dis2.setBackground(Color.green);
                           dis3.setBackground(Color.green);
                           dis4.setBackground(Color.green);

                           R1.setBackground(Color.lightGray);
                           R2.setBackground(Color.lightGray);
                           R3.setBackground(Color.lightGray);
                           R4.setBackground(Color.lightGray);
                           R5.setBackground(Color.lightGray);
                           avail.setBackground(Color.lightGray);
                           avail1.setBackground(Color.lightGray);
                           avail2.setBackground(Color.lightGray);
                           avail3.setBackground(Color.lightGray);
                           avail4.setBackground(Color.lightGray);
                           
                           defect.setBackground(Color.green);
                           defect1.setBackground(Color.green);
                           defect2.setBackground(Color.green);
                           defect3.setBackground(Color.green);
                           defect4.setBackground(Color.green);
                           def.setBackground(Color.darkGray);
                           def1.setBackground(Color.darkGray);
                           def2.setBackground(Color.darkGray);
                           def3.setBackground(Color.darkGray);
                           def4.setBackground(Color.darkGray);

                           def.setForeground(Color.white);
                           def1.setForeground(Color.white);
                           def2.setForeground(Color.white);
                           def3.setForeground(Color.white);
                           def4.setForeground(Color.white);

                           ll1.setBackground(Color.black);
                           ll2.setBackground(Color.black);
                           ll3.setBackground(Color.black);
                           ll1.setForeground(Color.white);
                           ll2.setForeground(Color.white);
                           ll3.setForeground(Color.white);
                           tt3.setBackground(Color.lightGray);
                           b15.setBackground(Color.red);

                           av.setBackground(Color.yellow);
                           av1.setBackground(Color.yellow);
                           av2.setBackground(Color.yellow);
                           av3.setBackground(Color.yellow);
                           av4.setBackground(Color.yellow);
                           
                           quan.setBackground(Color.red);
                           quan1.setBackground(Color.red);
                           quan2.setBackground(Color.red);
                           quan3.setBackground(Color.red);
                           quan4.setBackground(Color.red);

                           mobile.setBackground(Color.red);
                           nl.setBackground(Color.red);
                           nl1.setBackground(Color.red);
                           nl2.setBackground(Color.red);
                           nl3.setBackground(Color.red);
                           nl4.setBackground(Color.red);
                           
                           total.setBackground(Color.orange);
                           total1.setBackground(Color.orange);
                           total2.setBackground(Color.orange);
                           total3.setBackground(Color.orange);
                           total4.setBackground(Color.orange);

                           rr1.setBackground(Color.yellow);
                           rr2.setBackground(Color.yellow);
                           rr3.setBackground(Color.yellow);
                           rr4.setBackground(Color.yellow);
                           rr5.setBackground(Color.yellow);
                          
                           pass1.setBackground(Color.green);
                           t1.setBackground(Color.pink);
                           t2.setBackground(Color.pink);
                           t3.setBackground(Color.pink);
                           t4.setBackground(Color.pink);
                           t5.setBackground(Color.pink);
                           t6.setBackground(Color.pink);
                           t7.setBackground(Color.pink);
                           t8.setBackground(Color.pink);
                           t9.setBackground(Color.pink);
                           t10.setBackground(Color.pink);
                           t11.setBackground(Color.pink);
                           tt1.setBackground(Color.pink);
                           tt2.setBackground(Color.pink);
                           tt3.setBackground(Color.pink);

                           cost.setBackground(Color.green);
                           prof.setBackground(Color.green);
                           sold.setBackground(Color.green);
                           defected.setBackground(Color.green);
                           comson.setBackground(Color.green);
                           comson1.setBackground(Color.green);
                           GST.setBackground(Color.green);


                           b9.setBackground(Color.cyan);
                           b10.setBackground(Color.magenta);
                           b11.setBackground(Color.orange);
                           f1.setBackground(Color.black);
                           ff.setBackground(Color.yellow);
                           f2.setBackground(Color.pink);
                           f3.setBackground(Color.orange);

                           cs.setBackground(Color.cyan);
                           cs1.setBackground(Color.cyan);
                           cs2.setBackground(Color.cyan);
                           cs3.setBackground(Color.cyan);
                           cs4.setBackground(Color.cyan);
                           pf.setBackground(Color.cyan);
                           pf1.setBackground(Color.cyan);
                           pf2.setBackground(Color.cyan);
                           pf3.setBackground(Color.cyan);
                           pf4.setBackground(Color.cyan);
                           so.setBackground(Color.magenta);
                           so1.setBackground(Color.magenta);
                           so2.setBackground(Color.magenta);
                           so3.setBackground(Color.magenta);
                           so4.setBackground(Color.magenta);
                           df.setBackground(Color.magenta);
                           df1.setBackground(Color.magenta);
                           df2.setBackground(Color.magenta);
                           df3.setBackground(Color.magenta);
                           df4.setBackground(Color.magenta); 
                           cm.setBackground(Color.lightGray);
                           cm1.setBackground(Color.lightGray);
                           cm2.setBackground(Color.lightGray);
                           cm3.setBackground(Color.lightGray);
                           cm4.setBackground(Color.lightGray);
                           cm5.setBackground(Color.lightGray);
                           cm6.setBackground(Color.lightGray);
                           cm7.setBackground(Color.lightGray);
                           cm8.setBackground(Color.lightGray);
                           cm9.setBackground(Color.lightGray);
                           gs.setBackground(Color.lightGray); 
                           gs1.setBackground(Color.lightGray);
                           gs2.setBackground(Color.lightGray);
                           gs3.setBackground(Color.lightGray);
                           gs4.setBackground(Color.lightGray);
                           tt3.setBackground(Color.yellow);                         

                           Font myFont1=new Font("Serif",Font.BOLD,14);
                           l1.setFont(myFont1);
                           l2.setFont(myFont1);
                           l3.setFont(myFont1);
                           l4.setFont(myFont1);
                           l5.setFont(myFont1);
                           nl.setFont(myFont1);
                           nl1.setFont(myFont1);
                           nl2.setFont(myFont1);
                           nl3.setFont(myFont1);
                           nl4.setFont(myFont1);
                           mobile.setFont(myFont1);
                           ll1.setFont(myFont1);
                           ll2.setFont(myFont1);
                           ll3.setFont(myFont1);
                           cu.setFont(myFont1);
                           cu1.setFont(myFont1);
                          
                          text=new TextArea(aaa);
                          f1.add(head);
                          f1.add(pass);
                          f1.add(pass1);
                          f1.add(l1);f1.add(rate);f1.add(R1);f1.add(av);f1.add(avail);f1.add(quan);f1.add(t1);f1.add(defect);f1.add(def);f1.add(dis);f1.add(rr1);f1.add(total);f1.add(b1);f1.add(t2);
                          f1.add(l2);f1.add(rate1);f1.add(R2);f1.add(av1);f1.add(avail1);f1.add(quan1);f1.add(t3);f1.add(defect1);f1.add(def1);f1.add(dis1);f1.add(rr2);f1.add(total1);f1.add(b2);f1.add(t4);
                          f1.add(l3);f1.add(rate2);f1.add(R3);f1.add(av2);f1.add(avail2);f1.add(quan2);f1.add(t5);f1.add(defect2);f1.add(def2);f1.add(dis2);f1.add(rr3);f1.add(total2);f1.add(b3);f1.add(t6);
                          f1.add(l4);f1.add(rate3);f1.add(R4);f1.add(av3);f1.add(avail3);f1.add(quan3);f1.add(t7);f1.add(defect3);f1.add(def3);f1.add(dis3);f1.add(rr4);f1.add(total3);f1.add(b4);f1.add(t8);
                          f1.add(l5);f1.add(rate4);f1.add(R5);f1.add(av4);f1.add(avail4);f1.add(quan4);f1.add(t9);f1.add(defect4);f1.add(def4);f1.add(dis4);f1.add(rr5);f1.add(total4);f1.add(b5);f1.add(t10);
                          f1.add(b15);f1.add(b9);f1.add(b11);f1.add(b8);f1.add(b6);f1.add(b17);f1.add(b7);f1.add(t11);
                          ff.add(ll1);ff.add(tt1);ff.add(ll2);ff.add(tt2);ff.add(b12);ff.add(b13);
                          f2.add(ll3);f2.add(tt3);f2.add(b14);
                          f3.add(mobile);f3.add(cost);f3.add(prof);f3.add(sold);f3.add(defected);f3.add(comson);f3.add(comson1);f3.add(GST);
                          f3.add(nl);f3.add(cs);f3.add(pf);f3.add(so);f3.add(df);f3.add(cm);f3.add(cm5);f3.add(gs);
                          f3.add(nl1);f3.add(cs1);f3.add(pf1);f3.add(so1);f3.add(df1);f3.add(cm1);f3.add(cm6);f3.add(gs1);
                          f3.add(nl2);f3.add(cs2);f3.add(pf2);f3.add(so2);f3.add(df2);f3.add(cm2);f3.add(cm7);f3.add(gs2);
                          f3.add(nl3);f3.add(cs3);f3.add(pf3);f3.add(so3);f3.add(df3);f3.add(cm3);f3.add(cm8);f3.add(gs3);
                          f3.add(nl4);f3.add(cs4);f3.add(pf4);f3.add(so4);f3.add(df4);f3.add(cm4);f3.add(cm9);f3.add(gs4);
                          f3.add(b22);f3.add(b24);f3.add(b23);f3.add(b21);f3.add(b16);f3.add(b18);f3.add(cu);f3.add(cu1);
                          f4.add(text);
                           avail.setText(Double.toString(p1));
                           avail1.setText(Double.toString(p2));
                           avail2.setText(Double.toString(p3));
                           avail3.setText(Double.toString(p4));
                           avail4.setText(Double.toString(p5));
                           R1.setText(Double.toString(r1));
                           R2.setText(Double.toString(r2));
                           R3.setText(Double.toString(r3));
                           R4.setText(Double.toString(r4));
                           R5.setText(Double.toString(r5));
                           rr1.setText(Double.toString(di));
                           rr2.setText(Double.toString(di1));
                           rr3.setText(Double.toString(di2));
                           rr4.setText(Double.toString(di3));
                           rr5.setText(Double.toString(di4));
                           cs.setText(Double.toString(cp));
                           cs1.setText(Double.toString(cp1));
                           cs2.setText(Double.toString(cp2));
                           cs3.setText(Double.toString(cp3));
                           cs4.setText(Double.toString(cp4));
                           cm.setText(Double.toString(cp5));
                           cm1.setText(Double.toString(cp6));
                           cm2.setText(Double.toString(cp7));
                           cm3.setText(Double.toString(cp8));
                           cm4.setText(Double.toString(cp9));
                           cm5.setText(Double.toString(cp*(cp5/100)));
                           cm6.setText(Double.toString(cp1*(cp6/100)));
                           cm7.setText(Double.toString(cp2*(cp7/100)));
                           cm8.setText(Double.toString(cp3*(cp8/100)));
                           cm9.setText(Double.toString(cp4*(cp9/100)));
                           gs.setText(Double.toString(gt));
                           gs1.setText(Double.toString(gt1));
                           gs2.setText(Double.toString(gt2));
                           gs3.setText(Double.toString(gt3));
                           gs4.setText(Double.toString(gt4));
                           def.setText("0");
                           def1.setText("0");
                           def2.setText("0");
                           def3.setText("0");
                           def4.setText("0");

                           R1.setEditable(false);
                           R2.setEditable(false);
                           R3.setEditable(false);
                           R4.setEditable(false);
                           R5.setEditable(false);
                           avail.setEditable(false);
                           avail1.setEditable(false);
                           avail2.setEditable(false);
                           avail3.setEditable(false);
                           avail4.setEditable(false);
                           rr1.setEditable(false);
                           rr2.setEditable(false);
                           rr3.setEditable(false);
                           rr4.setEditable(false);
                           rr5.setEditable(false);
                           pa=Double.parseDouble(avail.getText());
                           pa1=Double.parseDouble(avail1.getText());
                           pa2=Double.parseDouble(avail2.getText());
                           pa3=Double.parseDouble(avail3.getText());
                           pa4=Double.parseDouble(avail4.getText());

ff.addWindowListener(new WindowAdapter(){  
 public void windowClosing(WindowEvent e) {  
  System.exit(0);  
    }  
}); 
f1.addWindowListener(new WindowAdapter(){  
 public void windowClosing(WindowEvent e) {  
  System.exit(0);  
    }  
});  
f2.addWindowListener(new WindowAdapter(){  
 public void windowClosing(WindowEvent e) {  
  System.exit(0);  
    }  
}); 
f3.addWindowListener(new WindowAdapter(){  
 public void windowClosing(WindowEvent e) {  
  System.exit(0);  
    }  
}); 
f4.addWindowListener(new WindowAdapter(){  
 public void windowClosing(WindowEvent e) {  
  System.exit(0);  
    }  
}); 
ff.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
             R1.setEditable(false);
             R2.setEditable(false);
             R3.setEditable(false);
             R4.setEditable(false);
             R5.setEditable(false);
             avail.setEditable(false);
             avail1.setEditable(false);
             avail2.setEditable(false);
             avail3.setEditable(false);
             avail4.setEditable(false);
             rr1.setEditable(false);
             rr2.setEditable(false);
             rr3.setEditable(false);
             rr4.setEditable(false);
             rr5.setEditable(false);

if(ae.getSource()==b12)
{
 if((tt1.getText()).equals("admin")&&(tt2.getText()).equals("admin"))
 {
  ff.setVisible(false);
  f1.setVisible(true);
  b15.show();
  pass.setText("admin");
  R1.setEditable(true);
  R2.setEditable(true);
  R3.setEditable(true);
  R4.setEditable(true);
  R5.setEditable(true);
  avail.setEditable(true);
  avail1.setEditable(true);
  avail2.setEditable(true);
  avail3.setEditable(true);
  avail4.setEditable(true);
  rr1.setEditable(true);
  rr2.setEditable(true);
  rr3.setEditable(true);
  rr4.setEditable(true);
  rr5.setEditable(true);
               t1.setText("0");
               t3.setText("0");
               t5.setText("0");
               t7.setText("0");
               t9.setText("0");
  
 }
 else
 {
  msg="enter correct username or password";
 }
}
             if(ae.getSource()==b11)
            {
             password=pass.getText();
             if((password).equals("admin"))
             {
             val="WELCOME ADMINISTRATOR";
             b15.show();
               R1.setEditable(true);
               R2.setEditable(true);
               R3.setEditable(true);
               R4.setEditable(true);
               R5.setEditable(true);
               avail.setEditable(true);
               avail1.setEditable(true);
               avail2.setEditable(true);
               avail3.setEditable(true);
               avail4.setEditable(true);
               rr1.setEditable(true);
               rr2.setEditable(true);
               rr3.setEditable(true);
               rr4.setEditable(true);
               rr5.setEditable(true);
               t1.setText("0");
               t3.setText("0");
               t5.setText("0");
               t7.setText("0");
               t9.setText("0");
             }
             else
             {
             val="WELCOME GUEST USER";
             b15.hide();
             }
            }

             if(ae.getSource()==b6)
             {
             if((pass.getText()).equals("admin"))
             {
             String b1,b2,b3,b4,b5,q1,q2,q3,q4,q5,bb1,bb2,bb3,bb4,bb5;
             double a1,a2,a3,a4,a5,x1,x2,x3,x4,x5,xx1,xx2,xx3,xx4,xx5;

             R1.setEditable(true);
             b1=R1.getText();
             a1=Double.parseDouble(b1);
             r1=a1;

             R2.setEditable(true);
             b2=R2.getText();
             a2=Double.parseDouble(b2);
             r2=a2;

             R3.setEditable(true);
             b3=R3.getText();
             a3=Double.parseDouble(b3);
             r3=a3;

             R4.setEditable(true);
             b4=R4.getText();
             a4=Double.parseDouble(b4);
             r4=a4;

             R5.setEditable(true);
             b5=R5.getText();
             a5=Double.parseDouble(b5);
             r5=a5;

             
             avail.setEditable(true);
             q1=avail.getText();
             x1=Double.parseDouble(q1);
             p1=x1;

             avail1.setEditable(true);
             q2=avail1.getText();
             x2=Double.parseDouble(q2);
             p2=x2;

             avail2.setEditable(true);
             q3=avail2.getText();
             x3=Double.parseDouble(q3);
             p3=x3;

             avail3.setEditable(true);
             q4=avail3.getText();
             x4=Double.parseDouble(q4);
             p4=x4;

             avail4.setEditable(true);
             q5=avail4.getText();
             x5=Double.parseDouble(q5);
             p5=x5;


             rr1.setEditable(true);
             bb1=rr1.getText();              
             xx1=Double.parseDouble(bb1);
             di=xx1;

             rr2.setEditable(true);
             bb2=rr2.getText();              
             xx2=Double.parseDouble(bb2);
             di1=xx2;

             rr3.setEditable(true);
             bb3=rr3.getText();              
             xx3=Double.parseDouble(bb3);
             di2=xx3;

             rr4.setEditable(true);
             bb4=rr4.getText();              
             xx4=Double.parseDouble(bb4);
             di3=xx4;

             rr5.setEditable(true);
             bb5=rr5.getText();              
             xx5=Double.parseDouble(bb5);
             di4=xx5;
             avail.setText(Double.toString(p1));
             avail1.setText(Double.toString(p2));
             avail2.setText(Double.toString(p3));
             avail3.setText(Double.toString(p4));
             avail4.setText(Double.toString(p5));
             R1.setText(Double.toString(r1));
             R2.setText(Double.toString(r2));
             R3.setText(Double.toString(r3));
             R4.setText(Double.toString(r4));
             R5.setText(Double.toString(r5));
             rr1.setText(Double.toString(di));
             rr2.setText(Double.toString(di1));
             rr3.setText(Double.toString(di2));
             rr4.setText(Double.toString(di3));
             rr5.setText(Double.toString(di4));
             val="QUANTITY HAS BEEN UPDATED";
             pass.setText("");
             b15.hide();
             }
             else
             {
             val="GUEST USER CANNOT UPDATE.PLEASE ENTER CORRECT PASSWORD OR CONTACT  DETAILS";     
             }
            }

            
             if((t1.getText())=="")
             {
             t1.setText("0");
             }

             if((t2.getText())=="")
             {
             t2.setText("0");
             }

             if((t3.getText())=="")
             {
             t3.setText("0");
             }
 
             if((t4.getText())=="")
             {
             t4.setText("0");
             }


             if((t5.getText())=="")
             {
             t5.setText("0");
             }

             if((t6.getText())=="")
             {
             t6.setText("0");
             }

             if((t7.getText())=="")
             {
             t7.setText("0");
             }

             if((t8.getText())=="")
             {
             t8.setText("0");
             }

             if((t9.getText())=="")
             {
             t9.setText("0");
             }

             if((t10.getText())=="")
             {
             t10.setText("0");
             }

             if((t11.getText())=="")
             {
             t11.setText("0");
             }
                      
if(ae.getSource()==b1)
{
            String s1=t1.getText();
            a=Double.parseDouble(s1);
            v=Double.parseDouble(def.getText());
            a=a-v;
            if(a<=0)
            {
             val="QUANTITY CANNOT BE LESS THAN ZERO RE-ENTER THE QUANTITY";
             t1.setText("");
             t2.setText("");
             p1=p1-v;
            }        
            else if((p1-a)<0)
            {
            val="ENTERED QUANTITY OF IPHONE  IS NOT AVAILABLE.  RE-ENTER QUANTITY";
            a=0;
            t1.setText(Double.toString(a));
            }
            else
            {
            val="";
            p1=p1-(a+v);
            val="STOCK AVAILABLE";
            b=a*(r1-(r1*(di/100)));
            gst=r1*(gt/100);
            t2.setText(Double.toString(b));
            }

t1.setText(Double.toString(a));
def.setText(Double.toString(v));
}
if(ae.getSource()==b2)
{
             String s2=t3.getText();
             a=Double.parseDouble(s2);
             v1=Double.parseDouble(def1.getText());
             a=a-v1;
             if(a<=0)
             {
              val="QUANTITY CANNOT BE LESS THAN ZERO RE-ENTER THE QUANTITY";
              t3.setText("");
              t4.setText("");
              p2=p2-v1;
             }
             else if((p2-a)<0)
             {
             val="ENTERED QUANTITY OF REDMI IS NOT AVAILABLE. RE-ENTER QUANTITY";
             a=0;
             t3.setText(Double.toString(a));
             }
             else
             {
             val="";
             p2=p2-(a+v1);
             val="STOCK AVAILABLE";
             c=a*(r2-(r2*(di1/100)));
             gst1=r2*(gt1/100);
             t4.setText(Double.toString(c));
             }
t3.setText(Double.toString(a));
def1.setText(Double.toString(v1));
}
 if(ae.getSource()==b3)
{
           String s3=t5.getText();
           a=Double.parseDouble(s3);
           v2=Double.parseDouble(def2.getText());
           a=a-v2;
           if(a<=0)
           {
             val="QUANTITY CANNOT BE LESS THAN ZERO RE-ENTER THE QUANTITY";
             t5.setText("");
             t6.setText("");
             p3=p3-v2;
           }         
           else if((p3-a)<0)
           {
           val="ENTERED QUANTITY OF OPPO IS NOT AVAILABLE. RE-ENTER QUANTITY";
           a=0;
           t5.setText(Double.toString(a));
           }
           else
           {
           val="";
           p3=p3-(a+v2);
           val="STOCK AVAILBALE";
           d=a*(r3-(r3*(di2/100)));
           gst2=r3*(gt2/100);
           t6.setText(Double.toString(d));
           }
t5.setText(Double.toString(a));
def2.setText(Double.toString(v2));
}
if(ae.getSource()==b4)
{
           String s4=t7.getText();
           a=Double.parseDouble(s4);
           v3=Double.parseDouble(def3.getText());
           a=a-v3;
           if(a<=0)
           {
             val="QUANTITY CANNOT BE LESS THAN ZERO RE-ENTER THE QUANTITY";
             t7.setText("");
             t8.setText("");
             p4=p4-v3;
           }          
           else if((p4-a)<0)
           {
           val="ENTERED QUNATITY OF VIVO IS NOT AVAILABLE. RE-ENTER QUANTITY";
           a=0;
           t7.setText(Double.toString(a));
           }
           else
           {
           val="";
           p4=p4-(a+v3);
           val="STOCK AVAILABLE";
           e=a*(r4-(r4*(di3/100)));
           gst3=r4*(gt3/100);
           t8.setText(Double.toString(e));
           }
t7.setText(Double.toString(a));
def3.setText(Double.toString(v3));
}
if(ae.getSource()==b5)
{
            String s5=t9.getText();
            a=Double.parseDouble(s5);
            v4=Double.parseDouble(def4.getText());
            a=a-v4;
            if(a<=0)
            {
              val="QUANTITY CANNOT BE LESS THAN ZERO RE-ENTER THE QUANTITY";
              t9.setText("");
              t10.setText("");
              p5=p5-v4;
            }        
            else if((p5-a)<0)
            {
            val="ENTERED QUANTITY OF MOTO IS NOT AVAILABLE.  RE-ENTER QUANTITY";
            a=0;
            t10.setText(Double.toString(a));
            }
            else
            {
            val="";
            p5=p5-(a+v4);
            val="STOCK AVAILABLE";
            f=a*(r5-(r5*(di4/100)));
            gst4=r5*(gt4/100);
            t10.setText(Double.toString(f));
            }
t9.setText(Double.toString(a));
def4.setText(Double.toString(v4));
}

if(ae.getSource()==b8)
{
t1.setText("0");t2.setText("");t3.setText("0");
t4.setText("");t5.setText("0");t6.setText("");
t7.setText("0");t8.setText("");t9.setText("0");
t10.setText("");t11.setText("0");def.setText("0");
def1.setText("0");def2.setText("0");def3.setText("0");def4.setText("0");
val="THANK YOU";
avail.setText(Double.toString(p1));
avail1.setText(Double.toString(p2));
avail2.setText(Double.toString(p3));
avail3.setText(Double.toString(p4));
avail4.setText(Double.toString(p5));
}

if(ae.getSource()==b7)
{
cmm=Double.parseDouble(cm5.getText());
cmm1=Double.parseDouble(cm6.getText());
cmm2=Double.parseDouble(cm7.getText());
cmm3=Double.parseDouble(cm8.getText());
cmm4=Double.parseDouble(cm9.getText());

sum=b+c+d+e+f+gst+gst1+gst2+gst3+gst4+cmm+cmm1+cmm2+cmm3+cmm4;
if(sum<=50000)
{
 sum=sum+(sum*0.04);
}
if((sum>50000)&&(sum<=100000))
{
 sum=sum+2000+((sum-50000)*0.08);
}
if((sum>100000)&&(sum<=500000))
{
 sum=sum+2000+4000+((sum-100000)*0.1);
}
if((sum>500000)&&(sum<=1000000))
{
 sum=sum+2000+4000+10000+((sum-500000)*0.15);
}
if((sum>1000000)&&(sum<=2000000))
{
 sum=sum+2000+4000+10000+75000+((sum-1000000)*0.16);
}
if(sum>2000000)
{
 sum=sum+2000+4000+10000+75000+160000+((sum-2000000)*0.18);
}
t11.setText(Double.toString(sum));
val="YOUR TOTAL IS ="+sum;
}

if(ae.getSource()==b9)
{
 f1.setVisible(false);
 ff.setVisible(true);
}

if(ae.getSource()==b13)
{
 ff.setVisible(false);
 f2.setVisible(true);

}
if(ae.getSource()==b14)
{
 if((tt3.getText()).equals(""))
 {
  info="enter you name first";
 }
else
 {
 f2.setVisible(false);
 f1.setVisible(true);
 b15.hide();
 }
}
if(ae.getSource()==b15)
{
 f1.setVisible(false);
 f3.setVisible(true);
}
if(ae.getSource()==b16)
{
 f3.setVisible(false);
 f1.setVisible(true);
}
if(ae.getSource()==b17)
{
 f1.setVisible(false);
 f4.setVisible(true);
}
 
if(ae.getSource()==b22)
{
              cp=Double.parseDouble(cs.getText());
             cp1=Double.parseDouble(cs1.getText());
             cp2=Double.parseDouble(cs2.getText());
             cp3=Double.parseDouble(cs3.getText());
             cp4=Double.parseDouble(cs4.getText());

             cp5=Double.parseDouble(cm.getText());
             cp6=Double.parseDouble(cm1.getText());
             cp7=Double.parseDouble(cm2.getText());
             cp8=Double.parseDouble(cm3.getText());
             cp9=Double.parseDouble(cm4.getText());

              gt=Double.parseDouble(gs.getText());
              gt1=Double.parseDouble(gs1.getText());
              gt2=Double.parseDouble(gs2.getText());
              gt3=Double.parseDouble(gs3.getText());
              gt4=Double.parseDouble(gs4.getText());
             
             cs.setText(Double.toString(cp));
             cs1.setText(Double.toString(cp1));
             cs2.setText(Double.toString(cp2));
             cs3.setText(Double.toString(cp3));
             cs4.setText(Double.toString(cp4));
             cm.setText(Double.toString(cp5));
             cm1.setText(Double.toString(cp6));
             cm2.setText(Double.toString(cp7));
             cm3.setText(Double.toString(cp8));
             cm4.setText(Double.toString(cp9));
             gs.setText(Double.toString(gt));
             gs1.setText(Double.toString(gt1));
             gs2.setText(Double.toString(gt2));
             gs3.setText(Double.toString(gt3));
             gs4.setText(Double.toString(gt4));
}

if(ae.getSource()==b21)
{
 String y,y1,y2,y3,y4,z,z1,z2,z3,z4;
 Double yy,yy1,yy2,yy3,yy4,zz,zz1,zz2,zz3,zz4;
 y=cs.getText();
 y1=cs1.getText();
 y2=cs2.getText();
 y3=cs3.getText();
 y4=cs4.getText();
 z=cm.getText();
 z1=cm1.getText();
 z2=cm2.getText();
 z3=cm3.getText();
 z4=cm4.getText();
 yy=Double.parseDouble(y);
 yy1=Double.parseDouble(y1);
 yy2=Double.parseDouble(y2);
 yy3=Double.parseDouble(y3);
 yy4=Double.parseDouble(y4);
 zz=Double.parseDouble(z);
 zz1=Double.parseDouble(z1);
 zz2=Double.parseDouble(z2);
 zz3=Double.parseDouble(z3);
 zz4=Double.parseDouble(z4);
 cm5.setText(Double.toString((zz/100)*(yy)));
 cm6.setText(Double.toString((zz1/100)*(yy1)));
 cm7.setText(Double.toString((zz2/100)*(yy2)));
 cm8.setText(Double.toString((zz3/100)*(yy3)));
 cm9.setText(Double.toString((zz4/100)*(yy4)));
}
if(ae.getSource()==b18)
{
 cmm=Double.parseDouble(cm5.getText());
 cmm1=Double.parseDouble(cm6.getText());
 cmm2=Double.parseDouble(cm7.getText());
 cmm3=Double.parseDouble(cm8.getText());
 cmm4=Double.parseDouble(cm9.getText());
 pf.setText(Double.toString(b-(cp+cmm+gst)));

 pf1.setText(Double.toString(c-(cp1+cmm1+gst1)));

 pf2.setText(Double.toString(d-(cp2+cmm2+gst2)));

 pf3.setText(Double.toString(e-(cp3+cmm3+gst3)));

 pf4.setText(Double.toString(f-(cp4+cmm4+gst4)));

}
if(ae.getSource()==b23)
{
 v=Double.parseDouble(def.getText());
 v1=Double.parseDouble(def1.getText());
 v2=Double.parseDouble(def2.getText());
 v3=Double.parseDouble(def3.getText());
 v4=Double.parseDouble(def4.getText());
 so.setText(Double.toString(pa-p1-v));
 so1.setText(Double.toString(pa1-p2-v1));
 so2.setText(Double.toString(pa2-p3-v2));
 so3.setText(Double.toString(pa3-p4-v3));
 so4.setText(Double.toString(pa4-p5-v4));
}
if(ae.getSource()==b24)
{
 m=Double.parseDouble(t1.getText());
 m1=Double.parseDouble(t3.getText());
 m2=Double.parseDouble(t5.getText());
 m3=Double.parseDouble(t7.getText());
 m4=Double.parseDouble(t9.getText());
 df.setText(Double.toString(pa-p1-m)); 
 df1.setText(Double.toString(pa1-p2-m1));
 df2.setText(Double.toString(pa2-p3-m2));
 df3.setText(Double.toString(pa3-p4-m3));
 df4.setText(Double.toString(pa4-p5-m4));
}
if(ae.getSource()==b17)
{
 String ss1=t1.getText();
 String ss2=t3.getText();
 String ss3=t5.getText();
 String ss4=t7.getText();
 String ss5=t9.getText();
 String ss6=t2.getText();
 String ss7=t4.getText();
 String ss8=t6.getText();
 String ss9=t8.getText();
 String ss10=t10.getText();
 if((t1.getText()!="")&&(t1.getText()!="0"))
 {
  aaa1=aaa+"MOBILE       QUANTITY        DISCOUNTED PRICE"+"\n"+
     "IPHONE              "+ss1+"                 "+ss6+" "+"\n";
  text.setText(aaa1);
 }
 if((t3.getText()!="")&&(t3.getText()!="0"))
 {
  aaa2=aaa1+"REDMI                 "+ss2+"                  "+ss7+" "+"\n";
  text.setText(aaa2);
 }
 if((t5.getText()!="")&&(t5.getText()!="0"))
 {
  aaa3=aaa2+"OPPO                  "+ss3+"                 "+ss8+" "+"\n";
  text.setText(aaa3);
 }
 if((t7.getText()!="")&&(t7.getText()!="0"))
 {
  aaa4=aaa3+"VIVO                     "+ss4+"                 "+ss9+" "+"\n";
  text.setText(aaa4);
 }
 if((t9.getText()!="")&&(t9.getText()!="0"))
 {
  aaa5=aaa4+"MOTO                   "+ss5+"                 "+ss10+" "+"\n"+
            "                                                        "+"\n"+
            "             "+"THANK YOU VISIT US AGAIN"+                  "\n";
  text.setText(aaa5);
 }

}
cu.setText(tt3.getText());
cu1.setText(Double.toString(sum));

ff.repaint();
f1.repaint();
f2.repaint();
}
public void paint(Graphics g)
{
g.setColor(Color.blue);
Font myFont = new Font("Serif",Font.BOLD+Font.ITALIC,15);
g.setFont(myFont);
g.drawString(val,50,350);
g.drawString(msg,50,200);
}
public static void main(String ar[]){
projectbill jb = new projectbill();
}
}
 