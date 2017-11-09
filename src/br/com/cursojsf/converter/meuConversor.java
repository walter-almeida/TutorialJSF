package br.com.cursojsf.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter("meuConversor")
public class meuConversor implements Converter {
	
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		System.out.println("MeuConversor getObject " +value);
		return value;
		//throw new ConverterException("Falha no Conversor");
	}
	
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		System.out.println("MeuConversor getAsString "+ value);
		return (String)value;
	}
}
