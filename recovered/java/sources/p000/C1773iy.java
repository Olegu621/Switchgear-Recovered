            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.content.SharedPreferences;
            import android.net.ConnectivityManager;
            import android.net.NetworkInfo;
            import android.os.Build;
            import android.preference.PreferenceManager;
            import android.telephony.TelephonyManager;
            import androidx.core.app.NotificationCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.usercentrics.sdk.p009v2.settings.data.ConsentDisclosureObject;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.ByteArrayInputStream;
            import java.io.CharConversionException;
            import java.io.IOException;
            import java.security.GeneralSecurityException;
            import java.security.KeyStoreException;
            import java.security.ProviderException;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.ConcurrentHashMap;
            import okhttp3.HttpUrl;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: renamed from: iy */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 20 */    public final class C1773iy implements InterfaceC0824cy {

                /* JADX INFO: renamed from: v */
                public static final C0971gy f11954v = new C0971gy(0);

                /* JADX INFO: renamed from: a */
                public Object f11955a;

                /* JADX INFO: renamed from: b */
                public Object f11956b;

                /* JADX INFO: renamed from: c */
                public Object f11957c;

                /* JADX INFO: renamed from: d */
                public Object f11958d;

                /* JADX INFO: renamed from: e */
                public Object f11959e;

                /* JADX INFO: renamed from: f */
                public Object f11960f;

                /* JADX INFO: renamed from: i */
                public Object f11961i;

                public C1773iy(Long l, Boolean bool, String str, ConsentDisclosureObject consentDisclosureObject, Boolean bool2, Boolean bool3, hu1 hu1Var) {
/* 1 */             hu1Var.getClass();
/* 7 */             this.f11955a = l;
/* 9 */             this.f11956b = bool;
/* 11 */            this.f11957c = str;
/* 13 */            this.f11958d = consentDisclosureObject;
/* 15 */            this.f11959e = bool2;
/* 17 */            this.f11960f = bool3;
/* 19 */            this.f11961i = hu1Var;
                }

                /* JADX INFO: renamed from: r */
                public static fs0 m5610r(byte[] bArr) throws IOException {
/* 3 */             ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
/* 34 */                return new fs0((f41) ((i41) C0875ec.m3361s(i41.m4465D(byteArrayInputStream, dg0.m3057a())).f7613b).m8625v(), 3);
                    } finally {
/* 39 */                byteArrayInputStream.close();
                    }
                }

                @Override // p000.InterfaceC0824cy
                /* JADX INFO: renamed from: c */
                public synchronized iz1 mo1259c(f02 f02Var) {
/* 10 */            s51 s51Var = (s51) ((HashMap) this.f11957c).get(f02Var);
/* 12 */            if (s51Var != null) {
/* 15 */                return s51Var;
                    }
/* 16 */            return f11954v;
                }

                @Override // p000.InterfaceC0824cy
                /* JADX INFO: renamed from: d */
                public synchronized iz1 mo1260d(f02 f02Var) {
/* 4 */             xe2.m9769g(f02Var, "Null interface requested.");
/* 15 */            return (iz1) ((HashMap) this.f11956b).get(f02Var);
                }

                /* JADX INFO: renamed from: f */
                public synchronized d52 m5611f() {
                    d52 d52Var;
                    try {
/* 6 */                 if (((String) this.f11956b) == null) {
/* 131 */                   throw new IllegalArgumentException("keysetName cannot be null");
                        }
                        synchronized (d52.f6998d) {
                            try {
/* 13 */                        Context context = (Context) this.f11955a;
/* 17 */                        String str = (String) this.f11956b;
/* 21 */                        String str2 = (String) this.f11957c;
/* 23 */                        byte[] bArrM7905p = null;
/* 24 */                        if (str != null) {
/* 26 */                            Context applicationContext = context.getApplicationContext();
                                    try {
/* 42 */                                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
/* 46 */                                if (string != null) {
/* 49 */                                    bArrM7905p = qj3.m7905p(string);
                                        }
                                    } catch (ClassCastException | IllegalArgumentException unused) {
/* 67 */                                throw new CharConversionException(fm0.m3784j("can't read keyset; the pref value ", str, " is not a valid hex string"));
                                    }
                                } else {
/* 70 */                            C1951n4.m6859j("keysetName cannot be null");
                                }
/* 75 */                        String str3 = (String) this.f11958d;
/* 77 */                        if (bArrM7905p == null) {
/* 79 */                            if (str3 != null) {
/* 85 */                                this.f11959e = m5624t();
                                    }
/* 94 */                            this.f11961i = m5615j();
                                } else if (str3 != null) {
/* 103 */                           this.f11961i = m5623s(bArrM7905p);
                                } else {
/* 110 */                           this.f11961i = m5610r(bArrM7905p);
                                }
/* 114 */                       d52Var = new d52(this);
                            } catch (Throwable th) {
/* 121 */                       throw th;
                            }
                        }
                    } catch (Throwable th2) {
/* 133 */               throw th2;
                    }
/* 119 */           return d52Var;
                }

                /* JADX INFO: renamed from: g */
                public void m5612g(HashMap map, boolean z) {
                    ArrayDeque arrayDeque;
/* 13 */            for (Map.Entry entry : map.entrySet()) {
/* 25 */                C2197sx c2197sx = (C2197sx) entry.getKey();
/* 31 */                iz1 iz1Var = (iz1) entry.getValue();
/* 33 */                int i = c2197sx.f16834d;
/* 36 */                if (i == 1 || (i == 2 && z)) {
/* 44 */                    iz1Var.get();
                        }
                    }
/* 50 */            xe0 xe0Var = (xe0) this.f11959e;
                    synchronized (xe0Var) {
                        try {
/* 53 */                    arrayDeque = xe0Var.f19054b;
/* 56 */                    if (arrayDeque != null) {
/* 58 */                        xe0Var.f19054b = null;
                            } else {
/* 63 */                        arrayDeque = null;
                            }
                        } catch (Throwable th) {
/* 85 */                    throw th;
                        }
                    }
/* 65 */            if (arrayDeque != null) {
/* 67 */                Iterator it = arrayDeque.iterator();
/* 75 */                if (it.hasNext()) {
/* 82 */                    throw fm0.m3780f(it);
                        }
                    }
                }

                /* JADX INFO: renamed from: h */
                public int m5613h() {
/* 5 */             wc0 wc0Var = (wc0) this.f11961i;
/* 7 */             ym1 ym1Var = ym1.f19696i;
/* 9 */             ym1 ym1Var2 = ym1.f19697v;
/* 20 */            xe2.m9775m("ftchNotif", "Fetching notification count from network.", null);
/* 25 */            ts0 ts0Var = (ts0) this.f11957c;
/* 41 */            HashMap mapM1239w = b40.m1239w(((er0) ((er0) ts0Var.f17248a).f7853b).m3589r("network_headers"));
/* 55 */            String strM3589r = ((er0) ((er0) ts0Var.f17248a).f7853b).m3589r("polling_route");
/* 61 */            C1969nm c1969nm = (C1969nm) this.f11958d;
/* 63 */            HashMap mapM7002e = c1969nm.m7002e();
/* 71 */            if (b40.m1233q(mapM7002e) || b40.m1233q(mapM1239w) || b40.m1232p(strM3589r)) {
/* 406 */               xe2.m9775m("ftchNotif", "Skipping notification count fetch. Invalid params for network call.", null);
/* 85 */                return -1;
                    }
/* 123 */           long jLongValue = Long.valueOf(c1969nm.m7008k(0, "cursor") + HttpUrl.FRAGMENT_ENCODE_SET).longValue();
/* 133 */           if (jLongValue != 0) {
/* 139 */               mapM7002e.put("cursor", String.valueOf(jLongValue));
                    }
/* 152 */           mapM7002e.put("did", ((C0210cb) this.f11955a).m1599v());
/* 165 */           mapM7002e.put("platform-id", ((er0) this.f11956b).m3588q());
                    try {
/* 184 */               C1795jj c1795jjM8750l = new lp0((ec0) this.f11960f, strM3589r, 0).m8750l(new wc0(13, mapM1239w, mapM7002e));
/* 188 */               int i = c1795jjM8750l.f12324a;
/* 190 */               String str = c1795jjM8750l.f12325b;
/* 194 */               if (i == 401 && !b40.m1232p(str)) {
/* 206 */                   if ("missing user auth token".equalsIgnoreCase(str)) {
/* 226 */                       throw gt0.m4014a(null, ym1Var, null);
                            }
/* 212 */                   if ("invalid user auth token".equalsIgnoreCase(str)) {
/* 220 */                       throw gt0.m4014a(null, ym1Var2, null);
                            }
                        }
/* 229 */               JSONObject jSONObject = new JSONObject(str);
/* 234 */               int iOptInt = jSONObject.optInt("uc", 0);
/* 242 */               int iOptInt2 = jSONObject.optInt("bpi", 5000);
/* 251 */               int iOptInt3 = jSONObject.optInt("mpi", 60000);
/* 260 */               boolean zOptBoolean = jSONObject.optBoolean("cp", false);
/* 272 */               long jOptLong = jSONObject.optLong("c", 0L);
/* 282 */               c1969nm.m7011n(Integer.valueOf(iOptInt2), "base_polling_interval");
/* 291 */               c1969nm.m7011n(Integer.valueOf(iOptInt3), "max_polling_interval");
/* 300 */               c1969nm.m7011n(Boolean.valueOf(zOptBoolean), "should_poll");
/* 303 */               if (iOptInt > 0) {
/* 309 */                   int iM7006i = c1969nm.m7006i() + iOptInt;
/* 323 */                   c1969nm.m7011n(Integer.valueOf(c1969nm.m7006i() + iOptInt), "unread_count");
/* 330 */                   if (!c1969nm.m7010m()) {
/* 354 */                       ((C0168b5) this.f11959e).m1253H(iM7006i > 1 ? ts0Var.m8908t(iM7006i, "plural_message") : ts0Var.m8908t(iM7006i, "single_message"), false);
                            }
                        }
/* 368 */               c1969nm.m7011n(Long.valueOf(jOptLong), "cursor");
/* 371 */               return i;
                    } catch (gt0 e) {
/* 378 */               ym1 ym1Var3 = e.f8807c;
/* 380 */               if (ym1Var3 == ym1Var2) {
/* 382 */                   wc0Var.m9526C("invalid user auth token");
                        } else if (ym1Var3 == ym1Var) {
/* 388 */                   wc0Var.m9526C("missing user auth token");
                        }
/* 393 */               xe2.m9777o("ftchNotif", "HSRootApiException in poller request", e);
/* 95 */                return -1;
                    } catch (JSONException e2) {
/* 399 */               xe2.m9777o("ftchNotif", "Error parsing poller response", e2);
/* 95 */                return -1;
                    } catch (Exception e3) {
/* 374 */               xe2.m9777o("ftchNotif", "Error in poller request", e3);
/* 95 */                return -1;
                    }
                }

                /* JADX INFO: renamed from: i */
                public JSONObject m5614i() {
                    int intExtra;
                    NetworkInfo activeNetworkInfo;
/* 5 */             C0210cb c0210cb = (C0210cb) this.f11957c;
/* 9 */             JSONObject jSONObject = new JSONObject();
                    try {
/* 14 */                String strM1593p = c0210cb.m1593p();
/* 20 */                Context context = (Context) c0210cb.f2804b;
/* 22 */                jSONObject.put("appVersion", strM1593p);
/* 31 */                jSONObject.put("appName", c0210cb.m1592o());
/* 40 */                jSONObject.put("appIdentifier", context.getPackageName());
/* 49 */                jSONObject.put("batteryLevel", c0210cb.m1594q());
/* 54 */                String str = "Not charging";
/* 63 */                String typeName = null;
/* 64 */                Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
/* 68 */                if (intentRegisterReceiver != null && ((intExtra = intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1)) == 2 || intExtra == 5)) {
/* 84 */                    str = "Charging";
                        }
/* 86 */                jSONObject.put("batteryStatus", str);
/* 95 */                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
/* 97 */                String simCountryIso = HttpUrl.FRAGMENT_ENCODE_SET;
/* 107 */               jSONObject.put("carrierName", telephonyManager == null ? HttpUrl.FRAGMENT_ENCODE_SET : telephonyManager.getNetworkOperatorName());
/* 116 */               TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
/* 118 */               if (telephonyManager2 != null) {
/* 121 */                   simCountryIso = telephonyManager2.getSimCountryIso();
                        }
/* 125 */               jSONObject.put("countryCode", simCountryIso);
                        try {
/* 136 */                   ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
/* 138 */                   if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
/* 146 */                       typeName = activeNetworkInfo.getTypeName();
                            }
                        } catch (SecurityException unused) {
                        }
