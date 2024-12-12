package Repository;
import java.util.Scanner;

import Models.Paciente;

public class GerenciaPacientes {
    private Paciente pacientes[];
    private Scanner ent;
    
    public GerenciaPacientes(Paciente pacientes[]){
        this.pacientes = pacientes;
        ent = new Scanner(System.in);
    }
    
    public void cadastrar(){
        String nome, cpf, nomeConv, numConv;
        
        int i = 0;
        while((i < pacientes.length) && (pacientes[i] != null)){
            i++;
        }
        if(i < pacientes.length){
            System.out.println("--==[Cadastro de Pacientes]==--");
            System.out.println("Nome: ");
            nome = ent.nextLine();
            System.out.println("CPF: ");
            cpf = ent.nextLine();
            System.out.println("Nome Convênio: ");
            nomeConv = ent.nextLine();
            System.out.println("Número Convênio: ");
            numConv = ent.nextLine();
            
            pacientes[i] = new Paciente(nome, cpf, nomeConv, numConv);
        }
        else{
            System.out.println("Vetor cheio.");
        }
    }
    
    public void alterar(){
        String nome, cpf, nomeConv, numConv;
        int pos, resp;
        
        System.out.println("--==[Alteração de Pacientes]==--");
        System.out.println("Qual paciente deseja alterar? (Entre com o ID do paciente): ");
        pos = ent.nextInt();
        if(pacientes[pos] != null){
            System.out.println("-=[Dados]=-");
            System.out.println("Nome atual: " + pacientes[pos].getNome());
            System.out.print("Alterar? (1-sim/2-não): ");
            resp = ent.nextInt();
            ent.nextLine();
            if(resp == 1){
                System.out.print("Digite o novo nome: ");
                nome = ent.nextLine();
                pacientes[pos].setNome(nome);
            }
            System.out.println("----------------------------------");
            System.out.println("CPF atual: " + pacientes[pos].getCpf());
            System.out.print("Alterar? (1-sim/2-não): ");
            resp = ent.nextInt();
            ent.nextLine();
            if(resp == 1){
                System.out.print("Digite o novo CPF: ");
                cpf = ent.nextLine();
                pacientes[pos].setCpf(cpf);
            }
            System.out.println("----------------------------------");
            System.out.println("Nome do Convêncio atual: " + pacientes[pos].getNomeConvenio());
            System.out.print("Alterar? (1-sim/2-não): ");
            resp = ent.nextInt();
            ent.nextLine();
            if(resp == 1){
                System.out.print("Digite o novo Nome do Convênio: ");
                 nomeConv = ent.nextLine();
                pacientes[pos].setNomeConvenio(nomeConv);
            }
            System.out.println("----------------------------------");
            System.out.println("Número do Convêncio atual: " + pacientes[pos].getNumeroConvenio());
            System.out.print("Alterar? (1-sim/2-não): ");
            resp = ent.nextInt();
            ent.nextLine();
            if(resp == 1){
                System.out.print("Digite o novo Número do Convênio: ");
                 numConv = ent.nextLine();
                pacientes[pos].setNumeroConvenio(numConv);
            }
            System.out.println("----------------------------------");

            System.out.println("Atualização realizada com sucesso.");
        }
        else{
            System.out.println("Vetor cheio.");
        }
    }
    
    public void excluir(){
        int pos, resp;
        
        System.out.println("--==[Exclusão de Pacientes]==--");
        System.out.println("Qual paciente deseja excluir? (Entre com o ID do paciente): ");
        pos = ent.nextInt();
        
        if(pacientes[pos] != null){
            System.out.println("-=[Dados do Paciente]=-");
            pacientes[pos].imprimir();
            System.out.print("\nConfirma exclusão? (1-sim/2-não): ");
            resp = ent.nextInt();
            
            if(resp == 1){
                pacientes[pos] = null;
                System.out.println("Exclusão efetuada com sucesso.");
            }
            else{
                System.out.println("Exclusão não efetuada.");
            }
        }
        else{
            System.out.println("Paciente não existe.");
        }
    }
    
    public void consultar(){
        int pos;
        
        System.out.println("--==[Consulta de Pacientes]==--");
        System.out.print("Qual paciente deseja consultar? (Entre com o ID do paciente): ");
        pos = ent.nextInt();
        
        if(pacientes[pos] != null){
            System.out.println("-=[Dados do Paciente]=-");
            pacientes[pos].imprimir();
        }
        else{
            System.out.println("Paciente não existe.");
        }
    }
    
    public void relatorio(){
        int pos = 0;
        
        System.out.println("--==[Relatório de Pacientes]==--");
        
        while(pos < pacientes.length){
            if(pacientes[pos] != null){
                pacientes[pos].imprimir();
                System.out.println("\n-----------------------------------\n");
            }
            
            pos++;
        }
    }
}