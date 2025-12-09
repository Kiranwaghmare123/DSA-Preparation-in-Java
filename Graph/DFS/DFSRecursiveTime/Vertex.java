
package dfsRecursiveTime;

public class Vertex 
{
	String name;
	int state;
	int discoveryTime;
	int finishingTime;
	
	Vertex(String name)
	{
		this.name = name;
	}
	public String toString()
	{
	     return name;
	}
}
