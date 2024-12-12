package Models;
public class Medico extends Pessoa {
    private String id;
    private String nome;
    private String cpf;
    private String crm;
    private String especialidade;
    private String ctps;
    
    // public Medico(String nome, String id, String cpf, String end, String tel,
    //         String crm, String esp, String ctps){
    //     super(nome, id, cpf, end, tel);
    //     this.crm = crm;
    //     especialidade = esp;
    //     this.ctps = ctps;
    // }

    public Medico(String nome, String cpf, String crm, String especialidade){
        super(nome, cpf);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }   
        
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("CRM            : " + crm);
        System.out.println("Especialidade  : " + especialidade);
    }
}