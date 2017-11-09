package br.com.cursojsf.listener;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class LifeCycleListener implements PhaseListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void afterPhase(PhaseEvent event) {
		int id = event.getPhaseId().getOrdinal();
		System.out.println("Fim da Fase "+ obterNomeDaFase(event.getPhaseId().getOrdinal(),id==6));		
	}

	@Override
	public void beforePhase(PhaseEvent event) {
		int id = event.getPhaseId().getOrdinal();
		 System.out.println("Início da Fase "+ obterNomeDaFase(id, id==1));		
	}

	@Override
	public PhaseId getPhaseId() {		
		return PhaseId.ANY_PHASE;
	}
	
	private String obterNomeDaFase(int id,boolean separar) {
		String s = "-x-x-x-x-x-x-x-x-xx-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x";
		String separador = (separar)?s:"";
		switch (id) {
		case 1:
			
			System.out.println(separador);
			return "Restore View";
		case 2:
			return "Apply Request Values";
		case 3:
			return "Process Validations";
		case 4:
			return "Update Model";
		case 5:
			return "Invoke Application";
		case 6:
			System.out.println(separador);
			return "Render Response";
		default:
			return "Não identificada";
		}
		
		
	}

}
