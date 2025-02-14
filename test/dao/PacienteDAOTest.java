/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static javax.print.attribute.Size2DSyntax.MM;
import modelo.Paciente;
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
public class PacienteDAOTest {
    PacienteDAO PacDAO =  new PacienteDAO();
    public PacienteDAOTest() {
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

   @Test
    public void TesteCadastrarPaciente() throws Exception {
        PacienteDAO pDAO = new PacienteDAO();
        // Executa o cadastro
       Paciente PacienteTeste1 = new Paciente();
        PacienteTeste1.setNome("Teos");
        PacienteTeste1.setCpf("113.123.123-12");
     SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date x1 = sdf1.parse("25/06/2018");
        
        PacienteTeste1.setDataNascimento(x1);
        PacienteTeste1.setRg("123.123.23");
        PacienteTeste1.setEndereco("Avenida1: Meio da Rua");
        PacienteTeste1.setTelefone("(19)1234-1234");
        PacienteTeste1.setConvenio(2);
        
        
       boolean resultado = pDAO.cadastrarPaciente(PacienteTeste1);
       System.out.println(resultado);
        // Verifica se o registro foi salvo
        assertTrue(resultado);
        
       
    }
   
 /**
     * Test of buscarPacienteFiltro method, of class PacienteDAO.
     */ 
     @Test
    public void testPacienteNulo() throws Exception {
        
    }
    
   
    
}
