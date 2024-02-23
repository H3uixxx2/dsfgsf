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
public class com_mongodb_tasktracker_model_ProjectRealmProxy extends com.mongodb.tasktracker.model.Project
    implements RealmObjectProxy, com_mongodb_tasktracker_model_ProjectRealmProxyInterface {

    static final class ProjectColumnInfo extends ColumnInfo {
        long nameColKey;
        long partitionColKey;

        ProjectColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Project");
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
            this.partitionColKey = addColumnDetails("partition", "partition", objectSchemaInfo);
        }

        ProjectColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ProjectColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ProjectColumnInfo src = (ProjectColumnInfo) rawSrc;
            final ProjectColumnInfo dst = (ProjectColumnInfo) rawDst;
            dst.nameColKey = src.nameColKey;
            dst.partitionColKey = src.partitionColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ProjectColumnInfo columnInfo;
    private ProxyState<com.mongodb.tasktracker.model.Project> proxyState;

    com_mongodb_tasktracker_model_ProjectRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ProjectColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.mongodb.tasktracker.model.Project>(this);
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
                row.getTable().setNull(columnInfo.nameColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$partition() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.partitionColKey);
    }

    @Override
    public void realmSet$partition(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.partitionColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.partitionColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.partitionColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.partitionColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "Project", true, 2, 0);
        builder.addPersistedProperty(NO_ALIAS, "name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "partition", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ProjectColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ProjectColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Project";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Project";
    }

    @SuppressWarnings("cast")
    public static com.mongodb.tasktracker.model.Project createOrUpdateEmbeddedUsingJsonObject(Realm realm, RealmModel parent, String parentProperty, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.mongodb.tasktracker.model.Project obj = realm.createEmbeddedObject(com.mongodb.tasktracker.model.Project.class, parent, parentProperty);

        final com_mongodb_tasktracker_model_ProjectRealmProxyInterface objProxy = (com_mongodb_tasktracker_model_ProjectRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("partition")) {
            if (json.isNull("partition")) {
                objProxy.realmSet$partition(null);
            } else {
                objProxy.realmSet$partition((String) json.getString("partition"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.mongodb.tasktracker.model.Project createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.mongodb.tasktracker.model.Project obj = new com.mongodb.tasktracker.model.Project();
        final com_mongodb_tasktracker_model_ProjectRealmProxyInterface objProxy = (com_mongodb_tasktracker_model_ProjectRealmProxyInterface) obj;
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
            } else if (name.equals("partition")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$partition((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$partition(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return obj;
    }

    static com_mongodb_tasktracker_model_ProjectRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.Project.class), false, Collections.<String>emptyList());
        io.realm.com_mongodb_tasktracker_model_ProjectRealmProxy obj = new io.realm.com_mongodb_tasktracker_model_ProjectRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.mongodb.tasktracker.model.Project copyOrUpdate(Realm realm, ProjectColumnInfo columnInfo, com.mongodb.tasktracker.model.Project object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.mongodb.tasktracker.model.Project) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.mongodb.tasktracker.model.Project copy(Realm realm, ProjectColumnInfo columnInfo, com.mongodb.tasktracker.model.Project newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.mongodb.tasktracker.model.Project) cachedRealmObject;
        }

        com_mongodb_tasktracker_model_ProjectRealmProxyInterface unmanagedSource = (com_mongodb_tasktracker_model_ProjectRealmProxyInterface) newObject;

        Table table = realm.getTable(com.mongodb.tasktracker.model.Project.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.nameColKey, unmanagedSource.realmGet$name());
        builder.addString(columnInfo.partitionColKey, unmanagedSource.realmGet$partition());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_mongodb_tasktracker_model_ProjectRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, Table parentObjectTable, long parentColumnKey, long parentObjectKey, com.mongodb.tasktracker.model.Project object, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.mongodb.tasktracker.model.Project.class);
        long tableNativePtr = table.getNativePtr();
        ProjectColumnInfo columnInfo = (ProjectColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.Project.class);
        long objKey = OsObject.createEmbeddedObject(parentObjectTable, parentObjectKey, parentColumnKey);
        cache.put(object, objKey);
        String realmGet$name = ((com_mongodb_tasktracker_model_ProjectRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        }
        String realmGet$partition = ((com_mongodb_tasktracker_model_ProjectRealmProxyInterface) object).realmGet$partition();
        if (realmGet$partition != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.partitionColKey, objKey, realmGet$partition, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Table parentObjectTable, long parentColumnKey, long parentObjectKey, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.mongodb.tasktracker.model.Project.class);
        long tableNativePtr = table.getNativePtr();
        ProjectColumnInfo columnInfo = (ProjectColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.Project.class);
        com.mongodb.tasktracker.model.Project object = null;
        while (objects.hasNext()) {
            object = (com.mongodb.tasktracker.model.Project) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createEmbeddedObject(parentObjectTable, parentObjectKey, parentColumnKey);
            cache.put(object, objKey);
            String realmGet$name = ((com_mongodb_tasktracker_model_ProjectRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            }
            String realmGet$partition = ((com_mongodb_tasktracker_model_ProjectRealmProxyInterface) object).realmGet$partition();
            if (realmGet$partition != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.partitionColKey, objKey, realmGet$partition, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Table parentObjectTable, long parentColumnKey, long parentObjectKey, com.mongodb.tasktracker.model.Project object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.mongodb.tasktracker.model.Project.class);
        long tableNativePtr = table.getNativePtr();
        ProjectColumnInfo columnInfo = (ProjectColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.Project.class);
        long objKey = OsObject.createEmbeddedObject(parentObjectTable, parentObjectKey, parentColumnKey);
        cache.put(object, objKey);
        String realmGet$name = ((com_mongodb_tasktracker_model_ProjectRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
        }
        String realmGet$partition = ((com_mongodb_tasktracker_model_ProjectRealmProxyInterface) object).realmGet$partition();
        if (realmGet$partition != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.partitionColKey, objKey, realmGet$partition, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.partitionColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Table parentObjectTable, long parentColumnKey, long parentObjectKey, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.mongodb.tasktracker.model.Project.class);
        long tableNativePtr = table.getNativePtr();
        ProjectColumnInfo columnInfo = (ProjectColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.Project.class);
        com.mongodb.tasktracker.model.Project object = null;
        while (objects.hasNext()) {
            object = (com.mongodb.tasktracker.model.Project) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createEmbeddedObject(parentObjectTable, parentObjectKey, parentColumnKey);
            cache.put(object, objKey);
            String realmGet$name = ((com_mongodb_tasktracker_model_ProjectRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
            }
            String realmGet$partition = ((com_mongodb_tasktracker_model_ProjectRealmProxyInterface) object).realmGet$partition();
            if (realmGet$partition != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.partitionColKey, objKey, realmGet$partition, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.partitionColKey, objKey, false);
            }
        }
    }

    public static com.mongodb.tasktracker.model.Project createDetachedCopy(com.mongodb.tasktracker.model.Project realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.mongodb.tasktracker.model.Project unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.mongodb.tasktracker.model.Project();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.mongodb.tasktracker.model.Project) cachedObject.object;
            }
            unmanagedObject = (com.mongodb.tasktracker.model.Project) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_mongodb_tasktracker_model_ProjectRealmProxyInterface unmanagedCopy = (com_mongodb_tasktracker_model_ProjectRealmProxyInterface) unmanagedObject;
        com_mongodb_tasktracker_model_ProjectRealmProxyInterface realmSource = (com_mongodb_tasktracker_model_ProjectRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$partition(realmSource.realmGet$partition());

        return unmanagedObject;
    }

    static com.mongodb.tasktracker.model.Project update(Realm realm, ProjectColumnInfo columnInfo, com.mongodb.tasktracker.model.Project realmObject, com.mongodb.tasktracker.model.Project newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_mongodb_tasktracker_model_ProjectRealmProxyInterface realmObjectTarget = (com_mongodb_tasktracker_model_ProjectRealmProxyInterface) realmObject;
        com_mongodb_tasktracker_model_ProjectRealmProxyInterface realmObjectSource = (com_mongodb_tasktracker_model_ProjectRealmProxyInterface) newObject;
        Table table = realm.getTable(com.mongodb.tasktracker.model.Project.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.nameColKey, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.partitionColKey, realmObjectSource.realmGet$partition());

        builder.updateExistingEmbeddedObject((RealmObjectProxy) realmObject);
        return realmObject;
    }

    public static void updateEmbeddedObject(Realm realm, com.mongodb.tasktracker.model.Project unmanagedObject, com.mongodb.tasktracker.model.Project managedObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        update(realm, (com_mongodb_tasktracker_model_ProjectRealmProxy.ProjectColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.Project.class), managedObject, unmanagedObject, cache, flags);
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Project = proxy[");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{partition:");
        stringBuilder.append(realmGet$partition() != null ? realmGet$partition() : "null");
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
        com_mongodb_tasktracker_model_ProjectRealmProxy aProject = (com_mongodb_tasktracker_model_ProjectRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aProject.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aProject.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aProject.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
