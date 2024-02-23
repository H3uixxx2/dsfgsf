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
public class com_mongodb_tasktracker_model_TaskRealmProxy extends com.mongodb.tasktracker.model.Task
    implements RealmObjectProxy, com_mongodb_tasktracker_model_TaskRealmProxyInterface {

    static final class TaskColumnInfo extends ColumnInfo {
        long idColKey;
        long nameColKey;
        long ownerColKey;
        long statusColKey;

        TaskColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Task");
            this.idColKey = addColumnDetails("id", "_id", objectSchemaInfo);
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
            this.ownerColKey = addColumnDetails("owner", "owner", objectSchemaInfo);
            this.statusColKey = addColumnDetails("status", "status", objectSchemaInfo);
        }

        TaskColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new TaskColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final TaskColumnInfo src = (TaskColumnInfo) rawSrc;
            final TaskColumnInfo dst = (TaskColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.nameColKey = src.nameColKey;
            dst.ownerColKey = src.ownerColKey;
            dst.statusColKey = src.statusColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private TaskColumnInfo columnInfo;
    private ProxyState<com.mongodb.tasktracker.model.Task> proxyState;

    com_mongodb_tasktracker_model_TaskRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (TaskColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.mongodb.tasktracker.model.Task>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public org.bson.types.ObjectId realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (org.bson.types.ObjectId) proxyState.getRow$realm().getObjectId(columnInfo.idColKey);
    }

    @Override
    public void realmSet$id(org.bson.types.ObjectId value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
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
    public String realmGet$owner() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.ownerColKey);
    }

    @Override
    public void realmSet$owner(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.ownerColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.ownerColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.ownerColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.ownerColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$status() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.statusColKey);
    }

    @Override
    public void realmSet$status(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'status' to null.");
            }
            row.getTable().setString(columnInfo.statusColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'status' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.statusColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "Task", false, 4, 0);
        builder.addPersistedProperty("id", "_id", RealmFieldType.OBJECT_ID, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "owner", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "status", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TaskColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new TaskColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Task";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Task";
    }

    @SuppressWarnings("cast")
    public static com.mongodb.tasktracker.model.Task createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.mongodb.tasktracker.model.Task obj = null;
        if (update) {
            Table table = realm.getTable(com.mongodb.tasktracker.model.Task.class);
            TaskColumnInfo columnInfo = (TaskColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.Task.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                objKey = table.findFirstObjectId(pkColumnKey, (org.bson.types.ObjectId)json.get("id"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.Task.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_mongodb_tasktracker_model_TaskRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_mongodb_tasktracker_model_TaskRealmProxy) realm.createObjectInternal(com.mongodb.tasktracker.model.Task.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_mongodb_tasktracker_model_TaskRealmProxy) realm.createObjectInternal(com.mongodb.tasktracker.model.Task.class, json.get("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_mongodb_tasktracker_model_TaskRealmProxyInterface objProxy = (com_mongodb_tasktracker_model_TaskRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("owner")) {
            if (json.isNull("owner")) {
                objProxy.realmSet$owner(null);
            } else {
                objProxy.realmSet$owner((String) json.getString("owner"));
            }
        }
        if (json.has("status")) {
            if (json.isNull("status")) {
                objProxy.realmSet$status(null);
            } else {
                objProxy.realmSet$status((String) json.getString("status"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.mongodb.tasktracker.model.Task createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.mongodb.tasktracker.model.Task obj = new com.mongodb.tasktracker.model.Task();
        final com_mongodb_tasktracker_model_TaskRealmProxyInterface objProxy = (com_mongodb_tasktracker_model_TaskRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                } else {
                    objProxy.realmSet$id(new org.bson.types.ObjectId(reader.nextString()));
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("owner")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$owner((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$owner(null);
                }
            } else if (name.equals("status")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$status((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$status(null);
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

    static com_mongodb_tasktracker_model_TaskRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.Task.class), false, Collections.<String>emptyList());
        io.realm.com_mongodb_tasktracker_model_TaskRealmProxy obj = new io.realm.com_mongodb_tasktracker_model_TaskRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.mongodb.tasktracker.model.Task copyOrUpdate(Realm realm, TaskColumnInfo columnInfo, com.mongodb.tasktracker.model.Task object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.mongodb.tasktracker.model.Task) cachedRealmObject;
        }

        com.mongodb.tasktracker.model.Task realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.mongodb.tasktracker.model.Task.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = table.findFirstObjectId(pkColumnKey, ((com_mongodb_tasktracker_model_TaskRealmProxyInterface) object).realmGet$id());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_mongodb_tasktracker_model_TaskRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.mongodb.tasktracker.model.Task copy(Realm realm, TaskColumnInfo columnInfo, com.mongodb.tasktracker.model.Task newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.mongodb.tasktracker.model.Task) cachedRealmObject;
        }

        com_mongodb_tasktracker_model_TaskRealmProxyInterface unmanagedSource = (com_mongodb_tasktracker_model_TaskRealmProxyInterface) newObject;

        Table table = realm.getTable(com.mongodb.tasktracker.model.Task.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addObjectId(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addString(columnInfo.nameColKey, unmanagedSource.realmGet$name());
        builder.addString(columnInfo.ownerColKey, unmanagedSource.realmGet$owner());
        builder.addString(columnInfo.statusColKey, unmanagedSource.realmGet$status());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_mongodb_tasktracker_model_TaskRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.mongodb.tasktracker.model.Task object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.mongodb.tasktracker.model.Task.class);
        long tableNativePtr = table.getNativePtr();
        TaskColumnInfo columnInfo = (TaskColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.Task.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_mongodb_tasktracker_model_TaskRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstObjectId(tableNativePtr, pkColumnKey, ((org.bson.types.ObjectId)primaryKeyValue).toString());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$name = ((com_mongodb_tasktracker_model_TaskRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        }
        String realmGet$owner = ((com_mongodb_tasktracker_model_TaskRealmProxyInterface) object).realmGet$owner();
        if (realmGet$owner != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ownerColKey, objKey, realmGet$owner, false);
        }
        String realmGet$status = ((com_mongodb_tasktracker_model_TaskRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusColKey, objKey, realmGet$status, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.mongodb.tasktracker.model.Task.class);
        long tableNativePtr = table.getNativePtr();
        TaskColumnInfo columnInfo = (TaskColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.Task.class);
        long pkColumnKey = columnInfo.idColKey;
        com.mongodb.tasktracker.model.Task object = null;
        while (objects.hasNext()) {
            object = (com.mongodb.tasktracker.model.Task) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_mongodb_tasktracker_model_TaskRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstObjectId(tableNativePtr, pkColumnKey, ((org.bson.types.ObjectId)primaryKeyValue).toString());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$name = ((com_mongodb_tasktracker_model_TaskRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            }
            String realmGet$owner = ((com_mongodb_tasktracker_model_TaskRealmProxyInterface) object).realmGet$owner();
            if (realmGet$owner != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ownerColKey, objKey, realmGet$owner, false);
            }
            String realmGet$status = ((com_mongodb_tasktracker_model_TaskRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusColKey, objKey, realmGet$status, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.mongodb.tasktracker.model.Task object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.mongodb.tasktracker.model.Task.class);
        long tableNativePtr = table.getNativePtr();
        TaskColumnInfo columnInfo = (TaskColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.Task.class);
        long pkColumnKey = columnInfo.idColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_mongodb_tasktracker_model_TaskRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstObjectId(tableNativePtr, pkColumnKey, ((org.bson.types.ObjectId)primaryKeyValue).toString());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$name = ((com_mongodb_tasktracker_model_TaskRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
        }
        String realmGet$owner = ((com_mongodb_tasktracker_model_TaskRealmProxyInterface) object).realmGet$owner();
        if (realmGet$owner != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ownerColKey, objKey, realmGet$owner, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.ownerColKey, objKey, false);
        }
        String realmGet$status = ((com_mongodb_tasktracker_model_TaskRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusColKey, objKey, realmGet$status, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.statusColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.mongodb.tasktracker.model.Task.class);
        long tableNativePtr = table.getNativePtr();
        TaskColumnInfo columnInfo = (TaskColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.Task.class);
        long pkColumnKey = columnInfo.idColKey;
        com.mongodb.tasktracker.model.Task object = null;
        while (objects.hasNext()) {
            object = (com.mongodb.tasktracker.model.Task) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_mongodb_tasktracker_model_TaskRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstObjectId(tableNativePtr, pkColumnKey, ((org.bson.types.ObjectId)primaryKeyValue).toString());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$name = ((com_mongodb_tasktracker_model_TaskRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
            }
            String realmGet$owner = ((com_mongodb_tasktracker_model_TaskRealmProxyInterface) object).realmGet$owner();
            if (realmGet$owner != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ownerColKey, objKey, realmGet$owner, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.ownerColKey, objKey, false);
            }
            String realmGet$status = ((com_mongodb_tasktracker_model_TaskRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusColKey, objKey, realmGet$status, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.statusColKey, objKey, false);
            }
        }
    }

    public static com.mongodb.tasktracker.model.Task createDetachedCopy(com.mongodb.tasktracker.model.Task realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.mongodb.tasktracker.model.Task unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.mongodb.tasktracker.model.Task();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.mongodb.tasktracker.model.Task) cachedObject.object;
            }
            unmanagedObject = (com.mongodb.tasktracker.model.Task) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_mongodb_tasktracker_model_TaskRealmProxyInterface unmanagedCopy = (com_mongodb_tasktracker_model_TaskRealmProxyInterface) unmanagedObject;
        com_mongodb_tasktracker_model_TaskRealmProxyInterface realmSource = (com_mongodb_tasktracker_model_TaskRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$owner(realmSource.realmGet$owner());
        unmanagedCopy.realmSet$status(realmSource.realmGet$status());

        return unmanagedObject;
    }

    static com.mongodb.tasktracker.model.Task update(Realm realm, TaskColumnInfo columnInfo, com.mongodb.tasktracker.model.Task realmObject, com.mongodb.tasktracker.model.Task newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_mongodb_tasktracker_model_TaskRealmProxyInterface realmObjectTarget = (com_mongodb_tasktracker_model_TaskRealmProxyInterface) realmObject;
        com_mongodb_tasktracker_model_TaskRealmProxyInterface realmObjectSource = (com_mongodb_tasktracker_model_TaskRealmProxyInterface) newObject;
        Table table = realm.getTable(com.mongodb.tasktracker.model.Task.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addObjectId(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.nameColKey, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.ownerColKey, realmObjectSource.realmGet$owner());
        builder.addString(columnInfo.statusColKey, realmObjectSource.realmGet$status());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Task = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{owner:");
        stringBuilder.append(realmGet$owner() != null ? realmGet$owner() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{status:");
        stringBuilder.append(realmGet$status());
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
        com_mongodb_tasktracker_model_TaskRealmProxy aTask = (com_mongodb_tasktracker_model_TaskRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aTask.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aTask.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aTask.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
