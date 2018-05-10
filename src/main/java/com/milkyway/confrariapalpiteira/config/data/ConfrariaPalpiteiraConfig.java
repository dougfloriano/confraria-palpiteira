package com.milkyway.confrariapalpiteira.config.data;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigurationProperties("cliente")
public class ConfrariaPalpiteiraConfig {

		private String host;
		private String urlConsulta;
		private String urlHistoricoBancario;
		private String urlContratos;
}
