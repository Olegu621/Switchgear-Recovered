            package p000;

            import com.google.android.gms.common.Feature;
            import com.google.android.gms.tasks.TaskCompletionSource;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public abstract class um2 {
                private final Feature[] zaa;
                private final boolean zab;
                private final int zac;

                public um2(Feature[] featureArr, boolean z, int i) {
/* 4 */             this.zaa = featureArr;
/* 6 */             boolean z2 = false;
/* 7 */             if (featureArr != null && z) {
/* 11 */                z2 = true;
                    }
/* 12 */            this.zab = z2;
/* 14 */            this.zac = i;
                }

                public static <A extends InterfaceC2359x8, ResultT> tm2 builder() {
/* 3 */             tm2 tm2Var = new tm2();
/* 7 */             tm2Var.f17186b = true;
/* 10 */            tm2Var.f17188d = 0;
/* 12 */            return tm2Var;
                }

                public abstract void doExecute(InterfaceC2359x8 interfaceC2359x8, TaskCompletionSource taskCompletionSource);

                public boolean shouldAutoResolveMissingFeatures() {
/* 1 */             return this.zab;
                }

                public final int zaa() {
/* 1 */             return this.zac;
                }

                public final Feature[] zab() {
/* 1 */             return this.zaa;
                }

/* 16 */        public um2() {
                    this.zaa = null;
                    this.zab = false;
                    this.zac = 0;
                }
            }
