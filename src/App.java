import static ui.UIMenu.*;

public class App {
    public static void main(String[] args) throws Exception {
        //showMenu();
        Doctor myDoctor = new Doctor("Oscar Lara", "Neurología");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Alejandra", "ale@gmail.com");
        patient.setWeight(62.5);
        patient.getWeight();
        patient.setPhoneNumber("1234567890");
        System.out.println(patient.getPhoneNumber()); 
    }
}
