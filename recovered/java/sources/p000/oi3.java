            package p000;

            import android.net.Uri;
            import android.os.Bundle;
            import android.text.TextUtils;
            import android.util.Log;
            import io.sentry.android.core.C1268s;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class oi3 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14772a = 2;

                /* JADX INFO: renamed from: b */
                public final ij3 f14773b;

                public oi3(mp3 mp3Var) {
/* 9 */             this.f14773b = mp3Var.f13905W;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: a */
                public boolean m7175a() {
/* 1 */             int i = this.f14772a;
/* 3 */             ij3 ij3Var = this.f14773b;
                    switch (i) {
                        case 0:
/* 23 */                    boolean z = false;
                            try {
/* 26 */                        v30 v30VarM3898a = g93.m3898a(ij3Var.f9645a);
/* 30 */                        if (v30VarM3898a == null) {
/* 32 */                            uh3 uh3Var = ij3Var.f9655f;
/* 34 */                            ij3.m4555l(uh3Var);
/* 41 */                            uh3Var.f17534Y.m8510a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                                    ij3Var = ij3Var;
                                } else {
/* 55 */                            int i2 = v30VarM3898a.m9214c(128, "com.android.vending").versionCode;
                                    ij3Var = i2;
/* 60 */                            if (i2 >= 80837300) {
/* 62 */                                z = true;
                                        ij3Var = i2;
                                    }
                                }
                                break;
                            } catch (Exception e) {
/* 64 */                        uh3 uh3Var2 = ij3Var.f9655f;
/* 66 */                        ij3.m4555l(uh3Var2);
/* 73 */                        uh3Var2.f17534Y.m8511b(e, "Failed to retrieve Play Store version for Install Referrer");
                            }
/* 76 */                    return z;
                        default:
/* 8 */                     uh3 uh3Var3 = ij3Var.f9655f;
/* 10 */                    ij3.m4555l(uh3Var3);
/* 18 */                    return Log.isLoggable(uh3Var3.m9021J(), 3);
                    }
                }

                /* JADX INFO: renamed from: b */
                public void m7176b(String str, Bundle bundle) {
                    String string;
/* 1 */             ij3 ij3Var = this.f14773b;
/* 3 */             bj3 bj3Var = ij3Var.f9659i;
/* 5 */             ki3 ki3Var = ij3Var.f9653e;
/* 7 */             ij3.m4555l(bj3Var);
/* 10 */            bj3Var.mo1375y();
/* 17 */            if (ij3Var.m4560d()) {
/* 108 */               return;
                    }
/* 23 */            if (bundle.isEmpty()) {
/* 25 */                string = null;
                    } else {
/* 32 */                if (true == str.isEmpty()) {
/* 34 */                    str = "auto";
                        }
/* 38 */                Uri.Builder builder = new Uri.Builder();
/* 41 */                builder.path(str);
/* 56 */                for (String str2 : bundle.keySet()) {
/* 68 */                    builder.appendQueryParameter(str2, bundle.getString(str2));
                        }
/* 76 */                string = builder.build().toString();
                    }
/* 84 */            if (TextUtils.isEmpty(string)) {
/* 108 */               return;
                    }
/* 86 */            ij3.m4553j(ki3Var);
/* 91 */            ki3Var.f12812h0.m8806n(string);
/* 94 */            C1268s c1268s = ki3Var.f12814i0;
/* 98 */            ij3Var.f9640V.getClass();
/* 105 */           c1268s.m4933b(System.currentTimeMillis());
                }

                /* JADX INFO: renamed from: c */
                public boolean m7177c() {
/* 5 */             if (!m7178d()) {
/* 46 */                return false;
                    }
/* 8 */             ij3 ij3Var = this.f14773b;
/* 12 */            ij3Var.f9640V.getClass();
/* 15 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 19 */            ki3 ki3Var = ij3Var.f9653e;
/* 21 */            ij3.m4553j(ki3Var);
                    return jCurrentTimeMillis - ki3Var.f12814i0.m4932a() > ij3Var.f9651d.m7403G(null, vg3.f18143j0);
                }

                /* JADX INFO: renamed from: d */
                public boolean m7178d() {
/* 3 */             ki3 ki3Var = this.f14773b.f9653e;
/* 5 */             ij3.m4553j(ki3Var);
                    return ki3Var.f12814i0.m4932a() > 0;
                }

/* 11 */        public oi3(ij3 ij3Var) {
                    this.f14773b = ij3Var;
                }

/* 12 */        public oi3(sk3 sk3Var, ij3 ij3Var) {
                    this.f14773b = ij3Var;
                }
            }
