public class Main {
    public static void main(String[] args){

        Teacher teacher=new Teacher("Karimova Saliha");
        System.out.println(teacher);

        Puple puple= new Puple("Kubatova Anara","Math",8);
        System.out.println(puple);

        System.out.println(puple.contionStart(5));
        System.out.println(puple.firstLesson(8));
        // puple.toString();

    }
}