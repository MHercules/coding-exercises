//The date is 20/02/2024

public class PreschoolStudent
{
	int idNum;
	int age;
	public final int HIGH_ID = 9999;
	public final int HIGH_AGE = 6;
	
	PreschoolStudent(int num, int studentAge)
	{
		setIdNum(num);
		setAge(studentAge);
	}
	
	public void setIdNum(int num)
	{
		if(num <= HIGH_ID)
		{
			this.idNum = num;
		}
		else
		{
			this.idNum = 0;	
		}
	}
	
	public void setAge(int studentAge)
	{
		if(studentAge <= HIGH_AGE)
		{
			this.age = studentAge;
		}
		else
		{
			this.age = 0;
		}
	}
	
	public int getIdNum()
	{
		return idNum;
	}
	
	public int getAge()
	{
		return age;
	}
}