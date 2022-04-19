package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {
	
	
	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Tio tia1 = new Tio("Maria");
		Tio tio2 = new Tio("João");
		
		Sobrinho sobrinha1 = new Sobrinho("Mila");
		Sobrinho sobrinho2 = new Sobrinho("Davi");
		
		tia1.getSobrinhos().add(sobrinha1);
		sobrinha1.getTios().add(tia1);
		
		tia1.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tia1);
		
		tio2.getSobrinhos().add(sobrinha1);
		sobrinha1.getTios().add(tio2);
		
		tio2.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio2);
		
		dao.abrirTransacao().incluir(tia1).incluir(tio2).incluir(sobrinha1).incluir(sobrinho2).fecharTransacao().fechar();
	}

}
