
package Tienda_Danny.repository;

import Tienda_Danny.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    // Método personalizado para obtener solo las categorías activas
    public List<Producto> findByActivoTrue();
}