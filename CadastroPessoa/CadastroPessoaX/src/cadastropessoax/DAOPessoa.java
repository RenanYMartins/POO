package cadastropessoax;

import java.util.ArrayList;
import java.util.List;

public class DAOPessoa {

    private List<Pessoa> databasePessoa = new ArrayList();

    public void create(Pessoa p) {
        databasePessoa.add(p);
    }

    public Pessoa read(int id) {
        for (Pessoa p : databasePessoa) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean update(Pessoa p) {
        Pessoa pExiste = read(p.getId());
        if (pExiste != null) {
            pExiste.setCpf(p.getCpf());
            pExiste.setNome(p.getNome());
            return true;
        }
        return false;
    }

    public boolean delete(Pessoa p) {
        Pessoa pExiste = read(p.getId());
        if (pExiste != null) {
            databasePessoa.remove(p);
            return true;
        }
        return false;
    }

    public String listAll() {
        String report = "";
        for (Pessoa p : databasePessoa) {
            report += p.getId() + "\n";
            report += p.getCpf() + "\n";
            report += p.getNome() + "\n";
        }
        return report;
    }

}
