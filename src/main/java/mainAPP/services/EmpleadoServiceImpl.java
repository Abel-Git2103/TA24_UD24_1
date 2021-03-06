package mainAPP.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mainAPP.dao.IEmpleadoDao;
import mainAPP.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	IEmpleadoDao iEmpleadoDao;
	
	@Override
	public List<Empleado> listarEmpleado() {
		return iEmpleadoDao.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		
		return iEmpleadoDao.save(empleado);
	}

	@Override
	public Empleado empleadoXID(Long id) {
		
		return iEmpleadoDao.findById(id).get();
	}
	
	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		
		return iEmpleadoDao.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		
		iEmpleadoDao.deleteById(id);
		
	}


	@Override
	public List<Empleado> listarEmpleadoNombre(String nombre) {
		
		return iEmpleadoDao.findByNombre(nombre);
	}
	
	@Override
	public List<Empleado> listarEmpleadoTrabajo(String trabajo){
		
		return iEmpleadoDao.findByTrabajo(trabajo);
	}
	
}
