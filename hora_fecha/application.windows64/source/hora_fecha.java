import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class hora_fecha extends PApplet {


int x=500;
int speed=1;
int diam =250;

public void setup() {
  
}
public void draw() {
  background(0);

  hora();
}
public void hora() {
  stroke(100);
  fill(255);

  rect(890, 0, 110, 50);
  fill(0);
  rect(895, 0, 100, 45);
  fill(255);
  textSize(15);
  text(day(), 900, 15);
  text(month(), 930, 15);
  text(year(), 960, 15);
  fill(255);
  textSize(15);
  text(hour(), 900, 40);
  text(minute(), 930, 40);

  text(second(), 960, 40);
}
  public void settings() {  size(1000, 1000); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "hora_fecha" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
