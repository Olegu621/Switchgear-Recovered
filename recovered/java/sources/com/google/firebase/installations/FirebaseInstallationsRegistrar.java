            package com.google.firebase.installations;

            import com.google.firebase.components.ComponentRegistrar;
            import java.util.Arrays;
            import java.util.List;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import p000.C2123qx;
            import p000.C2160rx;
            import p000.C2197sx;
            import p000.InterfaceC0824cy;
            import p000.InterfaceC1027ih;
            import p000.InterfaceC2296vj;
            import p000.f02;
            import p000.i13;
            import p000.r70;
            import p000.s80;
            import p000.vi0;
            import p000.x92;
            import p000.xt0;
            import p000.yt0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
                private static final String LIBRARY_NAME = "fire-installations";

                /* JADX INFO: Access modifiers changed from: private */
                public static FirebaseInstallationsApi lambda$getComponents$0(InterfaceC0824cy interfaceC0824cy) {
/* 52 */            return new FirebaseInstallations((vi0) interfaceC0824cy.get(vi0.class), interfaceC0824cy.mo1258b(yt0.class), (ExecutorService) interfaceC0824cy.mo1261e(new f02(InterfaceC1027ih.class, ExecutorService.class)), new x92((Executor) interfaceC0824cy.mo1261e(new f02(InterfaceC2296vj.class, Executor.class))));
                }

                @Override // com.google.firebase.components.ComponentRegistrar
                public List<C2197sx> getComponents() {
/* 3 */             C2160rx c2160rxM8644b = C2197sx.m8644b(FirebaseInstallationsApi.class);
/* 9 */             c2160rxM8644b.f16329a = LIBRARY_NAME;
/* 17 */            c2160rxM8644b.m8314a(r70.m8078a(vi0.class));
/* 22 */            int i = 0;
/* 29 */            c2160rxM8644b.m8314a(new r70(0, 1, yt0.class));
/* 46 */            c2160rxM8644b.m8314a(new r70(new f02(InterfaceC1027ih.class, ExecutorService.class), 1, 0));
/* 63 */            c2160rxM8644b.m8314a(new r70(new f02(InterfaceC2296vj.class, Executor.class), 1, 0));
/* 73 */            c2160rxM8644b.f16334f = new s80(14);
/* 75 */            C2197sx c2197sxM8315b = c2160rxM8644b.m8315b();
/* 81 */            xt0 xt0Var = new xt0(i);
/* 86 */            C2160rx c2160rxM8644b2 = C2197sx.m8644b(xt0.class);
/* 90 */            c2160rxM8644b2.f16333e = 1;
/* 97 */            c2160rxM8644b2.f16334f = new C2123qx(xt0Var, i);
/* 113 */           return Arrays.asList(c2197sxM8315b, c2160rxM8644b2.m8315b(), i13.m4432i(LIBRARY_NAME, BuildConfig.VERSION_NAME));
                }
            }
