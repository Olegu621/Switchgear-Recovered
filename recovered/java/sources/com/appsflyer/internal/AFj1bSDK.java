            package com.appsflyer.internal;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.ranges.IntRange;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            import p000.C1982nz;
            import p000.C2122qw;
            import p000.r02;
            import p000.u92;
            import p000.wy0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFj1bSDK {
                private static final List<Object> getMediationNetwork(JSONArray jSONArray) throws JSONException {
/* 6 */             IntRange intRangeM8048e = r02.m8048e(0, jSONArray.length());
/* 18 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(intRangeM8048e, 10));
/* 21 */            Iterator it = intRangeM8048e.iterator();
/* 29 */            while (it.hasNext()) {
/* 38 */                Object obj = jSONArray.get(((wy0) it).nextInt());
/* 42 */                obj.getClass();
/* 49 */                arrayList.add(getRevenue(obj));
                    }
/* 53 */            return arrayList;
                }

                public static final Map<String, Object> getMonetizationNetwork(JSONObject jSONObject) throws JSONException {
/* 1 */             jSONObject.getClass();
/* 4 */             Iterator<String> itKeys = jSONObject.keys();
/* 8 */             itKeys.getClass();
/* 11 */            C1982nz c1982nzM8981a = u92.m8981a(itKeys);
/* 17 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 28 */            for (Object obj : c1982nzM8981a) {
/* 37 */                Object obj2 = jSONObject.get((String) obj);
/* 41 */                obj2.getClass();
/* 48 */                linkedHashMap.put(obj, getRevenue(obj2));
                    }
/* 52 */            return linkedHashMap;
                }

                private static final Object getRevenue(Object obj) {
/* 3 */             if (obj instanceof JSONArray) {
/* 7 */                 return getMediationNetwork((JSONArray) obj);
                    }
/* 14 */            if (obj instanceof JSONObject) {
/* 18 */                return getMonetizationNetwork((JSONObject) obj);
                    }
/* 29 */            if (Intrinsics.m6216a(obj, JSONObject.NULL)) {
/* 31 */                return null;
                    }
/* 32 */            return obj;
                }
            }
