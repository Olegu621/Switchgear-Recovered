            package p000;

            import java.lang.ref.WeakReference;
            import java.util.HashMap;
            import java.util.HashSet;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qd2 {

                /* JADX INFO: renamed from: a */
                public HashMap f15494a;

                /* JADX INFO: renamed from: a */
                public final void m7781a(int i, pd2 pd2Var) {
/* 1 */             HashMap map = this.f15494a;
/* 11 */            HashSet hashSet = (HashSet) map.get(Integer.valueOf(i));
/* 13 */            if (hashSet == null) {
/* 17 */                hashSet = new HashSet();
/* 24 */                map.put(Integer.valueOf(i), hashSet);
                    }
/* 32 */            hashSet.add(new WeakReference(pd2Var));
                }
            }
