package hnch.referencia.core.service.interfaces.asistencial.maestra;
  
import java.util.List;

import hnch.referencia.core.bean.general.TablaBean;
import hnch.referencia.core.service.exception.ServiceException;
import hnch.referencia.core.service.interfaces.BaseService;
 

public interface MaestraAsis14Service extends BaseService<TablaBean> {
	 
	public List<TablaBean> listarPorCodigoTabla(String codTabla,int tipo) throws ServiceException;  
	
	public List<TablaBean> listarTodasTablas(TablaBean tablaBean) throws ServiceException;  
	
}
 
