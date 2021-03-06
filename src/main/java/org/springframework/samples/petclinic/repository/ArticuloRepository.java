package org.springframework.samples.petclinic.repository;

import java.util.Collection;
import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.Articulo;

public interface ArticuloRepository extends Repository<Articulo, Integer>{
	
	Collection<Articulo> findAll() throws DataAccessException;
	
	Optional<Articulo> findById(int id) throws DataAccessException;
	
	void deleteById(int id) throws DataAccessException;
	
	void save(Articulo articulo) throws DataAccessException;
	
	@Query(value="SELECT * FROM ARTICULOS articulo WHERE articulo.autor_id = :id", nativeQuery = true)
	public Collection<Articulo> findTutorArticulos(@Param("id") int id);
}
