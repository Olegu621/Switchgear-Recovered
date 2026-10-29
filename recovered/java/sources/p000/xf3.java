            package p000;

            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract /* synthetic */ class xf3 {
                /* JADX INFO: renamed from: a */
                public static /* synthetic */ boolean m9790a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
/* 5 */             while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
/* 13 */                if (unsafe.getObject(obj, j) != obj2) {
/* 15 */                    return false;
                        }
                    }
/* 7 */             return true;
                }
            }
