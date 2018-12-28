package cn.gree.lwh.Impl;

import cn.gree.lwh.service.commonService;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.stereotype.Service;

/**
 * Created by 260175 on 2018/8/24.
 * Author:JackLee -李文华
 * Email：18173910487@163.com
 * 描述：
 */
@Service
public class commonServiceImpl implements commonService {

    public Object getCommon(String myArray) throws Exception {
        String address = "";
        JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
        Client client = factory.createClient(address);
        String result = (String) client.invoke("getLocationByCode",/*"gzbh001925-008"*/myArray)[0];

        return result;
    }
}
