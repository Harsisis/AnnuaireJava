package fr.mns.jee.tp1Annuaire.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import fr.mns.jee.tp1Annuaire.database.DatabaseConnection;
import fr.mns.jee.tp1Annuaire.model.Person;

public class PersonDao implements Dao<Person> {
	
	@Override
	public Person find(Long id) {
		try {
			PreparedStatement stmt = DatabaseConnection.getInstance().getConn().prepareStatement("SELECT * FROM person p WHERE p.id =?");
			stmt.setLong(1,  id);
			return (Person) stmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Person> findAll() {
		try {
			PreparedStatement stmt = DatabaseConnection.getInstance().getConn().prepareStatement("SELECT * FROM person p");
			return (List<Person>) stmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Person create(Person entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person update(Person entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
