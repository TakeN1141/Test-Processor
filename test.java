package Homework03;
import java.util.ArrrayList;
public class test {
    public static void showStats(ArrayList<Person> people)
    {
        int numberOfStudents=0, numberOfProffessors=0, numberOfRichStudents=0;
        System.out.println("Number of people in the list: " + people.size());
        for(int i =0; i<=people.size();i++){
            if(people.get(i) instanceof Student) numberOfStudents++;
            else if (people.get(i) instanceof Proffessor) numberOfProffessors++;
            else if(people.get(i) instanceof RichStudent2) numberOfRichStudents++;
        }
        System.out.println("Number of Students in the list: "+numberOfStudents);
        System.out.println("Number of Proffessors in the list : "+numberOfProffessors);
        System.out.println("Number of Rich Students in the list : "+numberOfRichStudents);

        for(int i =0; i<=people.size();i++){
            if(people.get(i) instanceof Student) ((Student)people.get(i)).study();
           if(people.get(i) instanceof RichStudent2) ((RichStudent2)people.get(i)).study();
        }
    }
        public static void main(String[] args)throws ClassNotFoundException, IllegalAccessException, InstantiationException{

            Anon anon = new Anon(){
                @Override
                public void study();
                @Override
                public void think();
                @Override
                public void act();
            };

            String Name = Student.class.getName();
            Class<?> Stud = Class.forName(Name);
             Object stud1 = Stud.newInstance();

        }
    }

