/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reserva.app.controller;

import com.reserva.app.model.Equipamento;
import com.reserva.app.service.EquipamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipamentos")
public class EquipamentoController {
    private final EquipamentoService equipamentoService;

    @Autowired
    public EquipamentoController(EquipamentoService equipamentoService) {
        this.equipamentoService = equipamentoService;
    }

    @GetMapping
    public List<Equipamento> getAllEquipamentos() {
        return equipamentoService.getAllEquipamentos();
    }

    @PostMapping
    public Equipamento createEquipamento(@RequestBody Equipamento equipamento) {
        return equipamentoService.saveEquipamento(equipamento);
    }

    @DeleteMapping("/{id}")
    public void deleteEquipamento(@PathVariable Long id) {
        equipamentoService.deleteEquipamento(id);
    }
}

