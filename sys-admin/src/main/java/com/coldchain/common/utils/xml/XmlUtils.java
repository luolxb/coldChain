package com.coldchain.common.utils.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Xml解析工具类
 */
public class XmlUtils {

    /**
     * 将XML转为指定的POJO对象
     *
     * @param clazz  需要转换的类
     * @param xmlStr xml数据
     * @return
     * @throws Exception
     */
    public static Object xmlStrToObject(Class<?> clazz, String xmlStr) throws Exception {
        Object xmlObject = null;
        Reader reader = null;
        // 利用JAXBContext将类转为一个实例
        JAXBContext context = JAXBContext.newInstance(clazz);
        // XMl 转为对象的接口
        Unmarshaller unmarshaller = context.createUnmarshaller();
        reader = new StringReader(xmlStr);
        xmlObject = unmarshaller.unmarshal(reader);
        if (reader != null) {
            reader.close();
        }
        return xmlObject;
    }

    /**
     * 对象转xml字符串
     *
     * @param obj
     * @param load
     * @return
     */
    public static String objectToXmlStr(Object obj, Class<?> load) {
        String result = "";
        try {
            JAXBContext context = JAXBContext.newInstance(load);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "GBK");
            StringWriter writer = new StringWriter();
            marshaller.marshal(obj, writer);
            result = writer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
