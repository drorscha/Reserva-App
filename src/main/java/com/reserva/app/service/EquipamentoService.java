/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reserva.app.service;

import com.reserva.app.model.Equipamento;
import com.reserva.app.repository.EquipamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipamentoService {
    private final EquipamentoRepository equipamentoRepository;

    @Autowired
    public EquipamentoService(EquipamentoRepository equipamentoRepository) {
        this.equipamentoRepository = equipamentoRepository;
    }

    public List<Equipamento> getAllEquipamentos() {
        return equipamentoRepository.findAll();
    }

    public Optional<Equipamento> getEquipamentoById(Long id) {
        return equipamentoRepository.findById(id);
    }

    public Equipamento saveEquipamento(Equipamento equipamento) {
        return equipamentoRepository.save(equipamento);
    }

    public void deleteEquipamento(Long id) {
        equipamentoRepository.deleteById(id);
    }
}
