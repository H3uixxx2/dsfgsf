package io.realm;


import android.util.JsonReader;
import io.realm.ImportFlag;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(4);
        modelClasses.add(com.mongodb.tasktracker.model.Task.class);
        modelClasses.add(com.mongodb.tasktracker.model.User.class);
        modelClasses.add(com.mongodb.tasktracker.model.UserDetails.class);
        modelClasses.add(com.mongodb.tasktracker.model.Project.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(4);
        infoMap.put(com.mongodb.tasktracker.model.Task.class, io.realm.com_mongodb_tasktracker_model_TaskRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.mongodb.tasktracker.model.User.class, io.realm.com_mongodb_tasktracker_model_UserRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.mongodb.tasktracker.model.UserDetails.class, io.realm.com_mongodb_tasktracker_model_UserDetailsRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.mongodb.tasktracker.model.Project.class, io.realm.com_mongodb_tasktracker_model_ProjectRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(com.mongodb.tasktracker.model.Task.class)) {
            return io.realm.com_mongodb_tasktracker_model_TaskRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.mongodb.tasktracker.model.User.class)) {
            return io.realm.com_mongodb_tasktracker_model_UserRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.mongodb.tasktracker.model.UserDetails.class)) {
            return io.realm.com_mongodb_tasktracker_model_UserDetailsRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.mongodb.tasktracker.model.Project.class)) {
            return io.realm.com_mongodb_tasktracker_model_ProjectRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.mongodb.tasktracker.model.Task.class)) {
            return "Task";
        }
        if (clazz.equals(com.mongodb.tasktracker.model.User.class)) {
            return "User";
        }
        if (clazz.equals(com.mongodb.tasktracker.model.UserDetails.class)) {
            return "UserDetails";
        }
        if (clazz.equals(com.mongodb.tasktracker.model.Project.class)) {
            return "Project";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public Class<? extends RealmModel> getClazzImpl(String className) {
        checkClassName(className);

        if (className.equals("Task")) {
            return com.mongodb.tasktracker.model.Task.class;
        }
        if (className.equals("User")) {
            return com.mongodb.tasktracker.model.User.class;
        }
        if (className.equals("UserDetails")) {
            return com.mongodb.tasktracker.model.UserDetails.class;
        }
        if (className.equals("Project")) {
            return com.mongodb.tasktracker.model.Project.class;
        }
        throw getMissingProxyClassException(className);
    }

    @Override
    public boolean hasPrimaryKeyImpl(Class<? extends RealmModel> clazz) {
        return com.mongodb.tasktracker.model.Task.class.isAssignableFrom(clazz)
                || com.mongodb.tasktracker.model.User.class.isAssignableFrom(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(com.mongodb.tasktracker.model.Task.class)) {
                return clazz.cast(new io.realm.com_mongodb_tasktracker_model_TaskRealmProxy());
            }
            if (clazz.equals(com.mongodb.tasktracker.model.User.class)) {
                return clazz.cast(new io.realm.com_mongodb_tasktracker_model_UserRealmProxy());
            }
            if (clazz.equals(com.mongodb.tasktracker.model.UserDetails.class)) {
                return clazz.cast(new io.realm.com_mongodb_tasktracker_model_UserDetailsRealmProxy());
            }
            if (clazz.equals(com.mongodb.tasktracker.model.Project.class)) {
                return clazz.cast(new io.realm.com_mongodb_tasktracker_model_ProjectRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.mongodb.tasktracker.model.Task.class)) {
            com_mongodb_tasktracker_model_TaskRealmProxy.TaskColumnInfo columnInfo = (com_mongodb_tasktracker_model_TaskRealmProxy.TaskColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.Task.class);
            return clazz.cast(io.realm.com_mongodb_tasktracker_model_TaskRealmProxy.copyOrUpdate(realm, columnInfo, (com.mongodb.tasktracker.model.Task) obj, update, cache, flags));
        }
        if (clazz.equals(com.mongodb.tasktracker.model.User.class)) {
            com_mongodb_tasktracker_model_UserRealmProxy.UserColumnInfo columnInfo = (com_mongodb_tasktracker_model_UserRealmProxy.UserColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.User.class);
            return clazz.cast(io.realm.com_mongodb_tasktracker_model_UserRealmProxy.copyOrUpdate(realm, columnInfo, (com.mongodb.tasktracker.model.User) obj, update, cache, flags));
        }
        if (clazz.equals(com.mongodb.tasktracker.model.UserDetails.class)) {
            com_mongodb_tasktracker_model_UserDetailsRealmProxy.UserDetailsColumnInfo columnInfo = (com_mongodb_tasktracker_model_UserDetailsRealmProxy.UserDetailsColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.UserDetails.class);
            return clazz.cast(io.realm.com_mongodb_tasktracker_model_UserDetailsRealmProxy.copyOrUpdate(realm, columnInfo, (com.mongodb.tasktracker.model.UserDetails) obj, update, cache, flags));
        }
        if (clazz.equals(com.mongodb.tasktracker.model.Project.class)) {
            com_mongodb_tasktracker_model_ProjectRealmProxy.ProjectColumnInfo columnInfo = (com_mongodb_tasktracker_model_ProjectRealmProxy.ProjectColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.tasktracker.model.Project.class);
            return clazz.cast(io.realm.com_mongodb_tasktracker_model_ProjectRealmProxy.copyOrUpdate(realm, columnInfo, (com.mongodb.tasktracker.model.Project) obj, update, cache, flags));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public long insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(com.mongodb.tasktracker.model.Task.class)) {
            return io.realm.com_mongodb_tasktracker_model_TaskRealmProxy.insert(realm, (com.mongodb.tasktracker.model.Task) object, cache);
        } else if (clazz.equals(com.mongodb.tasktracker.model.User.class)) {
            return io.realm.com_mongodb_tasktracker_model_UserRealmProxy.insert(realm, (com.mongodb.tasktracker.model.User) object, cache);
        } else if (clazz.equals(com.mongodb.tasktracker.model.UserDetails.class)) {
            return io.realm.com_mongodb_tasktracker_model_UserDetailsRealmProxy.insert(realm, (com.mongodb.tasktracker.model.UserDetails) object, cache);
        } else if (clazz.equals(com.mongodb.tasktracker.model.Project.class)) {
            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.mongodb.tasktracker.model.Task.class)) {
                io.realm.com_mongodb_tasktracker_model_TaskRealmProxy.insert(realm, (com.mongodb.tasktracker.model.Task) object, cache);
            } else if (clazz.equals(com.mongodb.tasktracker.model.User.class)) {
                io.realm.com_mongodb_tasktracker_model_UserRealmProxy.insert(realm, (com.mongodb.tasktracker.model.User) object, cache);
            } else if (clazz.equals(com.mongodb.tasktracker.model.UserDetails.class)) {
                io.realm.com_mongodb_tasktracker_model_UserDetailsRealmProxy.insert(realm, (com.mongodb.tasktracker.model.UserDetails) object, cache);
            } else if (clazz.equals(com.mongodb.tasktracker.model.Project.class)) {
                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.mongodb.tasktracker.model.Task.class)) {
                    io.realm.com_mongodb_tasktracker_model_TaskRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.mongodb.tasktracker.model.User.class)) {
                    io.realm.com_mongodb_tasktracker_model_UserRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.mongodb.tasktracker.model.UserDetails.class)) {
                    io.realm.com_mongodb_tasktracker_model_UserDetailsRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.mongodb.tasktracker.model.Project.class)) {
                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public long insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.mongodb.tasktracker.model.Task.class)) {
            return io.realm.com_mongodb_tasktracker_model_TaskRealmProxy.insertOrUpdate(realm, (com.mongodb.tasktracker.model.Task) obj, cache);
        } else if (clazz.equals(com.mongodb.tasktracker.model.User.class)) {
            return io.realm.com_mongodb_tasktracker_model_UserRealmProxy.insertOrUpdate(realm, (com.mongodb.tasktracker.model.User) obj, cache);
        } else if (clazz.equals(com.mongodb.tasktracker.model.UserDetails.class)) {
            return io.realm.com_mongodb_tasktracker_model_UserDetailsRealmProxy.insertOrUpdate(realm, (com.mongodb.tasktracker.model.UserDetails) obj, cache);
        } else if (clazz.equals(com.mongodb.tasktracker.model.Project.class)) {
            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.mongodb.tasktracker.model.Task.class)) {
                io.realm.com_mongodb_tasktracker_model_TaskRealmProxy.insertOrUpdate(realm, (com.mongodb.tasktracker.model.Task) object, cache);
            } else if (clazz.equals(com.mongodb.tasktracker.model.User.class)) {
                io.realm.com_mongodb_tasktracker_model_UserRealmProxy.insertOrUpdate(realm, (com.mongodb.tasktracker.model.User) object, cache);
            } else if (clazz.equals(com.mongodb.tasktracker.model.UserDetails.class)) {
                io.realm.com_mongodb_tasktracker_model_UserDetailsRealmProxy.insertOrUpdate(realm, (com.mongodb.tasktracker.model.UserDetails) object, cache);
            } else if (clazz.equals(com.mongodb.tasktracker.model.Project.class)) {
                throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.mongodb.tasktracker.model.Task.class)) {
                    io.realm.com_mongodb_tasktracker_model_TaskRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.mongodb.tasktracker.model.User.class)) {
                    io.realm.com_mongodb_tasktracker_model_UserRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.mongodb.tasktracker.model.UserDetails.class)) {
                    io.realm.com_mongodb_tasktracker_model_UserDetailsRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.mongodb.tasktracker.model.Project.class)) {
                    throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(com.mongodb.tasktracker.model.Task.class)) {
            return clazz.cast(io.realm.com_mongodb_tasktracker_model_TaskRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.mongodb.tasktracker.model.User.class)) {
            return clazz.cast(io.realm.com_mongodb_tasktracker_model_UserRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.mongodb.tasktracker.model.UserDetails.class)) {
            return clazz.cast(io.realm.com_mongodb_tasktracker_model_UserDetailsRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.mongodb.tasktracker.model.Project.class)) {
            throw new IllegalArgumentException("Importing embedded classes from JSON without a parent is not allowed");
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(com.mongodb.tasktracker.model.Task.class)) {
            return clazz.cast(io.realm.com_mongodb_tasktracker_model_TaskRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.mongodb.tasktracker.model.User.class)) {
            return clazz.cast(io.realm.com_mongodb_tasktracker_model_UserRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.mongodb.tasktracker.model.UserDetails.class)) {
            return clazz.cast(io.realm.com_mongodb_tasktracker_model_UserDetailsRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.mongodb.tasktracker.model.Project.class)) {
            throw new IllegalArgumentException("Importing embedded classes from JSON without a parent is not allowed");
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(com.mongodb.tasktracker.model.Task.class)) {
            return clazz.cast(io.realm.com_mongodb_tasktracker_model_TaskRealmProxy.createDetachedCopy((com.mongodb.tasktracker.model.Task) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.mongodb.tasktracker.model.User.class)) {
            return clazz.cast(io.realm.com_mongodb_tasktracker_model_UserRealmProxy.createDetachedCopy((com.mongodb.tasktracker.model.User) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.mongodb.tasktracker.model.UserDetails.class)) {
            return clazz.cast(io.realm.com_mongodb_tasktracker_model_UserDetailsRealmProxy.createDetachedCopy((com.mongodb.tasktracker.model.UserDetails) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.mongodb.tasktracker.model.Project.class)) {
            return clazz.cast(io.realm.com_mongodb_tasktracker_model_ProjectRealmProxy.createDetachedCopy((com.mongodb.tasktracker.model.Project) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> boolean isEmbedded(Class<E> clazz) {
        if (clazz.equals(com.mongodb.tasktracker.model.Task.class)) {
            return false;
        }
        if (clazz.equals(com.mongodb.tasktracker.model.User.class)) {
            return false;
        }
        if (clazz.equals(com.mongodb.tasktracker.model.UserDetails.class)) {
            return false;
        }
        if (clazz.equals(com.mongodb.tasktracker.model.Project.class)) {
            return true;
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> void updateEmbeddedObject(Realm realm, E unmanagedObject, E managedObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) managedObject.getClass().getSuperclass();

        if (clazz.equals(com.mongodb.tasktracker.model.Task.class)) {
            throw getNotEmbeddedClassException("com.mongodb.tasktracker.model.Task");
        } else if (clazz.equals(com.mongodb.tasktracker.model.User.class)) {
            throw getNotEmbeddedClassException("com.mongodb.tasktracker.model.User");
        } else if (clazz.equals(com.mongodb.tasktracker.model.UserDetails.class)) {
            throw getNotEmbeddedClassException("com.mongodb.tasktracker.model.UserDetails");
        } else if (clazz.equals(com.mongodb.tasktracker.model.Project.class)) {
            io.realm.com_mongodb_tasktracker_model_ProjectRealmProxy.updateEmbeddedObject(realm, (com.mongodb.tasktracker.model.Project) unmanagedObject, (com.mongodb.tasktracker.model.Project) managedObject, cache, flags);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

}
