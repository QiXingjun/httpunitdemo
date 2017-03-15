package com.qixingjun.hello;

import com.meterware.httpunit.GetMethodWebRequest;
import com.meterware.httpunit.WebConversation;
import com.meterware.httpunit.WebRequest;
import com.meterware.httpunit.WebResponse;
import com.meterware.servletunit.InvocationContext;
import com.meterware.servletunit.ServletRunner;
import com.meterware.servletunit.ServletUnitClient;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/3/14
 * @Description  HelloWorld的单元测试类
 */
public class HelloWorldTest extends TestCase {

    @Test
    public void testDoGet() throws Exception {
        //建立一个WebConversation实例
        WebConversation webConversation = new WebConversation();
        // 发送请求
        WebRequest request = new GetMethodWebRequest("http://localhost:8080/test/hello");
        try {
            // 获得模拟服务器的信息
            WebResponse response = webConversation.getResponse(request);
            // 断言
            Assert.assertTrue(response.getText().equals("hello world"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}