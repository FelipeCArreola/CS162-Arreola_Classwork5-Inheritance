public class Main {

    public static void main(String[] args) {
	// write your code here

        Doctor doctor = new Doctor(true);
        Surgeon surgeon = new Surgeon(true);
        Doctor surgeon2 = new Doctor(true);


        System.out.println(doctor.treatPatient());

        System.out.println(surgeon.treatPatient());
        System.out.println(surgeon2.treatPatient());

        System.out.println(surgeon.makeIncision());

        System.out.println(surgeon2.getWorksAtHospital());
        System.out.println(doctor.getWorksAtHospital());
        System.out.println(surgeon.getWorksAtHospital());


    }
}
