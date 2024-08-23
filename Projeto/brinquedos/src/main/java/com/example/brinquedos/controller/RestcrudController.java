package com.example.brinquedos.controller;

import com.example.brinquedos.model.Brinquedo;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RestcrudController {

    private List<Brinquedo> brinquedos = new ArrayList<>();

    @GetMapping("/")
    public String HomePage() {
        return "Bem-vindo a Aplicação!";
    }

    // Método para LISTAR os brinquedos
    @GetMapping("/brinquedos")
    public List<Brinquedo> listarBrinquedos() {
        return brinquedos;
    }

    // Método para CRIAR um brinquedo novo
    @PostMapping("/brinquedos/add")
    public Brinquedo criarBrinquedo(@RequestBody Brinquedo brinquedo) {
        brinquedo.setId( generateNextId() );
        brinquedos.add(brinquedo);
        return brinquedo;
    }

    // Método para ATUALIZAR algum brinquedo
    @PutMapping("/brinquedos/atualizar/{id}")
    public Brinquedo atualizarBrinquedo(@PathVariable Long id, @RequestBody Brinquedo brinquedo) {
        Brinquedo brinquedoExistente = brinquedos.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElseThrow( () -> new IllegalArgumentException("Brinquedo não encontrado no método: atualizarBrinquedo"));

        brinquedoExistente.setNome(brinquedo.getNome());
        brinquedoExistente.setTipo(brinquedo.getTipo());
        brinquedoExistente.setClassificacao(brinquedo.getClassificacao());
        brinquedoExistente.setTamanho(brinquedo.getTamanho());
        brinquedoExistente.setPreco(brinquedo.getPreco());
        return brinquedoExistente;
    }

    // Método para DELETAR um brinquedo
    @DeleteMapping("/brinquedos/delete/{id}")
    public void excluirBrinquedo(@PathVariable Long id) {
        brinquedos.removeIf( u -> u.getId().equals(id));
    }


    // Método para listar um Brinquedo por ID especifico
    @GetMapping("/brinquedos/buscarid/{id}")
    public Brinquedo buscarBrinquedoPorId(@PathVariable Long id) {
        return brinquedos.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElseThrow( () -> new IllegalArgumentException("Brinquedo não encontrado no método: buscarBrinquedoPorId"));
    }

    private Long generateNextId() {
        Long maxId = brinquedos.stream()
                .mapToLong(Brinquedo::getId)
                .max()
                .orElse(0L);
        return maxId + 1;
    }
}