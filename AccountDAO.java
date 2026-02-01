import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO {

    public static void insertAccount(Account account, String surname) {
        String sql =
                "INSERT INTO accounts (owner, balance, type, surname) VALUES (?, ?, ?, ?)";

        try (Connection conn = DBConnection.connect();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, account.getOwner());
            ps.setDouble(2, account.getBalance());
            ps.setString(3, account.getClass().getSimpleName());
            ps.setString(4, surname);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<String> getAllAccounts() {
        List<String> result = new ArrayList<>();
        String sql = "SELECT * FROM accounts";

        try (Connection conn = DBConnection.connect();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                result.add(
                        rs.getInt("account_id") + " " +
                                rs.getString("owner") + " " +
                                rs.getDouble("balance") + " " +
                                rs.getString("type")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void updateBalance(int id, double newBalance) {
        String sql = "UPDATE accounts SET balance = ? WHERE account_id = ?";

        try (Connection conn = DBConnection.connect();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setDouble(1, newBalance);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteAccount(int id) {
        String sql = "DELETE FROM accounts WHERE account_id = ?";

        try (Connection conn = DBConnection.connect();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
