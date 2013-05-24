package com.springib.model.ibatis;

import java.util.List;

public interface RucDao {

	public List selectAll();
	public void update(Ruc RucWithNewValues);

}
