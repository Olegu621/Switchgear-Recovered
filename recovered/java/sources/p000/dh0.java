            package p000;

            import android.app.Activity;
            import android.app.Application;
            import android.content.Intent;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import com.google.android.gms.internal.measurement.zzdf;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.google.firebase.analytics.connector.AnalyticsConnector;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.ref.WeakReference;
            import java.util.ArrayDeque;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public final class dh0 implements Application.ActivityLifecycleCallbacks {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7195a;

                /* JADX INFO: renamed from: b */
                public final Object f7196b;

                public dh0() {
/* 2 */             this.f7195a = 0;
/* 14 */            this.f7196b = new ArrayDeque(10);
                }

                /* JADX INFO: renamed from: b */
                private final void m3066b(Activity activity, Bundle bundle) {
                }

                /* JADX INFO: renamed from: c */
                private final void m3067c(Activity activity) {
                }

                /* JADX INFO: renamed from: d */
                private final void m3068d(Activity activity) {
                }

                /* JADX INFO: renamed from: e */
                private final void m3069e(Activity activity) {
                }

                /* JADX INFO: renamed from: f */
                private final void m3070f(Activity activity) {
                }

                /* JADX INFO: renamed from: g */
                private final void m3071g(Activity activity, Bundle bundle) {
                }

                /* JADX INFO: renamed from: h */
                private final void m3072h(Activity activity, Bundle bundle) {
                }

                /* JADX INFO: renamed from: i */
                private final void m3073i(Activity activity) {
                }

                /* JADX INFO: renamed from: j */
                private final void m3074j(Activity activity) {
                }

                /* JADX INFO: renamed from: k */
                private final void m3075k(Activity activity) {
                }

                /* JADX INFO: renamed from: l */
                private final void m3076l(Activity activity) {
                }

                /* JADX INFO: renamed from: m */
                private final void m3077m(Activity activity) {
                }

                /* JADX INFO: renamed from: a */
                public void m3078a(Intent intent) {
/* 5 */             ArrayDeque arrayDeque = (ArrayDeque) this.f7196b;
/* 7 */             Bundle bundle = null;
                    try {
/* 8 */                 Bundle extras = intent.getExtras();
/* 12 */                if (extras != null) {
/* 16 */                    String string = extras.getString("google.message_id");
/* 20 */                    if (string == null) {
/* 24 */                        string = extras.getString("message_id");
                            }
/* 32 */                    if (!TextUtils.isEmpty(string)) {
/* 38 */                        if (arrayDeque.contains(string)) {
/* 160 */                           return;
                                } else {
/* 42 */                            arrayDeque.add(string);
                                }
                            }
/* 50 */                    bundle = extras.getBundle("gcm.n.analytics_data");
                        }
                    } catch (RuntimeException e) {
/* 57 */                AbstractC1245n0.m4891s("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
                    }
/* 76 */            if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
/* 78 */                if (bundle != null && "1".equals(bundle.getString("google.c.a.tc"))) {
/* 103 */                   AnalyticsConnector analyticsConnector = (AnalyticsConnector) vi0.m9271c().m9275b(AnalyticsConnector.class);
/* 105 */                   if (analyticsConnector != null) {
/* 109 */                       String string2 = bundle.getString("google.c.a.c_id");
/* 117 */                       analyticsConnector.setUserProperty("fcm", "_ln", string2);
/* 122 */                       Bundle bundle2 = new Bundle();
/* 129 */                       bundle2.putString(FirebaseAnalytics.Param.SOURCE, "Firebase");
/* 136 */                       bundle2.putString(FirebaseAnalytics.Param.MEDIUM, "notification");
/* 141 */                       bundle2.putString(FirebaseAnalytics.Param.CAMPAIGN, string2);
/* 146 */                       analyticsConnector.logEvent("fcm", "_cmp", bundle2);
                            } else {
/* 152 */                       AbstractC1245n0.m4889q("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                            }
                        }
/* 157 */               b40.m1241y("_no", bundle);
                    }
                }

                /* JADX INFO: renamed from: n */
                public void m3079n(zzdf zzdfVar, Bundle bundle) {
                    lm3 lm3Var;
                    ij3 ij3Var;
                    Uri uri;
/* 4 */             sl3 sl3Var = (sl3) this.f7196b;
                    try {
                        try {
/* 8 */                     ij3 ij3Var2 = (ij3) sl3Var.f16749a;
/* 10 */                    uh3 uh3Var = ij3Var2.f9655f;
/* 12 */                    ij3.m4555l(uh3Var);
/* 19 */                    uh3Var.f17534Y.m8510a("onActivityCreated");
/* 22 */                    Intent intent = zzdfVar.zzc;
/* 24 */                    if (intent != null) {
/* 26 */                        Uri data = intent.getData();
/* 30 */                        if (data == null || !data.isHierarchical()) {
/* 49 */                            Bundle extras = intent.getExtras();
/* 54 */                            if (extras != null) {
/* 58 */                                String string = extras.getString("com.android.vending.referral_url");
/* 66 */                                if (!TextUtils.isEmpty(string)) {
/* 68 */                                    data = Uri.parse(string);
/* 39 */                                    uri = data;
                                        }
                                    }
/* 73 */                            uri = null;
                                } else {
/* 39 */                            uri = data;
                                }
/* 74 */                        if (uri != null && uri.isHierarchical()) {
/* 85 */                            ij3.m4553j(ij3Var2.f9668w);
/* 90 */                            String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
/* 123 */                           String str = ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto";
/* 128 */                           String queryParameter = uri.getQueryParameter("referrer");
/* 137 */                           boolean z = bundle == null;
/* 139 */                           bj3 bj3Var = ij3Var2.f9659i;
/* 141 */                           ij3.m4555l(bj3Var);
/* 150 */                           bj3Var.m1370I(new ft0(this, z, uri, str, queryParameter));
/* 185 */                           ij3Var = (ij3) sl3Var.f16749a;
                                }
/* 158 */                       lm3Var = ij3Var.f9641W;
                            }
/* 156 */                   ij3Var = (ij3) sl3Var.f16749a;
                        } catch (RuntimeException e) {
/* 171 */                   uh3 uh3Var2 = ((ij3) sl3Var.f16749a).f9655f;
/* 173 */                   ij3.m4555l(uh3Var2);
/* 180 */                   uh3Var2.f17538f.m8511b(e, "Throwable caught in onActivityCreated");
                        }
/* 158 */               lm3Var = ij3Var.f9641W;
                    } finally {
/* 192 */               lm3Var = ((ij3) sl3Var.f16749a).f9641W;
/* 194 */               ij3.m4554k(lm3Var);
/* 197 */               lm3Var.m6505H(zzdfVar, bundle);
                    }
                }

                /* JADX INFO: renamed from: o */
                public void m3080o(zzdf zzdfVar) {
/* 9 */             lm3 lm3Var = ((ij3) ((sl3) this.f7196b).f16749a).f9641W;
/* 11 */            ij3.m4554k(lm3Var);
                    synchronized (lm3Var.f13413W) {
                        try {
/* 23 */                    if (Objects.equals(lm3Var.f13418i, zzdfVar)) {
/* 26 */                        lm3Var.f13418i = null;
                            }
                        } catch (Throwable th) {
/* 58 */                    throw th;
                        }
                    }
/* 42 */            if (((ij3) lm3Var.f16749a).f9651d.m7410N()) {
/* 53 */                lm3Var.f13417f.remove(Integer.valueOf(zzdfVar.zza));
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    switch (this.f7195a) {
                        case 0:
/* 14 */                    Intent intent = activity.getIntent();
/* 18 */                    if (intent != null) {
/* 25 */                        if (Build.VERSION.SDK_INT > 25) {
/* 47 */                            m3078a(intent);
                                } else {
/* 43 */                            new Handler(Looper.getMainLooper()).post(new RunnableC1784j8(23, this, intent));
                                }
                                break;
                            }
                            break;
                        case 1:
                            break;
                        default:
/* 10 */                    m3079n(zzdf.zza(activity), bundle);
                            break;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                    switch (this.f7195a) {
                        case 0:
/* 42 */                    return;
                        case 1:
/* 16 */                    bh3 bh3Var = (bh3) this.f7196b;
                            synchronized (bh3Var.f2429c) {
                                try {
/* 21 */                            WeakReference weakReference = bh3Var.f2431e;
/* 23 */                            if (weakReference == null) {
/* 39 */                                return;
                                    }
/* 33 */                            if (weakReference.get() == activity) {
/* 36 */                                bh3Var.f2431e = null;
                                    }
/* 39 */                            return;
                                } catch (Throwable th) {
/* 41 */                            throw th;
                                }
                            }
                        default:
/* 10 */                    m3080o(zzdf.zza(activity));
/* 13 */                    return;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                    switch (this.f7195a) {
                        case 0:
                        case 1:
                            break;
                        default:
/* 10 */                    m3081p(zzdf.zza(activity));
                            break;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                    switch (this.f7195a) {
                        case 0:
                            break;
                        case 1:
/* 18 */                    bh3.m1360c((bh3) this.f7196b, activity);
                            break;
                        default:
/* 10 */                    m3082q(zzdf.zza(activity));
                            break;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    switch (this.f7195a) {
                        case 0:
                        case 1:
                            break;
                        default:
/* 10 */                    m3083r(zzdf.zza(activity), bundle);
                            break;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                    switch (this.f7195a) {
                        case 1:
/* 11 */                    bh3.m1360c((bh3) this.f7196b, activity);
                            break;
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
/* 1 */             int i = this.f7195a;
                }

                /* JADX INFO: renamed from: p */
                public void m3081p(zzdf zzdfVar) {
/* 7 */             ij3 ij3Var = (ij3) ((sl3) this.f7196b).f16749a;
/* 9 */             lm3 lm3Var = ij3Var.f9641W;
/* 11 */            ij3.m4554k(lm3Var);
                    synchronized (lm3Var.f13413W) {
/* 18 */                lm3Var.f13412V = false;
/* 21 */                lm3Var.f13419v = true;
                    }
/* 26 */            ij3 ij3Var2 = (ij3) lm3Var.f16749a;
/* 30 */            ij3Var2.f9640V.getClass();
/* 33 */            long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 44 */            if (ij3Var2.f9651d.m7410N()) {
/* 62 */                bm3 bm3VarM6502E = lm3Var.m6502E(zzdfVar);
/* 68 */                lm3Var.f13415d = lm3Var.f13414c;
/* 70 */                lm3Var.f13414c = null;
/* 72 */                bj3 bj3Var = ij3Var2.f9659i;
/* 74 */                ij3.m4555l(bj3Var);
/* 82 */                bj3Var.m1370I(new es0(lm3Var, bm3VarM6502E, jElapsedRealtime));
                    } else {
/* 46 */                lm3Var.f13414c = null;
/* 48 */                bj3 bj3Var2 = ij3Var2.f9659i;
/* 50 */                ij3.m4555l(bj3Var2);
/* 58 */                bj3Var2.m1370I(new e50(lm3Var, jElapsedRealtime));
                    }
/* 85 */            lo3 lo3Var = ij3Var.f9667v;
/* 87 */            ij3.m4554k(lo3Var);
/* 92 */            ij3 ij3Var3 = (ij3) lo3Var.f16749a;
/* 96 */            ij3Var3.f9640V.getClass();
/* 99 */            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
/* 103 */           bj3 bj3Var3 = ij3Var3.f9659i;
/* 105 */           ij3.m4555l(bj3Var3);
/* 113 */           bj3Var3.m1370I(new ao3(lo3Var, jElapsedRealtime2, 1));
                }

                /* JADX INFO: renamed from: q */
                public void m3082q(zzdf zzdfVar) {
/* 7 */             ij3 ij3Var = (ij3) ((sl3) this.f7196b).f16749a;
/* 9 */             lo3 lo3Var = ij3Var.f9667v;
/* 11 */            ij3.m4554k(lo3Var);
/* 16 */            ij3 ij3Var2 = (ij3) lo3Var.f16749a;
/* 20 */            ij3Var2.f9640V.getClass();
/* 23 */            long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 27 */            bj3 bj3Var = ij3Var2.f9659i;
/* 29 */            ij3.m4555l(bj3Var);
/* 38 */            bj3Var.m1370I(new ao3(lo3Var, jElapsedRealtime, 0));
/* 41 */            lm3 lm3Var = ij3Var.f9641W;
/* 43 */            ij3.m4554k(lm3Var);
/* 46 */            Object obj = lm3Var.f13413W;
                    synchronized (obj) {
/* 50 */                lm3Var.f13412V = true;
/* 58 */                if (!Objects.equals(zzdfVar, lm3Var.f13418i)) {
                            synchronized (obj) {
/* 61 */                        lm3Var.f13418i = zzdfVar;
/* 63 */                        lm3Var.f13419v = false;
/* 68 */                        ij3 ij3Var3 = (ij3) lm3Var.f16749a;
/* 76 */                        if (ij3Var3.f9651d.m7410N()) {
/* 79 */                            lm3Var.f13420w = null;
/* 81 */                            bj3 bj3Var2 = ij3Var3.f9659i;
/* 83 */                            ij3.m4555l(bj3Var2);
/* 91 */                            bj3Var2.m1370I(new em3(lm3Var, 1));
                                }
                            }
                        }
                    }
/* 103 */           ij3 ij3Var4 = (ij3) lm3Var.f16749a;
/* 111 */           if (!ij3Var4.f9651d.m7410N()) {
/* 115 */               lm3Var.f13414c = lm3Var.f13420w;
/* 117 */               bj3 bj3Var3 = ij3Var4.f9659i;
/* 119 */               ij3.m4555l(bj3Var3);
/* 127 */               bj3Var3.m1370I(new em3(lm3Var, 0));
/* 130 */               return;
                    }
/* 137 */           lm3Var.m6506I(zzdfVar.zzb, lm3Var.m6502E(zzdfVar), false);
/* 144 */           of3 of3Var = ((ij3) lm3Var.f16749a).f9643Y;
/* 146 */           ij3.m4552i(of3Var);
/* 151 */           ij3 ij3Var5 = (ij3) of3Var.f16749a;
/* 155 */           ij3Var5.f9640V.getClass();
/* 158 */           long jElapsedRealtime2 = SystemClock.elapsedRealtime();
/* 162 */           bj3 bj3Var4 = ij3Var5.f9659i;
/* 164 */           ij3.m4555l(bj3Var4);
/* 172 */           bj3Var4.m1370I(new e50(of3Var, jElapsedRealtime2));
                }

                /* JADX INFO: renamed from: r */
                public void m3083r(zzdf zzdfVar, Bundle bundle) {
                    bm3 bm3Var;
/* 9 */             lm3 lm3Var = ((ij3) ((sl3) this.f7196b).f16749a).f9641W;
/* 11 */            ij3.m4554k(lm3Var);
/* 24 */            if (!((ij3) lm3Var.f16749a).f9651d.m7410N() || bundle == null || (bm3Var = (bm3) lm3Var.f13417f.get(Integer.valueOf(zzdfVar.zza))) == null) {
/* 76 */                return;
                    }
/* 47 */            Bundle bundle2 = new Bundle();
/* 54 */            bundle2.putLong("id", bm3Var.f2540c);
/* 61 */            bundle2.putString("name", bm3Var.f2538a);
/* 68 */            bundle2.putString("referrer_name", bm3Var.f2539b);
/* 73 */            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
                }

/* 16 */        public /* synthetic */ dh0(Object obj, int i) {
/* 17 */            this.f7195a = i;
                    this.f7196b = obj;
                }
            }
