            package p000;

            import com.google.android.gms.measurement.internal.zzgc;
            import java.util.List;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class om3 extends zzgc {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ AtomicReference f14829a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public om3(pn3 pn3Var, AtomicReference atomicReference) {
/* 5 */             super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
/* 1 */             this.f14829a = atomicReference;
                }

                @Override // com.google.android.gms.measurement.internal.zzgd
                /* JADX INFO: renamed from: f0 */
                public final void mo2190f0(List list) {
/* 1 */             AtomicReference atomicReference = this.f14829a;
                    synchronized (atomicReference) {
/* 4 */                 atomicReference.set(list);
/* 7 */                 atomicReference.notifyAll();
                    }
                }
            }
