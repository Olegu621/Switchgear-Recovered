            package com.quago.mobile.sdk.root;

            import com.quago.mobile.sdk.AbstractC0743k0;
            import com.quago.mobile.sdk.C0740j0;
            import java.util.Locale;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class QuagoRootDetectionNative {

                /* JADX INFO: renamed from: a */
                public static final C0740j0 f5621a;

                /* JADX INFO: renamed from: b */
                public static final boolean f5622b;

                static {
/* 1 */             Locale locale = AbstractC0743k0.f5509a;
/* 10 */            f5621a = new C0740j0("QuagoRootDetectionNative");
/* 13 */            f5622b = false;
                    try {
/* 17 */                System.loadLibrary("QuagoTool");
/* 21 */                f5622b = true;
                    } catch (UnsatisfiedLinkError e) {
/* 29 */                f5621a.m2612a("static", e);
                    }
                }

                public native int checkForRoot(Object[] objArr);

                public native void setLogLevel(int i);
            }
