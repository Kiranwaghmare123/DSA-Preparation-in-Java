

package btree;

public class Node 
{
    int[] key;
    Node[] child;
    int numKeys;

    public Node(int size)
    {
         numKeys = 0;
         key = new int[size];
         child = new Node[size];
    }
 
}
