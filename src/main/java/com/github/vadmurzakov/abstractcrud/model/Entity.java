package com.github.vadmurzakov.abstractcrud.model;

import java.io.Serializable;

public interface Entity<ID extends Serializable> {
	ID getId();
}
