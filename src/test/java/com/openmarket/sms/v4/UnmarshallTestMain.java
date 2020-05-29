package com.openmarket.sms.v4;

import com.openmarket.sms.v4.mo.*;
import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class UnmarshallTestMain {

  public static void main(String[] argv) throws Exception {
    String moString = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                      "<mobileOriginate submittedDate=\"2015-08-29T15:10:03.029-05:00\" ticketId=\"8514F-01278-17445-23FSJ\" xmlns=\"http://sms.openmarket.com/v4/mo\">\n" +
                      "  <source ton=\"1\" address=\"12125550123\" mobileOperatorId=\"383\"/>\n" +
                      "  <destination ton=\"3\" address=\"222111\"/>\n" +
                      "  <message udh=\"false\" type=\"text\">\n" +
                      "    <content>Hello</content>\n" +
                      "  </message>\n" +
                      "</mobileOriginate>\n";
    System.out.println(moString);
    JAXBContext context = JAXBContext.newInstance(MobileOriginate.class);
    MobileOriginate mo = (MobileOriginate)context.createUnmarshaller()
                     .unmarshal(new StringReader(moString));
    System.out.println("mo->submittedDate: "+mo.getSubmittedDate());
    System.out.println("mo->ticketId: "+mo.getTicketId());
    System.out.println("mo->source->address: "+mo.getSource().getAddress());
    System.out.println("mo->source->ton: "+mo.getSource().getTon());
    System.out.println("mo->source->mobileOperatorId: "+mo.getSource().getMobileOperatorId());
    System.out.println("mo->destination->ton: "+mo.getDestination().getTon());
    System.out.println("mo->destination->address: "+mo.getDestination().getAddress());
    System.out.println("mo->message->udh: "+mo.getMessage().isUdh());
    System.out.println("mo->message->type: "+mo.getMessage().getType());
    System.out.println("mo->message->content: "+mo.getMessage().getContent());
  }
}
