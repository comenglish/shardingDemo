package com.xiaomi.test.sharding.service.impl;

import com.xiaomi.test.sharding.dao.ATracehisDao;
import com.xiaomi.test.sharding.entity.ATracehis;
import com.xiaomi.test.sharding.entity.ATracehisExample;
import com.xiaomi.test.sharding.service.ATraceHisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import javax.annotation.Resource;

/**
 * Created by  on 12/8/16.
 */

@Service
public class ATraceHisServiceImpl implements ATraceHisService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ATraceHisServiceImpl.class);

	@Resource
	private ATracehisDao aTracehisDao;

	public ATracehis selectByKey(Long id) {
        LOGGER.info("traceHis pk:{}", id);
		ATracehisExample example=new ATracehisExample();
		example.createCriteria().andSystemRefEqualTo(id);
        List<ATracehis> aTracehis = aTracehisDao.selectByExample(example);
        if(aTracehis!=null&&aTracehis.size()>0){
            return aTracehis.get(0);
        }else{
            return null;
        }
    }
}
