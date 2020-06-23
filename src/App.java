import static ui.UIMenu.*;

public class App {
    public static void main(String[] args) throws Exception {
        //showMenu();
        Doctor myDoctor = new Doctor("Oscar Lara", "Neurología");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
    }
}
