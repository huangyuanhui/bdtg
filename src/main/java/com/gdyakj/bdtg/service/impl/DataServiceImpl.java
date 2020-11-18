package com.gdyakj.bdtg.service.impl;

import com.gdyakj.bdtg.bean.InfoMessage;
import com.gdyakj.bdtg.bean.PageResult;
import com.gdyakj.bdtg.dao.DataDao;
import com.gdyakj.bdtg.service.DataService;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private DataDao dataDao;

    @Override
    public void saveData(InfoMessage infoMessage) {
        try {
            infoMessage.setCreateTime(new Date());
            dataDao.insertData(infoMessage);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public PageResult pageInfo(int pageSize, int currentPage) {
        try {
            // 开始分页 这种写法最合适 因为分页插件只会加在紧随其后的第一个sql语句
            PageInfo<InfoMessage> pageInfo = PageHelper.startPage(currentPage, pageSize)
                    .doSelectPageInfo(new ISelect() {
                        @Override
                        public void doSelect() {
                            dataDao.findAll();
                        }
                    });
            return new PageResult(pageInfo.getPages(), pageInfo.getList());
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
