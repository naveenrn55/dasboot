package com.boot.services;

import java.util.List;

import com.boot.model.Shipwreck;
public interface ShipWreckService {

	public abstract List<Shipwreck> list();

	public abstract Shipwreck create(Shipwreck shipWreck);

	public abstract Shipwreck get(Long id);

	public abstract Shipwreck update(Long id, Shipwreck shipWreck);

	public abstract Shipwreck delete(Long id);

}