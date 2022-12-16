package org.formation.repository;

import org.formation.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICompteBancaire extends JpaRepository<Compte, Long>{

}
