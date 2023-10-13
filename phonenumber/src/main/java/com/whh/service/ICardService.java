package com.whh.service;

public interface ICardService {
    String get(String tele);
    Boolean check(String tele,String code);
}
