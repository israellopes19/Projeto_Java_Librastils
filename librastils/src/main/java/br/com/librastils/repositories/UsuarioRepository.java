package br.com.librastils.repositories;

import br.com.librastils.models.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String > {

}
