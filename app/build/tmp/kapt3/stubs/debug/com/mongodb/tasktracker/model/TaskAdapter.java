package com.mongodb.tasktracker.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0018\u00010\u0003R\u00020\u00000\u0001:\u0001\u001cB#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001c\u0010\u0013\u001a\u00020\u000e2\n\u0010\u0014\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001d"}, d2 = {"Lcom/mongodb/tasktracker/model/TaskAdapter;", "Lio/realm/RealmRecyclerViewAdapter;", "Lcom/mongodb/tasktracker/model/Task;", "Lcom/mongodb/tasktracker/model/TaskAdapter$TaskViewHolder;", "data", "Lio/realm/OrderedRealmCollection;", "user", "Lio/realm/mongodb/User;", "partition", "", "(Lio/realm/OrderedRealmCollection;Lio/realm/mongodb/User;Ljava/lang/String;)V", "getUser", "()Lio/realm/mongodb/User;", "changeStatus", "", "status", "Lcom/mongodb/tasktracker/model/TaskStatus;", "id", "Lorg/bson/types/ObjectId;", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeAt", "TaskViewHolder", "app_debug"})
public final class TaskAdapter extends io.realm.RealmRecyclerViewAdapter<com.mongodb.tasktracker.model.Task, com.mongodb.tasktracker.model.TaskAdapter.TaskViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final io.realm.mongodb.User user = null;
    private final java.lang.String partition = null;
    
    public TaskAdapter(@org.jetbrains.annotations.NotNull
    io.realm.OrderedRealmCollection<com.mongodb.tasktracker.model.Task> data, @org.jetbrains.annotations.NotNull
    io.realm.mongodb.User user, @org.jetbrains.annotations.NotNull
    java.lang.String partition) {
        super(null, false);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.realm.mongodb.User getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.mongodb.tasktracker.model.TaskAdapter.TaskViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.mongodb.tasktracker.model.TaskAdapter.TaskViewHolder holder, int position) {
    }
    
    private final void changeStatus(com.mongodb.tasktracker.model.TaskStatus status, org.bson.types.ObjectId id) {
    }
    
    private final void removeAt(org.bson.types.ObjectId id) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lcom/mongodb/tasktracker/model/TaskAdapter$TaskViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/mongodb/tasktracker/model/TaskAdapter;Landroid/view/View;)V", "data", "Lcom/mongodb/tasktracker/model/Task;", "getData", "()Lcom/mongodb/tasktracker/model/Task;", "setData", "(Lcom/mongodb/tasktracker/model/Task;)V", "menu", "Landroid/widget/TextView;", "getMenu", "()Landroid/widget/TextView;", "setMenu", "(Landroid/widget/TextView;)V", "name", "getName", "setName", "status", "getStatus", "setStatus", "app_debug"})
    public final class TaskViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView name;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView status;
        @org.jetbrains.annotations.Nullable
        private com.mongodb.tasktracker.model.Task data;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView menu;
        
        public TaskViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getStatus() {
            return null;
        }
        
        public final void setStatus(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.mongodb.tasktracker.model.Task getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable
        com.mongodb.tasktracker.model.Task p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getMenu() {
            return null;
        }
        
        public final void setMenu(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
    }
}