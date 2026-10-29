            package com.google.android.play.core.integrity;

            import android.content.Context;
            import p000.f42;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.u */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     final class C0457u implements InterfaceC0409av {

                /* JADX INFO: renamed from: a */
                private Context f5265a;

                public /* synthetic */ C0457u(C0456t c0456t) {
                }

                /* JADX INFO: renamed from: a */
                public final C0457u m2502a(Context context) {
/* 1 */             context.getClass();
/* 4 */             this.f5265a = context;
/* 6 */             return this;
                }

                @Override // com.google.android.play.core.integrity.InterfaceC0409av
                /* JADX INFO: renamed from: b */
                public final InterfaceC0410aw mo2467b() {
/* 1 */             Context context = this.f5265a;
/* 4 */             if (context != null) {
/* 8 */                 return new C0459w(context, null);
                    }
/* 28 */            f42.m3656l(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
/* 3 */             return null;
                }

/* 4 */         private C0457u() {
/* 5 */             throw null;
                }
            }
