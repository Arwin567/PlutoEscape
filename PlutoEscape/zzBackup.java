//ravi.16920@lpu.co.in

import java.awt.Graphics;
import java.awt.event.*;
import java.awt.*; import javax.swing.*; import java.awt.event.*;
import java.awt.Image;
public class BallGameTest
{
public static void main (String [] args)
{
BallGame world = new BallGame("Pluto Escape"); 

world.setVisible(true); 
world.move( ); 
}
}



 class BallGame extends MovingBall
 
{
	int x=0;
private Paddle myPaddle = new Paddle(FRAME_WIDTH, FRAME_HEIGHT);

public BallGame (String title)
{ 
super(title); 
addKeyListener(new KeyList( )); 
}

 

public void paint (Graphics g)
{ 
super.paint(g); 
if (isContact( )) 
{
myBall.bounce( ); 
x++;
	JLabel l2 = new JLabel("Score : ");
	JLabel l1 = new JLabel("Score : "+x);
l1.setFont(new Font("TNR",Font.BOLD,50)) ;
l1.setForeground(Color.white);
l1.setBounds(30,10,500,500);
add(l1);

} 
else 
{ 
myPaddle.paint(g); 
} 
}

public boolean isContact( ) 
{ 
if (myPaddle.area( ).contains(myBall.getPosition( ))) 
{ 
return true; 
} 
else 
{ 
return false; 
} 
}

// inner class for the listener 
private class KeyList extends KeyAdapter 
{ 
public void keyPressed (KeyEvent k) 
{ 
if (k.getKeyCode( ) == KeyEvent.VK_LEFT) 
{ 
myPaddle.moveLeft( ); 
} 
if (k.getKeyCode( ) == KeyEvent.VK_RIGHT) 
{ 
myPaddle.moveRight( );
}
} 
} 
} 


