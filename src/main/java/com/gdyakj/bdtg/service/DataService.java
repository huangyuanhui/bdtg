package com.gdyakj.bdtg.service;

import com.gdyakj.bdtg.bean.InfoMessage;
import com.gdyakj.bdtg.bean.PageResult;

public interface DataService {

    void saveData(InfoMessage infoMessage);

    PageResult pageInfo(int pageSize, int currentPage);
}
