import static ui.UIMenu.*;
import java.util.Date;
import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        //showMenu();
        Doctor myDoctor = new Doctor("Oscar Lara", "Neurología");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment availableAppointment : myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }

        Patient patient = new Patient("Alejandra", "ale@gmail.com");
        patient.setWeight(62.5);
        patient.getWeight();
        patient.setPhoneNumber("1234567890");
        System.out.println(patient.getPhoneNumber()); 
    }
}
