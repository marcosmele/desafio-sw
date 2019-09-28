package br.com.b2w.desafio.integracao.swapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultSwapi {

	private List<PlanetaSwapi> results;

	public ResultSwapi(List<PlanetaSwapi> results) {
		this.results = results;
	}

	
}