import java.util.*;

class Student
{
	String usn, name, branch;
	int age, sem;
	double avg;
	int marks[] = new int[3];

	Student()
	{
		usn = name = branch = null;
		marks[0] = marks[1] = marks[2] = 0;
		age = sem = 0;
		avg = 0;
	}

	Student(String usn, String name, String branch, int age, int sem)
	{
		this.usn = usn;
		this.name = name;
		this.branch = branch;
		this.age = age;
		this.sem = sem;
	}

	void setMarks(int arr[])
	{
		marks[0] = arr[0];
		marks[1] = arr[1];
		marks[2] = arr[2];

		avg = (marks[0] + marks[1] + marks[2])/3;
	}

	@Override
	public String toString()
	{
		return String.format(usn+"\t"+name+"\t"+age+"\t"+branch+"\t"+sem+"\t"+avg);
	}
}

public class labset2
{
	public static void main(String[] args) {
		String usn, name, branch;
		int age, sem;
		int marks[] = new int[3];
		int count;
		System.out.println("Enter the no. of students to enter");
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		sc.nextLine();
		Student student[] =  new Student[count];
		for(int i = 0; i < count; i++)
		{
			System.out.println("Enter USN, Name, Age, Branch, Sem");
			usn = sc.nextLine();
			name = sc.nextLine();
			age = sc.nextInt();
			sc.nextLine();
			branch = sc.nextLine();
			sem = sc.nextInt();
			sc.nextLine();
			student[i] = new Student(usn, name, branch, age, sem);
			System.out.println("Enter marks scored in 3 subjects");
			for(int j=0 ; j<3; j++)
			{
				marks[j] = sc.nextInt();
				sc.nextLine();
			}
			student[i].setMarks(marks);
		}
		System.out.println("USN: "+"\t\t"+"Name: "+"\t"+"Age: "+"\t"+"Branch: "+"\t"+"Sem: "+"\t"+"Avg: ");
		for(int i=0; i<count; i++)
		{
			System.out.println(student[i]);
		}
	}
}