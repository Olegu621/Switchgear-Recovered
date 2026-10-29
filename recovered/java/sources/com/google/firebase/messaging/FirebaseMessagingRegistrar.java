            package com.google.firebase.messaging;

            import com.google.firebase.components.ComponentRegistrar;
            import com.google.firebase.installations.FirebaseInstallationsApi;
            import io.sentry.C1697u2;
            import java.util.Arrays;
            import java.util.List;
            import p000.C2160rx;
            import p000.C2197sx;
            import p000.InterfaceC0824cy;
            import p000.a70;
            import p000.f02;
            import p000.f42;
            import p000.i13;
            import p000.li2;
            import p000.r70;
            import p000.ur2;
            import p000.vi0;
            import p000.wr2;
            import p000.z50;
            import p000.zi0;
            import p000.zt0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FirebaseMessagingRegistrar implements ComponentRegistrar {
                private static final String LIBRARY_NAME = "fire-fcm";

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(f02 f02Var, InterfaceC0824cy interfaceC0824cy) {
/* 9 */             vi0 vi0Var = (vi0) interfaceC0824cy.get(vi0.class);
/* 17 */            if (interfaceC0824cy.get(zi0.class) == null) {
/* 52 */                return new FirebaseMessaging(vi0Var, interfaceC0824cy.mo1258b(a70.class), interfaceC0824cy.mo1258b(zt0.class), (FirebaseInstallationsApi) interfaceC0824cy.get(FirebaseInstallationsApi.class), interfaceC0824cy.mo1260d(f02Var), (li2) interfaceC0824cy.get(li2.class));
                    }
/* 56 */            C1697u2.m5431g();
/* 59 */            return null;
                }

                @Override // com.google.firebase.components.ComponentRegistrar
                public List<C2197sx> getComponents() {
/* 7 */             f02 f02Var = new f02(ur2.class, wr2.class);
/* 12 */            C2160rx c2160rxM8644b = C2197sx.m8644b(FirebaseMessaging.class);
/* 18 */            c2160rxM8644b.f16329a = LIBRARY_NAME;
/* 26 */            c2160rxM8644b.m8314a(r70.m8078a(vi0.class));
/* 37 */            c2160rxM8644b.m8314a(new r70(0, 0, zi0.class));
/* 48 */            c2160rxM8644b.m8314a(new r70(0, 1, a70.class));
/* 58 */            c2160rxM8644b.m8314a(new r70(0, 1, zt0.class));
/* 67 */            c2160rxM8644b.m8314a(r70.m8078a(FirebaseInstallationsApi.class));
/* 75 */            c2160rxM8644b.m8314a(new r70(f02Var, 0, 1));
/* 84 */            c2160rxM8644b.m8314a(r70.m8078a(li2.class));
/* 92 */            c2160rxM8644b.f16334f = new z50(f02Var, 1);
/* 99 */            if (c2160rxM8644b.f16332d == 0) {
/* 101 */               c2160rxM8644b.f16332d = 1;
/* 117 */               return Arrays.asList(c2160rxM8644b.m8315b(), i13.m4432i(LIBRARY_NAME, "24.1.2"));
                    }
/* 124 */           f42.m3656l("Instantiation type has already been set.");
/* 127 */           return null;
                }
            }
