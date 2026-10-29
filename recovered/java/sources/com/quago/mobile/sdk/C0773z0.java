            package com.quago.mobile.sdk;

            import android.content.Context;
            import android.provider.Settings;
            import java.util.Locale;
            import p000.AbstractC0886en;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.z0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0773z0 {

                /* JADX INFO: renamed from: d */
                public static final transient C0740j0 f5687d;

                /* JADX INFO: renamed from: a */
                public final String f5688a;

                /* JADX INFO: renamed from: b */
                public final String f5689b;

                /* JADX INFO: renamed from: c */
                public boolean f5690c;

                static {
/* 1 */             Locale locale = AbstractC0743k0.f5509a;
/* 10 */            f5687d = new C0740j0("QuagoSecurity");
                }

                public C0773z0(Context context) {
                    String string;
/* 6 */             String string2 = null;
                    try {
/* 13 */                string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                    } catch (Exception e) {
/* 21 */                f5687d.m2612a("Security", e);
/* 24 */                string = null;
                    }
/* 25 */            this.f5688a = string;
                    try {
/* 33 */                string2 = Settings.Global.getString(context.getContentResolver(), "bluetooth_on");
                    } catch (Exception e2) {
/* 41 */                f5687d.m2612a("Security", e2);
                    }
/* 44 */            this.f5689b = string2;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("QuagoSecurity{android_id='");
/* 10 */            sb.append(this.f5688a);
/* 15 */            sb.append("', bluetooth_on='");
/* 20 */            sb.append(this.f5689b);
/* 25 */            sb.append("', rooted='");
/* 32 */            return AbstractC0886en.m3511o(sb, this.f5690c, "'}");
                }
            }
