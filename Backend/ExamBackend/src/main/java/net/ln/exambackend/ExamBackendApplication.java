package net.ln.exambackend;

import net.ln.exambackend.dtos.ClientDTO;
import net.ln.exambackend.repositories.ClientRepos;
import net.ln.exambackend.services.IClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class ExamBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamBackendApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ClientRepos clientRepos, IClientService iClientService){
        return args -> {
            Stream.of("mohamed","Aicha","Imane").forEach(nom->{
                ClientDTO clientDTO=new ClientDTO();
                clientDTO.setNom(nom);
                clientDTO.setEmail(nom+"@gmail.com");
                iClientService.saveclient(clientDTO);
            });
        };
    }
}
