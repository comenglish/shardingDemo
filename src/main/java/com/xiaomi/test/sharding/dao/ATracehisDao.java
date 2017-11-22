package com.xiaomi.test.sharding.dao;

import com.xiaomi.test.sharding.entity.ATracehis;
import com.xiaomi.test.sharding.entity.ATracehisExample;

import java.util.List;

public interface ATracehisDao {

    List<ATracehis> selectByExample(ATracehisExample example);

}