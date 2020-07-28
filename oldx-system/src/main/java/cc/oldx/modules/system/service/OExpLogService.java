package cc.oldx.modules.system.service;

import cc.oldx.common.utils.PageUtils;
import cc.oldx.mbg.domain.OExpLogEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 
 *
 * @author moli
 * @email 974751082@qq.com
 * @date 2020-07-28 21:57:52
 */
public interface OExpLogService extends IService<OExpLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

