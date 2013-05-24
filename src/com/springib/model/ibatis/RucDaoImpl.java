package com.springib.model.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class RucDaoImpl  extends SqlMapClientDaoSupport implements RucDao {

	@Override
	public List selectAll() {
		SqlMapClientTemplate template = getSqlMapClientTemplate();
        return (List)template.queryForList("getAll");
	}

	@Override
	public void update(Ruc RucWithNewValues) {
		SqlMapClientTemplate template = getSqlMapClientTemplate();
        template.update("update", RucWithNewValues);
	}

}
