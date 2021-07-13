import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();
     Doctor myDoctor = new Doctor ("Alvaro Florencia","pediatria" );
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
        Patient patient = new Patient("alvaro","al@gmail.com");
        patient.setWeight(54.6);



        /*

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
        Patient patient = new Patient("Lulu", "alejandra@mail.com");
        Patient patient2 = new Patient("Ana", "anahi@mail.com");

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
