            package p000;

            import java.util.Map;
            
            /* JADX INFO: renamed from: v */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC2275v extends AbstractC0163b0 {
                /* JADX INFO: renamed from: b */
                public abstract boolean mo8772b(Map.Entry entry);

                /* JADX INFO: renamed from: c */
                public /* bridge */ boolean mo8773c(Map.Entry entry) {
/* 1 */             return super.remove(entry);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
/* 3 */             if (obj instanceof Map.Entry) {
/* 9 */                 return mo8772b((Map.Entry) obj);
                    }
/* 5 */             return false;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final /* bridge */ boolean remove(Object obj) {
/* 3 */             if (obj instanceof Map.Entry) {
/* 9 */                 return mo8773c((Map.Entry) obj);
                    }
/* 5 */             return false;
                }
            }
