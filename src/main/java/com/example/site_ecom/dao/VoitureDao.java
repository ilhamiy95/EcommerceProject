package com.example.site_ecom.dao;

import com.example.site_ecom.model.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoitureDao extends JpaRepository<Voiture,Long> {

}
