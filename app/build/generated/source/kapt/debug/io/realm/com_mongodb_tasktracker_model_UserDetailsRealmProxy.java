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
public class com_mongodb_tasktracker_model_UserDetailsRealmProxy extends com.mongodb.tasktracker.model.UserDetails
    implements RealmObjectProxy, com_mongodb_tasktracker_model_UserDetailsRealmProxyInterface {

    static final class UserDetailsColumnInfo extends ColumnInfo {
        long nameColKey;
        long emailColKey;

        UserDetailsColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("UserDetails");
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
            this.emailColKey = addColumnDetails("email", "email", objectSchemaInfo);
        }

        UserDetailsColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UserDetailsColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UserDetailsColumnInfo src = (UserDetailsColumnInfo) rawSrc;
            final UserDetailsColumnInfo dst = (UserDetailsColumnInfo) rawDst;
            dst.nameColKey = src.nameColKey;
            dst.emailColKey = src.emailColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private UserDetailsColumnInfo columnInfo;
    private ProxyState<com.mongodb.tasktracker.model.UserDetails> proxyState;

    com_mongodb_tasktracker_model_UserDetailsRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UserDetailsColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.mongodb.tasktracker.model.UserDetails>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameColKey);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
            }
            row.getTable().setString(columnInfo.nameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.nameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$email() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.emailColKey);
    }

    @Override
    public void realmSet$email(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'email' to null.");
            }
            row.getTable().setString(columnInfo.emailColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'email' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.emailColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "UserDetails", false, 2, 0);
        builder.addPersistedProperty(NO_ALIAS, "name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "email", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserDetailsColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new UserDetailsColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "UserDetails";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "UserDetails";
    }

    @SuppressWarnings("cast")
    public static com.mongodb.tasktracker.model.UserDetails createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.mongodb.tasktracker.model.UserDetails obj = realm.createObjectInternal(com.mongodb.tasktracker.model.UserDetails.class, true, excludeFields);

        final com_mongodb_tasktracker_model_UserDetailsRealmProxyInterface objProxy = (com_mongodb_tasktracker_model_UserDetailsRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("email")) {
            if (json.isNull("email")) {
                objProxy.realmSet$email(null);
            } else {
                objProxy.realmSet$email((String) json.getString("email"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.mongodb.tasktracker.model.UserDetails createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.mongodb.tasktracker.model.UserDetails obj = new com.mongodb.tasktracker.model.UserDetails();
        final com_mongodb_tasktracker_model_UserDetailsRealmProxyInterface objProxy = (com_mongodb_tasktracker_model_UserDetailsRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("email")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$email((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$email(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static com_mongodb_tasktracker_model_UserDetailsRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.UserDetails.class), false, Collections.<String>emptyList());
        io.realm.com_mongodb_tasktracker_model_UserDetailsRealmProxy obj = new io.realm.com_mongodb_tasktracker_model_UserDetailsRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.mongodb.tasktracker.model.UserDetails copyOrUpdate(Realm realm, UserDetailsColumnInfo columnInfo, com.mongodb.tasktracker.model.UserDetails object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.mongodb.tasktracker.model.UserDetails) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.mongodb.tasktracker.model.UserDetails copy(Realm realm, UserDetailsColumnInfo columnInfo, com.mongodb.tasktracker.model.UserDetails newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.mongodb.tasktracker.model.UserDetails) cachedRealmObject;
        }

        com_mongodb_tasktracker_model_UserDetailsRealmProxyInterface unmanagedSource = (com_mongodb_tasktracker_model_UserDetailsRealmProxyInterface) newObject;

        Table table = realm.getTable(com.mongodb.tasktracker.model.UserDetails.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.nameColKey, unmanagedSource.realmGet$name());
        builder.addString(columnInfo.emailColKey, unmanagedSource.realmGet$email());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_mongodb_tasktracker_model_UserDetailsRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.mongodb.tasktracker.model.UserDetails object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.mongodb.tasktracker.model.UserDetails.class);
        long tableNativePtr = table.getNativePtr();
        UserDetailsColumnInfo columnInfo = (UserDetailsColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.UserDetails.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$name = ((com_mongodb_tasktracker_model_UserDetailsRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        }
        String realmGet$email = ((com_mongodb_tasktracker_model_UserDetailsRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailColKey, objKey, realmGet$email, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.mongodb.tasktracker.model.UserDetails.class);
        long tableNativePtr = table.getNativePtr();
        UserDetailsColumnInfo columnInfo = (UserDetailsColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.UserDetails.class);
        com.mongodb.tasktracker.model.UserDetails object = null;
        while (objects.hasNext()) {
            object = (com.mongodb.tasktracker.model.UserDetails) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$name = ((com_mongodb_tasktracker_model_UserDetailsRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            }
            String realmGet$email = ((com_mongodb_tasktracker_model_UserDetailsRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailColKey, objKey, realmGet$email, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.mongodb.tasktracker.model.UserDetails object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.mongodb.tasktracker.model.UserDetails.class);
        long tableNativePtr = table.getNativePtr();
        UserDetailsColumnInfo columnInfo = (UserDetailsColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.UserDetails.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$name = ((com_mongodb_tasktracker_model_UserDetailsRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
        }
        String realmGet$email = ((com_mongodb_tasktracker_model_UserDetailsRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailColKey, objKey, realmGet$email, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.emailColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.mongodb.tasktracker.model.UserDetails.class);
        long tableNativePtr = table.getNativePtr();
        UserDetailsColumnInfo columnInfo = (UserDetailsColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.UserDetails.class);
        com.mongodb.tasktracker.model.UserDetails object = null;
        while (objects.hasNext()) {
            object = (com.mongodb.tasktracker.model.UserDetails) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$name = ((com_mongodb_tasktracker_model_UserDetailsRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
            }
            String realmGet$email = ((com_mongodb_tasktracker_model_UserDetailsRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailColKey, objKey, realmGet$email, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.emailColKey, objKey, false);
            }
        }
    }

    public static com.mongodb.tasktracker.model.UserDetails createDetachedCopy(com.mongodb.tasktracker.model.UserDetails realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.mongodb.tasktracker.model.UserDetails unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.mongodb.tasktracker.model.UserDetails();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.mongodb.tasktracker.model.UserDetails) cachedObject.object;
            }
            unmanagedObject = (com.mongodb.tasktracker.model.UserDetails) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_mongodb_tasktracker_model_UserDetailsRealmProxyInterface unmanagedCopy = (com_mongodb_tasktracker_model_UserDetailsRealmProxyInterface) unmanagedObject;
        com_mongodb_tasktracker_model_UserDetailsRealmProxyInterface realmSource = (com_mongodb_tasktracker_model_UserDetailsRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$email(realmSource.realmGet$email());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("UserDetails = proxy[");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{email:");
        stringBuilder.append(realmGet$email());
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
        com_mongodb_tasktracker_model_UserDetailsRealmProxy aUserDetails = (com_mongodb_tasktracker_model_UserDetailsRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aUserDetails.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aUserDetails.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aUserDetails.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
