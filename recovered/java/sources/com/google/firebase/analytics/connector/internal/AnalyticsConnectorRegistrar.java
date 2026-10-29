            package com.google.firebase.analytics.connector.internal;

            import android.content.Context;
            import com.google.firebase.analytics.connector.AnalyticsConnector;
            import com.google.firebase.analytics.connector.AnalyticsConnectorImpl;
            import com.google.firebase.components.ComponentRegistrar;
            import java.util.Arrays;
            import java.util.List;
            import p000.C2160rx;
            import p000.C2197sx;
            import p000.InterfaceC0824cy;
            import p000.f42;
            import p000.i13;
            import p000.li2;
            import p000.r70;
            import p000.vi0;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ AnalyticsConnector lambda$getComponents$0(InterfaceC0824cy interfaceC0824cy) {
/* 25 */            return AnalyticsConnectorImpl.getInstance((vi0) interfaceC0824cy.get(vi0.class), (Context) interfaceC0824cy.get(Context.class), (li2) interfaceC0824cy.get(li2.class));
                }

                @Override // com.google.firebase.components.ComponentRegistrar
                public List<C2197sx> getComponents() {
/* 3 */             C2160rx c2160rxM8644b = C2197sx.m8644b(AnalyticsConnector.class);
/* 13 */            c2160rxM8644b.m8314a(r70.m8078a(vi0.class));
/* 22 */            c2160rxM8644b.m8314a(r70.m8078a(Context.class));
/* 31 */            c2160rxM8644b.m8314a(r70.m8078a(li2.class));
/* 34 */            zzb zzbVar = zzb.zza;
/* 38 */            xe2.m9769g(zzbVar, "Null factory");
/* 41 */            c2160rxM8644b.f16334f = zzbVar;
/* 50 */            if (c2160rxM8644b.f16332d == 0) {
/* 53 */                c2160rxM8644b.f16332d = 2;
/* 71 */                return Arrays.asList(c2160rxM8644b.m8315b(), i13.m4432i("fire-analytics", "22.5.0"));
                    }
/* 78 */            f42.m3656l("Instantiation type has already been set.");
/* 81 */            return null;
                }
            }
