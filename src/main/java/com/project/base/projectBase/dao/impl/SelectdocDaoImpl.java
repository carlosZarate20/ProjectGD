package com.project.base.projectBase.dao.impl;

import java.sql.Types;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.project.base.projectBase.dao.SelectDocDao;

@Repository
public class SelectdocDaoImpl implements SelectDocDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Integer getDocReniec(String inputValue) throws Exception {
		Integer result;
		try {
			SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate);
			
			simpleJdbcCall.withProcedureName("spBuscarClienteReniec")
						  .declareParameters( new SqlParameter("DOCUMENTO", Types.NVARCHAR))
						  .declareParameters( new SqlOutParameter("RESULTADO", Types.INTEGER));
			SqlParameterSource in = new MapSqlParameterSource()
							.addValue("DOCUMENTO", inputValue,Types.NVARCHAR);

			Map<?, ?> map = simpleJdbcCall.execute(in);
			result = (Integer) map.get("RESULTADO");
		} catch(Exception e) {
			throw new Exception("No se puede obenter un documento de la Reniec");
		}
		return result;
	}

	@Override
	public Integer getDocBaseCampana(String inputValue) throws Exception {
		Integer result;
		try {
			SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate);
			
			simpleJdbcCall.withProcedureName("spBuscarClienteBase")
						  .declareParameters( new SqlParameter("DOCUMENTO", Types.NVARCHAR))
						  .declareParameters( new SqlOutParameter("RESULTADO", Types.INTEGER));
			SqlParameterSource in = new MapSqlParameterSource()
							.addValue("DOCUMENTO", inputValue,Types.NVARCHAR);

			Map<?, ?> map = simpleJdbcCall.execute(in);
			result = (Integer) map.get("RESULTADO");
		} catch(Exception e) {
			throw new Exception("No se puede obenter un documento de la BaseCampana");
		}
		
		return result;
	}

	@Override
	public Integer getDocBaseRcc(String inputValue) throws Exception {
		Integer result;
		try {
			SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate);
			
			simpleJdbcCall.withProcedureName("spBuscarClienteRcc")
						  .declareParameters( new SqlParameter("DOCUMENTO", Types.NVARCHAR))
						  .declareParameters( new SqlOutParameter("RESULTADO", Types.INTEGER));
			SqlParameterSource in = new MapSqlParameterSource()
							.addValue("DOCUMENTO", inputValue,Types.NVARCHAR);

			Map<?, ?> map = simpleJdbcCall.execute(in);
			result = (Integer) map.get("RESULTADO");
		} catch(Exception e) {
			throw new Exception("No se puede obenter un documento de la Rcc");
		}
		return result;
	}

	@Override
	public Integer getDocBaseBuro(String inputValue) throws Exception {
		Integer result;
		try {
			SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate);
			
			simpleJdbcCall.withProcedureName("spBuscarClienteBuro")
						  .declareParameters( new SqlParameter("DOCUMENTO", Types.NVARCHAR))
						  .declareParameters( new SqlOutParameter("RESULTADO", Types.INTEGER));
			SqlParameterSource in = new MapSqlParameterSource()
							.addValue("DOCUMENTO", inputValue,Types.NVARCHAR);

			Map<?, ?> map = simpleJdbcCall.execute(in);
			result = (Integer) map.get("RESULTADO");
		} catch(Exception e) {
			throw new Exception("No se puede obenter un documento de la Buro");
		}
		return result;
	}

}
