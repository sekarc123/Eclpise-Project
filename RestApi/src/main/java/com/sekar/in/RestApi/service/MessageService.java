package com.sekar.in.RestApi.service;

import java.util.ArrayList;
import java.util.List;

import com.sekar.in.RestApi.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		
		Message m1 = new Message(1, "Hello World", "sekar");
		Message m2 = new Message(2, "Hello Jersy", "prakesh");
		
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}

	public Message getMessages(long id) {
		// TODO Auto-generated method stub
		Message m3 = new Message(1, "Hello World", "sekar");
		Message m4 = new Message(2, "Hello World", "prakesh");
		Message m5 = null;
//		return m3;
		if (id == 1){
			return m3;
		}
		else if(id == 2){
			return m4;
		}
		return m5;

}
}
