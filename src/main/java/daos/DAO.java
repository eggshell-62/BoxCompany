package daos;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

/**
 * Defines required method for any DAO.
 */
public interface DAO {
	public NamedParameterJdbcTemplate getJdbcTemplate();
	public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate);
}
