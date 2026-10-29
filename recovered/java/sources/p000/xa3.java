            package p000;

            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.api.internal.BasePendingResult;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xa3 implements rr1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ BasePendingResult f19009a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ we2 f19010b;

                public xa3(we2 we2Var, BasePendingResult basePendingResult) {
/* 4 */             this.f19010b = we2Var;
/* 6 */             this.f19009a = basePendingResult;
                }

                @Override // p000.rr1
                /* JADX INFO: renamed from: a */
                public final void mo4165a(Status status) {
/* 9 */             ((Map) this.f19010b.f18596c).remove(this.f19009a);
                }
            }
