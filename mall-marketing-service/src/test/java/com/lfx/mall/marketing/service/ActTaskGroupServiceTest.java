package com.lfx.mall.marketing.service;

import com.lfx.mall.marketing.service.base.AbstractSpringTest;
import com.lfx.mall.marketing.service.base.request.IdRequest;
import com.lfx.mall.marketing.service.request.ActTaskGroupPageRequest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author <a href="mailto:linfx@dydf.cn">linfuxin</a>
 * @date 2020-05-22 14:17:12
 */
public class ActTaskGroupServiceTest extends AbstractSpringTest {

    @Autowired
    private ActTaskGroupService service;

    @Test
    public void get() {
        System.out.println(toJsonStr(service.get(IdRequest.of(1)),true));
    }

    @Test
    public void page() {
        ActTaskGroupPageRequest request = readJsonFile("group-page.json", ActTaskGroupPageRequest.class);
        System.out.println(toJsonStr(service.page(request),true));
    }

}