package com.privalia.model;

import java.util.UUID;

public class PrivaliaObject {
	private UUID uuid;

	public PrivaliaObject() {
		uuid = UUID.randomUUID();
	}

	public PrivaliaObject(UUID uuid) {
		this.uuid = uuid;
	}

	/**
	 * @return the id
	 */
	public UUID getUUID() {
		return uuid;
	}
}
