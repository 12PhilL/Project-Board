package dio.me.project_board;

import dio.me.project_board.persistence.migration.MigrationStrategy;
import dio.me.project_board.ui.MainMenu;

import java.sql.SQLException;

import static dio.me.project_board.persistence.config.ConnectionConfig.getConnection;

public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }
}

