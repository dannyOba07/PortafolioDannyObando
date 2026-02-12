
package Tienda_Danny.repository;

import Tienda_Danny.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

    
    public List<Categoria> findByActivoTrue();
}
