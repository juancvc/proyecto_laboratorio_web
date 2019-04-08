package hnch.referencia.core.service.implementacion.seguridad;

import hnch.referencia.core.bean.seguridad.UsuarioBean;
import hnch.referencia.core.bean.seguridad.UsuarioRenaesBean;
import hnch.referencia.core.repository.DAOException;
import hnch.referencia.core.repository.interfaces.seguridad.UsuarioDAO;
import hnch.referencia.core.repository.interfaces.seguridad.UsuarioRenaesDAO;
import hnch.referencia.core.service.exception.ServiceException;
import hnch.referencia.core.service.interfaces.seguridad.UsuarioRenaesService;
import hnch.referencia.core.service.interfaces.seguridad.UsuarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("usuarioRenaesServiceImp")
@Transactional (readOnly = true)
public class UsuarioRenaesServiceImp implements UsuarioRenaesService {

	@Autowired
	UsuarioRenaesDAO usuarioDAO;
	
	@Override
	public boolean insertar(UsuarioRenaesBean t) throws ServiceException {
		// TODO Auto-generated method stub
		Boolean sw = false;
		try {
			sw =  usuarioDAO.insertar(t);
			
		} catch (DAOException e) { 
			e.printStackTrace();
		}
		return sw;
	}

	@Override
	public boolean actualizar(UsuarioRenaesBean t) throws ServiceException {
		// TODO Auto-generated method stub
		Boolean sw = false;
		try {
			sw =  usuarioDAO.actualizar(t);
			
		} catch (DAOException e) { 
			e.printStackTrace();
		}
		return sw;
	}

	@Override
	public boolean eliminar(UsuarioRenaesBean t) throws ServiceException {
		// TODO Auto-generated method stub
		Boolean sw = false;
		try {
			sw =  usuarioDAO.eliminar(t);
			
		} catch (DAOException e) { 
			e.printStackTrace();
		}
		return sw;
	}

	@Override
	public UsuarioRenaesBean getBuscarPorObjecto(UsuarioRenaesBean t)
			throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioRenaesBean> getBuscarPorFiltros(UsuarioRenaesBean t)
			throws ServiceException {
		// TODO Auto-generated method stub
		List<UsuarioRenaesBean> lstBean = null;
		try {
			lstBean =  usuarioDAO.getBuscarPorFiltros(t);
			
		} catch (DAOException e) { 
			e.printStackTrace();
		}
		return lstBean;
	}

	@Override
	public boolean existe(UsuarioRenaesBean t) throws ServiceException {
		// TODO Auto-generated method stub
		return false;
	}
 

	@Override
	public List<UsuarioRenaesBean> buscarxcodigousua(UsuarioBean prmUsuarioRenaesBean) throws ServiceException {
		List<UsuarioRenaesBean> lst = null; 
		try {
			lst =  usuarioDAO.buscarxcodigousua(prmUsuarioRenaesBean);
			
		} catch (DAOException e) { 
			e.printStackTrace();
		}
		return lst;
	}
	
 
}