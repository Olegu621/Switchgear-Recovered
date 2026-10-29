            package p000;

            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class ga3 extends ca3 implements Set {

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ int f8528c = 0;

                /* JADX INFO: renamed from: b */
                public transient ha3 f8529b;

                @Override // java.util.Collection, java.util.Set
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this || obj == this) {
/* 1 */                 return true;
                    }
/* 11 */            if (obj instanceof Set) {
/* 13 */                Set set = (Set) obj;
                        try {
                            return set.size() == 0 && containsAll(set);
                        } catch (ClassCastException | NullPointerException unused) {
                        }
                    }
/* 10 */            return false;
                }
            }
