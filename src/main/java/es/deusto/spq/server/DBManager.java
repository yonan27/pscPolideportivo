package es.deusto.spq.server;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;

import org.sqlite.core.DB;

import es.deusto.spq.client.Cliente;

import es.deusto.spq.client.ReservaInstalaciones;

import es.deusto.spq.client.gui.VentanaLogin;


public class DBManager {
	
	private static DBManager instance = null;
	private PersistenceManagerFactory pmf = null;
	private static boolean inicializado = false;
	private static Connection conn;
	
	private DBManager() {
		pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
	}
	
	/**
	 * Obtencion de la instancia del DBManager, si no existe la crea y si existe la devuelve
	 * @return instancia de DBManager
	 */
	
	public static DBManager getInstance() {
//		if (instance == null) {
		instance = new DBManager();
//			System.out.println("Nuevo DBManager");
//		}

		return instance;
	}
	
	public void storeObjectInDB(Object object) {
		PersistenceManager pm = pmf.getPersistenceManager();
		pm.getFetchPlan().setMaxFetchDepth(4);
		Transaction tx = pm.currentTransaction();
		

		try {
			tx.begin();
			pm.makePersistent(object);
			tx.commit();
		} catch (Exception ex) {
			System.out.println("  $ Error storing an object: " + ex.getMessage());
			System.out.println("Object:" + object);
		} finally {
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}

			pm.close();
		}
	}
		
	public void deleteObjectFromDB(Object object) {
		PersistenceManager pm = pmf.getPersistenceManager();
		pm.getFetchPlan().setMaxFetchDepth(4);
		Transaction tx = pm.currentTransaction();

		try {
			tx.begin();
			
			pm.deletePersistent(object);
			
			tx.commit();
		} catch (Exception ex) {
			System.out.println(" $ Error deleting an object: " + ex.getMessage());
		} finally {
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}

			pm.close();
		}
		}
	
	public void store(Cliente client) {
		DBManager.getInstance().storeObjectInDB(client);
	}

	public void delete(Cliente client) {
		DBManager.getInstance().deleteObjectFromDB(client);
	}
	
	public void store(ReservaInstalaciones reser) {
		DBManager.getInstance().storeObjectInDB(reser);
	}

	public void delete(ReservaInstalaciones reser) {
		DBManager.getInstance().deleteObjectFromDB(reser);
	}
	
	public Cliente getUsuario(String email) {
		PersistenceManager pm = pmf.getPersistenceManager();
		pm.getFetchPlan().setMaxFetchDepth(4);
		Transaction tx = pm.currentTransaction();
		Cliente user = null;

		try {
			tx.begin();

			Query<?> query = pm.newQuery("SELECT FROM " + Cliente.class.getName() + " WHERE email == '" + email + "'");
			query.setUnique(true);
			user = (Cliente) query.execute();

			tx.commit();
		} catch (Exception ex) {
			System.out.println(" $ Error cogiendo el usuario de la BD: " + ex.getMessage());
		} finally {
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}

			pm.close();
		}

		return user;	
		}
	
	public ReservaInstalaciones getReserva(String emailUsuario) {
		PersistenceManager pm = pmf.getPersistenceManager();
		pm.getFetchPlan().setMaxFetchDepth(4);
		Transaction tx = pm.currentTransaction();
		ReservaInstalaciones reserva = null;
		
		try {
			tx.begin();

			Query<?> query = pm.newQuery("SELECT FROM " + ReservaInstalaciones.class.getName() + " WHERE emailUsuario == '" + emailUsuario + "'");
			query.setUnique(true);
			reserva = (ReservaInstalaciones) query.execute();

			tx.commit();
		} catch (Exception ex) {
			System.out.println("Error mostrando la reserva de la BD: " + ex.getMessage());
		} finally {
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}

			pm.close();
		}
		return reserva;
		}
	
	public void agregarClientePolideportivo(List<Cliente> clientes) {
		PreparedStatement preparedStatement = null;

	        try {
	            
	        	for (Cliente c : clientes) {
	        		String query = " INSERT INTO CLIENTE (DNI, NOMBRE, APELLIDO, EDAD, EMAIL, CONTRASENYA, ADMIN)"
		                    + " VALUES (?, ?, ?, ?, ?, ?, ?)";

		            preparedStatement = conn.prepareStatement(query);

		            preparedStatement.setString(1, c.getDNI());
		            preparedStatement.setString(2, c.getNombre());
		            preparedStatement.setString(3, c.getApellido());
		            preparedStatement.setInt(4, c.getEdad());
		            preparedStatement.setString(5, c.getEmail());
		            preparedStatement.setString(6, c.getContrasenya());
		            preparedStatement.setBoolean(7, c.isAdmin());
		            preparedStatement.execute();

		            System.out.println("Clientes agregados correctamente");
				}
	        	

	        } catch (Exception e) {
	            System.out.println("Error agregando los clientes");
	            System.out.println(e);
	        }
	}
	
	public void initializeData() {
		System.out.println(" * Inicializando base de datos");
		
		Cliente c1 = new Cliente("43527594", "Manolito", "Manolo", 18, "Manolito@gmail.es", "manolo123", false);
		Cliente c2 = new Cliente("admin", "admin", "admin", 20, "admin@admin.es", "admin", true);
		
		try {
			 store(c1);
			 store(c2);
		} catch (Exception ex) {
			// TODO: handle exception
			System.out.println(" $ Error inicializando los datos: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	public void realizarReservaInstalacion(List<ReservaInstalaciones> reservas) {
		PreparedStatement preparedStatement = null;
	        try {
	        	for (ReservaInstalaciones r : reservas) {
	        		String query = " INSERT INTO RESERVAINSTALACIONES (IDRERSERVA, IDINSTALACION, EMAILUSUARIO, ANYO, DIA, HORA)"
		                    + " VALUES (?, ?, ?, ?, ?, ?, ?)";

		            preparedStatement = conn.prepareStatement(query);

		            preparedStatement.setString(1, r.getIDReserva());
		            preparedStatement.setString(2, r.getIDInstalacion());
		            preparedStatement.setString(3, r.getEmailUsuario());
		            preparedStatement.setInt(4, r.getAnyo());
		            preparedStatement.setInt(5, r.getDia());
		            preparedStatement.setInt(6, r.getHora());
		            preparedStatement.execute();

		            System.out.println("Reserva agregada correctamente");
				}
	        	

	        } catch (Exception e) {
	            System.out.println("Error al realizar la reserva");
	            System.out.println(e);
	        }
	 }

	       
	/*
	 * 	private String IDReserva;
    private String IDReserva;
    private String emailUsuario;
    private int anyo;
    private int mes;
    private int dia;
    private int hora;
    
	 */
	public List<ReservaInstalaciones> getAllReservas() {
		List<ReservaInstalaciones> reservas = new ArrayList<ReservaInstalaciones>();
		PersistenceManager pm = pmf.getPersistenceManager();
		/*
		 * 	pm.getFetchPlan().setMaxFetchDepth(4);
		Transaction tx = pm.currentTransaction();
		ReservaInstalaciones reserva = null;
			//Connection con = DB.initDB("database.sql");
		 */
	
		
		try (Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery("SELECT IDInstalación, IDReserva, emailUsuario, anyo, mes, dia, hora FROM RESERVA");
			while(rs.next()) {
				ReservaInstalaciones reserva = new ReservaInstalaciones();
				reserva.setIDInstalacion(rs.getString("IDReserva"));
				reserva.setIDReserva(rs.getString("IDReserva"));
				reserva.setEmailUsuario(rs.getString("user_email"));
				reserva.setAnyo(rs.getInt("anyo"));
				reserva.setMes(rs.getInt("mes"));
				reserva.setDia(rs.getInt("dia"));
				
				reservas.add(reserva);
			}
		} catch (SQLException e) {
			System.out.println("Error al coger reservas");
			
		}
		return reservas;
	}	


	
	public void ModificarReservaInstalacion(Connection con, int Instalacion) throws SQLException {
		PreparedStatement preparedStatement = null;
		String query = "Modify from ReservaInstalacion where IDReserva ";
		preparedStatement = conn.prepareStatement(query);
}
}