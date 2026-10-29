            package p000;

            import android.database.Cursor;
            import android.database.sqlite.SQLiteException;
            import android.text.TextUtils;
            import com.google.android.gms.internal.measurement.zzhr;
            import com.google.android.gms.internal.measurement.zzhs;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import okhttp3.HttpUrl;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 28 */    public final class hh2 implements InterfaceC2188so {

                /* JADX INFO: renamed from: a */
                public long f9082a;

                /* JADX INFO: renamed from: b */
                public final Object f9083b;

                /* JADX INFO: renamed from: c */
                public final Object f9084c;

                public hh2(ae3 ae3Var, String str, long j) {
/* 4 */             this.f9084c = ae3Var;
/* 6 */             kb1.m6058k(str);
/* 9 */             this.f9083b = str;
/* 27 */            this.f9082a = ae3Var.m243W("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
                }

                /* JADX INFO: renamed from: c */
                public static String m4226c(String str, long j, String str2) {
                    try {
/* 3 */                 JSONObject jSONObject = new JSONObject();
/* 8 */                 jSONObject.put("token", str);
/* 13 */                jSONObject.put("appVersion", str2);
/* 18 */                jSONObject.put("timestamp", j);
/* 21 */                return jSONObject.toString();
                    } catch (JSONException e) {
/* 43 */                AbstractC1245n0.m4889q("FirebaseMessaging", "Failed to encode token: " + e);
/* 46 */                return null;
                    }
                }

                /* JADX INFO: renamed from: d */
                public static hh2 m4227d(String str) {
/* 5 */             Object obj = null;
/* 6 */             if (TextUtils.isEmpty(str)) {
/* 5 */                 return null;
                    }
/* 15 */            if (!str.startsWith("{")) {
/* 71 */                return new hh2(str, 0L, obj);
                    }
                    try {
/* 19 */                JSONObject jSONObject = new JSONObject(str);
/* 42 */                return new hh2(jSONObject.getString("token"), jSONObject.getLong("timestamp"), jSONObject.getString("appVersion"));
                    } catch (JSONException e) {
/* 63 */                AbstractC1245n0.m4889q("FirebaseMessaging", "Failed to parse token: " + e);
/* 5 */                 return null;
                    }
                }

                @Override // p000.InterfaceC2188so
                /* JADX INFO: renamed from: a */
                public nm2 mo1580a() {
/* 3 */             return (nm2) this.f9084c;
                }

                @Override // p000.InterfaceC2188so
                /* JADX INFO: renamed from: b */
                public long mo1581b() {
/* 3 */             InterfaceC2188so interfaceC2188so = (InterfaceC2188so) this.f9083b;
/* 5 */             if (interfaceC2188so != null) {
/* 7 */                 return interfaceC2188so.mo1581b();
                    }
/* 12 */            long j = this.f9082a;
/* 18 */            if (j != -1) {
/* 20 */                return j;
                    }
/* 23 */            f42.m3656l("No timestamp is available.");
/* 26 */            return 0L;
                }

                @Override // p000.InterfaceC2188so
                /* JADX INFO: renamed from: e */
                public EnumC2151ro mo1584e() {
/* 3 */             InterfaceC2188so interfaceC2188so = (InterfaceC2188so) this.f9083b;
                    return interfaceC2188so != null ? interfaceC2188so.mo1584e() : EnumC2151ro.f16204a;
                }

                /* JADX INFO: renamed from: f */
                public List m4228f() {
                    List list;
                    List list2;
/* 6 */             ae3 ae3Var = (ae3) this.f9084c;
/* 10 */            ArrayList arrayList = new ArrayList();
/* 16 */            String str = (String) this.f9083b;
/* 32 */            Cursor cursorQuery = null;
                    try {
                        try {
/* 59 */                    cursorQuery = ae3Var.m261q0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", SharedDataContentProvider.BASE_PATH, "realtime"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.f9082a)}, null, null, "rowid", "1000");
/* 67 */                    if (cursorQuery.moveToFirst()) {
/* 177 */                       do {
/* 70 */                            long j = cursorQuery.getLong(0);
/* 75 */                            long j2 = cursorQuery.getLong(3);
/* 89 */                            boolean z = cursorQuery.getLong(5) == 1;
/* 93 */                            byte[] blob = cursorQuery.getBlob(4);
/* 101 */                           if (j > this.f9082a) {
/* 103 */                               this.f9082a = j;
                                    }
                                    try {
/* 113 */                               zzhr zzhrVar = (zzhr) ci3.m1677m0(zzhs.zzk(), blob);
/* 115 */                               String string = cursorQuery.getString(1);
/* 119 */                               if (string == null) {
/* 121 */                                   string = HttpUrl.FRAGMENT_ENCODE_SET;
                                        }
/* 123 */                               zzhrVar.zzl(string);
/* 131 */                               zzhrVar.zzo(cursorQuery.getLong(2));
/* 148 */                               arrayList.add(new xd3(j, j2, z, (zzhs) zzhrVar.zzbc()));
                                    } catch (IOException e) {
/* 157 */                               uh3 uh3Var = ((ij3) ae3Var.f16749a).f9655f;
/* 159 */                               ij3.m4555l(uh3Var);
/* 170 */                               uh3Var.f17538f.m8512c(uh3.m9013H(str), "Data loss. Failed to merge raw event. appId", e);
                                    }
/* 177 */                       } while (cursorQuery.moveToNext());
                                list = arrayList;
                            } else {
/* 184 */                       list2 = Collections.EMPTY_LIST;
                            }
                        } catch (SQLiteException e2) {
/* 191 */                   uh3 uh3Var2 = ((ij3) ae3Var.f16749a).f9655f;
/* 193 */                   ij3.m4555l(uh3Var2);
/* 204 */                   uh3Var2.f17538f.m8512c(uh3.m9013H(str), "Data loss. Error querying raw events batch. appId", e2);
                            list = arrayList;
                        }
                        list = list2;
/* 212 */               return list;
                    } finally {
/* 213 */               if (0 != 0) {
/* 215 */                   cursorQuery.close();
                        }
                    }
                }

                @Override // p000.InterfaceC2188so
                /* JADX INFO: renamed from: g */
                public EnumC2077po mo1586g() {
/* 3 */             InterfaceC2188so interfaceC2188so = (InterfaceC2188so) this.f9083b;
                    return interfaceC2188so != null ? interfaceC2188so.mo1586g() : EnumC2077po.f15194a;
                }

                @Override // p000.InterfaceC2188so
                /* JADX INFO: renamed from: j */
                public EnumC2114qo mo1589j() {
/* 3 */             InterfaceC2188so interfaceC2188so = (InterfaceC2188so) this.f9083b;
                    return interfaceC2188so != null ? interfaceC2188so.mo1589j() : EnumC2114qo.f15667a;
                }

/* 29 */        public hh2(ae3 ae3Var, String str) {
                    this.f9084c = ae3Var;
/* 31 */            kb1.m6058k(str);
                    this.f9083b = str;
                    this.f9082a = -1L;
                }

/* 31 */        public /* synthetic */ hh2(Object obj, long j, Object obj2) {
/* 32 */            this.f9083b = obj;
                    this.f9084c = obj2;
                    this.f9082a = j;
                }
            }
