            package com.google.firebase.ktx;

            import com.google.firebase.components.ComponentRegistrar;
            import java.util.List;
            import java.util.concurrent.Executor;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.C2085pw;
            import p000.C2160rx;
            import p000.C2197sx;
            import p000.InterfaceC1027ih;
            import p000.InterfaceC2296vj;
            import p000.dc0;
            import p000.f02;
            import p000.gx2;
            import p000.l71;
            import p000.r70;
            import p000.s10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m6176d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lsx;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
                @Override // com.google.firebase.components.ComponentRegistrar
                public List<C2197sx> getComponents() {
/* 10 */            C2160rx c2160rxM8643a = C2197sx.m8643a(new f02(InterfaceC1027ih.class, s10.class));
/* 28 */            c2160rxM8643a.m8314a(new r70(new f02(InterfaceC1027ih.class, Executor.class), 1, 0));
/* 33 */            c2160rxM8643a.f16334f = dc0.f7103e;
/* 35 */            C2197sx c2197sxM8315b = c2160rxM8643a.m8315b();
/* 46 */            C2160rx c2160rxM8643a2 = C2197sx.m8643a(new f02(l71.class, s10.class));
/* 60 */            c2160rxM8643a2.m8314a(new r70(new f02(l71.class, Executor.class), 1, 0));
/* 65 */            c2160rxM8643a2.f16334f = dc0.f7104f;
/* 67 */            C2197sx c2197sxM8315b2 = c2160rxM8643a2.m8315b();
/* 78 */            C2160rx c2160rxM8643a3 = C2197sx.m8643a(new f02(InterfaceC2296vj.class, s10.class));
/* 92 */            c2160rxM8643a3.m8314a(new r70(new f02(InterfaceC2296vj.class, Executor.class), 1, 0));
/* 97 */            c2160rxM8643a3.f16334f = dc0.f7105i;
/* 99 */            C2197sx c2197sxM8315b3 = c2160rxM8643a3.m8315b();
/* 110 */           C2160rx c2160rxM8643a4 = C2197sx.m8643a(new f02(gx2.class, s10.class));
/* 124 */           c2160rxM8643a4.m8314a(new r70(new f02(gx2.class, Executor.class), 1, 0));
/* 129 */           c2160rxM8643a4.f16334f = dc0.f7106v;
/* 139 */           return C2085pw.m7566e(c2197sxM8315b, c2197sxM8315b2, c2197sxM8315b3, c2160rxM8643a4.m8315b());
                }
            }
