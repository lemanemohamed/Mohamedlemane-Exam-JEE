package net.ln.exambackend.services;

import lombok.RequiredArgsConstructor;
import net.ln.exambackend.dtos.ClientDTO;
import net.ln.exambackend.entities.Client;
import net.ln.exambackend.mappers.ClientMapper;
import net.ln.exambackend.repositories.ClientRepos;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements IClientService {
    private ClientRepos clientRepos;
    private ClientMapper dtomapper;

    @Override
    public List<ClientDTO> getallclient() {
        List<Client> clientList=clientRepos.findAll();
        List<ClientDTO> clientDTOS=clientList.stream().map(client->{
            return dtomapper.fromclient(client);
        }).collect(Collectors.toList());
        return clientDTOS;
    }

    @Override
    public ClientDTO getclientbyId(Long id) {
        Client client = clientRepos.findById(id).get();
        return dtomapper.fromclient(client);
    }

    @Override
    public void deleteclient(ClientDTO clientDTO) {
        Client client1=dtomapper.fromclientDTO(clientDTO);
        clientRepos.delete(client1);
    }

    @Override
    public ClientDTO saveclient(ClientDTO clientDTO) {
        Client client =new Client();
        BeanUtils.copyProperties(clientDTO,client);
        client.setContratAssuranceList(new ArrayList<>());
        clientRepos.save(client);
        return clientDTO;
    }
}
