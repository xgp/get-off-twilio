package com.openmarket.sms.v4;

import com.openmarket.sms.v4.mt.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class MarshallTestMain {

  public static void main(String[] argv) throws Exception {
    MobileTerminate mt = new MobileTerminate();
    MessageDestination dest = new MessageDestination();
    dest.setAddress("12515550100");
    mt.setDestination(dest);
    Message msg = new Message();
    msg.setType("text");
    msg.setContent("Hello");
    mt.setMessage(msg);
    
    JAXBContext context = JAXBContext.newInstance(MobileTerminate.class);
    Marshaller mar = context.createMarshaller();
    mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
    mar.marshal(mt, System.out);
  }

}
