package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.TableRow;

public class DANI extends PApplet {
	

	public void settings() 
	{
		size(1000, 1000);
		//fullScreen(SPAN);
	}

	
	public void loadFile()
	{
		loadStrings("small.txt");
		//split(line, ' ');
		//w.replaceAll("[^\\w\\s]","");
		//s.toLowerCase();
	}

	public void findWord(String word)
	{

	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() 
	{
		colorMode(RGB);


       
	}

	public void keyPressed() 
	{

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}

}
