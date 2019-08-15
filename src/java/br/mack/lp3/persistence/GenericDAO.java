/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.lp3.persistence;

import java.util.List;

/**
 *
 * @author 41526740
 */
public interface GenericDAO<E> {
    public void create(E e);
    
    public List<E> readAll(long id);
    public E readById(long id);
    
    public void update(E e);
    
    public void delete(E e);
}
