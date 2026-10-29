            package p000;

            import com.google.android.gms.common.Feature;
            import com.google.android.gms.tasks.TaskCompletionSource;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class p22 {
                private final v81 zaa;
                private final Feature[] zab = null;
                private final boolean zac = false;
                private final int zad = 0;

                public p22(v81 v81Var) {
/* 4 */             this.zaa = v81Var;
                }

                public void clearListener() {
/* 1 */             v81 v81Var = this.zaa;
/* 4 */             v81Var.f17915b = null;
/* 6 */             v81Var.f17916c = null;
                }

                public t81 getListenerKey() {
/* 3 */             return this.zaa.f17916c;
                }

                public Feature[] getRequiredFeatures() {
/* 1 */             return this.zab;
                }

                public abstract void registerListener(InterfaceC2359x8 interfaceC2359x8, TaskCompletionSource taskCompletionSource);

                public final int zaa() {
/* 1 */             return this.zad;
                }

                public final boolean zab() {
/* 1 */             return this.zac;
                }
            }
