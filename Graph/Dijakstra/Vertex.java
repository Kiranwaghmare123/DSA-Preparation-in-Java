

package Dijkstras;

public class Vertex 
{
	String name;
	int status;
	int predecessor;
	int pathLength;
		
	Vertex(String name)
	{
		this.name = name;
	}
	public String toString()
	{
	     return name;
	}
}
