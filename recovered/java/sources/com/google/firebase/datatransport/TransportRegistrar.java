            package com.google.firebase.datatransport;

            import android.content.Context;
            import com.google.firebase.components.ComponentRegistrar;
            import java.util.Arrays;
            import java.util.List;
            import p000.C0959gm;
            import p000.C2160rx;
            import p000.C2197sx;
            import p000.InterfaceC0824cy;
            import p000.f02;
            import p000.f42;
            import p000.i13;
            import p000.n61;
            import p000.r70;
            import p000.ur2;
            import p000.wr2;
            import p000.yr2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class TransportRegistrar implements ComponentRegistrar {
                private static final String LIBRARY_NAME = "fire-transport";

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ wr2 lambda$getComponents$0(InterfaceC0824cy interfaceC0824cy) {
/* 9 */             yr2.m10174b((Context) interfaceC0824cy.get(Context.class));
/* 18 */            return yr2.m10173a().m10175c(C0959gm.f8709f);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ wr2 lambda$getComponents$1(InterfaceC0824cy interfaceC0824cy) {
/* 9 */             yr2.m10174b((Context) interfaceC0824cy.get(Context.class));
/* 18 */            return yr2.m10173a().m10175c(C0959gm.f8709f);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ wr2 lambda$getComponents$2(InterfaceC0824cy interfaceC0824cy) {
/* 9 */             yr2.m10174b((Context) interfaceC0824cy.get(Context.class));
/* 18 */            return yr2.m10173a().m10175c(C0959gm.f8708e);
                }

                @Override // com.google.firebase.components.ComponentRegistrar
                public List<C2197sx> getComponents() {
/* 3 */             C2160rx c2160rxM8644b = C2197sx.m8644b(wr2.class);
/* 9 */             c2160rxM8644b.f16329a = LIBRARY_NAME;
/* 17 */            c2160rxM8644b.m8314a(r70.m8078a(Context.class));
/* 27 */            c2160rxM8644b.f16334f = new f42(14);
/* 29 */            C2197sx c2197sxM8315b = c2160rxM8644b.m8315b();
/* 40 */            C2160rx c2160rxM8643a = C2197sx.m8643a(new f02(n61.class, wr2.class));
/* 48 */            c2160rxM8643a.m8314a(r70.m8078a(Context.class));
/* 58 */            c2160rxM8643a.f16334f = new f42(15);
/* 60 */            C2197sx c2197sxM8315b2 = c2160rxM8643a.m8315b();
/* 71 */            C2160rx c2160rxM8643a2 = C2197sx.m8643a(new f02(ur2.class, wr2.class));
/* 79 */            c2160rxM8643a2.m8314a(r70.m8078a(Context.class));
/* 89 */            c2160rxM8643a2.f16334f = new f42(16);
/* 105 */           return Arrays.asList(c2197sxM8315b, c2197sxM8315b2, c2160rxM8643a2.m8315b(), i13.m4432i(LIBRARY_NAME, "18.2.0"));
                }
            }
