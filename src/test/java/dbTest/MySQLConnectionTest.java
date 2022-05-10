package dbTest;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnectionTest {
    //MySQL Connector의 클래스, DB연결 드라이버 정의
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    //DB경로
    private static final String URL = "jdbc:mysql://localhost:3306/hansol?serverTimezone=UTC&characterEncoding=UTF-8";
    private static final String USER = "root";
    private static final String PASSWORD = null;

    @Test
    public void testConnection() throws Exception{
        //DBMS에게 DB 연결드라이버의 위치를 알려주기 위한 메서드
        Class.forName(DRIVER);
        try{
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println(conn);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
