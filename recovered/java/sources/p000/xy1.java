            package p000;

            import androidx.core.app.NotificationCompat;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import java.security.GeneralSecurityException;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import kotlin.collections.C1839a;
            import okhttp3.HttpUrl;
            import org.json.JSONArray;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xy1 {

                /* JADX INFO: renamed from: a */
                public Object f19393a;

                /* JADX INFO: renamed from: b */
                public Object f19394b;

                /* JADX INFO: renamed from: c */
                public Object f19395c;

                /* JADX INFO: renamed from: d */
                public Object f19396d;

                /* JADX INFO: renamed from: e */
                public Object f19397e;

                /* JADX INFO: renamed from: f */
                public Object f19398f;

                public xy1(uu1 uu1Var, uu1 uu1Var2, uu1 uu1Var3, uu1 uu1Var4, uu1 uu1Var5, EnumC0958gl enumC0958gl, int i) {
/* 4 */             uu1Var = (i & 1) != 0 ? null : uu1Var;
/* 9 */             uu1Var2 = (i & 2) != 0 ? null : uu1Var2;
/* 14 */            uu1Var3 = (i & 4) != 0 ? null : uu1Var3;
/* 19 */            uu1Var4 = (i & 8) != 0 ? null : uu1Var4;
/* 24 */            uu1Var5 = (i & 16) != 0 ? null : uu1Var5;
/* 27 */            enumC0958gl.getClass();
/* 33 */            this.f19393a = uu1Var;
/* 35 */            this.f19395c = uu1Var2;
/* 37 */            this.f19396d = uu1Var3;
/* 39 */            this.f19397e = uu1Var4;
/* 41 */            this.f19398f = uu1Var5;
/* 43 */            this.f19394b = enumC0958gl;
                }

                /* JADX INFO: renamed from: a */
                public static int m10036a(xy1 xy1Var, JSONArray jSONArray, boolean z) {
/* 3 */             er0 er0Var = (er0) xy1Var.f19395c;
/* 11 */            if (jSONArray.length() == 0) {
/* 9 */                 return 200;
                    }
                    try {
/* 26 */                xe2.m9775m("analyticsMngr", z ? "Syncing failed analytics events" : "Syncing analytics events", null);
/* 29 */                HashMap mapM10042e = xy1Var.m10042e();
/* 39 */                mapM10042e.put("e", jSONArray.toString());
/* 46 */                C0210cb c0210cb = (C0210cb) xy1Var.f19393a;
/* 48 */                String strM3588q = er0Var.m3588q();
/* 54 */                er0 er0Var2 = (er0) er0Var.f7853b;
/* 118 */               int i = new lp0((ec0) xy1Var.f19398f, "https://api." + er0Var2.m3589r(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST) + "/events/v1/" + er0Var2.m3589r("domain") + "/websdk/", 1).m8750l(new wc0(13, jb1.m5750j(c0210cb, strM3588q), mapM10042e)).f12324a;
/* 120 */               if ((i < 200 || i >= 300) && !z) {
/* 128 */                   xy1Var.m10046k(jSONArray);
                        }
/* 131 */               return i;
                    } catch (gt0 e) {
/* 134 */               xe2.m9777o("analyticsMngr", "Failed to send the events", e);
/* 137 */               if (!z) {
/* 139 */                   xy1Var.m10046k(jSONArray);
                        }
/* 142 */               throw e;
                    }
                }

                /* JADX INFO: renamed from: g */
                public static xy1 m10037g(String str, AbstractC2298vl abstractC2298vl, h31 h31Var, wq1 wq1Var, Integer num) throws GeneralSecurityException {
/* 4 */             if (wq1Var == wq1.RAW) {
/* 6 */                 if (num != null) {
/* 11 */                    ds0.m3203t("Keys with output prefix type raw should not have an id requirement.");
/* 3 */                     return null;
                        }
                    } else if (num == null) {
/* 41 */                ds0.m3203t("Keys with output prefix type different from raw should have an id requirement.");
/* 3 */                 return null;
                    }
/* 19 */            xy1 xy1Var = new xy1();
/* 22 */            xy1Var.f19393a = str;
/* 28 */            xy1Var.f19395c = p13.m7290b(str);
/* 30 */            xy1Var.f19396d = abstractC2298vl;
/* 32 */            xy1Var.f19397e = h31Var;
/* 34 */            xy1Var.f19398f = wq1Var;
/* 36 */            xy1Var.f19394b = num;
/* 38 */            return xy1Var;
                }

                /* JADX INFO: renamed from: j */
                public static ArrayList m10038j(uu1... uu1VarArr) {
/* 1 */             ArrayList<uu1> arrayListM7773h = C2103qd.m7773h(uu1VarArr);
/* 13 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(arrayListM7773h, 10));
/* 24 */            for (uu1 uu1Var : arrayListM7773h) {
/* 43 */                arrayList.add(new uu1(uu1Var.f15867b, uu1Var.f17723u, uu1Var.f17724v));
                    }
/* 51 */            if (arrayList.isEmpty()) {
/* 54 */                return null;
                    }
/* 53 */            return arrayList;
                }

                /* JADX INFO: renamed from: b */
                public void m10039b(long j) {
/* 3 */             er0 er0Var = (er0) this.f19395c;
/* 5 */             JSONArray jSONArrayM10043f = m10043f();
/* 17 */            if (jSONArrayM10043f.length() >= 1000) {
/* 23 */                er0Var.m3595y("app_launch_events", jSONArrayM10043f.toString());
/* 26 */                return;
                    }
                    try {
/* 29 */                JSONObject jSONObject = new JSONObject();
/* 34 */                jSONObject.put("ts", j);
/* 41 */                jSONObject.put("t", "a");
/* 44 */                jSONArrayM10043f.put(jSONObject);
                    } catch (Exception e) {
/* 53 */                xe2.m9777o("analyticsMngr", "Error in adding app launch event to existing array", e);
                    }
/* 60 */            er0Var.m3595y("app_launch_events", jSONArrayM10043f.toString());
                }

                /* JADX INFO: renamed from: c */
                public void m10040c(String str, String str2) {
/* 3 */             HashMap map = (HashMap) this.f19398f;
/* 5 */             if (map != null) {
/* 7 */                 map.put(str, str2);
                    } else {
/* 13 */                f42.m3656l("Property \"autoMetadata\" has not been set");
                    }
                }

                /* JADX INFO: renamed from: d */
                public C2142rf m10041d() {
/* 10 */            String strConcat = ((String) this.f19393a) == null ? " transportName" : HttpUrl.FRAGMENT_ENCODE_SET;
/* 16 */            if (((sd0) this.f19395c) == null) {
/* 20 */                strConcat = strConcat.concat(" encodedPayload");
                    }
/* 28 */            if (((Long) this.f19396d) == null) {
/* 32 */                strConcat = strConcat.concat(" eventMillis");
                    }
/* 40 */            if (((Long) this.f19397e) == null) {
/* 44 */                strConcat = strConcat.concat(" uptimeMillis");
                    }
/* 52 */            if (((HashMap) this.f19398f) == null) {
/* 56 */                strConcat = strConcat.concat(" autoMetadata");
                    }
/* 64 */            if (strConcat.isEmpty()) {
/* 104 */               return new C2142rf((String) this.f19393a, (Integer) this.f19394b, (sd0) this.f19395c, ((Long) this.f19396d).longValue(), ((Long) this.f19397e).longValue(), (HashMap) this.f19398f);
                    }
/* 114 */           f42.m3656l("Missing required properties:".concat(strConcat));
/* 117 */           return null;
                }

                /* JADX INFO: renamed from: e */
                public HashMap m10042e() {
/* 3 */             er0 er0Var = (er0) this.f19395c;
/* 7 */             HashMap map = new HashMap();
/* 14 */            String strM1599v = ((C0210cb) this.f19393a).m1599v();
/* 20 */            C1969nm c1969nm = (C1969nm) this.f19394b;
/* 24 */            String strM7009l = c1969nm.m7009l("userId");
/* 32 */            if (b40.m1232p(strM7009l)) {
/* 34 */                HashMap mapM7003f = c1969nm.m7003f();
/* 42 */                if (!b40.m1233q(mapM7003f)) {
/* 49 */                    strM7009l = (String) mapM7003f.get("userId");
                        }
                    }
/* 57 */            String strM3589r = ((er0) er0Var.f7853b).m3589r("legacy_event_ids");
/* 83 */            String string = (b40.m1232p(strM3589r) || !b40.m1236t(strM3589r)) ? HttpUrl.FRAGMENT_ENCODE_SET : new JSONObject(strM3589r).getString(strM7009l);
/* 87 */            map.put("did", strM1599v);
/* 94 */            if (!b40.m1232p(string)) {
/* 97 */                strM1599v = string;
                    }
/* 100 */           map.put("id", strM1599v);
/* 113 */           map.put("timestamp", String.valueOf(System.currentTimeMillis()));
/* 120 */           if (b40.m1234r(strM7009l)) {
/* 124 */               map.put("uid", strM7009l);
                    }
/* 129 */           String strM7009l2 = c1969nm.m7009l("userEmail");
/* 137 */           if (b40.m1234r(strM7009l2)) {
/* 141 */               map.put(NotificationCompat.CATEGORY_EMAIL, strM7009l2);
                    }
/* 152 */           map.putAll((HashMap) ((ra2) this.f19396d).f15958d);
/* 161 */           map.put("platform-id", er0Var.m3588q());
/* 164 */           return map;
                }

                /* JADX INFO: renamed from: f */
                public synchronized JSONArray m10043f() {
                    JSONArray jSONArray;
                    JSONArray jSONArray2;
                    Exception e;
/* 4 */             jSONArray = new JSONArray();
                    try {
/* 17 */                String strM3589r = ((er0) ((er0) this.f19395c).f7853b).m3589r("app_launch_events");
/* 25 */                if (!b40.m1232p(strM3589r)) {
/* 29 */                    jSONArray2 = new JSONArray(strM3589r);
                            try {
/* 42 */                        ((er0) ((er0) this.f19395c).f7853b).m3596z("app_launch_events");
                            } catch (Exception e2) {
/* 46 */                        e = e2;
/* 57 */                        xe2.m9777o("analyticsMngr", "Error in getting stored app launch events", e);
                            }
/* 60 */                    jSONArray = jSONArray2;
                        }
                    } catch (Exception e3) {
/* 51 */                jSONArray2 = jSONArray;
/* 52 */                e = e3;
                    }
/* 62 */            return jSONArray;
                }

                /* JADX INFO: renamed from: h */
                public ArrayList m10044h() {
/* 3 */             uu1 uu1Var = (uu1) this.f19398f;
/* 7 */             uu1 uu1Var2 = (uu1) this.f19396d;
/* 11 */            uu1 uu1Var3 = (uu1) this.f19397e;
/* 15 */            uu1 uu1Var4 = (uu1) this.f19395c;
/* 19 */            uu1 uu1Var5 = (uu1) this.f19393a;
/* 25 */            int iOrdinal = ((EnumC0958gl) this.f19394b).ordinal();
/* 34 */            if (iOrdinal != 0) {
/* 36 */                if (iOrdinal == 1) {
/* 99 */                    return C2103qd.m7773h(new List[]{m10038j(uu1Var5), m10038j(uu1Var4), m10038j(uu1Var3), m10038j(uu1Var2), m10038j(uu1Var)});
                        }
/* 38 */                if (iOrdinal != 2) {
/* 41 */                    ds0.m3187b();
/* 44 */                    return null;
                        }
                    }
/* 146 */           return C2103qd.m7773h(new List[]{m10038j(uu1Var5, uu1Var4), m10038j(uu1Var3), m10038j(uu1Var2), m10038j(uu1Var)});
                }

                /* JADX INFO: renamed from: i */
                public List m10045i() {
/* 25 */            ArrayList arrayListM10038j = m10038j((uu1) this.f19398f, (uu1) this.f19397e, (uu1) this.f19396d, (uu1) this.f19395c, (uu1) this.f19393a);
                    return arrayListM10038j != null ? C1839a.m6210b(arrayListM10038j) : nd0.f14189a;
                }

                /* JADX INFO: renamed from: k */
                public void m10046k(JSONArray jSONArray) {
/* 3 */             er0 er0Var = (er0) this.f19395c;
/* 9 */             if (jSONArray.length() == 0) {
/* 11 */                return;
                    }
/* 12 */            JSONArray jSONArrayM3585n = er0Var.m3585n();
/* 22 */            if (jSONArrayM3585n.length() > 1000) {
/* 26 */                JSONArray jSONArray2 = new JSONArray();
/* 33 */                for (int length = jSONArray.length(); length < 1000; length++) {
/* 39 */                    jSONArray2.put(jSONArrayM3585n.get(length));
                        }
/* 45 */                jSONArrayM3585n = jSONArray2;
                    }
/* 51 */            for (int i = 0; i < jSONArray.length(); i++) {
/* 57 */                jSONArrayM3585n.put(jSONArray.get(i));
                    }
/* 63 */            er0Var.m3578A(jSONArrayM3585n);
                }
            }
