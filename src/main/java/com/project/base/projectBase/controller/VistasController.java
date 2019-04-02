package com.project.base.projectBase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VistasController {

	@RequestMapping(value = "/{folder}/{pagina}", method = RequestMethod.GET)
	public String navegacion(@PathVariable ("folder") String folder, @PathVariable("pagina") String pagina) {
		return folder + "/" + pagina;
	}
}
