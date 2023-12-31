package com.manikhweschool.service;


import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manikhweschool.dao.ConsultationSessionRepository;
import com.manikhweschool.model.ConsultationSession;

@Service
public class ConsultationSessionService {

	@Autowired
	private ConsultationSessionRepository repository;
	
	public List<ConsultationSession> findAllConsultationSessions(){
		
		List<ConsultationSession> list = repository.findAll();
		Collections.sort(list);
		
		return list;
	}
	public long count() {
		return repository.count();
	}
	public void saveConsultationSession(ConsultationSession consultationSession) { 
		repository.save(consultationSession);
	}
	public Optional<ConsultationSession> findConsultationSession(long consultationSessionId){
		return repository.findById(consultationSessionId);
	}
	public void deleteConsultationSession(long consultationSessionId) { 
		repository.deleteById(consultationSessionId);
	}
}

