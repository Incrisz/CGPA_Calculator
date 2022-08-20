import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.LongStream;

// Not completed CGPA value yet to be printed out 
//calculation for GPA in both semesters completed

public class Main {

ArrayList<String> Course_name_arr = new ArrayList<String>();
ArrayList<Integer> Course_unit_arr = new ArrayList<Integer>();
ArrayList<Double> student_assessment_score_arr = new ArrayList<Double>();
ArrayList<Double> student_exam_score_arr = new ArrayList<Double>();
ArrayList<Double> add_exam_and_assessment_arr = new ArrayList<Double>();
ArrayList<String> grade_arr = new ArrayList<String>();
ArrayList<Integer> point_arr = new ArrayList<Integer>();
ArrayList<Integer> product_unit_points_arr = new ArrayList<Integer>();
ArrayList<Integer> GPA_arr = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Matric number ::");               //collects matric number
        String matric_number = scan.nextLine();
        System.out.println("Enter your Full_Name ::");                      //collects Student name
        String student_name = scan.nextLine();
        //Runs the First semester method
        FirstSemester();
        // Runs the Second semester method
        SecondSemester();
        System.out.println(student_name + " with Matric Number ::" + matric_number);
        //Runs the First GPA method
       
       

    }

   

    static void FirstSemester() {
        System.out.println("'\n\n\t\t\t-----------+---This is for your First Semester Courses--+------- \n\n");
        InformationCollector();
         
        System.out.println("------First Semester Courses has been registered successfully--+------- \n\n");
    }


    static void SecondSemester() {
        System.out.println("\n\n\t\t\t-----------+---This is for your Second Semester Courses--+------- \n\n");
        InformationCollector();
   
        System.out.println("------Second Semester Courses has been registered successfully--+------- \n\n");
    }




                static void InformationCollector() {

                    Scanner scan = new Scanner(System.in);
                    System.out.println("Enter the number of courses you are offering (e.g. 7) ::");
                    int Total_Num_of_Courses = scan.nextInt();

                    //CLass and object created to access values
                        Main myObj = new Main();

                        //for loop
                    for(int i=0;i<Total_Num_of_Courses;i++) {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter course name ::");
                        String Course_name = sc.nextLine();
                        System.out.println("Enter the course unit for " + Course_name.toUpperCase() + " ::");
                        int Course_unit = sc.nextInt();
                        System.out.println("Enter the assessment_score for " + Course_name.toUpperCase() + " ::");
                        double student_assessment_score = sc.nextInt();
                        System.out.println("Enter the Examination_score for " + Course_name.toUpperCase() + " ::");
                        double student_exam_score = sc.nextInt();
                        System.out.println("\t\t\t\t\t" + Course_name.toUpperCase() + " has been registered successfully \n\n Let's move to the next Course \n");

            //This sends all infomation collected to the arrays declared global            
                        myObj.Course_name_arr.add(Course_name);
                        myObj.Course_unit_arr.add(Course_unit);
                        myObj.student_assessment_score_arr.add(student_assessment_score);
                        myObj.student_exam_score_arr.add(student_exam_score);
                        double Total_score = student_assessment_score + student_exam_score;
                        myObj.add_exam_and_assessment_arr.add(Total_score);

            //Comapares results in order to know the appropraite grade that should be awarded the student
                        if(Total_score >= 70 && Total_score <= 100) {
                            myObj.grade_arr.add("A");
                            myObj.point_arr.add(5);
                            myObj.product_unit_points_arr.add(Course_unit * 5);
                        }else if(Total_score >= 60 && Total_score <= 69) {
                            myObj.grade_arr.add("B");
                            myObj.point_arr.add(4);
                            myObj.product_unit_points_arr.add(Course_unit * 4);
                        }else if(Total_score >= 50 && Total_score <= 59) {
                            myObj.grade_arr.add("C");
                            myObj.point_arr.add(3);
                            myObj.product_unit_points_arr.add(Course_unit * 3);
                        }else if(Total_score >= 45 && Total_score <= 49) {
                            myObj.grade_arr.add("D");
                            myObj.point_arr.add(2);
                            myObj.product_unit_points_arr.add(Course_unit * 2);
                        }else if(Total_score >= 40 && Total_score <= 44) {
                            myObj.grade_arr.add("E");
                            myObj.point_arr.add(1);
                            myObj.product_unit_points_arr.add(Course_unit * 1);
                        }else if(Total_score >= 0 && Total_score <= 39) {
                            myObj.grade_arr.add("F");
                            myObj.point_arr.add(0);
                            myObj.product_unit_points_arr.add(Course_unit * 0);
                          }
                
                    
                        }


                        //Totals Method was eliminated 
                        // This finds the totals od our array
                        //sum all the course unit
                        int sum = 0;
                        for(int i = 0; i < myObj.Course_unit_arr.size(); i++)
                            sum += myObj.Course_unit_arr.get(i);

                        int Total_course_unit = sum;

                        //sums the course_unit*points
                        int sum1 = 0;
                        for(int i = 0; i < myObj.product_unit_points_arr.size(); i++)
                            sum1 += myObj.product_unit_points_arr.get(i);

                        int Total_unit_points = sum1;

                        //Divides the total points and total course_unit
                    int GPA = Total_unit_points / Total_course_unit ;
                        //sends the divition to the GPA array
                    myObj.GPA_arr.add(GPA);
                    System.out.println("Your GPA for this semester is =  " + GPA);




                        }
}