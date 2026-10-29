            package p000;

            import com.google.android.gms.measurement.internal.zzgf;
            import com.google.android.gms.measurement.internal.zzop;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pm3 extends zzgf {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ AtomicReference f15179a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ pn3 f15180b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public pm3(pn3 pn3Var, AtomicReference atomicReference) {
/* 7 */             super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
/* 1 */             this.f15179a = atomicReference;
/* 3 */             this.f15180b = pn3Var;
                }

                @Override // com.google.android.gms.measurement.internal.zzgg
                /* JADX INFO: renamed from: i0 */
                public final void mo2191i0(zzop zzopVar) {
/* 1 */             AtomicReference atomicReference = this.f15179a;
                    synchronized (atomicReference) {
/* 10 */                uh3 uh3Var = ((ij3) this.f15180b.f16749a).f9655f;
/* 12 */                ij3.m4555l(uh3Var);
/* 29 */                uh3Var.f17534Y.m8511b(Integer.valueOf(zzopVar.f4226a.size()), "[sgtm] Got upload batches from service. count");
/* 32 */                atomicReference.set(zzopVar);
/* 35 */                atomicReference.notifyAll();
                    }
                }
            }
