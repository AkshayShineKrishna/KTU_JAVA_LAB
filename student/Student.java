class Student {
    int rollNo;
    String name,sClass;
    Student(String name,String sClass,int rollNo){
        this.name = name;
        this.sClass = sClass;
        this.rollNo = rollNo;
    }
    void displayDetails(){
        System.out.println("Name : " + name);
        System.out.println("Class : " + sClass);
        System.out.println("rollNo : " + rollNo);
    }
}

class StudentMain{
    public static void main(String[] args) {
        Student x = new Student("ABCD", "S4 IT", 105);
        x.displayDetails();
    }
}