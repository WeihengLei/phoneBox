package com.phonebox.core.entity;

//import cn.dreamount.core.reactor.component.mongo.AutoDate
//import cn.dreamount.core.reactor.component.mongo.AutoDateStrategy
//import cn.dreamount.core.reactor.component.mongo.GeneratedStrategy
//import cn.dreamount.core.reactor.component.mongo.GeneratedValue
import com.phonebox.core.type.Status;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.*;

@Data
@Document
public class Account {
        @Id
        private String id;
        private String name;
        private String userName;
        private String password;
        private String email;
        private String mobile;

        private Status status;
        private String createBy;
        private String lastUpdateBy;
        private Date createTime;
        private Date lastUpdateTime;
}

