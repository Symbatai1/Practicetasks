public class Puple extends Teacher {
    private String subject;
    private int time;

    public Puple(String name, String subject, int time) {
        super(name);
        this.subject = subject;
        this.time = time;
    }

    @Override
    public String lessonStart(String word) {
        return "Anara kirsin";
    }





    public String firstLesson(int num) {
        if (num == 8.00 || num < 8.00) {
        return "Sabak bashtaldy, okuuchu sabakka kirdi";
        } else{
            return "Sabak bashtalgan jok";
        }}

    public String contionStart(int a) {
        if (a == 4 || a == 5) {
            return "okuuchu  sabakta joop berip jakshy baa aldy";
        } else if (a == 3 || a < 3){
            return "Okuuchy jakshy joop bere albady";
        }else
        return "Myndai baa jok";
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAge() {
        return time;
    }

    public void setAge(int time) {
        this.time =time;
    }


    public Puple(String name) {
        super(name);
    }
}


