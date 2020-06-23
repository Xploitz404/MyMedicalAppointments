public class Doctor {
    static int id = 0; // Autoincrement
    String name;
    String speciality;

    Doctor() {
        System.out.println("Construyendo el objeto doctor");
    }

    Doctor(String name, String speciality) {
        System.out.println("Construyendo el objeto Doctor");
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID Doctor: " + id);
    }
}
