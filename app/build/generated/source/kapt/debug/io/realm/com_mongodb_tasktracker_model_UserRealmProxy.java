package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.NativeContext;
import io.realm.internal.OsList;
import io.realm.internal.OsMap;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSet;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_mongodb_tasktracker_model_UserRealmProxy extends com.mongodb.tasktracker.model.User
    implements RealmObjectProxy, com_mongodb_tasktracker_model_UserRealmProxyInterface {

    static final class UserColumnInfo extends ColumnInfo {
        long idColKey;
        long userIdColKey;
        long usernameColKey;
        long passwordColKey;
        long roleColKey;
        long detailsColKey;
        long memberOfColKey;

        UserColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("User");
            this.idColKey = addColumnDetails("id", "_id", objectSchemaInfo);
            this.userIdColKey = addColumnDetails("userId", "userId", objectSchemaInfo);
            this.usernameColKey = addColumnDetails("username", "username", objectSchemaInfo);
            this.passwordColKey = addColumnDetails("password", "password", objectSchemaInfo);
            this.roleColKey = addColumnDetails("role", "role", objectSchemaInfo);
            this.detailsColKey = addColumnDetails("details", "details", objectSchemaInfo);
            this.memberOfColKey = addColumnDetails("memberOf", "memberOf", objectSchemaInfo);
        }

        UserColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UserColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UserColumnInfo src = (UserColumnInfo) rawSrc;
            final UserColumnInfo dst = (UserColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.userIdColKey = src.userIdColKey;
            dst.usernameColKey = src.usernameColKey;
            dst.passwordColKey = src.passwordColKey;
            dst.roleColKey = src.roleColKey;
            dst.detailsColKey = src.detailsColKey;
            dst.memberOfColKey = src.memberOfColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private UserColumnInfo columnInfo;
    private ProxyState<com.mongodb.tasktracker.model.User> proxyState;
    private RealmList<com.mongodb.tasktracker.model.Project> memberOfRealmList;

    com_mongodb_tasktracker_model_UserRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UserColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.mongodb.tasktracker.model.User>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idColKey);
    }

    @Override
    public void realmSet$id(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userIdColKey);
    }

    @Override
    public void realmSet$userId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'userId' to null.");
            }
            row.getTable().setString(columnInfo.userIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'userId' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.userIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$username() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.usernameColKey);
    }

    @Override
    public void realmSet$username(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'username' to null.");
            }
            row.getTable().setString(columnInfo.usernameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'username' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.usernameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$password() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.passwordColKey);
    }

    @Override
    public void realmSet$password(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'password' to null.");
            }
            row.getTable().setString(columnInfo.passwordColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'password' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.passwordColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$role() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.roleColKey);
    }

    @Override
    public void realmSet$role(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'role' to null.");
            }
            row.getTable().setString(columnInfo.roleColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'role' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.roleColKey, value);
    }

    @Override
    public com.mongodb.tasktracker.model.UserDetails realmGet$details() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.detailsColKey)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.mongodb.tasktracker.model.UserDetails.class, proxyState.getRow$realm().getLink(columnInfo.detailsColKey), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$details(com.mongodb.tasktracker.model.UserDetails value) {
        Realm realm = (Realm) proxyState.getRealm$realm();
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("details")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = realm.copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.detailsColKey);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.detailsColKey, row.getObjectKey(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.detailsColKey);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.detailsColKey, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    @Override
    public RealmList<com.mongodb.tasktracker.model.Project> realmGet$memberOf() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (memberOfRealmList != null) {
            return memberOfRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.memberOfColKey);
            memberOfRealmList = new RealmList<com.mongodb.tasktracker.model.Project>(com.mongodb.tasktracker.model.Project.class, osList, proxyState.getRealm$realm());
            return memberOfRealmList;
        }
    }

    @Override
    public void realmSet$memberOf(RealmList<com.mongodb.tasktracker.model.Project> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("memberOf")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.mongodb.tasktracker.model.Project> original = value;
                value = new RealmList<com.mongodb.tasktracker.model.Project>();
                for (com.mongodb.tasktracker.model.Project item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.memberOfColKey);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.mongodb.tasktracker.model.Project linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.setRow(i, ((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        } else {
            osList.removeAll();
            if (value == null) {
                return;
            }
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.mongodb.tasktracker.model.Project linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "User", false, 7, 0);
        builder.addPersistedProperty("id", "_id", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "userId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "username", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "password", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "role", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty(NO_ALIAS, "details", RealmFieldType.OBJECT, "UserDetails");
        builder.addPersistedLinkProperty(NO_ALIAS, "memberOf", RealmFieldType.LIST, "Project");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new UserColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "User";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "User";
    }

    @SuppressWarnings("cast")
    public static com.mongodb.tasktracker.model.User createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        com.mongodb.tasktracker.model.User obj = null;
        if (update) {
            Table table = realm.getTable(com.mongodb.tasktracker.model.User.class);
            UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.User.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                objKey = table.findFirstString(pkColumnKey, json.getString("id"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.User.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_mongodb_tasktracker_model_UserRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("details")) {
                excludeFields.add("details");
            }
            if (json.has("memberOf")) {
                excludeFields.add("memberOf");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_mongodb_tasktracker_model_UserRealmProxy) realm.createObjectInternal(com.mongodb.tasktracker.model.User.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_mongodb_tasktracker_model_UserRealmProxy) realm.createObjectInternal(com.mongodb.tasktracker.model.User.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_mongodb_tasktracker_model_UserRealmProxyInterface objProxy = (com_mongodb_tasktracker_model_UserRealmProxyInterface) obj;
        if (json.has("userId")) {
            if (json.isNull("userId")) {
                objProxy.realmSet$userId(null);
            } else {
                objProxy.realmSet$userId((String) json.getString("userId"));
            }
        }
        if (json.has("username")) {
            if (json.isNull("username")) {
                objProxy.realmSet$username(null);
            } else {
                objProxy.realmSet$username((String) json.getString("username"));
            }
        }
        if (json.has("password")) {
            if (json.isNull("password")) {
                objProxy.realmSet$password(null);
            } else {
                objProxy.realmSet$password((String) json.getString("password"));
            }
        }
        if (json.has("role")) {
            if (json.isNull("role")) {
                objProxy.realmSet$role(null);
            } else {
                objProxy.realmSet$role((String) json.getString("role"));
            }
        }
        if (json.has("details")) {
            if (json.isNull("details")) {
                objProxy.realmSet$details(null);
            } else {
                com.mongodb.tasktracker.model.UserDetails detailsObj = com_mongodb_tasktracker_model_UserDetailsRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("details"), update);
                objProxy.realmSet$details(detailsObj);
            }
        }
        if (json.has("memberOf")) {
            if (json.isNull("memberOf")) {
                objProxy.realmSet$memberOf(null);
            } else {
                objProxy.realmGet$memberOf().clear();
                JSONArray array = json.getJSONArray("memberOf");
                for (int i = 0; i < array.length(); i++) {
                    com_mongodb_tasktracker_model_ProjectRealmProxy.createOrUpdateEmbeddedUsingJsonObject(realm, (RealmModel)objProxy, "memberOf", array.getJSONObject(i), update);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.mongodb.tasktracker.model.User createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.mongodb.tasktracker.model.User obj = new com.mongodb.tasktracker.model.User();
        final com_mongodb_tasktracker_model_UserRealmProxyInterface objProxy = (com_mongodb_tasktracker_model_UserRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("userId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userId(null);
                }
            } else if (name.equals("username")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$username((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$username(null);
                }
            } else if (name.equals("password")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$password((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$password(null);
                }
            } else if (name.equals("role")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$role((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$role(null);
                }
            } else if (name.equals("details")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$details(null);
                } else {
                    com.mongodb.tasktracker.model.UserDetails detailsObj = com_mongodb_tasktracker_model_UserDetailsRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$details(detailsObj);
                }
            } else if (name.equals("memberOf")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$memberOf(null);
                } else {
                    objProxy.realmSet$memberOf(new RealmList<com.mongodb.tasktracker.model.Project>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.mongodb.tasktracker.model.Project item = com_mongodb_tasktracker_model_ProjectRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$memberOf().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealmOrUpdate(obj);
    }

    static com_mongodb_tasktracker_model_UserRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.User.class), false, Collections.<String>emptyList());
        io.realm.com_mongodb_tasktracker_model_UserRealmProxy obj = new io.realm.com_mongodb_tasktracker_model_UserRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.mongodb.tasktracker.model.User copyOrUpdate(Realm realm, UserColumnInfo columnInfo, com.mongodb.tasktracker.model.User object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.mongodb.tasktracker.model.User) cachedRealmObject;
        }

        com.mongodb.tasktracker.model.User realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.mongodb.tasktracker.model.User.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = table.findFirstString(pkColumnKey, ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$id());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_mongodb_tasktracker_model_UserRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.mongodb.tasktracker.model.User copy(Realm realm, UserColumnInfo columnInfo, com.mongodb.tasktracker.model.User newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.mongodb.tasktracker.model.User) cachedRealmObject;
        }

        com_mongodb_tasktracker_model_UserRealmProxyInterface unmanagedSource = (com_mongodb_tasktracker_model_UserRealmProxyInterface) newObject;

        Table table = realm.getTable(com.mongodb.tasktracker.model.User.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addString(columnInfo.userIdColKey, unmanagedSource.realmGet$userId());
        builder.addString(columnInfo.usernameColKey, unmanagedSource.realmGet$username());
        builder.addString(columnInfo.passwordColKey, unmanagedSource.realmGet$password());
        builder.addString(columnInfo.roleColKey, unmanagedSource.realmGet$role());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_mongodb_tasktracker_model_UserRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        com.mongodb.tasktracker.model.UserDetails detailsObj = unmanagedSource.realmGet$details();
        if (detailsObj == null) {
            managedCopy.realmSet$details(null);
        } else {
            com.mongodb.tasktracker.model.UserDetails cachedetails = (com.mongodb.tasktracker.model.UserDetails) cache.get(detailsObj);
            if (cachedetails != null) {
                managedCopy.realmSet$details(cachedetails);
            } else {
                managedCopy.realmSet$details(com_mongodb_tasktracker_model_UserDetailsRealmProxy.copyOrUpdate(realm, (com_mongodb_tasktracker_model_UserDetailsRealmProxy.UserDetailsColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.UserDetails.class), detailsObj, update, cache, flags));
            }
        }

        RealmList<com.mongodb.tasktracker.model.Project> memberOfUnmanagedList = unmanagedSource.realmGet$memberOf();
        if (memberOfUnmanagedList != null) {
            RealmList<com.mongodb.tasktracker.model.Project> memberOfManagedList = managedCopy.realmGet$memberOf();
            memberOfManagedList.clear();
            for (int i = 0; i < memberOfUnmanagedList.size(); i++) {
                com.mongodb.tasktracker.model.Project memberOfUnmanagedItem = memberOfUnmanagedList.get(i);
                com.mongodb.tasktracker.model.Project cachememberOf = (com.mongodb.tasktracker.model.Project) cache.get(memberOfUnmanagedItem);
                if (cachememberOf != null) {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachememberOf.toString()");
                } else {
                    long objKey = memberOfManagedList.getOsList().createAndAddEmbeddedObject();
                    Row linkedObjectRow = realm.getTable(com.mongodb.tasktracker.model.Project.class).getUncheckedRow(objKey);
                    com.mongodb.tasktracker.model.Project linkedObject = com_mongodb_tasktracker_model_ProjectRealmProxy.newProxyInstance(realm, linkedObjectRow);
                    cache.put(memberOfUnmanagedItem, (RealmObjectProxy) linkedObject);
                    com_mongodb_tasktracker_model_ProjectRealmProxy.updateEmbeddedObject(realm, memberOfUnmanagedItem, linkedObject, new HashMap<RealmModel, RealmObjectProxy>(), Collections.EMPTY_SET);
                }
            }
        }

        return managedCopy;
    }

    public static long insert(Realm realm, com.mongodb.tasktracker.model.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.mongodb.tasktracker.model.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.User.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, (String)primaryKeyValue);
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$userId = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIdColKey, objKey, realmGet$userId, false);
        }
        String realmGet$username = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$username();
        if (realmGet$username != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.usernameColKey, objKey, realmGet$username, false);
        }
        String realmGet$password = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$password();
        if (realmGet$password != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwordColKey, objKey, realmGet$password, false);
        }
        String realmGet$role = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$role();
        if (realmGet$role != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.roleColKey, objKey, realmGet$role, false);
        }

        com.mongodb.tasktracker.model.UserDetails detailsObj = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$details();
        if (detailsObj != null) {
            Long cachedetails = cache.get(detailsObj);
            if (cachedetails == null) {
                cachedetails = com_mongodb_tasktracker_model_UserDetailsRealmProxy.insert(realm, detailsObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.detailsColKey, objKey, cachedetails, false);
        }

        RealmList<com.mongodb.tasktracker.model.Project> memberOfList = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$memberOf();
        if (memberOfList != null) {
            OsList memberOfOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.memberOfColKey);
            for (com.mongodb.tasktracker.model.Project memberOfItem : memberOfList) {
                Long cacheItemIndexmemberOf = cache.get(memberOfItem);
                if (cacheItemIndexmemberOf != null) {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + cacheItemIndexmemberOf.toString());
                } else {
                    cacheItemIndexmemberOf = com_mongodb_tasktracker_model_ProjectRealmProxy.insert(realm, table, columnInfo.memberOfColKey, objKey, memberOfItem, cache);
                }
            }
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.mongodb.tasktracker.model.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.User.class);
        long pkColumnKey = columnInfo.idColKey;
        com.mongodb.tasktracker.model.User object = null;
        while (objects.hasNext()) {
            object = (com.mongodb.tasktracker.model.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, (String)primaryKeyValue);
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$userId = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userIdColKey, objKey, realmGet$userId, false);
            }
            String realmGet$username = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$username();
            if (realmGet$username != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.usernameColKey, objKey, realmGet$username, false);
            }
            String realmGet$password = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$password();
            if (realmGet$password != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passwordColKey, objKey, realmGet$password, false);
            }
            String realmGet$role = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$role();
            if (realmGet$role != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.roleColKey, objKey, realmGet$role, false);
            }

            com.mongodb.tasktracker.model.UserDetails detailsObj = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$details();
            if (detailsObj != null) {
                Long cachedetails = cache.get(detailsObj);
                if (cachedetails == null) {
                    cachedetails = com_mongodb_tasktracker_model_UserDetailsRealmProxy.insert(realm, detailsObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.detailsColKey, objKey, cachedetails, false);
            }

            RealmList<com.mongodb.tasktracker.model.Project> memberOfList = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$memberOf();
            if (memberOfList != null) {
                OsList memberOfOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.memberOfColKey);
                for (com.mongodb.tasktracker.model.Project memberOfItem : memberOfList) {
                    Long cacheItemIndexmemberOf = cache.get(memberOfItem);
                    if (cacheItemIndexmemberOf != null) {
                        throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + cacheItemIndexmemberOf.toString());
                    } else {
                        cacheItemIndexmemberOf = com_mongodb_tasktracker_model_ProjectRealmProxy.insert(realm, table, columnInfo.memberOfColKey, objKey, memberOfItem, cache);
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.mongodb.tasktracker.model.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.mongodb.tasktracker.model.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.User.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, (String)primaryKeyValue);
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$userId = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIdColKey, objKey, realmGet$userId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userIdColKey, objKey, false);
        }
        String realmGet$username = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$username();
        if (realmGet$username != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.usernameColKey, objKey, realmGet$username, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.usernameColKey, objKey, false);
        }
        String realmGet$password = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$password();
        if (realmGet$password != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwordColKey, objKey, realmGet$password, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.passwordColKey, objKey, false);
        }
        String realmGet$role = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$role();
        if (realmGet$role != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.roleColKey, objKey, realmGet$role, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.roleColKey, objKey, false);
        }

        com.mongodb.tasktracker.model.UserDetails detailsObj = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$details();
        if (detailsObj != null) {
            Long cachedetails = cache.get(detailsObj);
            if (cachedetails == null) {
                cachedetails = com_mongodb_tasktracker_model_UserDetailsRealmProxy.insertOrUpdate(realm, detailsObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.detailsColKey, objKey, cachedetails, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.detailsColKey, objKey);
        }

        OsList memberOfOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.memberOfColKey);
        RealmList<com.mongodb.tasktracker.model.Project> memberOfList = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$memberOf();
        memberOfOsList.removeAll();
        if (memberOfList != null) {
            for (com.mongodb.tasktracker.model.Project memberOfItem : memberOfList) {
                Long cacheItemIndexmemberOf = cache.get(memberOfItem);
                if (cacheItemIndexmemberOf != null) {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + cacheItemIndexmemberOf.toString());
                } else {
                    cacheItemIndexmemberOf = com_mongodb_tasktracker_model_ProjectRealmProxy.insertOrUpdate(realm, table, columnInfo.memberOfColKey, objKey, memberOfItem, cache);
                }
            }
        }

        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.mongodb.tasktracker.model.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.User.class);
        long pkColumnKey = columnInfo.idColKey;
        com.mongodb.tasktracker.model.User object = null;
        while (objects.hasNext()) {
            object = (com.mongodb.tasktracker.model.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, (String)primaryKeyValue);
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$userId = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userIdColKey, objKey, realmGet$userId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userIdColKey, objKey, false);
            }
            String realmGet$username = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$username();
            if (realmGet$username != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.usernameColKey, objKey, realmGet$username, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.usernameColKey, objKey, false);
            }
            String realmGet$password = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$password();
            if (realmGet$password != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passwordColKey, objKey, realmGet$password, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.passwordColKey, objKey, false);
            }
            String realmGet$role = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$role();
            if (realmGet$role != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.roleColKey, objKey, realmGet$role, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.roleColKey, objKey, false);
            }

            com.mongodb.tasktracker.model.UserDetails detailsObj = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$details();
            if (detailsObj != null) {
                Long cachedetails = cache.get(detailsObj);
                if (cachedetails == null) {
                    cachedetails = com_mongodb_tasktracker_model_UserDetailsRealmProxy.insertOrUpdate(realm, detailsObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.detailsColKey, objKey, cachedetails, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.detailsColKey, objKey);
            }

            OsList memberOfOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.memberOfColKey);
            RealmList<com.mongodb.tasktracker.model.Project> memberOfList = ((com_mongodb_tasktracker_model_UserRealmProxyInterface) object).realmGet$memberOf();
            memberOfOsList.removeAll();
            if (memberOfList != null) {
                for (com.mongodb.tasktracker.model.Project memberOfItem : memberOfList) {
                    Long cacheItemIndexmemberOf = cache.get(memberOfItem);
                    if (cacheItemIndexmemberOf != null) {
                        throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + cacheItemIndexmemberOf.toString());
                    } else {
                        cacheItemIndexmemberOf = com_mongodb_tasktracker_model_ProjectRealmProxy.insertOrUpdate(realm, table, columnInfo.memberOfColKey, objKey, memberOfItem, cache);
                    }
                }
            }

        }
    }

    public static com.mongodb.tasktracker.model.User createDetachedCopy(com.mongodb.tasktracker.model.User realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.mongodb.tasktracker.model.User unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.mongodb.tasktracker.model.User();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.mongodb.tasktracker.model.User) cachedObject.object;
            }
            unmanagedObject = (com.mongodb.tasktracker.model.User) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_mongodb_tasktracker_model_UserRealmProxyInterface unmanagedCopy = (com_mongodb_tasktracker_model_UserRealmProxyInterface) unmanagedObject;
        com_mongodb_tasktracker_model_UserRealmProxyInterface realmSource = (com_mongodb_tasktracker_model_UserRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$userId(realmSource.realmGet$userId());
        unmanagedCopy.realmSet$username(realmSource.realmGet$username());
        unmanagedCopy.realmSet$password(realmSource.realmGet$password());
        unmanagedCopy.realmSet$role(realmSource.realmGet$role());

        // Deep copy of details
        unmanagedCopy.realmSet$details(com_mongodb_tasktracker_model_UserDetailsRealmProxy.createDetachedCopy(realmSource.realmGet$details(), currentDepth + 1, maxDepth, cache));

        // Deep copy of memberOf
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$memberOf(null);
        } else {
            RealmList<com.mongodb.tasktracker.model.Project> managedmemberOfList = realmSource.realmGet$memberOf();
            RealmList<com.mongodb.tasktracker.model.Project> unmanagedmemberOfList = new RealmList<com.mongodb.tasktracker.model.Project>();
            unmanagedCopy.realmSet$memberOf(unmanagedmemberOfList);
            int nextDepth = currentDepth + 1;
            int size = managedmemberOfList.size();
            for (int i = 0; i < size; i++) {
                com.mongodb.tasktracker.model.Project item = com_mongodb_tasktracker_model_ProjectRealmProxy.createDetachedCopy(managedmemberOfList.get(i), nextDepth, maxDepth, cache);
                unmanagedmemberOfList.add(item);
            }
        }

        return unmanagedObject;
    }

    static com.mongodb.tasktracker.model.User update(Realm realm, UserColumnInfo columnInfo, com.mongodb.tasktracker.model.User realmObject, com.mongodb.tasktracker.model.User newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_mongodb_tasktracker_model_UserRealmProxyInterface realmObjectTarget = (com_mongodb_tasktracker_model_UserRealmProxyInterface) realmObject;
        com_mongodb_tasktracker_model_UserRealmProxyInterface realmObjectSource = (com_mongodb_tasktracker_model_UserRealmProxyInterface) newObject;
        Table table = realm.getTable(com.mongodb.tasktracker.model.User.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.userIdColKey, realmObjectSource.realmGet$userId());
        builder.addString(columnInfo.usernameColKey, realmObjectSource.realmGet$username());
        builder.addString(columnInfo.passwordColKey, realmObjectSource.realmGet$password());
        builder.addString(columnInfo.roleColKey, realmObjectSource.realmGet$role());

        com.mongodb.tasktracker.model.UserDetails detailsObj = realmObjectSource.realmGet$details();
        if (detailsObj == null) {
            builder.addNull(columnInfo.detailsColKey);
        } else {
            com.mongodb.tasktracker.model.UserDetails cachedetails = (com.mongodb.tasktracker.model.UserDetails) cache.get(detailsObj);
            if (cachedetails != null) {
                builder.addObject(columnInfo.detailsColKey, cachedetails);
            } else {
                builder.addObject(columnInfo.detailsColKey, com_mongodb_tasktracker_model_UserDetailsRealmProxy.copyOrUpdate(realm, (com_mongodb_tasktracker_model_UserDetailsRealmProxy.UserDetailsColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.UserDetails.class), detailsObj, true, cache, flags));
            }
        }

        RealmList<com.mongodb.tasktracker.model.Project> memberOfUnmanagedList = realmObjectSource.realmGet$memberOf();
        if (memberOfUnmanagedList != null) {
            RealmList<com.mongodb.tasktracker.model.Project> memberOfManagedCopy = new RealmList<com.mongodb.tasktracker.model.Project>();
            OsList targetList = realmObjectTarget.realmGet$memberOf().getOsList();
            targetList.deleteAll();
            for (int i = 0; i < memberOfUnmanagedList.size(); i++) {
                com.mongodb.tasktracker.model.Project memberOfUnmanagedItem = memberOfUnmanagedList.get(i);
                com.mongodb.tasktracker.model.Project cachememberOf = (com.mongodb.tasktracker.model.Project) cache.get(memberOfUnmanagedItem);
                if (cachememberOf != null) {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachememberOf.toString()");
                } else {
                    long objKey = targetList.createAndAddEmbeddedObject();
                    Row row = realm.getTable(com.mongodb.tasktracker.model.Project.class).getUncheckedRow(objKey);
                    com.mongodb.tasktracker.model.Project proxyObject = com_mongodb_tasktracker_model_ProjectRealmProxy.newProxyInstance(realm, row);
                    cache.put(memberOfUnmanagedItem, (RealmObjectProxy) proxyObject);
                    memberOfManagedCopy.add(proxyObject);
                    com_mongodb_tasktracker_model_ProjectRealmProxy.updateEmbeddedObject(realm, memberOfUnmanagedItem, proxyObject, new HashMap<RealmModel, RealmObjectProxy>(), Collections.EMPTY_SET);
                }
            }
        } else {
            builder.addObjectList(columnInfo.memberOfColKey, new RealmList<com.mongodb.tasktracker.model.Project>());
        }

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("User = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userId:");
        stringBuilder.append(realmGet$userId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{username:");
        stringBuilder.append(realmGet$username());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{password:");
        stringBuilder.append(realmGet$password());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{role:");
        stringBuilder.append(realmGet$role());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{details:");
        stringBuilder.append(realmGet$details() != null ? "UserDetails" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{memberOf:");
        stringBuilder.append("RealmList<Project>[").append(realmGet$memberOf().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long objKey = proxyState.getRow$realm().getObjectKey();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (objKey ^ (objKey >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_mongodb_tasktracker_model_UserRealmProxy aUser = (com_mongodb_tasktracker_model_UserRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aUser.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aUser.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aUser.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
