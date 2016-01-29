///by:Ana Collantes
///modular0.java

float moonX, moonY;
float x,y;
float dx, dy;

void setup() {
  size(600,600);
  reset();
}

void reset() {
  moonX=width/2;
  moonY=40;

}

void draw() {
  scene();
  action();
  show();
  messages();
}

void scene() {
  background(25,34,77); ///light blue sky
  
 ///moon
 stroke(0);
 fill(110,110,113);
 ellipse(moonX, moonY, 40,40);
 fill(201,196,206); ////white spots
 //stroke(201,196,206);
 ellipse(moonX, moonY, 5, 5);
 ellipse(moonX+4, moonY+9, 4,4);
 ellipse(moonX+9,moonY-3, 6,6);
 ellipse(moonX-6,moonY-9, 7,7);
 ellipse(moonX-8,moonY+9,2,2);
 
 //house
 fill(255,151,113);
 triangle(400,230, 478,130, 559, 230);
 rect(400,230, 158, 150);
 //door
 fill(72,56,50);
 rect(465,334,30,45);
 //windows
 fill(27,36,62);
 //left window
 stroke(255);
 rect(420, 260, 40, 30);
 //stroke(255);
 //horizontal line
 line(420,275, 460,275);
 //vertical line
 line(440,260,440,289);
 //right window
 //stroke(0);
 rect(497, 260, 40,30);
 //horizontal line
 line(497,275,537,275);
 //vertical line
 line(517,260, 517, 290);
 //triangle window
 ellipse(478,200, 35,35);
 line(478,183, 478,217);
 line(460,200,494,200);
 
 stroke(0);
 fill(0);
 ellipse(470,358,1,1);
}
  void messages() {
    fill(222,194,252);
    text("Ana Collantes/modular0.java", width/22, 580);
  }
  
 void action() { ///moon moving from left to right
   if(moonX>width) {
     moonX=0;
     //moonY=  random( 20, 120 );
     }
     moonX=  moonX + 1; //move the moon 1=slow:2,3=fast
  
  x=  x + dx;
  //y=  y + dy;
 }
 void show() {
   //creature
   fill(253,211,255);
   ellipse(x,y,30,40);
   //eyes
   fill(255);
   ellipse(x-5,y-3, 5,5);  ///left eye
   fill(0);
   ellipse(x-5,y-3,1.5,1.5);
   
   fill(255);
   ellipse(x+6,y-3, 5,5);  ///right eye
   fill(0);
   ellipse(x+6,y-3,1.5,1.5);
   
   ///nose
   fill(253,211,255);
   triangle(x-2,y+6,x,y+2,x+2,y+6);
   ///mouth
   stroke(28);
   line(x-4,y+11, x+4,y+11);
   
   ///body
   fill(183,87,143);
   ellipse(x,y+50,40,60);
   //arms
   stroke(253,211,255);
   line(x+17,y+34,x+35,y-1);
   line(x-17,y+34,x-35,y-1);
   
   //feet
   stroke(0);
   fill(0);
   ellipse(x+13,y+80,15,5);  ///right
   ellipse(x-13,y+80,15,5);  ///left
 }
 
 void mousePressed() {
   reset();
   x=mouseX;
   y=mouseY;
 }
void keyPressed() {
  if(key== 'x') {
    exit();
  }
  if (key=='r'){
    reset();
  }
}

