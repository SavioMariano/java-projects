package ATV2_JAVA;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private int value;
    private List<String> clients;
    private List<String> bankAccounts;
    
    public Bank() {
        this.clients = new ArrayList<>();
        this.bankAccounts = new ArrayList<>();
    }

    public static void main(String[] args) {
        Bank obj1 = new Bank();
        obj1.registerClients("Junior", "771.256.165-01");
        obj1.createBankAccount("Robertin");
        obj1.showInfoClients();
        obj1.registerClients("Paulista", "855.515.422-01");
        obj1.createBankAccount("Gustavo");
        obj1.showInfoClients();
    }

    public String getName() {
        for (String client : clients){
            return client;
        }
    }

    public void registerClients(String name, String cpf) {
        String clientInfo = name + " " + cpf;
        if (!clients.contains(clientInfo)) {
            clients.add(clientInfo);
            System.out.println("Cliente " + name + " cadastrado com sucesso.");
        } else {
            System.out.println("Cliente " + name + " já cadastrado.");
        }
    }

    public void createBankAccount(String bankaccount) {
        for (String client : clients) {
            if (client.getName());
        }

    }

    public void deposit() {
    }

    public void withdraw(){
    }

    public void transfer(){
    }

    public void showInfoClients() {
        if (clients.isEmpty()) {
            System.out.println("Não possui nenhum cliente cadastrado.");
        } else if (bankAccounts.isEmpty()) {
            for (int client = 0; client < clients.size(); client++) {
                System.out.println("O cliente " + clients.get(client) + " não possui contas.");
            }
        } else {
            for (int client = 0; client < clients.size(); client++) {
                System.out.println("O cliente " + clients.get(client) + " possui as contas: ");
                
                for (String account : bankAccounts) {
                    System.out.println("- " + account);
                }
            }
        }
    }
}
