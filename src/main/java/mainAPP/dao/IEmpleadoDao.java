package mainAPP.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import mainAPP.dto.Empleado;

public interface IEmpleadoDao extends JpaRepository<Empleado, Long> {
	
	public List<Empleado> findByNombre(String nombre);
}
