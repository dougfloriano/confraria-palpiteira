package com.milkyway.confrariapalpiteira.http;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/cliente", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
		MediaType.APPLICATION_JSON_VALUE })
public class ConfrariaPalpiteiraController {

	@GetMapping
	@ResponseBody
	@ResponseStatus(code = HttpStatus.OK)
	public String obterClientes(@RequestParam(name = "cpf", required = true) String cpf,
			@RequestParam(name = "matricula", required = true) String matricula,
			@RequestHeader(name = "Authorization", required = true) String token) {

		return null;
	}

}
