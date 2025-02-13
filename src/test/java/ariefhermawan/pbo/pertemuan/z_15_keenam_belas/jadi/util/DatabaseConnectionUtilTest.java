package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.util;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionUtilTest {

    @Test
    void testConnection() throws SQLException {
        HikariDataSource dataSource = DatabaseConnectionUtil.getDataSource();
        assertNotNull(dataSource);

        Connection connection = dataSource.getConnection();
        assertNotNull(connection);

        connection.close();
        dataSource.close();
    }
}