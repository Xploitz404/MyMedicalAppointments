import static ui.UIMenu.*;

public class App {
    public static void main(String[] args) throws Exception {
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Rodríguez";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);
        Doctor.id++;
        Doctor myDoctorOscar = new Doctor();
        myDoctor.showId();
        showMenu();
    }
}