class MovingBall extends JFrame
{
protected final int FRAME_WIDTH = 700;
protected final int FRAME_HEIGHT = 700;
protected Ball myBall = new Ball(FRAME_WIDTH, FRAME_HEIGHT);
JLabel l;
ImageIcon i ;


public MovingBall (String title)
{
super(title);


setSize(FRAME_WIDTH, FRAME_HEIGHT);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
setBackground(Color.BLACK);
i = new ImageIcon(getClass().getResource("deep_space-wallpaper-1920x1080.jpg"));
l = new JLabel(i);
}

public void paint (Graphics g)
{
	
	
super.paint(g);
myBall.paint(g); 
}

public void move ( ) 
{ 
while (true) 
{
	add(l);
	
myBall.move( );		//**************
repaint( );
try
{
Thread.sleep(40);
}
catch (InterruptedException e)
{
System.exit(0);
}
} 
} 
} 




 class Ball extends JFrame
{
	Image globe = new ImageIcon("globe.png ").getImage();
private final int RADIUS = 10;
private Point pos;

private int yChange = 2;

private int xChange = 1;

private int height, width;

ImageIcon i1 = new ImageIcon(getClass().getResource("earth.png"));
JLabel l1 = new JLabel(i1);
int x,y,vel;
int x1,y1,vel1;
int x2,y2,vel2;
int x3,y3,vel3;
int x4,y4,vel4;
int x5,y5,vel5;
int x6,y6,vel6;
int x0,y0,vel0;
int a,b;
ImageIcon im = new ImageIcon(getClass().getResource("Animated-gif-Mars-spinning.gif"));
Image globe1 = new ImageIcon("sun-transparent-300x300.png").getImage();
Image saturn= new ImageIcon("saturn-transparent-300x300.png").getImage();
Image mars= new ImageIcon("mars-transparent-300x300.png").getImage();
Image pluto= new ImageIcon("pluto1.png").getImage();
Image mercury= new ImageIcon("mercury.png").getImage();
Image uranus= new ImageIcon("uranus.png").getImage();
Image jupiter= new ImageIcon("jupiter.png").getImage();
public Ball (int frameWidth, int frameHeight)
{
width = frameWidth; height = frameHeight; pos = new Point ( );
pos.x = (int)(Math.random( ) * (width - RADIUS)) + RADIUS;
pos.y = (int)(Math.random( ) * (height/2 - RADIUS)) + RADIUS;
x=250;
y=0;
vel=1;
x1=50;
y1=0;
vel1=1;
x2=400;
y2=0;
vel2=1;
x3=200; y3=0; vel3=1;
x4=500; y4=0; vel4=1;
x5=150; y5=0; vel5=1;
x6=390; y6=0; vel6=1;
x0=220; y0=0; vel0=1;


a=300;
b=300;
}

public void paint (Graphics g)
{
	g.setColor(Color.red);

	
	if(x0>350)
	{
		x0=350;
		vel0=-vel0;
	}
	else if(x0<300)
	{
		x0=300;
		vel0=-vel0;
	}	
	x0+=vel0;
	if(vel0>0)
		y0=350+(int)(Math.sqrt(4000-((x0-350)*(x0-350))));
	else
		y0=350-(int)(Math.sqrt(4000-((x0-350)*(x0-350))));
	g.drawImage(mercury,x0,y0,20,20,null);

	if(x>450)
	{
		x=450;
		vel=-vel;
	}
	else if(x<250)
	{
		x=250;
		vel=-vel;
	}	
	x+=vel;
	if(vel>0)
		y=350+(int)(Math.sqrt(10000-((x-350)*(x-350))));
	else
		y=350-(int)(Math.sqrt(10000-((x-350)*(x-350))));
	g.drawImage(globe,x,y,30,30,null);


if(x1>500)
{
	x1=500;
	vel1=-vel1;
}
else if(x1<200)
{
	x1=200;
	vel1=-vel1;
}
x1+=vel1;
if(vel1>0)
	y1=350+(int)(Math.sqrt(22500-((x1-350)*(x1-350))));
else
	y1=350-(int)(Math.sqrt(22500-((x1-350)*(x1-350))));
g.drawImage(mars,x1,y1,40,40,null);



if(x2>550)
{
	x2=550;
	vel2=-vel2;
}
else if(x2<150)
{
	x2=150;
	vel2=-vel2;
}
x2+=vel2;
if(vel2>0)
	y2=350+(int)(Math.sqrt(40000-((x2-350)*(x2-350))));
else
	y2=350-(int)(Math.sqrt(40000-((x2-350)*(x2-350))));
g.drawImage(jupiter,x2,y2,30,30,null);


if(x3>600)
	{
		x3=600;
		vel3=-vel3;
	}
	else if(x3<100)
	{
		x3=100;
		vel3=-vel3;
	}	
	x3+=vel3;
	if(vel3>0)
		y3=350+(int)(Math.sqrt(62500-((x3-350)*(x3-350))));
	else
		y3=350-(int)(Math.sqrt(62500-((x3-350)*(x3-350))));
	g.drawImage(saturn,x3,y3,30,30,null);

	
if(x4>650)
	{
		x3=650;
		vel4=-vel4;
	}
	else if(x4<50)
	{
		x4=50;
		vel4=-vel4;
	}	
	x4+=vel4;
	if(vel4>0)
		y4=350+(int)(Math.sqrt(90000-((x4-350)*(x4-350))));
	else
		y4=350-(int)(Math.sqrt(90000-((x4-350)*(x4-350))));
	g.drawImage(uranus,x4,y4,30,30,null);


	
g.drawImage(pluto,pos.x - RADIUS,pos.y - RADIUS, 2 * RADIUS, 2 * RADIUS,null);
add(l1);


g.drawImage(globe1,a,b,100,100,null);





if(pos.y>700)
{
	Font f = new Font("TNR",Font.BOLD,50);
	g.setFont(f);
	g.drawString("PLUTO ESCAPED !!",200,200);
}
}

public void move () 
{ 

 if( pos.x>x && pos.x<(x+30) && pos.y<(y+30) && pos.y>y)
 {
	 pos.x=x+15;
	 pos.y=y+30;
	 xChange = -xChange;
	 yChange = -yChange;
 }
 if( pos.x>x1 && pos.x<(x1+30) && pos.y<(y1+30) && pos.y>y1)
 {
	 pos.x=x1+15;
	 pos.y=y1+30;
	 xChange = -xChange;
	 yChange = -yChange;
 }
 if( pos.x>x2 && pos.x<(x2+40) && pos.y<(y2+40) && pos.y>y2)
 {
	 pos.x=x2+20;
	 pos.y=y2+40;
	 xChange = -xChange;
	 yChange = -yChange;
 }
 
 if( pos.x>x3 && pos.x<(x3+40) && pos.y<(y3+40) && pos.y>y3)
 {
	 pos.x=x3+20;
	 pos.y=y3+40;
	 xChange = -xChange;
	 yChange = -yChange;
 }
 
 if( pos.x>x4 && pos.x<(x4+40) && pos.y<(y4+40) && pos.y>y4)
 {
	 pos.x=x4+20;
	 pos.y=y4+40;
	 xChange = -xChange;
	 yChange = -yChange;
 }
 
 
 if( pos.x>320 && pos.x<380 && pos.y<380 && pos.y>320)
 {
	 pos.x=300;
	 pos.y=400;
	 xChange = -xChange;
	 yChange = -yChange;
 }

if(pos.y < 0 )
{
 pos.y=40;
yChange = -yChange; 
 }
if(pos.x <0)
{
 pos.x=40;

xChange = -xChange; 
} 
if (pos.x+(2*RADIUS) > width  ) 
{ 
xChange = -xChange; 
} 
if (pos.y+(2*RADIUS) < height ) 
{ 
pos.translate(xChange, yChange); 
} 
if (pos.x < width - RADIUS) 
{ 
pos.translate(xChange, yChange); 
} 


}

public void bounce ( )
{ 
yChange = -yChange; 
pos.translate(xChange, yChange); 
}

public Point getPosition ( )
{
return pos;
}
}


 class Paddle
{
private Color paddleColour = Color.blue;
private int x, y;
private int paddleWidth = 70;
private int r=100;
private int paddleHeight = 20;
Image globe = new ImageIcon("sun-transparent-300x300.png").getImage();
Image h = new ImageIcon("hand.png").getImage();
private int move = 5;

public Paddle (int frameWidth,int frameHeight)
{ 
x = (int)(Math.random( ) * (frameWidth - paddleWidth)); 
y = frameHeight - paddleHeight; 

}

public void moveRight ( ) 
{ 
x = x + move; 
}

public void moveLeft ( ) 
{ 
x = x - move; 
}

public Rectangle area ( ) 
{ 
return new Rectangle(x, y, paddleWidth, paddleHeight); 
}

public void paint (Graphics g) 
{ 

int r=100;
g.setColor(paddleColour); 
//g.fillRect(x, y, paddleWidth, paddleHeight);
g.drawImage(h,x-9, y, paddleWidth, paddleHeight,null);
g.setColor(Color.YELLOW);


 
  
      
}
}