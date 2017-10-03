package assign1test.studentRegTest;

import java.util.ArrayList;

import org.joda.time.LocalDate;

import assign1.studentReg.Course;
import assign1.studentReg.Module;
import assign1.studentReg.Student;

public class StudentTest {
	
	public static void main( String[] args )
    {
        System.out.println( "Student Registration Test\n" );
       
        //create students
        Student one  	= 	new 	Student("John", 21, "31/12/1995");
        Student two  	= 	new 	Student("Tom", 22, "01/08/1995");
        Student three 	= 	new	Student("Mary", 20, "11/05/1997");
        Student four  	= 	new 	Student("Paul", 21, "02/11/1995");
        Student five  	= 	new 	Student("Colin", 19, "04/10/1997");
        Student six 		= 	new 	Student("Louise", 19, "04/10/1997");
        
        //add to array lists for modules
        ArrayList<Student> Students_Maths = new ArrayList<Student>();
        Students_Maths.add(one);
        Students_Maths.add(two);
        
        ArrayList<Student> Students_Prog = new ArrayList<Student>();
        Students_Prog.add(one);
        Students_Prog.add(two);
        Students_Prog.add(three);
        
        ArrayList<Student> Students_Design = new ArrayList<Student>();
        Students_Design.add(four);
        Students_Design.add(five);
        Students_Design.add(six);
        
        ArrayList<Student> Students_AppliedMaths = new ArrayList<Student>();
        Students_AppliedMaths.add(four);
        Students_AppliedMaths.add(five);
        
        //create modules
        Module Maths = new Module("Maths", "MA123", Students_Maths);
        Module Programming = new Module("Programming", "CT111", Students_Prog);
        Module Design = new Module("Engineering Design", "EA150", Students_Design);
        Module AppliedMaths = new Module("Applied Maths", "EE120", Students_AppliedMaths);
        
        //add to array lists for courses
        ArrayList<Module> CS_Modules= new ArrayList<Module>();
        CS_Modules.add(Maths);
        CS_Modules.add(Programming);
        
        ArrayList<Module> Eng_Modules= new ArrayList<Module>();
        Eng_Modules.add(Design);
        Eng_Modules.add(AppliedMaths);
        
        LocalDate start = new LocalDate(2017,9,1);
        LocalDate end = new LocalDate(2018,5,10);
        
        //create courses
        Course ComputerScience = new Course("Computer Science", CS_Modules, start, end);
        Course Engineering = new Course("Engineering", Eng_Modules, start, end);
        
        //add to array list for printing loop
        ArrayList<Course> courses= new ArrayList<Course>();
        courses.add(ComputerScience);
        courses.add(Engineering);
        
        //loop over students in each course and print their details to console
        for (int i = 0; i <courses.size(); i++) {
        		for(int j = 0; j<courses.get(i).getStudents().size(); j++) {
        			
        			String printString = courses.get(i).getStudents().get(j).getDetails();
        			System.out.println(printString + "\n");
        		}
        }
    }
}
