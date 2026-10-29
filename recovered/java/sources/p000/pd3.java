            package p000;

            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            import android.text.TextUtils;
            import java.lang.reflect.InvocationTargetException;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pd3 extends sq3 {

                /* JADX INFO: renamed from: b */
                public Boolean f15073b;

                /* JADX INFO: renamed from: c */
                public String f15074c;

                /* JADX INFO: renamed from: d */
                public od3 f15075d;

                /* JADX INFO: renamed from: e */
                public Boolean f15076e;

                /* JADX INFO: renamed from: A */
                public final boolean m7397A(String str) {
/* 11 */            return "1".equals(this.f15075d.mo7139d(str, "gaia_collection_enabled"));
                }

                /* JADX INFO: renamed from: B */
                public final boolean m7398B(String str) {
/* 11 */            return "1".equals(this.f15075d.mo7139d(str, "measurement.event_sampling_enabled"));
                }

                /* JADX INFO: renamed from: C */
                public final boolean m7399C() {
/* 3 */             if (this.f15073b == null) {
/* 7 */                 Boolean boolM7408L = m7408L("app_measurement_lite");
/* 11 */                this.f15073b = boolM7408L;
/* 13 */                if (boolM7408L == null) {
/* 17 */                    this.f15073b = Boolean.FALSE;
                        }
                    }
                    return this.f15073b.booleanValue() || !((ij3) this.f16749a).f9647b;
                }

                /* JADX INFO: renamed from: D */
                public final String m7400D(String str) {
/* 5 */             ij3 ij3Var = (ij3) this.f16749a;
                    try {
/* 34 */                String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, HttpUrl.FRAGMENT_ENCODE_SET);
/* 36 */                kb1.m6061n(str2);
/* 39 */                return str2;
                    } catch (ClassNotFoundException e) {
/* 87 */                uh3 uh3Var = ij3Var.f9655f;
/* 89 */                ij3.m4555l(uh3Var);
/* 96 */                uh3Var.f17538f.m8511b(e, "Could not find SystemProperties class");
/* 7 */                 return HttpUrl.FRAGMENT_ENCODE_SET;
                    } catch (IllegalAccessException e2) {
/* 61 */                uh3 uh3Var2 = ij3Var.f9655f;
/* 63 */                ij3.m4555l(uh3Var2);
/* 70 */                uh3Var2.f17538f.m8511b(e2, "Could not access SystemProperties.get()");
/* 7 */                 return HttpUrl.FRAGMENT_ENCODE_SET;
                    } catch (NoSuchMethodException e3) {
/* 74 */                uh3 uh3Var3 = ij3Var.f9655f;
/* 76 */                ij3.m4555l(uh3Var3);
/* 83 */                uh3Var3.f17538f.m8511b(e3, "Could not find SystemProperties.get() method");
/* 7 */                 return HttpUrl.FRAGMENT_ENCODE_SET;
                    } catch (InvocationTargetException e4) {
/* 48 */                uh3 uh3Var4 = ij3Var.f9655f;
/* 50 */                ij3.m4555l(uh3Var4);
/* 57 */                uh3Var4.f17538f.m8511b(e4, "SystemProperties.get() threw an exception");
/* 7 */                 return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }

                /* JADX INFO: renamed from: E */
                public final void m7401E() {
/* 5 */             ((ij3) this.f16749a).getClass();
                }

                /* JADX INFO: renamed from: F */
                public final String m7402F(String str, ug3 ug3Var) {
                    return TextUtils.isEmpty(str) ? (String) ug3Var.m9011a(null) : (String) ug3Var.m9011a(this.f15075d.mo7139d(str, ug3Var.f17521a));
                }

                /* JADX INFO: renamed from: G */
                public final long m7403G(String str, ug3 ug3Var) {
/* 6 */             if (TextUtils.isEmpty(str)) {
/* 14 */                return ((Long) ug3Var.m9011a(null)).longValue();
                    }
/* 23 */            String strMo7139d = this.f15075d.mo7139d(str, ug3Var.f17521a);
/* 31 */            if (TextUtils.isEmpty(strMo7139d)) {
/* 39 */                return ((Long) ug3Var.m9011a(null)).longValue();
                    }
                    try {
/* 58 */                return ((Long) ug3Var.m9011a(Long.valueOf(Long.parseLong(strMo7139d)))).longValue();
                    } catch (NumberFormatException unused) {
/* 69 */                return ((Long) ug3Var.m9011a(null)).longValue();
                    }
                }

                /* JADX INFO: renamed from: H */
                public final int m7404H(String str, ug3 ug3Var) {
/* 6 */             if (TextUtils.isEmpty(str)) {
/* 14 */                return ((Integer) ug3Var.m9011a(null)).intValue();
                    }
/* 23 */            String strMo7139d = this.f15075d.mo7139d(str, ug3Var.f17521a);
/* 31 */            if (TextUtils.isEmpty(strMo7139d)) {
/* 39 */                return ((Integer) ug3Var.m9011a(null)).intValue();
                    }
                    try {
/* 58 */                return ((Integer) ug3Var.m9011a(Integer.valueOf(Integer.parseInt(strMo7139d)))).intValue();
                    } catch (NumberFormatException unused) {
/* 69 */                return ((Integer) ug3Var.m9011a(null)).intValue();
                    }
                }

                /* JADX INFO: renamed from: I */
                public final double m7405I(String str, ug3 ug3Var) {
/* 6 */             if (TextUtils.isEmpty(str)) {
/* 14 */                return ((Double) ug3Var.m9011a(null)).doubleValue();
                    }
/* 23 */            String strMo7139d = this.f15075d.mo7139d(str, ug3Var.f17521a);
/* 31 */            if (TextUtils.isEmpty(strMo7139d)) {
/* 39 */                return ((Double) ug3Var.m9011a(null)).doubleValue();
                    }
                    try {
/* 58 */                return ((Double) ug3Var.m9011a(Double.valueOf(Double.parseDouble(strMo7139d)))).doubleValue();
                    } catch (NumberFormatException unused) {
/* 69 */                return ((Double) ug3Var.m9011a(null)).doubleValue();
                    }
                }

                /* JADX INFO: renamed from: J */
                public final boolean m7406J(String str, ug3 ug3Var) {
/* 6 */             if (TextUtils.isEmpty(str)) {
/* 14 */                return ((Boolean) ug3Var.m9011a(null)).booleanValue();
                    }
/* 23 */            String strMo7139d = this.f15075d.mo7139d(str, ug3Var.f17521a);
                    return TextUtils.isEmpty(strMo7139d) ? ((Boolean) ug3Var.m9011a(null)).booleanValue() : ((Boolean) ug3Var.m9011a(Boolean.valueOf("1".equals(strMo7139d)))).booleanValue();
                }

                /* JADX INFO: renamed from: K */
                public final Bundle m7407K() {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
                    try {
/* 6 */                 Context context = ij3Var.f9645a;
/* 8 */                 Context context2 = ij3Var.f9645a;
/* 10 */                uh3 uh3Var = ij3Var.f9655f;
/* 16 */                if (context.getPackageManager() == null) {
/* 18 */                    ij3.m4555l(uh3Var);
/* 25 */                    uh3Var.f17538f.m8510a("Failed to load metadata: PackageManager is null");
/* 5 */                     return null;
                        }
/* 41 */                ApplicationInfo applicationInfoM9213b = g93.m3898a(context2).m9213b(128, context2.getPackageName());
/* 45 */                if (applicationInfoM9213b != null) {
/* 58 */                    return applicationInfoM9213b.metaData;
                        }
/* 47 */                ij3.m4555l(uh3Var);
/* 54 */                uh3Var.f17538f.m8510a("Failed to load metadata: ApplicationInfo is null");
/* 5 */                 return null;
                    } catch (PackageManager.NameNotFoundException e) {
/* 61 */                uh3 uh3Var2 = ij3Var.f9655f;
/* 63 */                ij3.m4555l(uh3Var2);
/* 70 */                uh3Var2.f17538f.m8511b(e, "Failed to load metadata: Package name not found");
/* 5 */                 return null;
                    }
                }

                /* JADX INFO: renamed from: L */
                public final Boolean m7408L(String str) {
/* 1 */             kb1.m6058k(str);
/* 4 */             Bundle bundleM7407K = m7407K();
/* 9 */             if (bundleM7407K != null) {
/* 32 */                if (bundleM7407K.containsKey(str)) {
/* 39 */                    return Boolean.valueOf(bundleM7407K.getBoolean(str));
                        }
/* 8 */                 return null;
                    }
/* 15 */            uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 17 */            ij3.m4555l(uh3Var);
/* 24 */            uh3Var.f17538f.m8510a("Failed to load metadata: Metadata bundle is null");
/* 8 */             return null;
                }

                /* JADX INFO: renamed from: M */
                public final boolean m7409M() {
/* 5 */             ((ij3) this.f16749a).getClass();
/* 10 */            Boolean boolM7408L = m7408L("firebase_analytics_collection_deactivated");
                    return boolM7408L != null && boolM7408L.booleanValue();
                }

                /* JADX INFO: renamed from: N */
                public final boolean m7410N() {
/* 3 */             Boolean boolM7408L = m7408L("google_analytics_automatic_screen_reporting_enabled");
                    return boolM7408L == null || boolM7408L.booleanValue();
                }

                /* JADX INFO: renamed from: O */
                public final lk3 m7411O(String str, boolean z) {
                    Object obj;
/* 1 */             kb1.m6058k(str);
/* 6 */             ij3 ij3Var = (ij3) this.f16749a;
/* 8 */             Bundle bundleM7407K = m7407K();
/* 12 */            if (bundleM7407K == null) {
/* 14 */                uh3 uh3Var = ij3Var.f9655f;
/* 16 */                ij3.m4555l(uh3Var);
/* 23 */                uh3Var.f17538f.m8510a("Failed to load metadata: Metadata bundle is null");
/* 26 */                obj = null;
                    } else {
/* 28 */                obj = bundleM7407K.get(str);
                    }
/* 32 */            lk3 lk3Var = lk3.UNINITIALIZED;
/* 34 */            if (obj == null) {
/* 36 */                return lk3Var;
                    }
/* 43 */            if (Boolean.TRUE.equals(obj)) {
/* 45 */                return lk3.GRANTED;
                    }
/* 54 */            if (Boolean.FALSE.equals(obj)) {
/* 56 */                return lk3.DENIED;
                    }
/* 59 */            if (z && "eu_consent_policy".equals(obj)) {
/* 69 */                return lk3.POLICY;
                    }
/* 72 */            uh3 uh3Var2 = ij3Var.f9655f;
/* 74 */            ij3.m4555l(uh3Var2);
/* 81 */            uh3Var2.f17541w.m8511b(str, "Invalid manifest metadata for");
/* 84 */            return lk3Var;
                }
            }
