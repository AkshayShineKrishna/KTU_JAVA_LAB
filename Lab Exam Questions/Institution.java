import java.util.Scanner;

class Staff {

    String id, name, dept, designation;

    static Scanner s = new Scanner(System.in);

    Staff() {

        System.out.print("Enter the staff id : ");
        id = s.next();
        id += s.nextLine();

        System.out.print("Enter the staff name : ");
        name = s.next();
        name += s.nextLine();

        System.out.print("Enter the staff department : ");
        dept = s.next();
        dept += s.nextLine();

        System.out.print("Enter the staff designation : ");
        designation = s.next();
        designation += s.nextLine();

    }

    void display() {

        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Department : " + dept);
        System.out.println("Designation : " + designation);

    }
}

class Teaching extends Staff {

    String course1, course2, course3;

    Teaching() {

        super();

        System.out.print("Enter course 1 : ");
        course1 = s.next();
        course1 += s.nextLine();

        System.out.print("Enter course 2 : ");
        course2 = s.next();
        course2 += s.nextLine();

        System.out.print("Enter course 3 : ");
        course3 = s.next();
        course3 += s.nextLine();

    }

    void displayCourseDetails() {

        super.display();
        System.out.println("Courses : " + course1 + ", " + course2 + ", " + course3);

    }
}

class Technical extends Staff {

    String lab1, lab2;

    Technical() {

        super();

        System.out.print("Enter lab 1 : ");
        lab1 = s.next();
        lab1 += s.nextLine();

        System.out.print("Enter lab 2 : ");
        lab2 = s.next();
        lab2 += s.nextLine();

    }

    void displayLabDetails() {

        super.display();
        System.out.println("Labs : " + lab1 + ", " + lab2);
        
    }
}

class Institution {
    public static void main(String[] args) {

        Teaching[] teach = new Teaching[20];
        Technical[] tech = new Technical[20];

        int sizeTeach, sizeTech;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the no of Teaching Staff's : ");
        sizeTeach = s.nextInt();

        for(int i = 0; i<sizeTeach ; i++){
            teach[i] = new Teaching();
            System.out.println();
            System.out.println("---------------------------------------");
        }
        
        System.out.println();
        System.out.println("*******************************************");
        System.out.print("Enter the no of Technical Staff's : ");
        sizeTech = s.nextInt();

        for(int i = 0 ; i<sizeTech ; i++){
            tech[i] = new Technical();
            System.out.println();
            System.out.println("---------------------------------------");
        }

        System.out.println();
        System.out.println("*******************************************");
        System.out.println();
        System.out.println("Displaying Teaching Staff details");
        for(int i = 0; i<sizeTeach ; i++){
            teach[i].displayCourseDetails();
            System.out.println();
            System.out.println("---------------------------------------");
        }

        System.out.println();
        System.out.println("*******************************************");
        System.out.println();
        System.out.println("Displaying Technical Staff details");
        for(int i = 0; i<sizeTech ; i++){
            tech[i].displayLabDetails();
            System.out.println();
            System.out.println("---------------------------------------");
        }

        s.close();
    }
}
