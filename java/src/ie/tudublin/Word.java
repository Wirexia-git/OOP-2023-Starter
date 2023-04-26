package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.TableRow;


public class Word extends PApplet 
{
    private String word;

    ArrayList<Follow> words = new ArrayList<Follow>();


    @Override
	public String toString()
	{
		return ("");
	}

    public Word(String word) 
    {
        this.word = word;
    }

    public String getWord()
	{
		return word;
	}

	public void setWord(String word)
	{
		this.word = word;
	}

    public void findFollow(String word)
    {

    }
}
