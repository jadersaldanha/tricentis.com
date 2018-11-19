package support;

public interface IDatapool {
	
	/**
	 * Informa se há mais registros no datapool para uma nova iteração.
	*/
	public abstract boolean hasNext();

	/**
	 * Informa se há registros no datapool.
	*/
	public abstract boolean isEmpty();

	/**
	 * Reinicia a iteração novamente a partir do primeiro registro.
	*/
	public abstract void reset();

	/**
	 * Informa a quantidade de registros presentes no datapool.
	*/
	public abstract int getSize();

	/**
	 * Avança o ponteiro para o próximo registro.
	 * .
	 * @throws DatapoolException 
	*/
	public abstract IDatapool next() throws DatapoolException;

	/**
	 * Avança o ponteiro para o registro informado no parâmetro "line".
	 * .
	 * @param line índice do registro desejado, de 0 até tamanho - 1.
	 * @throws DatapoolException 
	*/
	public abstract IDatapool nextTo(int line) throws DatapoolException;

	/**
	 * Avança o ponteiro para um registro pseudo-aleatório.
	 * .
	 * @throws DatapoolException 
	*/
	public abstract IDatapool nextRandom() throws DatapoolException;

	/**
	 * Retorna o valor do campo informado referente ao registro atual.
	 * 
	 * @param field é o nome do campo.
	 * @throws DatapoolException 
	*/
	public abstract String getValue(String field) throws DatapoolException;

	/**
	 * Retorna o valor do campo relativo ao índice das colunas referente ao registro atual.
	 * 
	 * @param fieldIndex é o índice da coluna desejada, sendo um número de 0 até quantidade de registros - 1.
	 * @throws DatapoolException 
	*/
	public abstract String getValue(int fieldIndex) throws DatapoolException;

}
