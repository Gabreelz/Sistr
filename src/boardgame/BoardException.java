package boardgame;

public class BoardException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	/*A utilização do serialVersionUID é recomendada para garantir a consistência entre 
	diferentes versões de uma classe, pois mudanças na classe (como adicionar novos campos) 
	podem alterar a representação serializada e causar problemas de compatibilidade.*/
	
	public BoardException(String msg) {
		super(msg);
	}
}
