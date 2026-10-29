            package p000;

            import com.google.android.gms.tasks.TaskCompletionSource;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class cy2 {
                private final t81 zaa;

                public cy2(t81 t81Var) {
/* 4 */             this.zaa = t81Var;
                }

                public t81 getListenerKey() {
/* 1 */             return this.zaa;
                }

                public abstract void unregisterListener(InterfaceC2359x8 interfaceC2359x8, TaskCompletionSource taskCompletionSource);
            }
