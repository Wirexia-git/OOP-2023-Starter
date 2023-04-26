package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;


public class Word extends PApplet
{
    private String word;

    ArrayList<Follow> follow_words = new ArrayList<Follow>();

    public Word(String word) 
    {
        this.word = word;
    }

    @Override
	public String toString()
	{
		return (word + ": " + follow_words);
	}

    public String getWord()
	{
		return word;
	}

	public void setWord(String word)
	{
		this.word = word;
	}

    public void findFollow(Follow str)
    {
        str.toString();
        for(Follow f:follow_words)
        {
            System.out.print(f);
        }
    }

    /*void printModel()
	{
		//stroke(255, 255, 255);
		//textAlign(CENTER, CENTER);
		//textSize(30);
        System.out.println("HEY HEY");

		for (int i = 0; i <= 14; i++)
		{
			//text(" " + word, width/2, height/2);
			System.out.println("HEY HEY");
			System.out.println(d.getLines());
		}
	}*/

    /*void loadWords()
    {

    }
    */

    public void setup()
    {
        //printModel();
        //loadWords();
    }
}
