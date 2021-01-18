package br.com.iblue.relaciona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.iblue.relaciona.entity.Funcionario;
import br.com.iblue.relaciona.entity.Pessoa;
import br.com.iblue.relaciona.repository.FuncionarioRepository;
import br.com.iblue.relaciona.repository.PessoaRepository;


@SpringBootApplication
public class RelacionaApplication implements CommandLineRunner {

 

    @Autowired
    private FuncionarioRepository daof;

 

    @Autowired
    private PessoaRepository daop;

 

    public static void main(String[] args) {
        SpringApplication.run(RelacionaApplication.class, args);
    }

 

    @Override
    public void run(String... args) throws Exception {

 

        try {

           // Pessoa p = new Pessoa(null, "lucas", "lucas@gmail.com");
            //Pessoa resposta1 = daop.save(p);
           // System.out.println("Dados Gravados de pessoa: " + resposta1);
        	
            Funcionario f = new Funcionario(null, "lucas", "lucas@gmail.com", "programador",
                    "senior", 9000., 500., 800.);
 
            Funcionario resposta2 = daof.save(f);
            daop.save(resposta2);
            System.out.println("Dados Gravados: " + resposta2);

        } catch (Exception ex) {
            ex.printStackTrace();

        }
 
    }

 

}
