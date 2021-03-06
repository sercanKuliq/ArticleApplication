package com.article.dto;

import com.article.entity.user.User;
import com.article.enumerations.ResponseMessageStatus;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO extends ResponseDTO {

    private List<User> users;
    private User user;

    public UserDTO(Boolean status, String message, ResponseMessageStatus responseMessageStatus, List<User> users) {
        super(status, message, responseMessageStatus);
        this.users = users;
    }

    public UserDTO(Boolean status, String message, ResponseMessageStatus responseMessageStatus, User user) {
        super(status, message, responseMessageStatus);
        this.user = user;
    }

    public UserDTO(Boolean status, String message, ResponseMessageStatus responseMessageStatus) {
        super(status, message, responseMessageStatus);
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
