package br.com.etechoracio.avaliacao.business;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.etechoracio.avaliacao.dao.CadastroDAO;
import br.com.etechoracio.avaliacao.model.Cadastro;
import br.com.etechoracio.common.business.BaseSB;

@Service
public class CadastroSB extends BaseSB {
	
	private CadastroDAO cadastroDAO;
	
	@Override
	protected void postConstructImpl() {
		cadastroDAO = getDAO(CadastroDAO.class);
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<Cadastro> findAll(){
		return cadastroDAO.findAll();
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void save(Cadastro cadastro){
		cadastroDAO.save(cadastro);	
	}

}
