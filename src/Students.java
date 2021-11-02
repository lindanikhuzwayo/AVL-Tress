 
 /** ...*/
 
 /**
  Student class stores students information  
  @author Lindani Khuzwayo

**/
public class Students implements Comparable<Students> {
  /**
     
     
    Name stores name  of the student
    ID stores the id of the student
    LastName stores the surname
     
     **/
    String Name;
    String ID;
    String LastName;
    int opCount;
    /** constructor methods for vars, returns their value and toString for printing everything
    
    
    @param StudentName stores name of student
    @param StudentID  stores ID of student
    @param StudentLastname stores surnname of student
    

 
    
    
    **/
    
    
    
    public Students (String StudentName, String StudentID, String StudentLastname){
        Name=StudentName;
        ID=StudentID;
        LastName=StudentLastname;
    }
    /** instrumentation gets thee value of  the number of oparations 
    @returns the number of oparations made (comparisons)
    
    **/
    public int getopCount(){
    return opCount;
    }
    
    
    /** retrieves the student ID accessor  method
    
    @returns the current student ID
    **/
    public String getStudentID(){
        return ID;
    
    }
    
   /** retrieves the student Name accessor  method 
    
    @returns the current student name
    **/
    public String getStudentName(){
        return Name;
    }
    /** 
    retrieves the student Surname accessor  method
    @return string surname of the student 
    **/
    public String getSurname(){
        return LastName;
    }
    // retrieves the student infomation  accessor  method
    public String toString(){
        return "StudentID :"+ID+"  StudentName :"+Name+" "+LastName;
    }
     public int compareTo(Students other){
     
      return ID.compareTo(other.ID);
     }
         
        
    
     








}
