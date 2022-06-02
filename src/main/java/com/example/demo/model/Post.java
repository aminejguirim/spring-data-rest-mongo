package com.example.demo.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@RequiredArgsConstructor
@Document(collection = "posts")
public class Post {

      @Id
      private String id;
      @NonNull
      private String name;
      @NonNull
      private String content;
      @NonNull
      private Date date;

      // getters and setters

}