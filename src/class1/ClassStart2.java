package class1;

public class ClassStart2 {
    public static void main(String[] args) {

        String [] studentNames = {"학생1","학생2","학생3"};
        int[] studentAges = {15,16,17};
        int[] studentGrades={90,80,70};
        for(int i=0;i<studentNames.length;i++) {
            System.out.println("이름: "+studentNames[i]+" 나이: " + studentAges[i]+" 성적: "+studentGrades[i]);
        }

//        String student1Name= "학생1";
//        int student1Age= 15;
//        int student1Grade = 90;
//
//        String student2Name="학생2";
//        int student2Age=16;
//        int student2Grade =80;
//
//        String student3Name="학생3";
//        int student3Age=17;
//        int student3Grade =70;

//        System.out.println(" 이름: "+student1Name +" 나이: " + student1Age+" 성적: "+student1Grade);
//        System.out.println(" 이름: "+student2Name +" 나이: " + student2Age+" 성적: "+student2Grade);
//        System.out.println(" 이름: "+student3Name +" 나이: " + student3Age+" 성적: "+student3Grade);

    }
}
