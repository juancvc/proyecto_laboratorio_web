package hnch.referencia.core.repository.interfaces.asistencial.maestra; 
import java.util.List;

import hnch.referencia.core.bean.general.TablaBean;
import hnch.referencia.core.repository.DAOException;
import hnch.referencia.core.repository.interfaces.BaseDAO;

 
public interface MaestraBanc01DAO  extends BaseDAO<TablaBean>  {
	  
	public List<TablaBean> listarPorCodigoTabla(String codTabla,int tipo) throws DAOException;
}
