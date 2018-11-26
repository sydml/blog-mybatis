package cn.yml.blog.service.impl;

import cn.yml.blog.dao.SysLogMapper;
import cn.yml.blog.dao.SysViewMapper;
import cn.yml.blog.entity.SysLog;
import cn.yml.blog.entity.SysView;
import cn.yml.blog.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * SysService实现类
 *
 * @author:wmyskxz
 * @create:2018-06-20-下午 20:17
 */
@Component
public class SysServiceImpl implements SysService {

    @Autowired
    SysLogMapper sysLogMapper;
    @Autowired
    SysViewMapper sysViewMapper;


    /**
     * 增加一条日志信息
     *
     * @param sysLog
     */
    @Override
    public void addLog(SysLog sysLog) {
        sysLogMapper.insertSelective(sysLog);
    }

    /**
     * 增加一条访问量
     *
     * @param sysView
     */
    @Override
    public void addView(SysView sysView) {
        sysViewMapper.insertSelective(sysView);
    }

    /**
     * 获取日志的总数量
     *
     * @return 日志的总数量
     */
    @Override
    public int getLogCount() {
        return sysLogMapper.count();
    }

    /**
     * 返回当前网站的访问量
     *
     * @return
     */
    @Override
    public int getViewCount() {
        return sysViewMapper.count();
    }

    /**
     * 返回所有的日志信息
     *
     * @return
     */
    @Override
    public List<SysLog> listAllLog() {
        return sysLogMapper.selectAll();
    }

    /**
     * 返回所有的访问信息
     *
     * @return
     */
    @Override
    public List<SysView> listAllView() {
        return sysViewMapper.selectAll();
    }
}
