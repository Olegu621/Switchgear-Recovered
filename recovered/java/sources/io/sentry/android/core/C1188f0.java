            package io.sentry.android.core;

            import androidx.lifecycle.DefaultLifecycleObserver;
            import java.util.Iterator;
            import p000.g71;
            
            /* JADX INFO: renamed from: io.sentry.android.core.f0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1188f0 implements DefaultLifecycleObserver {

                /* JADX INFO: renamed from: a */
                public final C1185e0 f10011a = new C1185e0(this, 0);

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1191g0 f10012b;

                public C1188f0(C1191g0 c1191g0) {
/* 4 */             this.f10012b = c1191g0;
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final void onStart(g71 g71Var) {
/* 5 */             this.f10012b.f10021d = Boolean.FALSE;
/* 9 */             Iterator it = this.f10011a.iterator();
/* 17 */            while (it.hasNext()) {
/* 25 */                ((InterfaceC1182d0) it.next()).mo4761c();
                    }
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final void onStop(g71 g71Var) {
/* 5 */             this.f10012b.f10021d = Boolean.TRUE;
/* 9 */             Iterator it = this.f10011a.iterator();
/* 17 */            while (it.hasNext()) {
/* 25 */                ((InterfaceC1182d0) it.next()).mo4762f();
                    }
                }
            }
