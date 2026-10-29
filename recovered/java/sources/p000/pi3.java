            package p000;

            import android.app.ActivityManager;
            import android.app.BroadcastOptions;
            import android.content.Context;
            import android.content.Intent;
            import android.content.SharedPreferences;
            import android.content.pm.ResolveInfo;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import java.nio.charset.Charset;
            import java.util.List;
            import okhttp3.HttpUrl;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 63 */    public final class pi3 implements ul3, jd3 {

                /* JADX INFO: renamed from: a */
                public final Object f15137a;

                public /* synthetic */ pi3(qf3 qf3Var) {
/* 6 */             pi3 pi3Var = new pi3((Object) qf3Var);
/* 62 */            this.f15137a = gd3.m3912a(new ac3(gd3.m3912a(new ac1(28, gd3.m3912a(new we2(pi3Var, gd3.m3912a(new ac3(pi3Var, 10)), 26, false)), gd3.m3912a(new qf3(pi3Var)), pi3Var)), 6));
                }

                /* JADX INFO: renamed from: a */
                public void m7455a() {
/* 3 */             lo3 lo3Var = (lo3) this.f15137a;
/* 5 */             lo3Var.mo1375y();
/* 10 */            ij3 ij3Var = (ij3) lo3Var.f16749a;
/* 12 */            ki3 ki3Var = ij3Var.f9653e;
/* 14 */            ij3.m4553j(ki3Var);
/* 17 */            xt0 xt0Var = ij3Var.f9640V;
/* 19 */            xt0Var.getClass();
/* 30 */            if (ki3Var.m6119J(System.currentTimeMillis())) {
/* 32 */                ki3 ki3Var2 = ij3Var.f9653e;
/* 34 */                ij3.m4553j(ki3Var2);
/* 40 */                ki3Var2.f12797W.m4239b(true);
/* 45 */                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
/* 48 */                ActivityManager.getMyMemoryState(runningAppProcessInfo);
/* 55 */                if (runningAppProcessInfo.importance == 100) {
/* 57 */                    uh3 uh3Var = ij3Var.f9655f;
/* 59 */                    ij3.m4555l(uh3Var);
/* 66 */                    uh3Var.f17534Y.m8510a("Detected application was in foreground");
/* 69 */                    xt0Var.getClass();
/* 76 */                    m7457d(System.currentTimeMillis());
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:11:0x002d  */
                @Override // p000.ul3
                /* JADX INFO: renamed from: b */
                public void mo173b(int i, Throwable th, byte[] bArr) {
                    uh3 uh3Var;
                    uh3 uh3Var2;
/* 1 */             int i2 = i;
/* 11 */            ij3 ij3Var = (ij3) this.f15137a;
/* 25 */            uh3 uh3Var3 = ij3Var.f9655f;
/* 29 */            if (i2 == 200 || i2 == 204) {
/* 44 */                if (th == null) {
/* 46 */                    ki3 ki3Var = ij3Var.f9653e;
/* 48 */                    ij3.m4553j(ki3Var);
/* 54 */                    ki3Var.f12808e0.m4239b(true);
/* 57 */                    if (bArr != null || bArr.length == 0) {
/* 338 */                       ij3.m4555l(uh3Var3);
/* 345 */                       uh3Var3.f17533X.m8510a("Deferred Deep Link response empty.");
/* 348 */                       return;
                            }
                            try {
/* 72 */                        JSONObject jSONObject = new JSONObject(new String(bArr));
/* 75 */                        String strOptString = jSONObject.optString("deeplink", HttpUrl.FRAGMENT_ENCODE_SET);
/* 83 */                        if (TextUtils.isEmpty(strOptString)) {
/* 85 */                            ij3.m4555l(uh3Var3);
/* 92 */                            uh3Var3.f17533X.m8510a("Deferred Deep Link is empty.");
/* 95 */                            return;
                                }
/* 100 */                       String strOptString2 = jSONObject.optString("gclid", HttpUrl.FRAGMENT_ENCODE_SET);
/* 104 */                       String strOptString3 = jSONObject.optString("gbraid", HttpUrl.FRAGMENT_ENCODE_SET);
/* 108 */                       String strOptString4 = jSONObject.optString("gad_source", HttpUrl.FRAGMENT_ENCODE_SET);
/* 114 */                       double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
/* 120 */                       Bundle bundle = new Bundle();
/* 123 */                       up3 up3Var = ij3Var.f9668w;
/* 125 */                       ij3.m4553j(up3Var);
/* 130 */                       ij3 ij3Var2 = (ij3) up3Var.f16749a;
/* 136 */                       if (TextUtils.isEmpty(strOptString)) {
/* 138 */                           uh3Var2 = uh3Var3;
                                } else {
/* 144 */                           Context context = ij3Var2.f9645a;
/* 150 */                           uh3Var2 = uh3Var3;
                                    try {
/* 168 */                               List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
/* 172 */                               if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
/* 184 */                                   if (!TextUtils.isEmpty(strOptString3)) {
/* 186 */                                       bundle.putString("gbraid", strOptString3);
                                            }
/* 199 */                                   if (!TextUtils.isEmpty(strOptString4)) {
/* 201 */                                       bundle.putString("gad_source", strOptString4);
                                            }
/* 204 */                                   bundle.putString("gclid", strOptString2);
/* 211 */                                   bundle.putString("_cis", "ddp");
/* 220 */                                   ij3Var.f9642X.m8556G("auto", "_cmp", bundle);
/* 227 */                                   if (TextUtils.isEmpty(strOptString)) {
/* 337 */                                       return;
                                            }
                                            try {
/* 236 */                                       SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
/* 240 */                                       editorEdit.putString("deeplink", strOptString);
/* 247 */                                       editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
/* 254 */                                       if (editorEdit.commit()) {
/* 260 */                                           Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
/* 265 */                                           Context context2 = ij3Var2.f9645a;
/* 271 */                                           if (Build.VERSION.SDK_INT < 34) {
/* 273 */                                               context2.sendBroadcast(intent);
/* 276 */                                               return;
                                                    } else {
/* 2 */                                                 context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
/* 292 */                                               return;
                                                    }
                                                }
/* 337 */                                       return;
                                            } catch (RuntimeException e) {
/* 300 */                                       uh3 uh3Var4 = ((ij3) up3Var.f16749a).f9655f;
/* 302 */                                       ij3.m4555l(uh3Var4);
/* 309 */                                       uh3Var4.f17538f.m8511b(e, "Failed to persist Deferred Deep Link. exception");
/* 337 */                                       return;
                                            }
                                        }
                                    } catch (JSONException e2) {
/* 190 */                               e = e2;
/* 191 */                               uh3Var = uh3Var2;
/* 327 */                               ij3.m4555l(uh3Var);
/* 334 */                               uh3Var.f17538f.m8511b(e, "Failed to parse the Deferred Deep Link response. exception");
/* 337 */                               return;
                                    }
                                }
/* 313 */                       ij3.m4555l(uh3Var2);
/* 316 */                       uh3Var = uh3Var2;
                                try {
/* 322 */                           uh3Var.f17541w.m8513d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
/* 325 */                           return;
                                } catch (JSONException e3) {
/* 326 */                           e = e3;
/* 327 */                           ij3.m4555l(uh3Var);
/* 334 */                           uh3Var.f17538f.m8511b(e, "Failed to parse the Deferred Deep Link response. exception");
/* 337 */                           return;
                                }
                            } catch (JSONException e4) {
/* 96 */                        e = e4;
/* 97 */                        uh3Var = uh3Var3;
                            }
                        }
                    } else if (i2 == 304) {
/* 39 */                i2 = 304;
/* 44 */                if (th == null) {
/* 46 */                    ki3 ki3Var2 = ij3Var.f9653e;
/* 48 */                    ij3.m4553j(ki3Var2);
/* 54 */                    ki3Var2.f12808e0.m4239b(true);
/* 57 */                    if (bArr != null) {
                            }
/* 338 */                   ij3.m4555l(uh3Var3);
/* 345 */                   uh3Var3.f17533X.m8510a("Deferred Deep Link response empty.");
/* 348 */                   return;
                        }
                    }
/* 349 */           ij3.m4555l(uh3Var3);
/* 360 */           uh3Var3.f17541w.m8512c(Integer.valueOf(i2), "Network Request for Deferred Deep Link failed. response, exception", th);
                }

                /* JADX INFO: renamed from: c */
                public void m7456c(long j) {
/* 3 */             lo3 lo3Var = (lo3) this.f15137a;
/* 5 */             lo3Var.mo1375y();
/* 8 */             lo3Var.m6515D();
/* 13 */            ij3 ij3Var = (ij3) lo3Var.f16749a;
/* 15 */            ki3 ki3Var = ij3Var.f9653e;
/* 17 */            ij3.m4553j(ki3Var);
/* 24 */            if (ki3Var.m6119J(j)) {
/* 26 */                ij3.m4553j(ki3Var);
/* 32 */                ki3Var.f12797W.m4239b(true);
/* 39 */                ij3Var.m4569q().m4533E();
                    }
/* 42 */            ij3.m4553j(ki3Var);
/* 47 */            ki3Var.f12801a0.m4933b(j);
/* 56 */            if (ki3Var.f12797W.m4238a()) {
/* 58 */                m7457d(j);
                    }
                }

                /* JADX INFO: renamed from: d */
                public void m7457d(long j) {
/* 3 */             lo3 lo3Var = (lo3) this.f15137a;
/* 5 */             lo3Var.mo1375y();
/* 10 */            ij3 ij3Var = (ij3) lo3Var.f16749a;
/* 16 */            if (ij3Var.m4560d()) {
/* 20 */                ki3 ki3Var = ij3Var.f9653e;
/* 22 */                ij3.m4553j(ki3Var);
/* 27 */                ki3Var.f12801a0.m4933b(j);
/* 32 */                ij3Var.f9640V.getClass();
/* 35 */                long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 39 */                uh3 uh3Var = ij3Var.f9655f;
/* 41 */                ij3.m4555l(uh3Var);
/* 52 */                uh3Var.f17534Y.m8511b(Long.valueOf(jElapsedRealtime), "Session started, time");
/* 57 */                long j2 = j / 1000;
/* 59 */                Long lValueOf = Long.valueOf(j2);
/* 63 */                sl3 sl3Var = ij3Var.f9642X;
/* 65 */                ij3.m4554k(sl3Var);
/* 74 */                sl3Var.m8560K(j, lValueOf, "auto", "_sid");
/* 78 */                ij3.m4553j(ki3Var);
/* 83 */                ki3Var.f12802b0.m4933b(j2);
/* 89 */                ki3Var.f12797W.m4239b(false);
/* 94 */                Bundle bundle = new Bundle();
/* 99 */                bundle.putLong("_sid", j2);
/* 102 */               ij3.m4554k(sl3Var);
/* 110 */               sl3Var.m8557H("auto", "_s", bundle, j);
/* 115 */               String strM8805m = ki3Var.f12811g0.m8805m();
/* 123 */               if (TextUtils.isEmpty(strM8805m)) {
/* 146 */                   return;
                        }
/* 127 */               Bundle bundle2 = new Bundle();
/* 132 */               bundle2.putString("_ffr", strM8805m);
/* 135 */               ij3.m4554k(sl3Var);
/* 143 */               sl3Var.m8557H("auto", "_ssr", bundle2, j);
                    }
                }

                /* JADX INFO: renamed from: e */
                public void m7458e(int i, cn3 cn3Var) {
/* 5 */             ((kn3) this.f15137a).m6162g(i, cn3Var);
                }

                /* JADX INFO: renamed from: f */
                public void m7459f(int i, int i2) throws C1868kw {
/* 8 */             kn3 kn3Var = (kn3) this.f15137a;
/* 10 */            kn3Var.m6158c(i, (i2 >> 31) ^ (i2 + i2));
                }

                /* JADX INFO: renamed from: g */
                public void m7460g(int i, long j) throws C1868kw {
/* 9 */             kn3 kn3Var = (kn3) this.f15137a;
/* 11 */            kn3Var.m6160e(i, (j >> 63) ^ (j + j));
                }

                /* JADX INFO: renamed from: h */
                public void m7461h(int i, Object obj, bq3 bq3Var) throws C1868kw {
/* 3 */             kn3 kn3Var = (kn3) this.f15137a;
/* 5 */             tm3 tm3Var = (tm3) obj;
/* 11 */            kn3Var.m6165j((i << 3) | 2);
/* 18 */            kn3Var.m6165j(tm3Var.mo3540b(bq3Var));
/* 23 */            bq3Var.mo1410e(tm3Var, kn3Var.f12897a);
                }

                /* JADX INFO: renamed from: i */
                public void m7462i(int i, Object obj, bq3 bq3Var) throws C1868kw {
/* 3 */             kn3 kn3Var = (kn3) this.f15137a;
/* 8 */             kn3Var.m6157b(i, 3);
/* 13 */            bq3Var.mo1410e((tm3) obj, kn3Var.f12897a);
/* 17 */            kn3Var.m6157b(i, 4);
                }

                @Override // p000.jd3
                public Object zza() {
/* 7 */             return (Context) ((qf3) this.f15137a).f15523a;
                }

/* 64 */        public /* synthetic */ pi3(Object obj) {
/* 65 */            this.f15137a = obj;
                }

/* 65 */        public pi3(kn3 kn3Var) {
                    Charset charset = so3.f16726a;
                    this.f15137a = kn3Var;
                    kn3Var.f12897a = this;
                }
            }
