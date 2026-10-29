            package p000;

            import androidx.fragment.app.Fragment;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class im0 extends km0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ so0 f9711a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ AtomicReference f9712b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ AbstractC0830d3 f9713c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ InterfaceC0202c3 f9714d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Fragment f9715e;

                public im0(Fragment fragment, so0 so0Var, AtomicReference atomicReference, AbstractC0830d3 abstractC0830d3, InterfaceC0202c3 interfaceC0202c3) {
/* 4 */             this.f9715e = fragment;
/* 6 */             this.f9711a = so0Var;
/* 8 */             this.f9712b = atomicReference;
/* 10 */            this.f9713c = abstractC0830d3;
/* 12 */            this.f9714d = interfaceC0202c3;
                }

                @Override // p000.km0
                /* JADX INFO: renamed from: a */
                public final void mo668a() {
/* 1 */             Fragment fragment = this.f9715e;
/* 26 */            this.f9712b.set(((AbstractC1816k3) this.f9711a.apply(null)).m5940d(fragment.generateActivityResultKey(), fragment, this.f9713c, this.f9714d));
                }
            }
