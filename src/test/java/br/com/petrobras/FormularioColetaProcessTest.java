package br.com.petrobras;
import org.drools.KnowledgeBase;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.junit.Before;
import org.junit.Test;


public class FormularioColetaProcessTest {

	@Before
	public void setUp() {
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add( ResourceFactory.newClassPathResource("greet.bpmn"), ResourceType.BPMN2 );
		
		KnowledgeBase kbase = kbuilder.newKnowledgeBase();
		
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		ksession.startProcess("Process_1");
	}
	
	@Test
	public void test() {
		criarFormularioColetaDeterminadoMesAno();
		preencherFormularioColetaDeterminadoProjeto();
		submeterInformacoesFormularioColetaAprovacaoResponsavel();
		aprovarInformacoesFormularioColeta();
		disponibilizarInformacoesProjetoSistemasApresentacao();
	}

	/**
	 * Executado quando o Administrador do PPGI cria a Coleta de Informacoes 
	 * dos Projetos de Negocio para determinado Mes/Ano
	 */
	private void criarFormularioColetaDeterminadoMesAno() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Executado pelo delegado do projeto para preenchimento das informacoes 
	 * pertinentes aquele Projeto de Negocio no sistema PPGI
	 */
	private void preencherFormularioColetaDeterminadoProjeto() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Executado pelo delegado quando ele conclui a inclusao das informacoes e 
	 * submete as informacoes para que seu responsavel aprove
	 */
	private void submeterInformacoesFormularioColetaAprovacaoResponsavel() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Executado quando o responsavel de determinado Projeto de Negocio aprova 
	 * as informacoes submetidas pelo seu delegado no sistema
	 */
	private void aprovarInformacoesFormularioColeta() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Executado pelo Administrador para exposi��o das informa��es dos Projetos 
	 * de Negocio aos executivos da Petrobras
	 */
	private void disponibilizarInformacoesProjetoSistemasApresentacao() {
		// TODO Auto-generated method stub
		
	}

}
