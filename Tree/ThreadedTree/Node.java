

package threadedtree;

public class Node 
{
        public Node left;
        public boolean leftThread;
        public int info;
        public boolean rightThread;
        public Node right;
    
        public Node(int i)
        {
            info = i;
            left = null;
            right = null;
            leftThread = true;
            rightThread = true;
        }
}

