package br.com.cursojsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

@ManagedBean
@SessionScoped
public class MeuBean {
	private HtmlInputText componenteEntrada;
	private String valorDado;
	private HtmlOutputText componenteSaida;
	private String valorSaida;
	
	public MeuBean() {
		log("construido");
	}
	
	public void valorAlterado(ValueChangeEvent event) {
		log(event.getOldValue() + " para "+ event.getNewValue());
	}

	public void acao() {
		valorSaida = valorDado;
		log("Sucesso!");
	}
	
	
	
	public HtmlInputText getComponenteEntrada() {
		log(componenteEntrada);
		return componenteEntrada;
	}

	public void setComponenteEntrada(HtmlInputText componenteEntrada) {
		log(componenteEntrada);
		this.componenteEntrada = componenteEntrada;
	}

	public String getValorDado() {
		log(valorDado);
		return valorDado;
	}

	public void setValorDado(String valorDado) {
		log(valorDado);
		this.valorDado = valorDado;
	}

	public HtmlOutputText getComponenteSaida() {
		log(componenteSaida);
		return componenteSaida;
	}

	public void setComponenteSaida(HtmlOutputText componenteSaida) {
		log(componenteSaida);
		this.componenteSaida = componenteSaida;
	}

	public String getValorSaida() {
		log(valorSaida);
		return valorSaida;
	}

	public void setValorSaida(String valorSaida) {
		log(valorSaida);
		this.valorSaida = valorSaida;
	}

	private void log(Object obj) {
		String nomeMetodo = Thread.currentThread().getStackTrace()[2].getMethodName();
		System.out.println("MeuBean "+nomeMetodo+": "+obj);
	}
}
