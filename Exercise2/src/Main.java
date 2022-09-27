import java.util.*;
public class Main{
    public static void main(String[] args) {

    }

    public class Student {
        private String name;
        private int note;
        public final String getName()
        {
            return name;
        }
        public final void setName(String value)
        {
            name = value;
        }
        public final int getNote()
        {
            return note;
        }
        public final void setNote(int value)
        {
            if (value >= 0 && value <= 10)
            {
                note = value;
            }
        }
        public final boolean getPassed()
        {
            if (note >= 5)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    public class Students
    {
        private ArrayList listStudents = new ArrayList();


        public final void Agregar(Student alu){
            listStudents.add(alu);
        }


        public final Student Get(int num) {
            if (num >= 0 && num <= listStudents.size())
            {
                return ((Student)listStudents.get(num));
            }
            return null;
        }


        public final float getMedia()
        {
            if (listStudents.isEmpty())
            {
                return 0;
            }
            else
            {
                float media = 0;
                for (int i = 0; i < listStudents.size(); i++)
                {
                    media += ((Student)listStudents.get(i)).getNote();
                }
                return (media / listStudents.size());
            }
        }
    }

}





