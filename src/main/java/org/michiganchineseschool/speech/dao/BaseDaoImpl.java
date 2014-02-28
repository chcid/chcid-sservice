package org.michiganchineseschool.speech.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDaoImpl {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		if (null == jdbcTemplate) {
			jdbcTemplate = new JdbcTemplate(dataSource);
		}
		jdbcTemplate.setResultsMapCaseInsensitive(true);
		return jdbcTemplate;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void delete(String id, String tableName) throws Exception {
		String sql = "DELETE FROM " + tableName + " WHERE ID" + tableName
				+ " = " + id;
		getJdbcTemplate().execute(sql);
	}
}
