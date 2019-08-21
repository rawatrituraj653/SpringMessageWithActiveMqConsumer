package com.msg.broker.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.msg.broker.producer.Employee;
@Component
//@EnableJms
public class MsgReciever {

	
	@JmsListener(destination = "my-app")
	public void readMyMsg(Message message) throws JMSException {
		if(message instanceof  TextMessage) {
			TextMessage message2=(TextMessage) message;
			System.out.println("from consumer application");
			System.out.println(message2.getText());
			
		}
		else if(message instanceof ObjectMessage) {
			System.out.println("comes from object msg");
			ObjectMessage  message1=(ObjectMessage) message;
			Employee employee= (Employee) message1.getObject();
			System.out.println(employee);
		}	
		
	}
	
}
