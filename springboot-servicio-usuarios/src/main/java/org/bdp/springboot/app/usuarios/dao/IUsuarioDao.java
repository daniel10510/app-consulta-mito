package org.bdp.springboot.app.usuarios.dao;

import org.bdp.springboot.app.usuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IUsuarioDao extends JpaRepository<Usuario, String>{
	
	public long countByUsername(String username);
	
	@Query("select u from Usuario u where u.username=?1")
	public Usuario obtenerPorUsername(String username);
	
	@Query("select u from Usuario u where u.username=?1")
	public Usuario findByUsername(String username);
}


//@RepositoryRestResource(path="usuarios")
//public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long>{
//
//	@RestResource(path="buscar-username")
//	public Usuario findByUsername(@Param("username") String username);
//	
//	@Query("select u from Usuario u where u.username=?1")
//	public Usuario obtenerPorUsername(String username);
//}
