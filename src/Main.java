import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();
     Doctor myDoctor = new Doctor ("Alvaro Florencia","alvaro@gmail.com" );
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);
        System.out.println();
        System.out.println();
        Patient patient = new Patient("Angel", "angel@mail.com");
        System.out.println(patient);



        /*
         for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
        model.Patient patient = new model.Patient("alvaro","al@gmail.com");
        patient.setWeight(54.6);

         System.out.println(patient.name);
       System.out.println(patient.email);
       patient.weight=60.5;
       patient.height=1.65;
       System.out.println(patient.weight);
       System.out.println(patient.height);
        int i = 0;

        int b = 2;
        b = i;
        //b=0
        String name = "angel";

        System.out.println();
        System.out.println();
        model.Patient patient = new model.Patient("Lulu", "alejandra@mail.com");
        model.Patient patient2 = new model.Patient("Ana", "anahi@mail.com");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;
       System.out.println(patient.getName());
       System.out.println(patient2.getName());
       patient.setName("Alvaro");
       System.out.println(patient.getName());
       System.out.println(patient2.getName());
  */
    }

}
