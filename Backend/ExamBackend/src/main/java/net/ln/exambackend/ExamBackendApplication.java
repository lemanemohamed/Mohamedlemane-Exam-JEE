package net.ln.exambackend;

import net.ln.exambackend.dtos.ClientDTO;
import net.ln.exambackend.entities.ContratAssuranceAutomobile;
import net.ln.exambackend.enumeration.StatusContrat;
import net.ln.exambackend.mappers.ClientMapper;
import net.ln.exambackend.repositories.ClientRepos;
import net.ln.exambackend.services.IClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class ExamBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamBackendApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ClientRepos clientRepos, IClientService iClientService, ClientMapper clientMapper){
        return args -> {
            Stream.of("mohamed","Aicha","Imane").forEach(nom->{
                ClientDTO clientDTO=new ClientDTO();
                clientDTO.setNom(nom);
                clientDTO.setEmail(nom+"@gmail.com");
                iClientService.saveclient(clientDTO);
            });
            iClientService.getallclient().forEach(cust->{
                List<ContratAssuranceAutomobile> contratAssuranceAutomobiles=new ArrayList<>();
                ContratAssuranceAutomobile contratAssuranceAutomobile=new ContratAssuranceAutomobile();
                contratAssuranceAutomobile.setClient(clientMapper.fromclientDTO(cust));
                contratAssuranceAutomobile.setDureeContrat(3);
                contratAssuranceAutomobile.setMarqueVéhicule("marcedeces)";
                contratAssuranceAutomobile.setModèleVéhicule("2020");
                contratAssuranceAutomobile.setStatut(StatusContrat.VALIDE);
                contratAssuranceAutomobile.setNuméroImmatriculation(3300);
                contratAssuranceAutomobile.setMontantcotisation(5566.55);
                contratAssuranceAutomobile.setTauxCouverture(8.4);
                contratAssuranceAutomobile.setDateSouscription(new Date());
                contratAssuranceAutomobile.setDateValidation(new Date());
                contratAssuranceAutomobile.setPaiementList(new ArrayList<>());

            });
        };
    }
}
