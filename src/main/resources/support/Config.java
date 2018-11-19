package support;

import com.aventstack.extentreports.Status;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
	protected static final int DEFAULT_TIMEOUT = 30;
	
	protected static FileInputStream file;
	protected static Properties properties;
	
	static {
		initConfig();
	}

	private static void initConfig() {
		try {
			file = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties");
			properties = new Properties();
			properties.load(file);
		} catch (IOException ex) {
			Report.log(Status.WARNING, "Arquivo de configuração <b>config.properties</b> nao encontrado no projeto! <br/>" + ex.getMessage());
		}
	}

	/**
	 * Busca uma propriedade definida no <code>config.properties</code>.
	 * 
	 * @param propertyName É o nome/chave da propriedade que deseja-se obter o valor.
	 * @return O valor da propriedade requisitada ou uma String vazia caso a propriedade não exista.
	 */
	public static String get(String propertyName) {
		String propertyValue = properties.getProperty(propertyName);
		
		if(propertyValue == null) {
			String errorMessage = "Propriedade '" + propertyName + "' não encontrada no arquivo de configuração.";
			Report.log(Status.FATAL, errorMessage);
			return "";
		}
		
		return propertyValue;
	}

	/**
	 * Busca no <code>config.properties</code> o valor definido para timeout padrão para carregamento dos elementos. <br>
	 * Default <strong>30 segundos</strong> caso propriedade não seja definida.
	 * 
	 * @return o valor definido como timeout padrão
	 */
	public static int getDefaultTimeout() {
		if(properties == null) {
			return DEFAULT_TIMEOUT;
		}
		
		return Integer.valueOf(properties.getProperty("default.timeout", String.valueOf(DEFAULT_TIMEOUT)));
	}
	
	public static boolean isDashboardWebEnable() {
		String isEnabled = properties.getProperty("dashboard.enable");
		return isEnabled != null && isEnabled.equals("true");
	}
	
	public static String getDashboardWebLocation() {
		String location = properties.getProperty("dashboard.location");
		if(location == null) {
			String errorMessage = "Propriedade 'dashboard.location' não encontrada no arquivo de configuração.";
			Report.log(Status.FATAL, errorMessage);
			throw new ExceptionInInitializerError(errorMessage);
		}
		return location;
	}

	public static String getDbHost(String environment) {
		String dbHost = properties.getProperty("database." + environment + ".host");
		if(dbHost == null) {
			String errorMessage = "Propriedade 'database." + environment + ".host' não encontrada no arquivo de configuração.";
			Report.log(Status.FATAL, errorMessage);
			throw new ExceptionInInitializerError(errorMessage);
		}
		return dbHost;
	}

	public static String getDbUser(String environment) {
		String dbUser = properties.getProperty("database." + environment + ".user");
		if(dbUser == null) {
			String errorMessage = "Propriedade 'database." + environment + ".user' não encontrada no arquivo de configuração.";
			Report.log(Status.FATAL, errorMessage);
			throw new ExceptionInInitializerError(errorMessage);
		}
		return dbUser;
	}

	public static String getDbPassword(String environment) {
		String dbPass = properties.getProperty("database." + environment + ".pass");
		if(dbPass == null) {
			String errorMessage = "Propriedade 'database." + environment + ".pass' não encontrada no arquivo de configuração.";
			Report.log(Status.FATAL, errorMessage);
			throw new ExceptionInInitializerError(errorMessage);
		}
		return dbPass;
	}
}


