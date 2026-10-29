            package p000;

            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gm0 extends AbstractC0903f3 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ AtomicReference f8712a;

                public gm0(AtomicReference atomicReference) {
/* 4 */             this.f8712a = atomicReference;
                }

                @Override // p000.AbstractC0903f3
                /* JADX INFO: renamed from: a */
                public final void mo3637a(Object obj) {
/* 7 */             AbstractC0903f3 abstractC0903f3 = (AbstractC0903f3) this.f8712a.get();
/* 9 */             if (abstractC0903f3 != null) {
/* 11 */                abstractC0903f3.mo3637a(obj);
                    } else {
/* 17 */                f42.m3656l("Operation cannot be started before fragment is in created state");
                    }
                }
            }
