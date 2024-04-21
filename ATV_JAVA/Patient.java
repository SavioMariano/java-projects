package ATV_JAVA;

import java.util.ArrayList;

public class Patient {
    private String name;
    private int age;
    private ArrayList<String> consultationHistory;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.consultationHistory = new ArrayList<>();
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("Julio", 40);
        patient1.newConsultations("Exame de prostata");
        patient1.newConsultations("PSA");
        patient1.showConsultations();
    }

    public String information(){
        return "O paciente "+ this.name + " possui "+ this.age +" anos";
    }

    //adicionando consultas
    public void newConsultations(String consultation) {
        consultationHistory.add(consultation);
    }
    //Mostrando a lista de consultas.
    public void showConsultations() {
        if (consultationHistory.isEmpty()) {
            System.out.println("O paciente " + name + " não possui registros de consultas");
        } else {
            System.out.println("Consultas realizadas pelo paciente " + name + ":");
            //para cada consulta adicionada, vai adicionar no historico
            for (String consultation : consultationHistory) {
                System.out.println("- " + consultation);
            }
        }
    }
}
