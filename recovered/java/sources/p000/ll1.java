            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.database.Cursor;
            import androidx.core.app.NotificationCompat;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.ByteArrayInputStream;
            import java.io.File;
            import java.io.ObjectInputStream;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.Locale;
            import java.util.Map;
            import java.util.TimeZone;
            import okhttp3.HttpUrl;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ll1 {

                /* JADX INFO: renamed from: a */
                public final SharedPreferences f13382a;

                /* JADX INFO: renamed from: b */
                public at0 f13383b;

                /* JADX INFO: renamed from: c */
                public final er0 f13384c;

                /* JADX INFO: renamed from: d */
                public final Context f13385d;

                /* JADX INFO: renamed from: e */
                public at0 f13386e;

                /* JADX INFO: renamed from: f */
                public final xi1 f13387f;

                /* JADX INFO: renamed from: g */
                public final StringBuilder f13388g;

                /* JADX INFO: renamed from: h */
                public final HashMap f13389h;

                /* JADX INFO: renamed from: i */
                public int f13390i;

                public ll1(Context context, er0 er0Var) {
/* 6 */             HashMap map = new HashMap();
/* 9 */             this.f13389h = map;
/* 12 */            this.f13390i = 0;
/* 14 */            this.f13385d = context;
/* 18 */            SharedPreferences sharedPreferences = context.getSharedPreferences("__hs_migration_prefs", 0);
/* 22 */            this.f13382a = sharedPreferences;
/* 24 */            this.f13384c = er0Var;
/* 31 */            this.f13387f = new xi1(sharedPreferences);
/* 40 */            this.f13388g = new StringBuilder("Migration Result: ");
/* 46 */            map.put("DeviceId : ", "Failed");
/* 51 */            map.put("SDK Language : ", "Failed");
/* 56 */            map.put("Push Token : ", "Failed");
/* 61 */            map.put("Legacy Analytics Id : ", "Failed");
/* 66 */            map.put("User Data : ", "Failed");
                }

                /* JADX INFO: renamed from: i */
                public static Object m6484i(byte[] bArr) throws Throwable {
                    ByteArrayInputStream byteArrayInputStream;
                    Throwable th;
                    ObjectInputStream objectInputStream;
                    try {
/* 4 */                 byteArrayInputStream = new ByteArrayInputStream(bArr);
                        try {
/* 9 */                     objectInputStream = new ObjectInputStream(byteArrayInputStream);
                            try {
/* 12 */                        Object object = objectInputStream.readObject();
/* 16 */                        b40.m1221e(byteArrayInputStream);
/* 19 */                        b40.m1221e(objectInputStream);
/* 22 */                        return object;
                            } catch (Throwable th2) {
/* 23 */                        th = th2;
/* 34 */                        b40.m1221e(byteArrayInputStream);
/* 37 */                        b40.m1221e(objectInputStream);
/* 40 */                        throw th;
                            }
                        } catch (Throwable th3) {
/* 27 */                    th = th3;
/* 28 */                    objectInputStream = null;
                        }
                    } catch (Throwable th4) {
/* 31 */                byteArrayInputStream = null;
/* 32 */                th = th4;
/* 33 */                objectInputStream = null;
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m6485a(int i) {
/* 1 */             xi1 xi1Var = this.f13387f;
                    try {
/* 35 */                String str = "Native SDK version: " + this.f13385d.getSharedPreferences("HSJsonData", 0).getString("libraryVersion", "unknown") + " to SDK X version: 10.2.0";
/* 40 */                if (i != -1) {
/* 54 */                    xi1Var.getClass();
                        } else {
/* 43 */                    xi1Var.m9969a(str, null);
/* 48 */                    xi1Var.m9969a(" Migration failed!", null);
                        }
                    } catch (Exception e) {
/* 60 */                xi1Var.m9969a("Error fetching SDK info for logging", e);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final boolean m6486b(String str) {
/* 16 */            return new File(this.f13385d.getDatabasePath(str).getAbsolutePath()).exists();
                }

                /* JADX INFO: renamed from: c */
                public final void m6487c(String str, boolean z) {
/* 6 */             String str2 = z ? " : Success" : " : Failed";
/* 8 */             xi1 xi1Var = this.f13387f;
/* 10 */            if (z) {
/* 21 */                xi1Var.getClass();
                    } else {
/* 17 */                xi1Var.m9969a(str.concat(str2), null);
                    }
                }

                /* JADX INFO: renamed from: d */
                public final boolean m6488d() throws Throwable {
                    boolean z;
/* 1 */             er0 er0Var = this.f13384c;
/* 19 */            if (b40.m1234r(((er0) er0Var.f7853b).m3589r("hs_did"))) {
/* 21 */                z = true;
                    } else {
/* 25 */                Object objM6491g = m6491g("key_support_device_id");
/* 29 */                if (objM6491g == null) {
/* 31 */                    z = false;
                        } else {
/* 35 */                    er0Var.m3595y("hs_did", (String) objM6491g);
/* 21 */                    z = true;
                        }
                    }
/* 41 */            m6487c("DeviceId migration", z);
/* 46 */            m6493j("DeviceId : ", z);
/* 53 */            boolean zM1234r = b40.m1234r(er0Var.m3584m());
/* 57 */            String str = HttpUrl.FRAGMENT_ENCODE_SET;
/* 59 */            if (!zM1234r) {
/* 64 */                Object objM6491g2 = m6491g("key_push_token");
/* 78 */                er0Var.m3595y("current_push_token", objM6491g2 instanceof String ? (String) objM6491g2 : HttpUrl.FRAGMENT_ENCODE_SET);
                    }
/* 83 */            m6487c("Push token migration", true);
/* 88 */            m6493j("Push Token : ", true);
/* 105 */           if (!b40.m1234r(((er0) er0Var.f7853b).m3589r("language"))) {
/* 110 */               Object objM6491g3 = m6491g("sdkLanguage");
/* 116 */               if (objM6491g3 instanceof String) {
/* 119 */                   str = (String) objM6491g3;
                        }
/* 121 */               er0Var.m3595y("language", str);
                    }
/* 126 */           m6487c("SDK language migration", true);
/* 131 */           m6493j("SDK Language : ", true);
                    return z;
                }

                /* JADX WARN: Code duplicated, block: B:22:0x0052  */
                /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
                /* JADX INFO: renamed from: e */
                public final boolean m6489e() {
/* 7 */             if (!m6486b("__hs_db_helpshift_users")) {
/* 9 */                 return false;
                    }
/* 13 */            JSONObject jSONObject = new JSONObject();
/* 16 */            Cursor cursorRawQuery = null;
                    try {
                        try {
/* 25 */                    cursorRawQuery = this.f13386e.getReadableDatabase().rawQuery("SELECT * FROM legacy_analytics_event_id_table", null);
/* 33 */                    while (cursorRawQuery.moveToNext()) {
/* 55 */                        jSONObject.put(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("identifier")), cursorRawQuery.getString(cursorRawQuery.getColumnIndex("analytics_event_id")));
                            }
                        } catch (Exception e) {
/* 71 */                    this.f13387f.m9969a("Error reading legacy analytics event id.", e);
/* 74 */                    if (cursorRawQuery != null) {
                            }
/* 81 */                    if (jSONObject.length() > 0) {
/* 94 */                        return true;
                            }
/* 91 */                    this.f13384c.m3595y("legacy_event_ids", jSONObject.toString());
/* 94 */                    return true;
                        }
/* 63 */                cursorRawQuery.close();
/* 81 */                if (jSONObject.length() > 0) {
/* 94 */                    return true;
                        }
/* 91 */                this.f13384c.m3595y("legacy_event_ids", jSONObject.toString());
/* 94 */                return true;
                    } catch (Throwable th) {
/* 96 */                if (cursorRawQuery != null) {
/* 98 */                    cursorRawQuery.close();
                        }
/* 101 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: f */
                public final boolean m6490f() {
/* 1 */             xi1 xi1Var = this.f13387f;
/* 12 */            if (m6486b("__hs_db_helpshift_users")) {
/* 18 */                ArrayList<Map> arrayList = new ArrayList();
/* 21 */                Cursor cursorRawQuery = null;
                        try {
                            try {
/* 30 */                        cursorRawQuery = this.f13386e.getReadableDatabase().rawQuery("SELECT * FROM user_table", null);
/* 44 */                        while (cursorRawQuery.moveToNext()) {
/* 48 */                            HashMap map = new HashMap();
/* 65 */                            map.put("anon", String.valueOf(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("anonymous"))));
/* 78 */                            map.put("userId", cursorRawQuery.getString(cursorRawQuery.getColumnIndex("identifier")));
/* 93 */                            map.put("userName", cursorRawQuery.getString(cursorRawQuery.getColumnIndex("name")));
/* 108 */                           map.put("userEmail", cursorRawQuery.getString(cursorRawQuery.getColumnIndex(NotificationCompat.CATEGORY_EMAIL)));
/* 123 */                           map.put("userAuthToken", cursorRawQuery.getString(cursorRawQuery.getColumnIndex("auth_token")));
/* 140 */                           map.put("isActive", String.valueOf(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("active"))));
/* 143 */                           arrayList.add(map);
                                }
/* 151 */                       cursorRawQuery.close();
/* 162 */                       for (Map map2 : arrayList) {
                                    try {
/* 174 */                               boolean zEquals = "1".equals(map2.remove("anon"));
/* 182 */                               boolean zEquals2 = "1".equals(map2.remove("isActive"));
/* 186 */                               er0 er0Var = this.f13384c;
/* 188 */                               if (zEquals) {
/* 192 */                                   JSONObject jSONObject = new JSONObject();
/* 199 */                                   jSONObject.put("userId", map2.get("userId"));
/* 208 */                                   er0Var.m3595y("anon_user_id_map", jSONObject.toString());
                                        } else if (zEquals2) {
/* 227 */                                   er0Var.m3595y("active_user", new JSONObject(map2).toString());
                                        }
                                    } catch (Exception e) {
/* 233 */                               xi1Var.m9969a("Error setting user data in SDK X migration", e);
/* 11 */                                return false;
                                    }
                                }
/* 237 */                       return true;
                            } catch (Exception e2) {
/* 241 */                       xi1Var.m9969a("Error getting user data from native SDK", e2);
/* 244 */                       if (cursorRawQuery != null) {
/* 246 */                           cursorRawQuery.close();
                                }
                            }
                        } catch (Throwable th) {
/* 250 */                   if (cursorRawQuery != null) {
/* 252 */                       cursorRawQuery.close();
                            }
/* 255 */                   throw th;
                        }
                    }
/* 11 */            return false;
                }

                /* JADX WARN: Code duplicated, block: B:23:0x0049  */
                /* JADX WARN: Code duplicated, block: B:30:? A[SYNTHETIC] */
                /* JADX INFO: renamed from: g */
                public final Object m6491g(String str) throws Throwable {
                    Throwable th;
                    Cursor cursorQuery;
/* 3 */             Cursor cursor = null;
                    try {
/* 22 */                cursorQuery = this.f13383b.getReadableDatabase().query("key_value_store", null, "key=?", new String[]{str}, null, null, null);
                        try {
                            try {
/* 37 */                        Object objM6484i = cursorQuery.moveToFirst() ? m6484i(cursorQuery.getBlob(1)) : null;
/* 48 */                        cursorQuery.close();
/* 51 */                        return objM6484i;
                            } catch (Exception e) {
/* 46 */                        e = e;
/* 63 */                        this.f13387f.m9969a("Failed to read the native db or DB does not exist. Key : ".concat(str), e);
/* 66 */                        if (cursorQuery != null) {
/* 68 */                            cursorQuery.close();
                                }
/* 3 */                         return null;
                            }
                        } catch (Throwable th2) {
/* 43 */                    th = th2;
/* 44 */                    cursor = cursorQuery;
/* 72 */                    if (cursor != null) {
/* 77 */                        throw th;
                            }
/* 74 */                    cursor.close();
/* 77 */                    throw th;
                        }
                    } catch (Exception e2) {
/* 55 */                e = e2;
/* 56 */                cursorQuery = null;
                    } catch (Throwable th3) {
/* 53 */                th = th3;
/* 72 */                if (cursor != null) {
/* 77 */                    throw th;
                        }
/* 74 */                cursor.close();
/* 77 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: h */
                public final void m6492h(int i) {
/* 2 */             if (i != -1) {
/* 4 */                 return;
                    }
/* 7 */             StringBuilder sb = this.f13388g;
/* 9 */             sb.append(" Attempts: ");
/* 14 */            sb.append(this.f13390i);
/* 19 */            sb.append(" , ");
/* 24 */            sb.append("DeviceId : ");
/* 27 */            HashMap map = this.f13389h;
/* 35 */            sb.append((String) map.get("DeviceId : "));
/* 38 */            sb.append(" , ");
/* 43 */            sb.append("User Data : ");
/* 52 */            sb.append((String) map.get("User Data : "));
/* 55 */            sb.append(" , ");
/* 60 */            sb.append("Push Token : ");
/* 69 */            sb.append((String) map.get("Push Token : "));
/* 72 */            sb.append(" , ");
/* 77 */            sb.append("SDK Language : ");
/* 86 */            sb.append((String) map.get("SDK Language : "));
/* 89 */            sb.append(" , ");
/* 94 */            sb.append("Legacy Analytics Id : ");
/* 103 */           sb.append((String) map.get("Legacy Analytics Id : "));
                    try {
/* 108 */               JSONObject jSONObject = new JSONObject();
/* 117 */               SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH);
/* 126 */               simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
/* 140 */               jSONObject.put("dt", simpleDateFormat.format(new Date()));
/* 147 */               jSONObject.put("l", "ERROR");
/* 156 */               jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, sb.toString());
/* 163 */               jSONObject.put("src", "sdkx.android.10.2.0");
/* 182 */               this.f13382a.edit().putString("failure_logs", jSONObject.toString()).commit();
                    } catch (Exception unused) {
/* 190 */               AbstractC1245n0.m4876d("Helpshift_Migrator", "Error storing failure log.");
                    }
                }

                /* JADX INFO: renamed from: j */
                public final void m6493j(String str, boolean z) {
/* 1 */             if (z) {
/* 7 */                 this.f13389h.put(str, "Success");
                    }
                }
            }
