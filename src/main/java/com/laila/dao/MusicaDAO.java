/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.laila.dao;

import com.laila.model.Musica;
import java.util.List;

public interface MusicaDAO {
    // Método que devuelve el listado de objetos
    public List<Musica> findAll();
    // Método que inserta un objeto en la BBDD
    public Musica insert(Musica objMusica);
    // Método que devuelve un objeto en base a su ID
    public Musica findById(Integer id);
    // Método que modifica un objeto en la BBDD en base a su ID
    public Musica updateById(Integer id, Musica objMusica);
    // Método que elimina un objeto en la BBDD en base a su ID
    public Boolean deleteById(Integer id);
}
