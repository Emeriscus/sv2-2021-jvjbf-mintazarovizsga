package dogTypes;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DelegatingDataSource;

import javax.sql.DataSource;
import java.util.List;
import java.util.Locale;

public class DogTypes {

    private JdbcTemplate jdbcTemplate;

    public DogTypes(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<String> getDogsByCountry(String country) {
        //language=sql
        return jdbcTemplate.query("select * from dog_types where country=?",
                (rs, RowNum) -> rs.getString("name").toLowerCase()
                , country);
    }
}
