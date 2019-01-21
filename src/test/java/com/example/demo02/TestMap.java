package com.example.demo02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class TestMap {
	@Test
	public void testMap(){
		Map<String,String> map =new HashMap<>();
		map.put("name","gsy");
		map.put("sex","");
		System.out.println(map.get("name")+":"+map.get("sex"));
	}
	@Test
	public void test(){
		HashMap<String,String> map = new HashMap<>();
		map.put("1","11");
		map.put("2","22");
		map.put("3","33");
		String key = "3";
		System.out.println(map.get(key));
        String str = "  he  llo, 1  ";System.out.print(str.trim());
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> a = new HashMap<>();
        a.put("msg", "msg1");

        Map<String, Object> b = new HashMap<>();
        b.put("msg2","msg2");
        b.put("timeout","24");
        Map<String, Object> c = new HashMap<>();
        c.put("msg3","msg3");
        c.put("timeout","2");
        Map<String, Object> d = new HashMap<>();
        d.put("flag","1");
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        System.out.println(list);
	}
	@Test
    public void t(){
	    String str = "尊敬的${custName}客户您好, 为您办理的${pkgName}因余额不足无法办理，请在24小时内登录${url}进行支付,支付金额${payMoney}元";
        str = str.replace("${custName}","谷世宇");
        str = str.replace("${pkgName}","谷");
        str = str.replace("${url}","世");
        str = str.replace("${payMoney}","宇1");
        System.out.println(str);
    }
}
