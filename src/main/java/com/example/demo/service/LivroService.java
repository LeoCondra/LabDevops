package com.example.demo.service;

import com.example.demo.model.Livro;
import com.example.demo.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public void salvar(Livro livro) {
        this.livroRepository.save(livro);
    }

    public List<Livro> listar(){
        return this.livroRepository.findAll();
    }
}
