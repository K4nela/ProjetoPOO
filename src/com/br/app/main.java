package src.com.br.app;

import src.com.br.agenda.dao.ContatoDAO;
import src.com.br.model.Contato;

import java.util.Date;

public class main {
    public static void main(String[] args){
        Contato contato = new Contato();
        ContatoDAO contatoDAO = new ContatoDAO();

        contato.setNome("Maria");
        contato.setIdade(20);
        contato.setId(55);
        contato.setDataCadastro(new Date());

        //Salvando novo contato
//        contatoDAO.save(contato);

        //Atualizar o contato
        Contato c1 = new Contato();
        c1.setNome("Maria Clara");
        c1.setIdade(20);
        c1.setDataCadastro(new Date());
        c1.setId(1);

        //Atualizando o contato com id co contato c1
//        contatoDAO.update(c1);

        //Deletando o contato com id
        contatoDAO.deleteById(1);

        //Visualização dos registros do banco de dados
        for(Contato c: contatoDAO.getContatos()){
            System.out.println("Contato: " + c.getNome());
        }
        }
}
