package ariefhermawan.pbo.pertemuan.z_15_keenam_belas.jadi.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DatabaseConnectionUtil {

    private static HikariDataSource hikariDataSource;

    static {
        HikariConfig configuration = new HikariConfig();
        configuration.setDriverClassName("com.mysql.cj.jdbc.Driver");
        configuration.setUsername("root");
        configuration.setPassword("root@120303");
        configuration.setJdbcUrl("jdbc:mysql://localhost:3306/project_uas_pbo");

        // Connection Pool
        configuration.setMaximumPoolSize(10);
        configuration.setMinimumIdle(3);
        configuration.setIdleTimeout(60 * 1000);
        configuration.setMaxLifetime(60 * 60 * 1000);

        hikariDataSource = new HikariDataSource(configuration);
    }

    public static HikariDataSource getDataSource() {
        return hikariDataSource;
    }
}
