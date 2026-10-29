            package com.appsflyer.internal;

            import java.net.HttpURLConnection;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import org.json.JSONArray;
            import p000.C2122qw;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFd1qSDK {
                public static final boolean getCurrencyIso4217Code(HttpURLConnection httpURLConnection) {
/* 1 */             httpURLConnection.getClass();
                    return httpURLConnection.getResponseCode() / 100 == 2;
                }

                public static final JSONArray getMediationNetwork(List<AFc1aSDK> list) {
/* 1 */             list.getClass();
/* 12 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 15 */            Iterator<T> it = list.iterator();
/* 23 */            while (it.hasNext()) {
/* 35 */                arrayList.add(((AFc1aSDK) it.next()).getRevenue());
                    }
/* 41 */            return new JSONArray((Collection) arrayList);
                }
            }