/* 150 */               if (typeName == null) {
/* 152 */                   typeName = "Unknown";
                        }
/* 154 */               jSONObject.put("networkType", typeName);
/* 157 */               we2 we2VarM1566w = C0210cb.m1566w();
/* 165 */               jSONObject.put("diskSpace", we2VarM1566w.f18596c);
/* 172 */               jSONObject.put("freeSpace", we2VarM1566w.f18595b);
/* 179 */               jSONObject.put("osVersion", Build.VERSION.RELEASE);
/* 186 */               jSONObject.put("deviceModel", Build.MODEL);
/* 193 */               jSONObject.put("liteSdkVersion", "10.2.0");
                    } catch (JSONException e) {
/* 202 */               xe2.m9777o("ConfigMangr", "error in generating device metadata", e);
                    }
/* 205 */           return jSONObject;
                }

                /* JADX INFO: renamed from: j */
                public fs0 m5615j() throws GeneralSecurityException, IOException {
/* 6 */             if (((x31) this.f11960f) == null) {
/* 370 */               ds0.m3203t("cannot read or generate keyset");
/* 5 */                 return null;
                    }
/* 15 */            fs0 fs0Var = new fs0(i41.m4464C(), 3);
/* 20 */            x31 x31Var = (x31) this.f11960f;
                    synchronized (fs0Var) {
/* 25 */                fs0Var.m3814i(x31Var.f18926a);
                    }
/* 45 */            int iM6607A = q13.m7676a((i41) fs0Var.m3820q().f7613b).m6875y().m6607A();
                    synchronized (fs0Var) {
/* 64 */                for (int i = 0; i < ((i41) ((f41) fs0Var.f8339b).f14864b).m4472z(); i++) {
                            try {
/* 74 */                        h41 h41VarM4471y = ((i41) ((f41) fs0Var.f8339b).f14864b).m4471y(i);
/* 82 */                        if (h41VarM4471y.m4108B() == iM6607A) {
/* 94 */                            if (!h41VarM4471y.m4110D().equals(u31.ENABLED)) {
/* 333 */                               throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + iM6607A);
                                    }
/* 98 */                            f41 f41Var = (f41) fs0Var.f8339b;
/* 100 */                           f41Var.m7234e();
/* 107 */                           i41.m4467w((i41) f41Var.f14864b, iM6607A);
                                }
                            } catch (Throwable th) {
/* 364 */                       throw th;
                            }
                        }
/* 362 */               throw new GeneralSecurityException("key not found: " + iM6607A);
                    }
