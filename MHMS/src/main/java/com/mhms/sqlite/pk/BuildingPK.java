package com.mhms.sqlite.pk;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BuildingPK implements Serializable {

	private static final long serialVersionUID = 1L;

	private int bid;
	
	private int rid;
	
}
