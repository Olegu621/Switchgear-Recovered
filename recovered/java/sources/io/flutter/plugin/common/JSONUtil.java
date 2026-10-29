            package io.flutter.plugin.common;

            import java.lang.reflect.Array;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            import org.json.JSONArray;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class JSONUtil {
                private JSONUtil() {
                }

                public static Object unwrap(Object obj) {
/* 8 */             if (JSONObject.NULL.equals(obj) || obj == null) {
/* 7 */                 return null;
                    }
/* 16 */            if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
/* 50 */                return obj;
                    }
                    try {
/* 53 */                if (obj instanceof JSONArray) {
/* 57 */                    ArrayList arrayList = new ArrayList();
/* 60 */                    JSONArray jSONArray = (JSONArray) obj;
/* 67 */                    for (int i = 0; i < jSONArray.length(); i++) {
/* 77 */                        arrayList.add(unwrap(jSONArray.get(i)));
                            }
/* 83 */                    return arrayList;
                        }
/* 86 */                if (obj instanceof JSONObject) {
/* 90 */                    HashMap map = new HashMap();
/* 93 */                    JSONObject jSONObject = (JSONObject) obj;
/* 95 */                    Iterator<String> itKeys = jSONObject.keys();
/* 103 */                   while (itKeys.hasNext()) {
/* 105 */                       String next = itKeys.next();
/* 119 */                       map.put(next, unwrap(jSONObject.get(next)));
                            }
/* 123 */                   return map;
                        }
/* 7 */                 return null;
                    } catch (Exception unused) {
                    }
                }

                public static Object wrap(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return JSONObject.NULL;
                    }
/* 8 */             if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
/* 23 */                return obj;
                    }
                    try {
/* 26 */                if (obj instanceof Collection) {
/* 30 */                    JSONArray jSONArray = new JSONArray();
/* 35 */                    Iterator it = ((Collection) obj).iterator();
/* 43 */                    while (it.hasNext()) {
/* 53 */                        jSONArray.put(wrap(it.next()));
                            }
/* 57 */                    return jSONArray;
                        }
/* 66 */                if (obj.getClass().isArray()) {
/* 70 */                    JSONArray jSONArray2 = new JSONArray();
/* 73 */                    int length = Array.getLength(obj);
/* 78 */                    for (int i = 0; i < length; i++) {
/* 88 */                        jSONArray2.put(wrap(Array.get(obj, i)));
                            }
/* 94 */                    return jSONArray2;
                        }
/* 97 */                if (obj instanceof Map) {
/* 101 */                   JSONObject jSONObject = new JSONObject();
/* 118 */                   for (Map.Entry entry : ((Map) obj).entrySet()) {
/* 140 */                       jSONObject.put((String) entry.getKey(), wrap(entry.getValue()));
                            }
/* 144 */                   return jSONObject;
                        }
/* 147 */               if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
/* 181 */                   return obj;
                        }
/* 200 */               if (obj.getClass().getPackage().getName().startsWith("java.")) {
/* 202 */                   return obj.toString();
                        }
/* 207 */               return null;
                    } catch (Exception unused) {
                    }
                }
            }
