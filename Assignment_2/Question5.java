public class Question5 {
    public static void main(String[] args) {
        //number of pens 
        int pens = 14;
        int students = 3;

        //pen each student will get
        int pen_per_student = pens/students;
        int remaining_pen = pens % students;
        System.out.println("The Pen Per Student is " + pen_per_student + " and the remaining pen not distributed is " + remaining_pen);
    }
}
