package org.slc.sli.domain;

import java.util.HashMap;
import java.util.Map;

import org.bson.BasicBSONObject;
import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class MongoEntity implements Entity {

	final String type;
	final String id;
	final Map<String, Object> body;
	final Map<String, Object> metaData;

	public MongoEntity(String type, String id, Map<String, Object> body,
			Map<String, Object> metaData) {
		if (body == null) {
			body = new BasicBSONObject();
		}
		if (metaData == null) {
			metaData = new BasicBSONObject();
		}
		this.type = type;
		this.id = id;
		this.body = body;
		this.metaData = metaData;
	}

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public Map<String, Object> getBody() {
		return body;
	}

	public DBObject toDBObject() {
		BasicDBObject dbObj = new BasicDBObject();
		dbObj.put("type", this.type);
		if (this.id != null) {
			dbObj.put("_id", new ObjectId(this.id));
		}
		dbObj.put("body", this.body);
		dbObj.put("metadata", this.metaData);
		return dbObj;
	}

	@SuppressWarnings("rawtypes")
	public static MongoEntity fromDBObject(DBObject dbObj) {
		String type = (String) dbObj.get("type");
		String id = ((ObjectId) dbObj.get("_id")).toString();
		Map map = dbObj.toMap();
		Map<String, Object> body = new HashMap<String, Object>();
		if (map.containsKey("body")) {
			body.putAll((Map) map.get("body"));
		}
		Map<String, Object> metaData = new HashMap<String, Object>();
		if (map.containsKey("metadata")) {
			metaData.putAll((Map) map.get("metadata"));
		}
		return new MongoEntity(type, id, body, metaData);
	}

}
