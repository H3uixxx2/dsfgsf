package com.mongodb.tasktracker.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0016\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015\u00a8\u0006\""}, d2 = {"Lcom/mongodb/tasktracker/model/User;", "Lio/realm/RealmObject;", "id", "", "userId", "username", "password", "role", "details", "Lcom/mongodb/tasktracker/model/UserDetails;", "memberOf", "Lio/realm/RealmList;", "Lcom/mongodb/tasktracker/model/Project;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mongodb/tasktracker/model/UserDetails;Lio/realm/RealmList;)V", "getDetails", "()Lcom/mongodb/tasktracker/model/UserDetails;", "setDetails", "(Lcom/mongodb/tasktracker/model/UserDetails;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getMemberOf", "()Lio/realm/RealmList;", "setMemberOf", "(Lio/realm/RealmList;)V", "getPassword", "setPassword", "getRole", "setRole", "getUserId", "setUserId", "getUsername", "setUsername", "app_debug"})
public class User extends io.realm.RealmObject {
    @org.jetbrains.annotations.NotNull
    @io.realm.annotations.RealmField(value = "_id")
    @io.realm.annotations.PrimaryKey
    private java.lang.String id;
    @org.jetbrains.annotations.NotNull
    private java.lang.String userId;
    @org.jetbrains.annotations.NotNull
    private java.lang.String username;
    @org.jetbrains.annotations.NotNull
    private java.lang.String password;
    @org.jetbrains.annotations.NotNull
    private java.lang.String role;
    @org.jetbrains.annotations.Nullable
    private com.mongodb.tasktracker.model.UserDetails details;
    @org.jetbrains.annotations.NotNull
    private io.realm.RealmList<com.mongodb.tasktracker.model.Project> memberOf;
    
    public User() {
        super();
    }
    
    public User(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    java.lang.String userId, @org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String role, @org.jetbrains.annotations.Nullable
    com.mongodb.tasktracker.model.UserDetails details, @org.jetbrains.annotations.NotNull
    io.realm.RealmList<com.mongodb.tasktracker.model.Project> memberOf) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRole() {
        return null;
    }
    
    public final void setRole(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.mongodb.tasktracker.model.UserDetails getDetails() {
        return null;
    }
    
    public final void setDetails(@org.jetbrains.annotations.Nullable
    com.mongodb.tasktracker.model.UserDetails p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.realm.RealmList<com.mongodb.tasktracker.model.Project> getMemberOf() {
        return null;
    }
    
    public final void setMemberOf(@org.jetbrains.annotations.NotNull
    io.realm.RealmList<com.mongodb.tasktracker.model.Project> p0) {
    }
}