package com.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipWreckRepository;

@Service
public class ShipWreckServiceImpl implements ShipWreckService {

	@Autowired
	private ShipWreckRepository repository;
	@Override
	public List<Shipwreck> list() {
		return repository.findAll();
		}

	@Override
	public Shipwreck create(Shipwreck shipWreck) {
		return repository.saveAndFlush(shipWreck);
		}

	@Override
	public Shipwreck get(Long id) {
		return repository.getOne(id);
		}

	@Override
	public Shipwreck update(Long id, Shipwreck shipWreck) {
		//Shipwreck existingShipWreck = repository.getOne(id);
		 Shipwreck save = repository.save(shipWreck);
		 return save;
	}

	@Override
	public Shipwreck delete(Long id) {
		repository.deleteById(id);
		return null;
	}

	public void setShipWreckRepository(ShipWreckRepository shipWreckRepository) {
		this.repository = shipWreckRepository;
		
	}

}
