import processing.core.PApplet;

public class Sketch extends PApplet {
	
	// BASE DIEMSIONS USED TO CALCULATE DOOR POSITION
	int baseX = 200;
	int baseY = 400;
	
	public void settings() {
	   size(600, 600);
	}
	  
	public void setup() {
	   background(125, 235, 250);
	   strokeWeight(5);
	}

	public void draw() {
		
	   // BASE OF THE HOUSE
	   fill(138, 132, 127);
	   rect(baseX, baseY, 200, 150);
	   // DOOR
	   fill(118, 156, 145);
	   rect(baseX + 80, baseY + 100, 30, 50);
		
	   // ROOF
	   fill(44, 245, 188);
	   triangle(100, 400, 300, 80, 500, 400);
		
	   // WINDOWS
	   fill(255);
	   ellipse(350, 450, 30, 30);
	   ellipse(250, 450, 30, 30);
		
	   line(300, 300, 160, 300);
	   line(300, 200, 223, 200);
	   
	   // GROUND
	   fill(94, 219, 98);
	   rect(0, 550, 600, 100);
	   
	   fill(242, 255, 59);
	   ellipse(0, 0, 100, 100);
	}
}