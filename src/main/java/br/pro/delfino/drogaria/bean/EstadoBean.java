package br.pro.delfino.drogaria.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/*
 * Bean é o controle e modelo
 * Existe 2 tipos para fazer o Bean (Se está usando container (Tomcat) ou
 * Application Server (WildFly)
 * Expression Language (ligar visão com o modelo / controle)
 * FacesMessage (Exibir mensagens)
 * Controle não manipula visão
 */

@ManagedBean
public class EstadoBean {

	public void salvar() {		
		
		/*
		 * 1º Parâmetro: Tipo do erro
		 * 2º Mensagem resumida
		 * 3º Mensagem detalhada
		 */		
		
		String texto = "Programação Web com Java";
		FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_FATAL, texto, texto);
		
		FacesContext contexto = FacesContext.getCurrentInstance(); // Captura o contexto		
		contexto.addMessage(null, mensagem);
	}
}
