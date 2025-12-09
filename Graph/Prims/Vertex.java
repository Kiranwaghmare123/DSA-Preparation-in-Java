

package prims;

public class Vertex 
{
	String name;
	int status;
	int predecessor;
	int length;
		
	Vertex(String name)
	{
		this.name = name;
	}
	public String toString()
	{
	     return name;
	}
}
