

package dfsUndirectedClassifyEdges;

public class Vertex 
{
	String name;
	int state;
	int predecessor;
	
	Vertex(String name)
	{
		this.name = name;
	}
	public String toString()
	{
	     return name;
	}
}
