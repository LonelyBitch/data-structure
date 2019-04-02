
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 事务操作
 */
public class JDBCDemo6 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        try {
            //获取数据库连接
            connection = JDBCUtils.getConnection();
            //开启事务
            connection.setAutoCommit(false);
            //定义sql
            String sql1 = "update cou set money = money - ? where id = ?";
            String sql2 = "update cou set money = money + ? where id = ?";
            //获取执行sql的对象
            pstmt1 = connection.prepareStatement(sql1);
            pstmt2 = connection.prepareStatement(sql2);
            //设置参数
            pstmt1.setInt(1,500);
            pstmt1.setInt(2,1);

            pstmt2.setInt(1,500);
            pstmt2.setInt(2,2);
            //执行sql
            pstmt1.executeUpdate();
            //制造异常
            int i = 3/0;
            pstmt2.executeUpdate();
            //提交事务
            connection.commit();
        } catch (Exception e) {
            try {
                //事务回滚
                if (connection != null){

                    System.out.println("rollback");
                    connection.rollback();

                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt1,connection);
            JDBCUtils.close(pstmt2,null);
        }
    }
}
