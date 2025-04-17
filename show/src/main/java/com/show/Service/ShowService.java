package com.show.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.show.Entity.Show;
import com.show.Repository.ShowRepository;

@Service
public class ShowService {
	private final ShowRepository showRepository;

	public ShowService(ShowRepository showRepository) {
		super();
		this.showRepository = showRepository;
	}


	public Show saveShow(Show show) {
		return showRepository.save(show);
	}

	public Show getShowFindById(Long id) {
		return showRepository.findById(id).orElse(null);
	}

	public List<Show> getAllShow(){
		return showRepository.findAll();
	}
	
	public Show alteraShow(Long id, Show alteraShow) {
		Optional<Show> existeShow = showRepository.findById(id);
		if(existeShow.isPresent()) {
			alteraShow.setId(id);
			return showRepository.save(alteraShow);	
		} else {
			return null;
		}
	}
	
	public boolean deleteShow(Long id) {
		Optional<Show> existeShow = showRepository.findById(id);
		if(existeShow.isPresent()) {
			showRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}
}
