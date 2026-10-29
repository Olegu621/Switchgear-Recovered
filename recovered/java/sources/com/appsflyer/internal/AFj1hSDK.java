            package com.appsflyer.internal;

            import java.lang.reflect.Field;
            import okhttp3.HttpUrl;
            import p000.C0848dl;
            import p000.m42;
            import p000.n42;
            import p000.o42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFj1hSDK implements AFj1iSDK {
                @Override // com.appsflyer.internal.AFj1iSDK
                public final String getMediationNetwork() {
                    Object n42Var;
                    try {
/* 1 */                 m42 m42Var = o42.f14612b;
/* 7 */                 Field declaredField = C0848dl.class.getDeclaredField("a");
/* 12 */                declaredField.setAccessible(true);
/* 16 */                Object obj = declaredField.get(null);
/* 20 */                obj.getClass();
/* 23 */                n42Var = (String) obj;
                    } catch (Throwable th) {
/* 27 */                m42 m42Var2 = o42.f14612b;
/* 31 */                n42Var = new n42(th);
                    }
/* 38 */            if (n42Var instanceof n42) {
/* 40 */                n42Var = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 42 */            return (String) n42Var;
                }
            }
