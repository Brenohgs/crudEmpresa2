package com.example.crudSpring.projetoCRUD.REPOSITORY;

import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudSpring.projetoCRUD.ENTITY.AdminEntity;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Long>{
    List<Admin> findByNomeContainingIgnoreCase(String nome_admin);

}
