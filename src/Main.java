
public class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("Hospital Central");

        Especialidad cardiologia = new Especialidad("Cardiología");
        Especialidad neurologia = new Especialidad("Neurologia");
        Especialidad psicologo = new Especialidad("Psicologia");
        Especialidad nutricionista = new Especialidad("Nutricionista");

        Medico drPerez = new Medico("Dr. Pérez", cardiologia,60);
        Medico drGomez = new Medico("Dr. Gómez", psicologo,87);
        Medico drMedina = new Medico("Dr. Medina",nutricionista,30);
        Medico drSulivan = new Medico("Dr. Sulivan", cardiologia,35);

        Paciente paciente1 = new Paciente("Romi",19);
        Paciente paciente2 = new Paciente("Santi",20);

        cardiologia.agregarMedico(drPerez);
        neurologia.agregarMedico(drGomez);
        nutricionista.agregarMedico(drMedina);
        psicologo.agregarMedico(drSulivan);

        hospital.agregarMedico(drPerez);
        hospital.agregarMedico(drGomez);
        hospital.agregarMedico(drMedina);
        hospital.agregarMedico(drSulivan);

        hospital.agregarEspecialidad(psicologo);
        hospital.agregarEspecialidad(nutricionista);
        hospital.agregarEspecialidad(cardiologia);
        hospital.agregarEspecialidad(neurologia);

        TurnoMedico turno1 = new TurnoMedico(paciente1, drPerez, "Chequeo general", "Consultorio 101","11/11/24");
        TurnoMedico turno2 = new TurnoMedico(paciente2, drMedina, "Armado de plan de nutricion", "Consultorio 324","05/12/24");

        CongresoMedicos congreso1 = new CongresoMedicos(drMedina, "Capacitacion IA en medicina", "25/08/2024", "Presencial",hospital.getListaMedicos());
        CongresoMedicos congreso2 = new CongresoMedicos(drGomez, "Cuestiones Sanitarias en el Hospital", "14/09/2024", "Virtual",hospital.getListaMedicos());


        turno1.confirmarCita();
        turno2.confirmarCita();
        turno1.cancelarCita();

        congreso1.confirmarCita();
        congreso2.confirmarCita();
        congreso2.cancelarCita();


        Calificacion calificacion1 = new Calificacion(drPerez);
        Calificacion calificacion2 = new Calificacion(drMedina);

        calificacion1.enviarCalificacion("Excelente atención", 5);
        calificacion1.enviarCalificacion("Estuvo bien, cumplio con las expectativas", 4);
        calificacion1.enviarCalificacion("Regular, hubo retrasos. Hay cosas para mejorar", 3);

        calificacion2.enviarCalificacion("Malisima Atencion", 2);
        calificacion2.enviarCalificacion("Estuvo bien, cumplio con las expectativas", 4);
        calificacion2.enviarCalificacion("Me dio de comer McDonalds como dieta, cualquiera", 1);
        calificacion2.enviarCalificacion("Excelente atención", 5);
        calificacion2.enviarCalificacion("Muy bien!", 4);


        System.out.println(calificacion1.generarInformeCalificaciones());
        System.out.println(calificacion2.generarInformeCalificaciones());
    }
}