package io.realm;


public interface com_mongodb_tasktracker_model_UserRealmProxyInterface {
    public String realmGet$id();
    public void realmSet$id(String value);
    public String realmGet$userId();
    public void realmSet$userId(String value);
    public String realmGet$username();
    public void realmSet$username(String value);
    public String realmGet$password();
    public void realmSet$password(String value);
    public String realmGet$role();
    public void realmSet$role(String value);
    public com.mongodb.tasktracker.model.UserDetails realmGet$details();
    public void realmSet$details(com.mongodb.tasktracker.model.UserDetails value);
    public RealmList<com.mongodb.tasktracker.model.Project> realmGet$memberOf();
    public void realmSet$memberOf(RealmList<com.mongodb.tasktracker.model.Project> value);
}
