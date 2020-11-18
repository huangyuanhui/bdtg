package com.gdyakj.bdtg.dao;

import com.gdyakj.bdtg.bean.InfoMessage;

import java.util.List;

public interface DataDao {
    void insertData(InfoMessage infoMessage);

    List<InfoMessage> findAll();
}
