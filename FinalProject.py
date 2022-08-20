#! /usr/bin/python3

#Project made for a student in AHMAN UNIVERSITY,PATIGI KWARA STATE

class Project:
#These are global varaibles which are declared to store data. They are serving as a one time database
    Course_name_arr = []        #Course name array
    Course_unit_arr = []       #Course unit array
    student_assessment_score_arr = []  #Student assessment score array
    student_exam_score_arr = []         #student examination score array
    add_exam_and_assessment_arr = []       #summation of student assessment score and examination score array
    grade_arr = []                          #Grade array
    point_arr = []                      #points array
    product_unit_points_arr = []   #multiplication of course_unit and points array
    GPA_arr = []                    #GPA array

    def __init__(self):
        matric_number = input("Enter your Matric number ::")          #collects matric number
        student_name = input("Enter your Full_Name ::")                   #collects student name
        #Runs the First semester method
        Project.FirstSemester()
        #Runs the Second semester method
        Project.SecondSemester()
        print(student_name + " with Matric Number ::" + str(matric_number))
        #Runs the First GPA method
        Project.GPA()
       
    def GPA():
        #finds the sum of GPA
        Total_GPA = sum(Project.GPA_arr)
        #calculates the CGPA
        CGPA = Total_GPA / 2
        print("----------------\n\nTherefore your CGPA for the 2 semester is = " + str(CGPA))

    def FirstSemester():
        print('\n\n\t\t\t-----------+---This is for your First Semester Courses--+------- \n\n')
        Project.InformationCollector()
        Project.Totals()
        print('------First Semester Courses has been registered successfully--+------- \n\n')
    

    def SecondSemester():
        print('\t\t\t-----------+---This is for your Second Semester Courses--+------- \n\n')
        Project.InformationCollector()
        Project.Totals()
        print('------Second Semester Courses has been registered successfully--+------- \n\n')

    

    def Totals():
        #sum all the course unit
        Total_course_unit = sum(Project.Course_unit_arr)
        #sums the course_unit*points
        Total_unit_points = sum(Project.product_unit_points_arr)
        #Divides the total points and total course_unit
        GPA = Total_unit_points / Total_course_unit 
        #sends the divition to the GPA array
        Project.GPA_arr.append(GPA)
        print("Your GPA for this semester is =  " + str(GPA))
         
           

    def InformationCollector():

        #This collects infomation from the user
        Total_Num_of_Courses = int(input("Enter the number of courses you are offering (e.g. 7) ::"))
        i=0
        while( i < Total_Num_of_Courses):
            Course_name = input("Enter course name ::")
            Course_unit = int(input("Enter the course unit for " + Course_name.upper() + " ::"))
            
            student_assessment_score = int(input("Enter the assessment_score for " + Course_name.upper() + " ::"))
            
            student_exam_score = int(input("Enter the Examination_score for " + Course_name.upper() + " ::"))
            
            print("\t\t\t\t\t" + Course_name.upper() + " has been registered successfully \n\n Let's move to the next Course \n")
            
            #This sends all infomation collected to the arrays declared global
            Project.Course_name_arr.append(Course_name)
            Project.Course_unit_arr.append(Course_unit)
            Project.student_assessment_score_arr.append(student_assessment_score)
            Project.student_exam_score_arr.append(student_exam_score)
            Total_score = student_assessment_score + student_exam_score
            Project.add_exam_and_assessment_arr.append(Total_score)

            #Comapares results in order to know the appropraite grade that should be awarded the student
            if (Total_score >= 70 and Total_score <= 100):
                Project.grade_arr.append("A")
                Project.point_arr.append(5)
                Project.product_unit_points_arr.append(Course_unit * 5)
            elif (Total_score >= 60 and Total_score <= 69): 
                Project.grade_arr.append("B")
                Project.point_arr.append(4)
                Project.product_unit_points_arr.append(Course_unit * 4)
            elif (Total_score >= 50 and Total_score <= 59):
                Project.grade_arr.append("C")
                Project.point_arr.append(3)
                Project.product_unit_points_arr.append(Course_unit * 3)    
            elif (Total_score >= 45 and Total_score <= 49):
                Project.grade_arr.append("D")
                Project.point_arr.append(2)
                Project.product_unit_points_arr.append(Course_unit * 2)  
            elif (Total_score >= 40 and Total_score <= 44):
                Project.grade_arr.append("E")
                Project.point_arr.append(1)
                Project.product_unit_points_arr.append(Course_unit * 1)   
            elif (Total_score >= 0 and Total_score <= 39):
                Project.grade_arr.append("F")
                Project.point_arr.append(0)
                Project.product_unit_points_arr.append(Course_unit * 0)     
            
            i +=1
        



Project()