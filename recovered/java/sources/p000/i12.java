            package p000;

            import android.database.Observable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class i12 extends Observable {
                /* JADX INFO: renamed from: a */
                public final boolean m4416a() {
/* 7 */             return !((Observable) this).mObservers.isEmpty();
                }

                /* JADX INFO: renamed from: b */
                public final void m4417b() {
/* 9 */             for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
/* 19 */                ((j12) ((Observable) this).mObservers.get(size)).mo1015a();
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m4418c(int i) {
/* 9 */             for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
/* 19 */                ((j12) ((Observable) this).mObservers.get(size)).mo1016b(i);
                    }
                }
            }