/* 113 */           Context context = (Context) this.f11955a;
/* 117 */           String str = (String) this.f11956b;
/* 121 */           String str2 = (String) this.f11957c;
/* 123 */           if (str == null) {
/* 307 */               C1951n4.m6859j("keysetName cannot be null");
/* 5 */                 return null;
                    }
/* 125 */           Context applicationContext = context.getApplicationContext();
/* 144 */           SharedPreferences.Editor editorEdit = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext).edit() : applicationContext.getSharedPreferences(str2, 0).edit();
/* 152 */           if (((C2486y5) this.f11959e) != null) {
/* 154 */               C0875ec c0875ecM3820q = fs0Var.m3820q();
/* 160 */               C2486y5 c2486y5 = (C2486y5) this.f11959e;
/* 162 */               byte[] bArr = new byte[0];
/* 166 */               i41 i41Var = (i41) c0875ecM3820q.f7613b;
/* 172 */               byte[] bArrMo1524a = c2486y5.mo1524a(i41Var.m9359e(), bArr);
                        try {
/* 192 */                   if (!i41.m4466E(c2486y5.mo1525b(bArrMo1524a, bArr), dg0.m3057a()).equals(i41Var)) {
/* 265 */                       throw new GeneralSecurityException("cannot encrypt keyset");
                            }
/* 194 */                   yd0 yd0VarM10338z = zd0.m10338z();
/* 199 */                   C2222tl c2222tlM9303c = AbstractC2298vl.m9303c(bArrMo1524a, 0, bArrMo1524a.length);
/* 203 */                   yd0VarM10338z.m7234e();
/* 210 */                   zd0.m10336w((zd0) yd0VarM10338z.f14864b, c2222tlM9303c);
/* 213 */                   n41 n41VarM7676a = q13.m7676a(i41Var);
/* 217 */                   yd0VarM10338z.m7234e();
/* 224 */                   zd0.m10337x((zd0) yd0VarM10338z.f14864b, n41VarM7676a);
/* 249 */                   if (!editorEdit.putString(str, qj3.m7907r(((zd0) yd0VarM10338z.m7231b()).m9359e())).commit()) {
/* 254 */                       ds0.m3195l("Failed to write to SharedPreferences");
/* 5 */                         return null;
                            }
                        } catch (pz0 unused) {
/* 268 */                   ds0.m3203t("invalid keyset, corrupted key material");
/* 5 */                     return null;
                        }
                    } else if (!editorEdit.putString(str, qj3.m7907r(((i41) fs0Var.m3820q().f7613b).m9359e())).commit()) {
/* 301 */               ds0.m3195l("Failed to write to SharedPreferences");
/* 5 */                 return null;
                    }
