package com.boot.DasBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Shipwreck;
import com.boot.services.ShipWreckServiceImpl;

@RestController
@RequestMapping("api/v1/")
public class ShipWreckController {

	private ShipWreckServiceImpl shipWreckService;

	public ShipWreckServiceImpl getShipWreckService() {
		return shipWreckService;
	}

	@Autowired
	public void setShipWreckService(ShipWreckServiceImpl shipWreckService) {
		this.shipWreckService = shipWreckService;
	}

	@GetMapping(value = "shipwrecks")
	public List<Shipwreck> list() {
		return shipWreckService.list();
	}

	@PostMapping(value = "shipwrecks")
	public Shipwreck create(@RequestBody Shipwreck shipWreck) {
		return shipWreckService.create(shipWreck);
	}

	@GetMapping(value = "shipwrecks/{id}")
	public Shipwreck get(@PathVariable Long id) {
		return shipWreckService.get(id);
	}

	@PutMapping(value = "shipwrecks/{id}")
	public Shipwreck update(@PathVariable Long id,
			@RequestBody Shipwreck shipWreck) {
		return shipWreckService.update(id, shipWreck);
	}

	@DeleteMapping(value = "shipwrecks/{id}")
	public Shipwreck delete(@PathVariable Long id) {
		return shipWreckService.delete(id);
	}
}
