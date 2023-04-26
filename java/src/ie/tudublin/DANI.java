package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class DANI extends PApplet {
	
	private String[] lines;
	ArrayList<Word> words = new ArrayList<Word>();

	public void settings() 
	{
		size(1000, 1000);
		//fullScreen(SPAN);
	}

	
	public void loadFile()
	{
		lines = loadStrings("small.txt");
		println("there are " + lines.length + " lines");
		for (int i = 0 ; i < lines.length; i++) 
		{
  			println(lines[i]);
			split(lines[i], ' ');
			//PApplet.replaceAll("[^\\w\\s]","");
			//PApplet.toLowerCase();
		}
	}

	public String[] getLines()
	{
		return lines;
	}

	public void setLines(String[] lines)
	{
		this.lines = lines;
	}

	public String findWord()
	{
		//str.printModel();
		/*for (Word w:words)
		{
		
		}*/
		return null;
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() 
	{
		colorMode(RGB);
		loadFile();
		findWord();
	}

	public void keyPressed() 
	{
		if (keyCode == RIGHT)
		{

		}
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
