package ca.sheridancollege.week1.softwarefundamentals;

/**
 * This class +++Insert Description Here+++
 *
 * @author Kenny Ho
 */
public class StudentList {
    public static void main(String[] args) {
        //1. Create an array of students
        Student[] sList = new Student[5];
        
        //2. Put name in the array
        for (int i=0;  i<=sList.length-1;i++)
        {
           sList[i] = new Student();
           sList[i].setName("Student "+ (i+1));
        }
        
        //3. Print Array\
        for (Student s:sList)
            System.out.println("The Student name is: " + s.getName());
        
    }
   
            
}
