package com.wsjinformatica.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wsjinformatica.dslist.dto.GameListDTO;
import com.wsjinformatica.dslist.entities.GameList;
import com.wsjinformatica.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public GameListDTO findById(Long id) {
		GameList result = gameListRepository.findById(id).get();
		GameListDTO dto = new GameListDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameListDTO> FindAll(){
	List<GameList> result = gameListRepository.findAll();
	List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
	return dto;
	}

}
