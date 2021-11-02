/** ...*/


/**
 *Class contains all the methosd for data handling for AVL Tree
 *@uathor Lindani khuzwayo
 **/






import java.io.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files




public class AccessAVLApp{

public static AVLTree<Students> info = new AVLTree<Students>(); //AVL Tree to store students 
//Instrrumetation 
public static int opCount=0;
public static int temp1=0;



/** take in a student id, checks if they have permission and 
prints name and id if they have alse prints Accessdineid
@param StudentID urgument to be recieved  




  **/
public static void printStudent(String StudentID){
Students temp= new Students("null",StudentID,"null");
BinaryTreeNode<Students> x = info.find(temp);
int v = info.getopCount()-temp1;
if (x== null){
    System.out.println("Access denied!");
    System.out.println("Number of comparisons: "+v);
    System.out.println("Number of comparisons(insert) :  "+temp1);

}else{

 System.out.println(x.data.getStudentName()+" "+x.data.getSurname());
 System.out.println("Number of comparisons: "+v);
 System.out.println("Number of comparisons(insert) :  "+temp1);


}


}

//Prints all th estudebts in the tree 
public static void printAllStudents(){
int counter=0;
info.postOrder();
}


/**
Read in text file oklist.txt
insert student objects into AVL Tree
@excption throw exception if fil not found or any other problem  

**/
public static void Read(){
int counter=0;
try{
File myObj = new File("/home/lindani/Assignment2/data/file9.txt");
Scanner myReader = new Scanner(myObj);
 while (myReader.hasNextLine()) {
  String data = myReader.nextLine();
  String[] strArry =data.split(" ");
  // the insertion
  info.insert( new Students(strArry[1],strArry[0], strArry[2] ) ); 
  counter++;
}myReader.close();
} catch (FileNotFoundException e){
 System.out.println("An error occurred");
 e.printStackTrace();}
 temp1 = info.getopCount();

  
  
  }

/** main method, calls all the methods for AVL solution
main drives the program 
@param args contains Strings of arguments on the comand line (powershell)

**/
public static void main (String[] args){

Read(); 

if (args.length==0){
 printAllStudents();

int v= info.getopCount()-temp1;
 System.out.println("Number of comparisons(find) :  "+v);
 System.out.println("Number of comparisons(insert) :  "+temp1);
}


if (args.length!=0){
printStudent(args[0]);
}


System.out.println("Height of the tree:  "+info.height(info.root));





}////main\\\\\\
















 }