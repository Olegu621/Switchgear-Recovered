            package p000;

            import com.google.android.gms.common.Feature;
            import com.google.android.gms.tasks.TaskCompletionSource;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mb3 extends um2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ tm2 f13680a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public mb3(tm2 tm2Var, Feature[] featureArr, boolean z, int i) {
/* 3 */             super(featureArr, z, i);
/* 1 */             this.f13680a = tm2Var;
                }

                @Override // p000.um2
                public final void doExecute(InterfaceC2359x8 interfaceC2359x8, TaskCompletionSource taskCompletionSource) {
/* 5 */             this.f13680a.f17185a.accept(interfaceC2359x8, taskCompletionSource);
                }
            }
