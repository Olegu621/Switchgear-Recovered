            package com.supercell.p007id.scid_plugin;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import org.json.JSONArray;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b\u001a\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b\u001a\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b\u001a\u0017\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b\u001a\u001c\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u000b\u001a\u001c\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u000e\u001a\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0011\u001a\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0014\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0010H\u0086\b\u001a\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0010H\u0086\b\u001a\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u0002*\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0010H\u0086\b\u001a\u0017\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0010H\u0086\b\u001a\u001c\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0010H\u0086\b¢\u0006\u0002\u0010\u0016\u001a\u001c\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0010H\u0086\b¢\u0006\u0002\u0010\u0017\u001a\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0010H\u0086\b¢\u0006\u0002\u0010\u0018\u001a\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0010H\u0086\b¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, m6176d2 = {"getOrNull", HttpUrl.FRAGMENT_ENCODE_SET, "Lorg/json/JSONObject;", "name", HttpUrl.FRAGMENT_ENCODE_SET, "getStringOrNull", "getJSONObjectOrNull", "getJSONArrayOrNull", "Lorg/json/JSONArray;", "getBooleanOrNull", HttpUrl.FRAGMENT_ENCODE_SET, "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;", "getDoubleOrNull", HttpUrl.FRAGMENT_ENCODE_SET, "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Double;", "getIntOrNull", HttpUrl.FRAGMENT_ENCODE_SET, "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "getLongOrNull", HttpUrl.FRAGMENT_ENCODE_SET, "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;", FirebaseAnalytics.Param.INDEX, "(Lorg/json/JSONArray;I)Ljava/lang/Boolean;", "(Lorg/json/JSONArray;I)Ljava/lang/Double;", "(Lorg/json/JSONArray;I)Ljava/lang/Integer;", "(Lorg/json/JSONArray;I)Ljava/lang/Long;", "scid_plugin_release"}, m6177k = 2, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 10 */    public final class JSON_OptionalKt {
                public static final Boolean getBooleanOrNull(JSONObject jSONObject, String str) {
/* 1 */             jSONObject.getClass();
/* 4 */             str.getClass();
/* 7 */             Object objOpt = jSONObject.opt(str);
/* 12 */            if (objOpt == null || objOpt.equals(JSONObject.NULL)) {
/* 22 */                objOpt = null;
                    }
/* 23 */            if (objOpt == null || !(objOpt instanceof Boolean)) {
/* 11 */                return null;
                    }
/* 29 */            return (Boolean) objOpt;
                }

                public static final Double getDoubleOrNull(JSONObject jSONObject, String str) {
/* 1 */             jSONObject.getClass();
/* 4 */             str.getClass();
/* 7 */             Object objOpt = jSONObject.opt(str);
/* 12 */            if (objOpt == null || objOpt.equals(JSONObject.NULL)) {
/* 22 */                objOpt = null;
                    }
/* 23 */            if (objOpt != null) {
/* 27 */                if (objOpt instanceof Integer) {
/* 36 */                    return Double.valueOf(((Number) objOpt).intValue());
                        }
/* 43 */                if (objOpt instanceof Long) {
/* 52 */                    return Double.valueOf(((Number) objOpt).longValue());
                        }
/* 59 */                if (objOpt instanceof Double) {
/* 61 */                    return (Double) objOpt;
                        }
                    }
/* 11 */            return null;
                }

                public static final Integer getIntOrNull(JSONObject jSONObject, String str) {
/* 1 */             jSONObject.getClass();
/* 4 */             str.getClass();
/* 7 */             Object objOpt = jSONObject.opt(str);
/* 12 */            if (objOpt == null || objOpt.equals(JSONObject.NULL)) {
/* 22 */                objOpt = null;
                    }
/* 23 */            if (objOpt == null || !(objOpt instanceof Integer)) {
/* 11 */                return null;
                    }
/* 29 */            return (Integer) objOpt;
                }

                public static final JSONArray getJSONArrayOrNull(JSONObject jSONObject, String str) {
/* 1 */             jSONObject.getClass();
/* 4 */             str.getClass();
/* 7 */             return jSONObject.optJSONArray(str);
                }

                public static final JSONObject getJSONObjectOrNull(JSONObject jSONObject, String str) {
/* 1 */             jSONObject.getClass();
/* 4 */             str.getClass();
/* 7 */             return jSONObject.optJSONObject(str);
                }

                public static final Long getLongOrNull(JSONObject jSONObject, String str) {
/* 1 */             jSONObject.getClass();
/* 4 */             str.getClass();
/* 7 */             Object objOpt = jSONObject.opt(str);
/* 12 */            if (objOpt == null || objOpt.equals(JSONObject.NULL)) {
/* 22 */                objOpt = null;
                    }
/* 23 */            if (objOpt != null) {
/* 27 */                if (objOpt instanceof Integer) {
/* 36 */                    return Long.valueOf(((Number) objOpt).intValue());
                        }
/* 43 */                if (objOpt instanceof Long) {
/* 45 */                    return (Long) objOpt;
                        }
                    }
/* 11 */            return null;
                }

                public static final Object getOrNull(JSONObject jSONObject, String str) {
/* 1 */             jSONObject.getClass();
/* 4 */             str.getClass();
/* 7 */             Object objOpt = jSONObject.opt(str);
/* 12 */            if (objOpt == null || objOpt.equals(JSONObject.NULL)) {
/* 11 */                return null;
                    }
/* 23 */            return objOpt;
                }

                public static final String getStringOrNull(JSONObject jSONObject, String str) {
/* 1 */             jSONObject.getClass();
/* 4 */             str.getClass();
/* 7 */             Object objOpt = jSONObject.opt(str);
/* 12 */            if (objOpt == null || objOpt.equals(JSONObject.NULL)) {
/* 22 */                objOpt = null;
                    }
/* 23 */            if (objOpt == null || !(objOpt instanceof String)) {
/* 11 */                return null;
                    }
/* 29 */            return (String) objOpt;
                }

/* 11 */        public static final JSONArray getJSONArrayOrNull(JSONArray jSONArray, int i) {
                    jSONArray.getClass();
/* 12 */            return jSONArray.optJSONArray(i);
                }

/* 11 */        public static final JSONObject getJSONObjectOrNull(JSONArray jSONArray, int i) {
                    jSONArray.getClass();
/* 12 */            return jSONArray.optJSONObject(i);
                }

/* 24 */        public static final Object getOrNull(JSONArray jSONArray, int i) {
                    jSONArray.getClass();
/* 25 */            Object objOpt = jSONArray.opt(i);
/* 27 */            if (objOpt == null || objOpt.equals(JSONObject.NULL)) {
                        return null;
                    }
                    return objOpt;
                }

/* 32 */        public static final Boolean getBooleanOrNull(JSONArray jSONArray, int i) {
                    jSONArray.getClass();
/* 33 */            Object objOpt = jSONArray.opt(i);
/* 35 */            if (objOpt == null || objOpt.equals(JSONObject.NULL)) {
                        objOpt = null;
                    }
/* 36 */            if (objOpt == null || !(objOpt instanceof Boolean)) {
                        return null;
                    }
                    return (Boolean) objOpt;
                }

/* 32 */        public static final Integer getIntOrNull(JSONArray jSONArray, int i) {
                    jSONArray.getClass();
/* 33 */            Object objOpt = jSONArray.opt(i);
/* 35 */            if (objOpt == null || objOpt.equals(JSONObject.NULL)) {
                        objOpt = null;
                    }
/* 36 */            if (objOpt == null || !(objOpt instanceof Integer)) {
                        return null;
                    }
                    return (Integer) objOpt;
                }

/* 32 */        public static final String getStringOrNull(JSONArray jSONArray, int i) {
                    jSONArray.getClass();
/* 33 */            Object objOpt = jSONArray.opt(i);
/* 35 */            if (objOpt == null || objOpt.equals(JSONObject.NULL)) {
                        objOpt = null;
                    }
/* 36 */            if (objOpt == null || !(objOpt instanceof String)) {
                        return null;
                    }
                    return (String) objOpt;
                }

/* 48 */        public static final Long getLongOrNull(JSONArray jSONArray, int i) {
                    jSONArray.getClass();
/* 49 */            Object objOpt = jSONArray.opt(i);
/* 51 */            if (objOpt == null || objOpt.equals(JSONObject.NULL)) {
                        objOpt = null;
                    }
                    if (objOpt != null) {
/* 52 */                if (objOpt instanceof Integer) {
                            return Long.valueOf(((Number) objOpt).intValue());
                        }
/* 53 */                if (objOpt instanceof Long) {
                            return (Long) objOpt;
                        }
                    }
                    return null;
                }

/* 64 */        public static final Double getDoubleOrNull(JSONArray jSONArray, int i) {
                    jSONArray.getClass();
/* 65 */            Object objOpt = jSONArray.opt(i);
/* 67 */            if (objOpt == null || objOpt.equals(JSONObject.NULL)) {
                        objOpt = null;
                    }
                    if (objOpt != null) {
/* 68 */                if (objOpt instanceof Integer) {
                            return Double.valueOf(((Number) objOpt).intValue());
                        }
/* 69 */                if (objOpt instanceof Long) {
                            return Double.valueOf(((Number) objOpt).longValue());
                        }
/* 70 */                if (objOpt instanceof Double) {
                            return (Double) objOpt;
                        }
                    }
                    return null;
                }
            }
