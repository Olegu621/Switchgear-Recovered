            package com.appsflyer.internal;

            import java.lang.reflect.Array;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 43 */    public final class AFg1eSDK {
                private static List<Object> AFAdRevenueData(JSONArray jSONArray) throws JSONException {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 11 */            for (int i = 0; i < jSONArray.length(); i++) {
/* 13 */                Object revenue = jSONArray.get(i);
/* 19 */                if (revenue instanceof JSONArray) {
/* 23 */                    revenue = AFAdRevenueData((JSONArray) revenue);
                        } else if (revenue instanceof JSONObject) {
/* 34 */                    revenue = getRevenue((JSONObject) revenue);
                        }
/* 38 */                arrayList.add(revenue);
                    }
/* 44 */            return arrayList;
                }

                public static JSONObject getMediationNetwork(Map<String, ?> map) {
/* 3 */             JSONObject jSONObject = new JSONObject();
/* 18 */            for (Map.Entry<String, ?> entry : map.entrySet()) {
                        try {
/* 40 */                    jSONObject.put(entry.getKey(), getRevenue(entry.getValue()));
                        } catch (JSONException unused) {
                        }
                    }
/* 44 */            return jSONObject;
                }

                private static Object getRevenue(Object obj) {
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
/* 53 */                        jSONArray.put(getRevenue(it.next()));
                            }
/* 57 */                    return jSONArray;
                        }
/* 66 */                if (!obj.getClass().isArray()) {
/* 97 */                    if (obj instanceof Map) {
/* 101 */                       return getMediationNetwork((Map) obj);
                            }
                            return ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
                        }
/* 68 */                int length = Array.getLength(obj);
/* 74 */                JSONArray jSONArray2 = new JSONArray();
/* 78 */                for (int i = 0; i < length; i++) {
/* 88 */                    jSONArray2.put(getRevenue(Array.get(obj, i)));
                        }
/* 94 */                return jSONArray2;
                    } catch (Exception unused) {
/* 148 */               return JSONObject.NULL;
                    }
                }

/* 44 */        public static JSONObject AFAdRevenueData(String str) {
                    if (str == null) {
                        return null;
                    }
                    try {
/* 45 */                return new JSONObject(str);
                    } catch (JSONException unused) {
                        return null;
                    }
                }

/* 150 */       public static Map<String, Object> getRevenue(JSONObject jSONObject) throws JSONException {
/* 151 */           HashMap map = new HashMap();
/* 152 */           Iterator<String> itKeys = jSONObject.keys();
/* 153 */           while (itKeys.hasNext()) {
/* 154 */               String next = itKeys.next();
/* 155 */               Object revenue = jSONObject.get(next);
/* 156 */               if (revenue instanceof JSONArray) {
/* 157 */                   revenue = AFAdRevenueData((JSONArray) revenue);
                        } else if (revenue instanceof JSONObject) {
/* 159 */                   revenue = getRevenue((JSONObject) revenue);
                        }
/* 160 */               map.put(next, revenue);
                    }
                    return map;
                }
            }
