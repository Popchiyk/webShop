package com.company;

import com.company.entity.Role;
import com.company.entity.User;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        String filepath = "result.xml";
        User user = new User();
        Role role = new Role(2,"admin");
        User userAdd = new User(4,"roman2","roman2","roman2@chnu", Date.valueOf("2022-04-05"),
                Date.valueOf("2022-04-05"),"+380996440686",new ArrayList<Role>(
                Collections.singletonList(role.getById(1))
        ));
                //)
//        try {
//            JAXBContext context = JAXBContext.newInstance(User.class);
//            Marshaller marshaller = context.createMarshaller();
//            Unmarshaller un = context.createUnmarshaller();
//            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//            marshaller.marshal(user.getAll(),new File(filepath));
//           User unmarshal = (User) un.unmarshal(new File(filepath));
//            System.out.println(unmarshal.toString());
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }
//        user.delete(4);
        //user.add(userAdd);
//        ObjectMapper om = new ObjectMapper();
//        List<User> users = user.getAll();
//        File file = new File("result.json");
//        if(!file.exists()){
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE); //turn off everything
//        om.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY); // only use fields
//        om.writeValue(file,users);
//
//        JavaType type = om.getTypeFactory().constructCollectionType(List.class,User.class);
//        List<User> user1s =  om.readValue(file,type);
//        System.out.println(user1s);

    }
}
