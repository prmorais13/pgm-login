package br.gov.rn.natal.pgmlogin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.rn.natal.pgmlogin.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}