/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruno & Domênica
 */
public class ConexaoBancoTest {
    
    public ConexaoBancoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getConexao method, of class ConexaoBanco.
     */
    @Test
    public void testGetConexao() throws Exception {
        System.out.println("Teste Conexao");
        ConexaoBanco  conn = new ConexaoBanco();
        Connection realidade = conn.getConexao();
        assertNotNull(realidade);
     
    }
    
}
