package com.wsjinformatica.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsjinformatica.dslist.dto.GameMinDTO;
import com.wsjinformatica.dslist.entities.Game;
import com.wsjinformatica.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	
	public List<GameMinDTO> FindAll(){
	List<Game> result = gameRepository.findAll();
	List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
	return dto;
	}

}
