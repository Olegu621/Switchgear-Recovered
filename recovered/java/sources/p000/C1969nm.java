            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.Paint;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$styleable;
            import com.google.android.material.datepicker.C0355l;
            import java.io.File;
            import java.lang.ref.WeakReference;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.UUID;
            import okhttp3.HttpUrl;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: renamed from: nm */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 129 */   public final class C1969nm {

                /* JADX INFO: renamed from: a */
                public final Object f14373a;

                /* JADX INFO: renamed from: b */
                public final Object f14374b;

                /* JADX INFO: renamed from: c */
                public final Object f14375c;

                /* JADX INFO: renamed from: d */
                public Object f14376d;

                /* JADX INFO: renamed from: e */
                public Object f14377e;

                /* JADX INFO: renamed from: f */
                public final Object f14378f;

                /* JADX INFO: renamed from: g */
                public final Object f14379g;

                /* JADX INFO: renamed from: h */
                public Object f14380h;

                public C1969nm(Context context) {
/* 18 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(yy1.m10198D(context, C0355l.class.getCanonicalName(), R$attr.materialCalendarStyle), R$styleable.MaterialCalendar);
/* 33 */            this.f14373a = C2093q3.m7680d(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_dayStyle, 0));
/* 45 */            this.f14379g = C2093q3.m7680d(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_dayInvalidStyle, 0));
/* 57 */            this.f14374b = C2093q3.m7680d(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_daySelectedStyle, 0));
/* 69 */            this.f14375c = C2093q3.m7680d(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_dayTodayStyle, 0));
/* 73 */            ColorStateList colorStateListM3033o = de3.m3033o(context, typedArrayObtainStyledAttributes, R$styleable.MaterialCalendar_rangeFillColor);
/* 87 */            this.f14376d = C2093q3.m7680d(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_yearStyle, 0));
/* 99 */            this.f14377e = C2093q3.m7680d(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_yearSelectedStyle, 0));
/* 111 */           this.f14378f = C2093q3.m7680d(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_yearTodayStyle, 0));
/* 115 */           Paint paint = new Paint();
/* 118 */           this.f14380h = paint;
/* 124 */           paint.setColor(colorStateListM3033o.getDefaultColor());
/* 127 */           typedArrayObtainStyledAttributes.recycle();
                }

                /* JADX INFO: renamed from: c */
                public static String m6998c(String str, String str2) {
/* 3 */             StringBuilder sbM3794t = fm0.m3794t(str, "_");
/* 7 */             if (str2 == null) {
/* 9 */                 str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 11 */            sbM3794t.append(str2);
/* 20 */            return sbM3794t.toString().replaceAll("[^a-zA-Z0-9]", "_");
                }

                /* JADX WARN: Code duplicated, block: B:18:0x006c  */
                /* JADX WARN: Code duplicated, block: B:20:0x0077  */
                /* JADX WARN: Code duplicated, block: B:23:0x008c  */
                /* JADX WARN: Code duplicated, block: B:24:0x0093  */
                /* JADX WARN: Code duplicated, block: B:26:0x00a6  */
                /* JADX WARN: Code duplicated, block: B:29:0x00be  */
                /* JADX INFO: renamed from: a */
                public void m6999a() {
                    HashMap map;
                    ss0 ss0VarM10324d;
                    SharedPreferences.Editor editorEdit;
                    SharedPreferences.Editor editorEdit2;
                    long jOptLong;
/* 6 */             er0 er0Var = (er0) this.f14378f;
/* 10 */            String strM3589r = er0Var.m3589r("url_mapping_etag");
/* 16 */            long jM3587p = er0Var.m3587p("url_mapping_last_success_time");
/* 26 */            File file = new File(m7004g());
/* 29 */            boolean zExists = file.exists();
/* 33 */            if (!zExists) {
/* 39 */                file.getParentFile().mkdirs();
/* 42 */                strM3589r = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 44 */            String str = strM3589r;
/* 52 */            if (!zExists || b40.m1232p(str)) {
/* 111 */               map = new HashMap();
/* 118 */               if (b40.m1234r(str)) {
/* 122 */                   map.put("If-None-Match", str);
                        }
/* 133 */               ss0VarM10324d = ((zb0) this.f14374b).m10324d((String) this.f14375c, map, file);
/* 139 */               if (ss0VarM10324d.f16756e) {
/* 148 */                   String str2 = ss0VarM10324d.f16754c;
/* 154 */                   editorEdit = ((SharedPreferences) er0Var.f7853b).edit();
/* 158 */                   editorEdit.putString("url_mapping_etag", str2);
/* 165 */                   if (!editorEdit.commit()) {
/* 167 */                       editorEdit.commit();
                            }
/* 170 */                   long jCurrentTimeMillis = System.currentTimeMillis();
/* 178 */                   editorEdit2 = ((SharedPreferences) er0Var.f7853b).edit();
/* 182 */                   editorEdit2.putLong("url_mapping_last_success_time", jCurrentTimeMillis);
/* 189 */                   if (!editorEdit2.commit()) {
/* 191 */                       editorEdit2.commit();
                            }
                        } else {
/* 144 */                   xe2.m9777o("resCacheMngr", "Failed to download the URLs mapping file", null);
                        }
                    } else {
/* 60 */                long jCurrentTimeMillis2 = System.currentTimeMillis();
                        try {
/* 77 */                    jOptLong = new JSONObject(yy1.m10196B(m7004g())).optLong("ttl", 86400000L);
                        } catch (Exception e) {
/* 85 */                    xe2.m9777o("resCacheMngr", "Error getting cache mapping ttl", e);
/* 88 */                    jOptLong = 86400000;
                        }
/* 94 */                if (jM3587p < jCurrentTimeMillis2 - jOptLong || jM3587p < System.currentTimeMillis() - 604800000) {
/* 111 */                   map = new HashMap();
/* 118 */                   if (b40.m1234r(str)) {
/* 122 */                       map.put("If-None-Match", str);
                            }
/* 133 */                   ss0VarM10324d = ((zb0) this.f14374b).m10324d((String) this.f14375c, map, file);
/* 139 */                   if (ss0VarM10324d.f16756e) {
/* 144 */                       xe2.m9777o("resCacheMngr", "Failed to download the URLs mapping file", null);
                            } else {
/* 148 */                       String str3 = ss0VarM10324d.f16754c;
/* 154 */                       editorEdit = ((SharedPreferences) er0Var.f7853b).edit();
/* 158 */                       editorEdit.putString("url_mapping_etag", str3);
/* 165 */                       if (!editorEdit.commit()) {
/* 167 */                           editorEdit.commit();
                                }
/* 170 */                       long jCurrentTimeMillis3 = System.currentTimeMillis();
/* 178 */                       editorEdit2 = ((SharedPreferences) er0Var.f7853b).edit();
/* 182 */                       editorEdit2.putLong("url_mapping_last_success_time", jCurrentTimeMillis3);
/* 189 */                       if (!editorEdit2.commit()) {
/* 191 */                           editorEdit2.commit();
                                }
                            }
                        }
                    }
/* 196 */           HashMap map2 = new HashMap();
                    try {
/* 214 */               JSONArray jSONArray = new JSONObject(yy1.m10196B(m7004g())).getJSONArray("url_paths");
/* 223 */               for (int i = 0; i < jSONArray.length(); i++) {
/* 225 */                   JSONObject jSONObject = jSONArray.getJSONObject(i);
/* 243 */                   map2.put(jSONObject.getString("path"), Long.valueOf(jSONObject.optLong("ttl", 86400000L)));
                        }
                    } catch (Exception e2) {
/* 252 */               xe2.m9777o("resCacheMngr", "Error getting URLs mapping", e2);
                    }
/* 255 */           this.f14380h = map2;
                }

                /* JADX INFO: renamed from: b */
                public void m7000b() {
/* 12 */            if (!m7003f().isEmpty()) {
/* 98 */                xe2.m9775m("UsrMngr", "Existing anon user details found. Not generating new anon user ID", null);
/* 101 */               return;
                    }
/* 16 */            xe2.m9775m("UsrMngr", "Existing anon user details not found. Generating new anon user ID", null);
/* 21 */            JSONObject jSONObject = new JSONObject();
                    try {
/* 73 */                jSONObject.put("userId", "hsft_anon_" + System.currentTimeMillis() + "-" + UUID.randomUUID().toString().replaceAll("-", HttpUrl.FRAGMENT_ENCODE_SET).substring(0, 15));
/* 86 */                ((er0) this.f14373a).m3595y("anon_user_id_map", jSONObject.toString());
                    } catch (Exception unused) {
/* 92 */                xe2.m9775m("UsrMngr", "Error in saving the anonymous local user id", null);
                    }
                }

                /* JADX INFO: renamed from: d */
                public we2 m7001d() {
/* 1 */             String str = "anon_user_data";
/* 7 */             er0 er0Var = (er0) this.f14373a;
/* 11 */            JSONObject jSONObject = new JSONObject();
/* 14 */            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    try {
/* 16 */                String strM3589r = "{}";
/* 36 */                if (!b40.m1233q(b40.m1239w(((er0) er0Var.f7853b).m3589r("active_user")))) {
/* 42 */                    strM3589r = ((er0) er0Var.f7853b).m3589r("active_user_data");
/* 3 */                     str = "active_user_data";
                        } else if (b40.m1233q(m7003f())) {
/* 67 */                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
/* 62 */                    strM3589r = ((er0) er0Var.f7853b).m3589r("anon_user_data");
                        }
                        try {
/* 72 */                    if (!b40.m1232p(strM3589r)) {
/* 76 */                        jSONObject = new JSONObject(strM3589r);
                            }
                        } catch (Exception e) {
/* 81 */                    e = e;
/* 82 */                    str2 = str;
/* 89 */                    xe2.m9777o("UsrMngr", "Error getting active user in user data", e);
/* 92 */                    str = str2;
                        }
                    } catch (Exception e2) {
/* 84 */                e = e2;
                    }
/* 98 */            return new we2(str, jSONObject, 9, false);
                }

                /* JADX INFO: renamed from: e */
                public HashMap m7002e() {
/* 15 */            HashMap mapM1239w = b40.m1239w(((er0) ((er0) this.f14373a).f7853b).m3589r("active_user"));
/* 23 */            if (b40.m1233q(mapM1239w)) {
/* 25 */                mapM1239w = m7003f();
                    }
                    return b40.m1233q(mapM1239w) ? new HashMap() : m7007j(mapM1239w);
                }

                /* JADX INFO: renamed from: f */
                public HashMap m7003f() {
/* 15 */            return b40.m1239w(((er0) ((er0) this.f14373a).f7853b).m3589r("anon_user_id_map"));
                }

                /* JADX INFO: renamed from: g */
                public String m7004g() {
/* 25 */            return m7005h() + File.separator + ((String) this.f14376d);
                }

                /* JADX INFO: renamed from: h */
                public String m7005h() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append((String) this.f14373a);
/* 13 */            String str = File.separator;
/* 19 */            fm0.m3796v(sb, str, "helpshift", str, "resource_cache");
/* 22 */            sb.append(str);
/* 29 */            sb.append((String) this.f14377e);
/* 32 */            return sb.toString();
                }

                /* JADX INFO: renamed from: i */
                public int m7006i() {
/* 14 */            return ((Integer) m7008k(0, "unread_count")).intValue();
                }

                /* JADX INFO: renamed from: j */
                public HashMap m7007j(HashMap map) {
/* 19 */            HashMap mapM1239w = b40.m1239w(((er0) ((er0) ((ts0) this.f14374b).f17248a).f7853b).m3589r("user_data_key_mapping"));
/* 27 */            if (b40.m1233q(mapM1239w)) {
/* 29 */                return null;
                    }
/* 33 */            HashMap map2 = new HashMap();
/* 48 */            for (String str : map.keySet()) {
/* 60 */                String str2 = (String) mapM1239w.get(str);
/* 66 */                if (b40.m1234r(str2)) {
/* 72 */                    map2.put(str2, map.get(str));
                        }
                    }
/* 76 */            return map2;
                }

                /* JADX INFO: renamed from: k */
                public Object m7008k(Object obj, String str) {
                    Object objOpt;
/* 1 */             we2 we2VarM7001d = m7001d();
                    return (b40.m1232p((String) we2VarM7001d.f18596c) || (objOpt = ((JSONObject) we2VarM7001d.f18595b).opt(str)) == null) ? obj : objOpt;
                }

                /* JADX INFO: renamed from: l */
                public String m7009l(String str) {
/* 11 */            String strM3589r = ((er0) ((er0) this.f14373a).f7853b).m3589r("active_user");
/* 21 */            if (strM3589r.isEmpty()) {
/* 19 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    try {
/* 29 */                return new JSONObject(strM3589r).getString(str);
                    } catch (JSONException e) {
/* 43 */                xe2.m9777o("UsrMngr", "error in getting user info for key: ".concat(str), e);
/* 19 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }

                /* JADX INFO: renamed from: m */
                public boolean m7010m() {
/* 11 */            return ((Boolean) m7008k(Boolean.FALSE, "push_token_synced")).booleanValue();
                }

                /* JADX INFO: renamed from: n */
                public void m7011n(Object obj, String str) {
/* 1 */             we2 we2VarM7001d = m7001d();
/* 5 */             Object obj2 = we2VarM7001d.f18595b;
/* 9 */             String str2 = (String) we2VarM7001d.f18596c;
/* 15 */            if (b40.m1232p(str2)) {
/* 17 */                return;
                    }
/* 18 */            JSONObject jSONObject = (JSONObject) obj2;
/* 20 */            jSONObject.put(str, obj);
/* 31 */            ((er0) this.f14373a).m3595y(str2, jSONObject.toString());
                }

                /* JADX INFO: renamed from: o */
                public boolean m7012o(String str) {
/* 5 */             boolean z = false;
/* 6 */             if (b40.m1232p(str)) {
/* 5 */                 return false;
                    }
/* 17 */            Iterator it = ((HashMap) this.f14380h).keySet().iterator();
/* 25 */            while (it.hasNext()) {
/* 37 */                if (str.startsWith((String) it.next())) {
/* 39 */                    z = true;
                            break;
                        }
                    }
/* 65 */            xe2.m9775m("resCacheMngr", "Should cache url? " + z + "   with path - " + str, null);
/* 68 */            return z;
                }

                /* JADX INFO: renamed from: p */
                public boolean m7013p() {
/* 11 */            return ((Boolean) m7008k(Boolean.FALSE, "should_poll")).booleanValue();
                }

/* 130 */       public C1969nm(er0 er0Var, qi1 qi1Var, ts0 ts0Var, ra2 ra2Var, C0168b5 c0168b5) {
/* 132 */           this.f14373a = er0Var;
/* 133 */           this.f14374b = ts0Var;
/* 134 */           this.f14375c = qi1Var;
/* 135 */           this.f14378f = ra2Var;
/* 136 */           this.f14379g = c0168b5;
/* 137 */           this.f14380h = new WeakReference(null);
                }

/* 137 */       public C1969nm(er0 er0Var, zb0 zb0Var, v32 v32Var, String str, String str2, String str3, String str4) {
/* 139 */           this.f14374b = zb0Var;
/* 140 */           this.f14378f = er0Var;
/* 141 */           this.f14379g = v32Var;
/* 142 */           this.f14373a = str;
/* 143 */           this.f14375c = str2;
/* 144 */           this.f14376d = str3;
/* 145 */           this.f14377e = str4;
/* 146 */           this.f14380h = new HashMap();
                }
            }
