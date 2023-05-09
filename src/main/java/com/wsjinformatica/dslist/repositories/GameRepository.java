package com.wsjinformatica.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wsjinformatica.dslist.entities.Game;


public interface GameRepository extends JpaRepository<Game, Long>  {

}
