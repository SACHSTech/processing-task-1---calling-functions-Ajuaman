import processing.core.PApplet;

public class Sketch extends PApplet {
	
	// BASE DIEMSIONS USED TO CALCULATE DOOR POSITION
	int baseX = 200;
	int baseY = 400;
	
	public void settings() {
	 size(600, 600);
	}
	  
	public void setup() {
	 background(210, 255, 173);
	 strokeWeight(5);
	}

	public void draw() {
		
	// BASE OF THE HOUSE
	 rect(baseX, baseY, 200, 150);
	 fill(138, 132, 127);
	 // DOOR
	 rect(baseX + 80, baseY + 100, 30, 50);
	 fill(118, 156, 145);
		
	 // ROOF
	 triangle(100, 400, 300, 80, 500, 400);
	 fill(44, 245, 188);
		
	 // WINDOWS
	 ellipse(350, 450, 30, 30);
	 ellipse(250, 450, 30, 30);
	 fill(255);
		
	 line(300, 300, 160, 300);
	 line(300, 200, 223, 200);
	}
}