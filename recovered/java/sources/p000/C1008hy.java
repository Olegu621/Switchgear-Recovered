            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            
            /* JADX INFO: renamed from: hy */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class C1008hy implements iz1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9357a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f9358b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f9359c;

                public /* synthetic */ C1008hy(int i, Object obj, Object obj2) {
/* 1 */             this.f9357a = i;
/* 3 */             this.f9358b = obj;
/* 5 */             this.f9359c = obj2;
                }

                @Override // p000.iz1
                public final Object get() {
                    ApplicationInfo applicationInfo;
                    Bundle bundle;
/* 1 */             int i = this.f9357a;
/* 4 */             Object obj = this.f9359c;
/* 6 */             Object obj2 = this.f9358b;
                    switch (i) {
                        case 0:
/* 123 */                   C2197sx c2197sx = (C2197sx) obj;
/* 132 */                   return c2197sx.f16836f.create(new C0168b5(c2197sx, (C1773iy) obj2));
                        case 1:
/* 105 */                   ts0 ts0Var = new ts0();
/* 118 */                   ts0Var.f17248a = ((Context) obj2).getSharedPreferences("FirebaseHeartBeat".concat((String) obj), 0);
/* 120 */                   return ts0Var;
                        default:
/* 11 */                    vi0 vi0Var = (vi0) obj2;
/* 17 */                    String strM9276d = vi0Var.m9276d();
/* 31 */                    a40 a40Var = new a40();
/* 34 */                    Context contextCreateDeviceProtectedStorageContext = v00.createDeviceProtectedStorageContext((Context) obj);
/* 44 */                    SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(strM9276d), 0);
/* 54 */                    boolean z = true;
/* 55 */                    if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
/* 57 */                        z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                            } else {
                                try {
/* 62 */                            PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
/* 66 */                            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
/* 92 */                                z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                                    }
                                    break;
                                } catch (PackageManager.NameNotFoundException unused) {
                                }
                            }
/* 96 */                    a40Var.f78a = z;
/* 98 */                    return a40Var;
                    }
                }
            }
