package fr.mns.jee.tp1Annuaire.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.mns.jee.tp1Annuaire.database.DatabaseConnection;
import fr.mns.jee.tp1Annuaire.model.Person;

public class PersonDao implements Dao<Person> {
	
	@Override
	public Person find(Long id) {
		try {
			PreparedStatement stmt = DatabaseConnection.getInstance().getConn().prepareStatement("SELECT * FROM person p WHERE p.id =?");
			stmt.setLong(1,  id);
			ResultSet res = stmt.executeQuery();
			Person person = new Person();
			person.setId(res.getLong("ID"));
			person.setLastname(res.getString("last_name"));
			person.setFirstName(res.getString("first_name"));
			person.setBirthDate(res.getDate("birthdate"));
			person.setPhoneNumber(res.getString("phone_number"));
			return person;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Person> findAll() {
		try {
			PreparedStatement stmt = DatabaseConnection.getInstance().getConn().prepareStatement("SELECT * FROM person p");
			ResultSet res = stmt.executeQuery();
			List<Person> persons = new ArrayList<>();
			while(res.next()) {
				Person person = new Person();
				person.setId(res.getLong("ID"));
				person.setLastname(res.getString("last_name"));
				person.setFirstName(res.getString("first_name"));
				person.setBirthDate(res.getDate("birthdate"));
				person.setPhoneNumber(res.getString("phone_number"));
				persons.add(person);
			}
			return persons;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Person create(Person entity) {
		try {
			PreparedStatement stmt = DatabaseConnection.getInstance().getConn().prepareStatement("INSERT INTO person (lastname, firstname, birthdate, phoneNumber, gender) "
					+ "VALUES (?, ?, ?, ?, ?)");
			stmt.setString(1,  entity.getLastname());
			stmt.setString(2,  entity.getFirstName());
			stmt.setDate(3,  entity.getBirthDate());
			stmt.setString(4,  entity.getPhoneNumber());
			stmt.setString(5,  entity.getGender().toString());
			ResultSet res = stmt.executeQuery();
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Person update(Person entity) {
		try {
			PreparedStatement stmt = DatabaseConnection.getInstance().getConn().prepareStatement("UPDATE person "
					+ "SET firstname = ? "
					+ "lastname = ? "
					+ "birthdate = ? "
					+ "phoneNumber = ? "
					+ "gender = ? "
					+ "WHERE person.id == ? ");
			stmt.setString(1,  entity.getFirstName());
			stmt.setString(2,  entity.getLastname());
			stmt.setDate(3,  entity.getBirthDate());
			stmt.setString(4,  entity.getPhoneNumber());
			stmt.setString(5,  entity.getGender().toString());
			stmt.setLong(6,  entity.getId());
			ResultSet res = stmt.executeQuery();
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Person delete(Long id) {
		try {
			PreparedStatement stmt = DatabaseConnection.getInstance().getConn().prepareStatement("DELETE FROM person p WHERE p.id = ?");
			stmt.setLong(1,  id);
			stmt.executeQuery();
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
