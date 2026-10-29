            package com.google.gson;

            import com.google.gson.internal.LinkedTreeMap;
            import java.util.Map;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public final class JsonObject extends JsonElement {
                private final LinkedTreeMap<String, JsonElement> members = new LinkedTreeMap<>(false);

                public void add(String str, JsonElement jsonElement) {
/* 1 */             LinkedTreeMap<String, JsonElement> linkedTreeMap = this.members;
/* 3 */             if (jsonElement == null) {
/* 5 */                 jsonElement = JsonNull.INSTANCE;
                    }
/* 7 */             linkedTreeMap.put(str, jsonElement);
                }

                public void addProperty(String str, String str2) {
/* 12 */            add(str, str2 == null ? JsonNull.INSTANCE : new JsonPrimitive(str2));
                }

                public Map<String, JsonElement> asMap() {
/* 1 */             return this.members;
                }

                @Override // com.google.gson.JsonElement
                public JsonObject deepCopy() {
/* 3 */             JsonObject jsonObject = new JsonObject();
/* 20 */            for (Map.Entry<String, JsonElement> entry : this.members.entrySet()) {
/* 44 */                jsonObject.add(entry.getKey(), entry.getValue().deepCopy());
                    }
/* 48 */            return jsonObject;
                }

                public Set<Map.Entry<String, JsonElement>> entrySet() {
/* 3 */             return this.members.entrySet();
                }

                public boolean equals(Object obj) {
/* 1 */             if (obj != this) {
                        return (obj instanceof JsonObject) && ((JsonObject) obj).members.equals(this.members);
                    }
/* 22 */            return true;
                }

                public JsonElement get(String str) {
/* 3 */             return this.members.get(str);
                }

                public JsonArray getAsJsonArray(String str) {
/* 7 */             return (JsonArray) this.members.get(str);
                }

                public JsonObject getAsJsonObject(String str) {
/* 7 */             return (JsonObject) this.members.get(str);
                }

                public JsonPrimitive getAsJsonPrimitive(String str) {
/* 7 */             return (JsonPrimitive) this.members.get(str);
                }

                public boolean has(String str) {
/* 3 */             return this.members.containsKey(str);
                }

                public int hashCode() {
/* 3 */             return this.members.hashCode();
                }

                public boolean isEmpty() {
                    return this.members.size() == 0;
                }

                public Set<String> keySet() {
/* 3 */             return this.members.keySet();
                }

                public JsonElement remove(String str) {
/* 3 */             return this.members.remove(str);
                }

                public int size() {
/* 3 */             return this.members.size();
                }

/* 15 */        public void addProperty(String str, Number number) {
/* 16 */            add(str, number == null ? JsonNull.INSTANCE : new JsonPrimitive(number));
                }

/* 16 */        public void addProperty(String str, Boolean bool) {
/* 17 */            add(str, bool == null ? JsonNull.INSTANCE : new JsonPrimitive(bool));
                }

/* 17 */        public void addProperty(String str, Character ch) {
/* 18 */            add(str, ch == null ? JsonNull.INSTANCE : new JsonPrimitive(ch));
                }
            }
