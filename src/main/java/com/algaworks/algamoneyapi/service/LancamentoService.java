package com.algaworks.algamoneyapi.service;

import com.algaworks.algamoneyapi.model.Lancamento;
import com.algaworks.algamoneyapi.model.Pessoa;
import com.algaworks.algamoneyapi.repository.LancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LancamentoService {
    @Autowired
    private LancamentoRepository lancamentoRepository;

    public Lancamento atualizar(Long codigo, Lancamento lancamento) {
        Optional<Lancamento> lancamentoSalvo = lancamentoRepository.findById(codigo);
        if (lancamentoSalvo.isEmpty()) {
            throw new EmptyResultDataAccessException(1);
        }
        Lancamento lancamentoSaved = lancamentoSalvo.get();
        lancamentoSaved.setDescricao(lancamento.getDescricao());
        lancamentoSaved.setValor(lancamento.getValor());

        return lancamentoRepository.save(lancamentoSaved);
    }

    private Lancamento buscarLancamentoPeloCodigo(Long codigo) {
        Lancamento lancamentoSalvo = lancamentoRepository.getReferenceById(codigo);
        if (lancamentoSalvo == null) {
            throw new EmptyResultDataAccessException(1);
        }
        return lancamentoSalvo;
    }

}
