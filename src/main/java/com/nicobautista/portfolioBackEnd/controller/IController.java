package com.nicobautista.portfolioBackEnd.controller;

import java.util.List;

public interface IController {
    
    public List<Object> get(Integer Id);
    
    public void add(Object obj);
    
    
    public void edit(Object obj);
    
    
    public void erase(Integer Id);
}
