public class Main {

    public static void main(String[] args) {
        // write your code here
        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(111, "Chinh");
        Student s2 = new Student(222, "Toan");
        Student s3 = new Student(333, "Dung");

        //calling display method
        s1.display();
        s2.display();
        s3.display();

    }
}