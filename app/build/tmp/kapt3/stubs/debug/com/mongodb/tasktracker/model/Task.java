package com.mongodb.tasktracker.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u0004R\u0012\u0010\u0012\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/mongodb/tasktracker/model/Task;", "Lio/realm/RealmObject;", "_name", "", "(Ljava/lang/String;)V", "id", "Lorg/bson/types/ObjectId;", "getId", "()Lorg/bson/types/ObjectId;", "setId", "(Lorg/bson/types/ObjectId;)V", "name", "getName", "()Ljava/lang/String;", "setName", "owner", "getOwner", "setOwner", "status", "value", "Lcom/mongodb/tasktracker/model/TaskStatus;", "statusEnum", "getStatusEnum", "()Lcom/mongodb/tasktracker/model/TaskStatus;", "setStatusEnum", "(Lcom/mongodb/tasktracker/model/TaskStatus;)V", "app_debug"})
public class Task extends io.realm.RealmObject {
    @org.jetbrains.annotations.NotNull
    @io.realm.annotations.RealmField(value = "_id")
    @io.realm.annotations.PrimaryKey
    private org.bson.types.ObjectId id;
    @org.jetbrains.annotations.NotNull
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable
    private java.lang.String owner;
    @io.realm.annotations.Required
    private java.lang.String status;
    
    public Task() {
        super();
    }
    
    public Task(@org.jetbrains.annotations.NotNull
    java.lang.String _name) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.bson.types.ObjectId getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull
    org.bson.types.ObjectId p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOwner() {
        return null;
    }
    
    public final void setOwner(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.mongodb.tasktracker.model.TaskStatus getStatusEnum() {
        return null;
    }
    
    public final void setStatusEnum(@org.jetbrains.annotations.NotNull
    com.mongodb.tasktracker.model.TaskStatus value) {
    }
}