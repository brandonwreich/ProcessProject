package sample.model;

public class PlayDohBird
{
	private int tail;

	public PlayDohBird()
	{
		this.tail = 2;
	}
	
	public PlayDohBird(int tail)
	{
		this.tail = tail;
	}
	
	public String toString()
	{
		String description = "I am a bird and my size is " + tail;
		return description;
	}
}
