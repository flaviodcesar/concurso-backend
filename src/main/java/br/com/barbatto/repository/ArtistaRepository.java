package br.com.barbatto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.barbatto.entities.Artista;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Repositorio da tabela Artista
 * @author Karen Barbato
 * @since 06/01/2020
 */
@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Integer>{

	@Query("FROM Artista a WHERE UPPERCASE(a.nome) like %:nome% ")
	Page<Artista> search(@Param("nome") String nome, Pageable pageable);
}
