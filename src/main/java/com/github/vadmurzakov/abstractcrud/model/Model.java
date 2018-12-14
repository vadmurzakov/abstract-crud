package com.github.vadmurzakov.abstractcrud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Getter
@Setter
@MappedSuperclass
public abstract class Model<ID extends Serializable> implements Entity<ID> {

}
