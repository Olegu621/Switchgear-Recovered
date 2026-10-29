            package com.google.android.play.core.integrity;

            import android.content.Context;
            import p000.f42;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.q */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     final class C0453q implements InterfaceC0460x {

                /* JADX INFO: renamed from: a */
                private Context f5259a;

                public /* synthetic */ C0453q(C0452p c0452p) {
                }

                /* JADX INFO: renamed from: a */
                public final C0453q m2499a(Context context) {
/* 1 */             context.getClass();
/* 4 */             this.f5259a = context;
/* 6 */             return this;
                }

                @Override // com.google.android.play.core.integrity.InterfaceC0460x
                /* JADX INFO: renamed from: b */
                public final C0455s mo2500b() {
/* 1 */             Context context = this.f5259a;
/* 4 */             if (context != null) {
/* 8 */                 return new C0455s(context, null);
                    }
/* 28 */            f42.m3656l(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
/* 3 */             return null;
                }

/* 4 */         private C0453q() {
/* 5 */             throw null;
                }
            }