/* 298 */           return fs0Var;
                }

                /* JADX INFO: renamed from: k */
                public synchronized JSONArray m5616k(int i) {
                    JSONArray jSONArray;
                    try {
/* 4 */                 jSONArray = new JSONArray();
                        try {
/* 15 */                    int iMin = Math.min(((ArrayList) this.f11959e).size(), i);
/* 20 */                    for (int i2 = 0; i2 < iMin; i2++) {
/* 30 */                        jSONArray.put(((ArrayList) this.f11959e).get(i2));
                            }
                        } catch (Exception e) {
/* 43 */                    xe2.m9777o("ConfigMangr", "Error getting DebugLogs.", e);
                        }
                    } catch (Throwable th) {
/* 49 */                throw th;
                    }
/* 47 */            return jSONArray;
                }

                /* JADX INFO: renamed from: l */
                public String m5617l(String str, String str2, boolean z) {
/* 2 */             JSONObject jSONObjectM5618m = m5618m(false);
/* 8 */             JSONObject jSONObject = new JSONObject();
                    try {
/* 15 */                if (b40.m1234r(str)) {
/* 19 */                    jSONObject.put("faqId", str);
                        }
/* 29 */                if (b40.m1234r(str2)) {
/* 33 */                    jSONObject.put("sectionId", str2);
                        }
/* 38 */                if (z) {
/* 40 */                    jSONObject.put("showChatIcon", false);
                        } else if (((Boolean) ((C1969nm) this.f11958d).m7008k(Boolean.FALSE, "show_chat_icon_in_helpcenter")).booleanValue()) {
/* 65 */                    jSONObject.put("showChatIcon", true);
                        }
/* 78 */                String strM3589r = ((er0) ((er0) this.f11955a).f7853b).m3589r("additional_hc_data");
/* 86 */                if (b40.m1234r(strM3589r) && b40.m1236t(strM3589r)) {
/* 101 */                   jSONObject.put("additionalInfo", new JSONObject(strM3589r));
                        }
/* 106 */               jSONObjectM5618m.put("helpcenterConfig", jSONObject);
/* 109 */               return jSONObjectM5618m.toString();
                    } catch (Exception e) {
/* 118 */               xe2.m9777o("ConfigMangr", "Error in generating the helpcenter config", e);
/* 121 */               return jSONObjectM5618m.toString();
                    }
                }

                /* JADX INFO: renamed from: m */
                public JSONObject m5618m(boolean z) {
/* 7 */             ArrayList arrayList = (ArrayList) this.f11961i;
/* 13 */            er0 er0Var = (er0) this.f11955a;
/* 15 */            String strM3588q = er0Var.m3588q();
/* 21 */            er0 er0Var2 = (er0) er0Var.f7853b;
/* 25 */            String strM3589r = er0Var2.m3589r("domain");
/* 31 */            String strM3589r2 = er0Var2.m3589r("config");
/* 37 */            C0210cb c0210cb = (C0210cb) this.f11957c;
/* 41 */            JSONObject jSONObject = new JSONObject();
                    try {
/* 46 */                String strM3589r3 = er0Var2.m3589r("local_storage_data");
/* 54 */                if (b40.m1234r(strM3589r3)) {
/* 63 */                    jSONObject.put("localStorageData", new JSONObject(strM3589r3));
                        }
/* 75 */                jSONObject.put("metaData", m5614i());
/* 80 */                c0210cb.getClass();
/* 85 */                jSONObject.put("os", "android");
/* 88 */                String strM3584m = er0Var.m3584m();
/* 96 */                if (b40.m1234r(strM3584m) && !((C1969nm) this.f11958d).m7010m()) {
/* 110 */                   jSONObject.put("pushToken", strM3584m);
                        }
/* 128 */               jSONObject.put("analyticsData", new JSONObject((HashMap) ((ra2) this.f11956b).f15957c));
/* 137 */               jSONObject.put("deviceId", c0210cb.m1599v());
/* 142 */               jSONObject.put("launchedFromHelpcenter", z);
                    } catch (JSONException e) {
/* 148 */               xe2.m9777o("ConfigMangr", "error in generating liteSdkConfig", e);
                    }
/* 157 */           if (b40.m1232p(strM3589r2)) {
/* 155 */               strM3589r2 = "{}";
                    }
                    try {
/* 162 */               JSONObject jSONObject2 = new JSONObject(strM3589r2);
/* 167 */               jSONObject2.put("platformId", strM3588q);
/* 170 */               jSONObject2.put("domain", strM3589r);
/* 180 */               if (!jSONObject2.has("widgetOptions")) {
/* 185 */                   JSONObject jSONObject3 = new JSONObject();
                            try {
/* 190 */                       jSONObject3.put("showLauncher", false);
/* 196 */                       jSONObject3.put("fullScreen", true);
/* 199 */                       jSONObject2.put("widgetOptions", jSONObject3);
                            } catch (JSONException e2) {
/* 206 */                       xe2.m9777o("ConfigMangr", "Error in setting the widget option config", e2);
                            }
                        }
/* 213 */               if (!jSONObject2.has("language")) {
                            try {
/* 216 */                       String strM3589r4 = er0Var2.m3589r("language");
/* 224 */                       if (b40.m1232p(strM3589r4)) {
/* 226 */                           strM3589r4 = c0210cb.m1601y();
                                }
/* 233 */                       jSONObject2.put("language", strM3589r4);
                            } catch (Exception e3) {
/* 239 */                       xe2.m9777o("ConfigMangr", "Error in setting the language", e3);
                            }
                        }
/* 244 */               String strM3589r5 = er0Var2.m3589r("active_user");
/* 252 */               if (b40.m1234r(strM3589r5)) {
                            try {
/* 256 */                       JSONObject jSONObject4 = new JSONObject(strM3589r5);
/* 259 */                       Iterator<String> itKeys = jSONObject4.keys();
/* 267 */                       while (itKeys.hasNext()) {
/* 269 */                           String next = itKeys.next();
/* 279 */                           jSONObject2.put(next, jSONObject4.get(next));
                                }
                            } catch (JSONException e4) {
/* 286 */                       xe2.m9777o("ConfigMangr", "Error in setting the user config", e4);
                            }
                        }
                        try {
/* 301 */                   jSONObject2.put("clearAnonymousUserOnLogin", ((SharedPreferences) er0Var2.f7853b).getBoolean("clear_anonymous_user", false));
                        } catch (JSONException e5) {
/* 308 */                   xe2.m9777o("ConfigMangr", "error in setting clear anonymous user flag ", e5);
                        }
/* 330 */               xe2.m9775m("ConfigMangr", "Adding sdk open source value to config : " + ((String) this.f11960f), null);
/* 341 */               if (!b40.m1232p((String) this.f11960f)) {
/* 349 */                   jSONObject2.put(FirebaseAnalytics.Param.SOURCE, (String) this.f11960f);
                        }
/* 362 */               if ("proactive".equals((String) this.f11960f)) {
/* 366 */                   String strM3589r6 = er0Var2.m3589r("localProactiveConfig");
                            try {
/* 385 */                       jSONObject2.put("configForSubsequentProactiveIssues", new JSONObject(b40.m1232p(strM3589r6) ? "{}" : strM3589r6));
                            } catch (JSONException e6) {
/* 392 */                       xe2.m9777o("ConfigMangr", "Error in setting local proactive config ", e6);
                            }
                        }
/* 403 */               if (b40.m1234r(er0Var2.m3589r("anon_user_id_map"))) {
/* 419 */                   String str = (String) b40.m1238v(er0Var2.m3589r("anon_user_id_map")).get("userId");
/* 425 */                   if (b40.m1234r(str)) {
/* 429 */                       jSONObject.put("anonUserId", str);
                            }
                        }
/* 436 */               if (!arrayList.isEmpty()) {
/* 445 */                   jSONObject2.put("userTrail", new JSONArray((Collection) arrayList));
                        }
/* 453 */               jSONObject2.put("liteSdkConfig", jSONObject);
/* 456 */               return jSONObject2;
                    } catch (JSONException e7) {
/* 459 */               xe2.m9777o("ConfigMangr", "Error in creating the config object", e7);
/* 464 */               return new JSONObject();
                    }
                }

                /* JADX INFO: renamed from: n */
                public String m5619n(String str) {
/* 3 */             er0 er0Var = (er0) this.f11955a;
/* 11 */            if ("webchat".equals(str)) {
/* 19 */                return ((er0) er0Var.f7853b).m3589r("ui_config_data");
                    }
                    return "helpcenter".equals(str) ? ((er0) er0Var.f7853b).m3589r("helpcenter_ui_config_data") : HttpUrl.FRAGMENT_ENCODE_SET;
                }

                /* JADX INFO: renamed from: o */
                public void m5620o() {
/* 17 */            for (C2197sx c2197sx : ((HashMap) this.f11955a).keySet()) {
/* 35 */                for (r70 r70Var : c2197sx.f16833c) {
/* 46 */                    if (r70Var.f15896b == 2 && !((HashMap) this.f11957c).containsKey(r70Var.f15895a)) {
/* 62 */                        HashMap map = (HashMap) this.f11957c;
/* 64 */                        f02 f02Var = r70Var.f15895a;
/* 66 */                        Set set = Collections.EMPTY_SET;
/* 70 */                        s51 s51Var = new s51();
/* 74 */                        s51Var.f16429b = null;
/* 85 */                        s51Var.f16428a = Collections.newSetFromMap(new ConcurrentHashMap());
/* 89 */                        s51Var.f16428a.addAll(set);
/* 92 */                        map.put(f02Var, s51Var);
                            } else if (((HashMap) this.f11956b).containsKey(r70Var.f15895a)) {
                                continue;
                            } else {
/* 108 */                       int i = r70Var.f15896b;
/* 111 */                       if (i == 1) {
/* 168 */                           throw new t70("Unsatisfied dependency for component " + c2197sx + ": " + r70Var.f15895a);
                                }
/* 113 */                       if (i != 2) {
/* 118 */                           HashMap map2 = (HashMap) this.f11956b;
/* 120 */                           f02 f02Var2 = r70Var.f15895a;
/* 124 */                           ds0 ds0Var = mq1.f13941c;
/* 126 */                           C0971gy c0971gy = mq1.f13942d;
/* 128 */                           mq1 mq1Var = new mq1();
/* 131 */                           mq1Var.f13943a = ds0Var;
/* 133 */                           mq1Var.f13944b = c0971gy;
/* 135 */                           map2.put(f02Var2, mq1Var);
                                }
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: p */
                public ArrayList m5621p(ArrayList arrayList) {
/* 3 */             HashMap map = (HashMap) this.f11956b;
/* 7 */             ArrayList arrayList2 = new ArrayList();
/* 10 */            Iterator it = arrayList.iterator();
/* 18 */            while (it.hasNext()) {
/* 24 */                C2197sx c2197sx = (C2197sx) it.next();
/* 28 */                if (c2197sx.f16835e == 0) {
/* 38 */                    iz1 iz1Var = (iz1) ((HashMap) this.f11955a).get(c2197sx);
/* 50 */                    for (f02 f02Var : c2197sx.f16832b) {
/* 62 */                        if (map.containsKey(f02Var)) {
/* 83 */                            arrayList2.add(new RunnableC1784j8(10, (mq1) ((iz1) map.get(f02Var)), iz1Var));
                                } else {
/* 64 */                            map.put(f02Var, iz1Var);
                                }
                            }
                        }
                    }
/* 87 */            return arrayList2;
                }

                /* JADX INFO: renamed from: q */
                public ArrayList m5622q() {
/* 3 */             HashMap map = (HashMap) this.f11957c;
/* 7 */             ArrayList arrayList = new ArrayList();
/* 12 */            HashMap map2 = new HashMap();
/* 31 */            for (Map.Entry entry : ((HashMap) this.f11955a).entrySet()) {
/* 43 */                C2197sx c2197sx = (C2197sx) entry.getKey();
/* 47 */                if (c2197sx.f16835e != 0) {
/* 54 */                    iz1 iz1Var = (iz1) entry.getValue();
/* 66 */                    for (f02 f02Var : c2197sx.f16832b) {
/* 78 */                        if (!map2.containsKey(f02Var)) {
/* 85 */                            map2.put(f02Var, new HashSet());
                                }
/* 94 */                        ((Set) map2.get(f02Var)).add(iz1Var);
                            }
                        }
                    }
/* 110 */           for (Map.Entry entry2 : map2.entrySet()) {
/* 126 */               if (map.containsKey(entry2.getKey())) {
/* 178 */                   s51 s51Var = (s51) map.get(entry2.getKey());
/* 186 */                   Iterator it = ((Set) entry2.getValue()).iterator();
/* 194 */                   while (it.hasNext()) {
/* 209 */                       arrayList.add(new RunnableC1784j8(11, s51Var, (iz1) it.next()));
                            }
                        } else {
/* 132 */                   f02 f02Var2 = (f02) entry2.getKey();
/* 140 */                   Set set = (Set) ((Collection) entry2.getValue());
/* 144 */                   s51 s51Var2 = new s51();
/* 148 */                   s51Var2.f16429b = null;
/* 159 */                   s51Var2.f16428a = Collections.newSetFromMap(new ConcurrentHashMap());
/* 163 */                   s51Var2.f16428a.addAll(set);
/* 166 */                   map.put(f02Var2, s51Var2);
                        }
                    }
/* 213 */           return arrayList;
                }

                /* JADX INFO: renamed from: s */
                public fs0 m5623s(byte[] bArr) {
                    try {
/* 14 */                this.f11959e = new C1881l8().m6402c((String) this.f11958d);
                        try {
/* 49 */                    return new fs0((f41) ((i41) C0875ec.m3359J(new qc3(new ByteArrayInputStream(bArr), 11), (C2486y5) this.f11959e).f7613b).m8625v(), 3);
                        } catch (IOException | GeneralSecurityException e) {
                            try {
/* 56 */                        return m5610r(bArr);
                            } catch (IOException unused) {
/* 61 */                        throw e;
                            }
                        }
                    } catch (GeneralSecurityException | ProviderException e2) {
                        try {
/* 65 */                    fs0 fs0VarM5610r = m5610r(bArr);
/* 69 */                    Object obj = d52.f6998d;
/* 75 */                    AbstractC1245n0.m4891s("d52", "cannot use Android Keystore, it'll be disabled", e2);
/* 78 */                    return fs0VarM5610r;
                        } catch (IOException unused2) {
/* 79 */                    throw e2;
                        }
                    }
                }

                /* JADX INFO: renamed from: t */
                public C2486y5 m5624t() throws KeyStoreException {
/* 5 */             Object obj = d52.f6998d;
/* 9 */             C1881l8 c1881l8 = new C1881l8();
                    try {
/* 17 */                boolean zM6400a = C1881l8.m6400a((String) this.f11958d);
                        try {
/* 25 */                    return c1881l8.m6402c((String) this.f11958d);
                        } catch (GeneralSecurityException | ProviderException e) {
/* 33 */                    if (!zM6400a) {
/* 58 */                        throw new KeyStoreException(fm0.m3784j("the master key ", (String) this.f11958d, " exists but is unusable"), e);
                            }
/* 35 */                    Object obj2 = d52.f6998d;
/* 37 */                    AbstractC1245n0.m4891s("d52", "cannot use Android Keystore, it'll be disabled", e);
/* 12 */                    return null;
                        }
                    } catch (GeneralSecurityException | ProviderException e2) {
/* 62 */                Object obj3 = d52.f6998d;
/* 64 */                AbstractC1245n0.m4891s("d52", "cannot use Android Keystore, it'll be disabled", e2);
/* 12 */                return null;
                    }
                }

                /* JADX INFO: renamed from: u */
                public void m5625u(String str, String str2) {
/* 3 */             er0 er0Var = (er0) this.f11955a;
/* 9 */             if (b40.m1232p(str2) || !b40.m1236t(str2)) {
/* 72 */                return;
                    }
                    try {
/* 20 */                JSONObject jSONObject = new JSONObject(str2);
/* 29 */                if ("webchat".equals(str)) {
/* 37 */                    er0Var.m3595y("ui_config_data", jSONObject.toString());
                        } else if ("helpcenter".equals(str)) {
/* 57 */                    er0Var.m3595y("helpcenter_ui_config_data", jSONObject.toString());
                        }
                    } catch (Exception e) {
/* 69 */                xe2.m9777o("ConfigMangr", "error in saving the ui config data for ".concat(str), e);
                    }
                }

/* 21 */        public C1773iy() {
/* 23 */            this.f11955a = null;
/* 24 */            this.f11956b = null;
/* 25 */            this.f11957c = null;
/* 26 */            this.f11958d = null;
/* 27 */            this.f11959e = null;
/* 28 */            this.f11960f = null;
                }
            }
