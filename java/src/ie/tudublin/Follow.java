package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Follow extends PApplet 
{
    private String[] word;
	private int count;
    
    public Follow(String[] word, int count) 
    {
        this.word = word;
        this.count = count;
    }

	@Override
	public String toString()
	{
		return (word + "(" + count + ")");
	}

	public String[] getWord()
	{
		return word;
	}

	public void setWord(String[] word)
	{
		this.word = word;
	}

	public int getCount()
	{
		return count;
	}

	public void setCount(int count)
	{
		this.count = count;
	}    
}
