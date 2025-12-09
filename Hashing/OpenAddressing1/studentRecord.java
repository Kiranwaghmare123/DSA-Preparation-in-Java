

package OpenAddressing1;

public class studentRecord 
{
	private int studentId;
	private String studentName;
	
	public studentRecord(int i, String name)
	{
		studentId=i;
		studentName = name;
	}
	
	public int getstudentId()
	{
		return studentId;
	}
	
	public void setstudentId(int i)
	{
		studentId = i;
	}
	
	public String toString()
	{
		return  studentId + " " + studentName + " ";
	}
}
