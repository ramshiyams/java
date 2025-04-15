package MODULE3;

import java.util.Scanner;

public class TeacherArr {
	String name;
	String gender;
	String address;
	int age;
	TeacherArr(){}
	TeacherArr(String name,String gender,String address,int age){
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.address=address;}}
class Employee extends Person{
	String empid,company_name,qualification;
	float salary;
	private String teacherid;
	private String subject;
	private String department;
	Employee(){}
	Employee(String name,String gender,String address,int age,String empid,String company_name,String qualification,float salary){
		super(name,gender,address,age);
		this.empid=empid;
		this.company_name=company_name;
		this.qualification=qualification;
		this.salary=salary;}
class Teacher extends Employee{
		String subject,department,teacherid;
		Teacher(String name,String gender,String address,int age,String empid,String company_name,String qualification,float salary,String subject,String department,String teacherid){
			super(name,gender,address,age,empid,company_name,qualification,salary);}}
	public void display() {
		System.out.println("Teacher id"+empid);
		System.out.println("Teacher name:" +name);
		System.out.println("Teacher gender:"+gender);
		System.out.println("Teacher address"+address);
		System.out.println("Teacher age"+age);
		System.out.println("Teacher company_name"+company_name);
		System.out.println("Qualification"+qualification);
		System.out.println("Teacher salary"+salary);
		System.out.println("Teacher teacher_id"+teacherid);
		System.out.println("Techer subject"+subject);
		System.out.println("Teacher department:"+department);}}
		
	public class TeacherArr{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of teacher:");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter teacher details one by one");
		int n;
		Teacher teacher[]=new Teacher[n];
		Scanner sct=new Scanner(System.in);
		int tid,age,empid;String name;String company_name,qualification,gender;float salary;String address;
		String department;
		String subject;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enterdetails of teacher"+(i+1));
			System.out.print("enter the teacher id");
			tid=sct.nextInt();
			System.out.println("enter employee id of teacher"+(i+1)+"(integer)");
			empid=sct.nextInt();
			System.out.print("enter the Teacher name(string)");
			name=sc.next();
			System.out.println("enter teacher gender");
			gender=sct.next();
			System.out.println("enter the teacher address");
			address=sct.next();
			System.out.println("enter the teacher age");
			age=sct.nextInt();
			System.out.print("enter the teacher company name");
			company_name=sct.next();
			System.out.println("enteer the teacher department");
			department=sct.next();
			System.out.println("enter the qualification");
			qualification=sct.next();
			System.out.println("enter the teacher subject");
			subject=sct.next();
			System.out.println("enter teacher salary(float)");
			salary=sct.nextFloat();
			Teacher t=new Teacher(name,gender,address,age,empid,company_name,qualification,salary,subject,department,tid);
			teacher[i]=t;
		}
		System.out.print("Teacher are:\n");
		for(Teacher x:teacher) {
			x.display();
			System.out.print("\n");
		}
}
}