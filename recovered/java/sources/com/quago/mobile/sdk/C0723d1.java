            package com.quago.mobile.sdk;

            import android.os.Build;
            import java.util.Locale;
            import p000.AbstractC0886en;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.d1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0723d1 {

                /* JADX INFO: renamed from: h */
                public static final transient C0740j0 f5396h;

                /* JADX INFO: renamed from: a */
                public final String f5397a;

                /* JADX INFO: renamed from: b */
                public final String f5398b;

                /* JADX INFO: renamed from: c */
                public final String f5399c;

                /* JADX INFO: renamed from: d */
                public final String f5400d;

                /* JADX INFO: renamed from: e */
                public final String f5401e;

                /* JADX INFO: renamed from: f */
                public final int f5402f;

                /* JADX INFO: renamed from: g */
                public final int f5403g;

                static {
/* 1 */             Locale locale = AbstractC0743k0.f5509a;
/* 10 */            f5396h = new C0740j0("QuagoVersion");
                }

                public C0723d1() {
                    int i;
                    String str;
                    String str2;
                    String str3;
                    String str4;
/* 6 */             int i2 = 0;
                    try {
/* 7 */                 i = Build.VERSION.SDK_INT;
                    } catch (Exception e) {
/* 13 */                f5396h.m2612a("Version", e);
/* 16 */                i = 0;
                    }
/* 17 */            this.f5403g = i;
/* 19 */            String str5 = null;
                    try {
/* 20 */                str = Build.VERSION.RELEASE;
                    } catch (Exception e2) {
/* 26 */                f5396h.m2612a("Version", e2);
/* 29 */                str = null;
                    }
/* 30 */            this.f5400d = str;
                    try {
/* 32 */                str2 = Build.VERSION.CODENAME;
                    } catch (Exception e3) {
/* 38 */                f5396h.m2612a("Version", e3);
/* 41 */                str2 = null;
                    }
/* 42 */            this.f5398b = str2;
                    try {
/* 44 */                str3 = Build.VERSION.INCREMENTAL;
                    } catch (Exception e4) {
/* 50 */                f5396h.m2612a("Version", e4);
/* 53 */                str3 = null;
                    }
/* 54 */            this.f5399c = str3;
                    try {
/* 56 */                str4 = Build.VERSION.BASE_OS;
                    } catch (Exception e5) {
/* 62 */                f5396h.m2612a("Version", e5);
/* 65 */                str4 = null;
                    }
                    try {
/* 66 */                i2 = Build.VERSION.PREVIEW_SDK_INT;
                    } catch (Exception e6) {
/* 72 */                f5396h.m2612a("Version", e6);
                    }
                    try {
/* 75 */                str5 = Build.VERSION.SECURITY_PATCH;
                    } catch (Exception e7) {
/* 81 */                f5396h.m2612a("Version", e7);
                    }
/* 84 */            this.f5397a = str4;
/* 86 */            this.f5402f = i2;
/* 88 */            this.f5401e = str5;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("QuagoVersion{base_os='");
/* 10 */            sb.append(this.f5397a);
/* 15 */            sb.append("', codename='");
/* 20 */            sb.append(this.f5398b);
/* 25 */            sb.append("', incremental='");
/* 30 */            sb.append(this.f5399c);
/* 35 */            sb.append("', release='");
/* 40 */            sb.append(this.f5400d);
/* 45 */            sb.append("', security_patch='");
/* 50 */            sb.append(this.f5401e);
/* 55 */            sb.append("', preview_sdk_int=");
/* 60 */            sb.append(this.f5402f);
/* 65 */            sb.append(", sdk_int=");
/* 72 */            return AbstractC0886en.m3510n(sb, this.f5403g, '}');
                }
            }
