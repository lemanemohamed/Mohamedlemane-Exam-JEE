package net.ln.exambackend.services;

import net.ln.exambackend.dtos.ClientDTO;
import net.ln.exambackend.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IClientService {

    List<ClientDTO> getallclient();

    ClientDTO getclientbyId(Long id);
    void  deleteclient(ClientDTO clientDTO);
    ClientDTO  saveclient(ClientDTO clientDTO);
}

