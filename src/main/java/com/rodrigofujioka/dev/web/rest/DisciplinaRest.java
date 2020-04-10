package com.rodrigofujioka.dev.web.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigofujioka.dev.web.domain.Disciplina;
import com.rodrigofujioka.dev.web.service.DisciplinaService;
import com.rodrigofujioka.dev.web.service.dto.DisciplinaBuscaAnoDTO;
import com.rodrigofujioka.dev.web.service.dto.DisciplinaNomeProfessorDTO;

import javassist.NotFoundException;

@RestController
@RequestMapping("/api")
public class DisciplinaRest {

	@Autowired
	private DisciplinaService disciplinaService;

	@PostMapping("/disciplina")
	public ResponseEntity<Disciplina> salvar(@RequestBody @Valid Disciplina disciplina) {
		return ResponseEntity.ok(disciplinaService.salvar(disciplina));
	}
	
	@GetMapping("/disciplina/busca/{anoInicial}/{anoFinal}")
	public ResponseEntity<List<Disciplina>> buscaDisciplinaEntreAnosPath(@PathVariable int anoInicial, @PathVariable int anoFinal){
	
		return ResponseEntity.ok(disciplinaService.getDisciplinaEntreAnos(anoFinal,anoFinal));
	}
	
	@GetMapping("/disciplina/busca")
	public ResponseEntity<List<Disciplina>> buscaDisciplinaEntreAnos(@RequestBody @Valid DisciplinaBuscaAnoDTO dtoBusca){
		return ResponseEntity.ok(disciplinaService.getDisciplinaEntreAnos(dtoBusca));
	}
	
	
	public ResponseEntity<DisciplinaNomeProfessorDTO> getDisciplinaProfessor(@PathVariable Long id){
		try {
			DisciplinaNomeProfessorDTO disciplinaNomeProfessorDTO = disciplinaService.getDisciplinaPorId(id);
			return ResponseEntity.ok(disciplinaNomeProfessorDTO);
		} catch (NotFoundException e) {
			//FIXME Incluid LOGS AQUI
			e.printStackTrace();
			return ResponseEntity.notFound().build();
		}
		
	}
	
	@PutMapping("/disciplina")
	public ResponseEntity<Disciplina> update(@RequestBody @Valid Disciplina disciplina) {
		return ResponseEntity.ok(disciplinaService.update(disciplina));
	}
	

	@GetMapping("/disciplina/{id}")
	public ResponseEntity<Disciplina> consultaPorId(@PathVariable Long id) {
		return ResponseEntity.ok(disciplinaService.consultaPorId(id));
	}
	
	@GetMapping("/disciplina")
	public ResponseEntity<List<Disciplina>> listar() {
		return ResponseEntity.ok(disciplinaService.listar());
	}

	@DeleteMapping("/disciplina/{id}")
	public ResponseEntity deletePorId(@PathVariable Long id) {
		try {
			disciplinaService.deletePorId(id);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}

	}
	
	
	
	
	

}
