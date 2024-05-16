package universidad;

import javax.swing.JOptionPane;
import java.sql.*;

public class Universidad {

    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/universidad";
            String usuario = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, usuario, password);
//            String sql = "INSERT INTO " 
//                    + "alumno(dniA, apellidoA, nombreA, fechaNacimientoA, estadoAlumno)"
//                    + " VALUES " 
//                    + "(12345678, 'Torres','Juan','2000-01-01',1),"
//                    + "(23456789,'Perez','Maria','1999-02-02',1),"
//                    + "(34567890,'Exploradora','Dora','1990-03-03',1)";
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.executeUpdate();
//            String sql = "INSERT INTO " 
//                    + "materia(nombreM,añoM,estadoM)"
//                    + " VALUES " 
//                    + "('MATEMATICA',2024,1),"
//                    + "('EDA',2024,1),"
//                    + "('WEB',2024,1),"
//                    + "('LABORATORIO',2024,1)";
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.executeUpdate(); 
//            String sql = "INSERT INTO " 
//                    + "inscripcion(nota,idAlumno,idMateria)"
//                    + " VALUES " 
//                    + "(10,1,1),"
//                    + "(2,1,2),"
//                    + "(6,2,3),"
//                    + "(10,2,4),"
//                    + "(10,3,1),"
//                    + "(1,3,4)";
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.executeUpdate(); 

//            String sql = "SELECT * FROM inscripcion JOIN alumno ON inscripcion.idAlumno = alumno.idAlumno WHERE inscripcion.nota > 8";
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet datos = ps.executeQuery();
//            while (datos.next()) {
//                int dniA = datos.getInt("dniA");
//                String apellidoA = datos.getString("apellidoA");
//                String nombreA = datos.getString("nombreA");
//                String fechaNacimientoA = datos.getString("fechaNacimientoA");
//                boolean estado = datos.getBoolean("estadoAlumno");
//                System.out.println("DNI: " + dniA);
//                System.out.println("Apellido: " + apellidoA);
//                System.out.println("Nombre: " + nombreA);
//                System.out.println("Fecha Nacimiento: " + fechaNacimientoA);
//                System.out.println("Esctado: " + estado);
//                System.out.println("------------------------------");
//            }
              String sql = "DELETE FROM inscripcion WHERE idInscripto = 7";
              PreparedStatement ps = con.prepareStatement(sql);
              ps.executeUpdate();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR DRIVER");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR CONEXION");
        }
    }

}
