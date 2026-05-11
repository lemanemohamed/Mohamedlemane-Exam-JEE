package net.ln.exambackend.Web;

import net.ln.exambackend.dtos.ClientDTO;
import net.ln.exambackend.entities.Client;
import net.ln.exambackend.repositories.ClientRepos;
import net.ln.exambackend.services.IClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientRestControler {
    ClientRepos clientRepos;
    IClientService iClientService;
     @GetMapping("/clients")
     public List<ClientDTO> getallclier(){
         return iClientService.getallclient();
     }
}
