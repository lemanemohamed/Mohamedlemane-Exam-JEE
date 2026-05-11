package net.ln.exambackend.mappers;

import net.ln.exambackend.dtos.ClientDTO;
import net.ln.exambackend.entities.Client;
import net.ln.exambackend.repositories.ClientRepos;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClientMapper {
    private ClientRepos clientRepos;
    public ClientDTO fromclient(Client client){
        ClientDTO clientDTO=new ClientDTO();
        BeanUtils.copyProperties(client,clientDTO);
        return clientDTO;
    }
    public Client fromclientDTO(ClientDTO clientDTO){
        Client client=new Client();
        BeanUtils.copyProperties(clientDTO,client);
        client.setContratAssuranceList(new ArrayList<>());
        return client;
    }

}
