            package p000;

            import java.util.regex.Matcher;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class rc1 extends AbstractC2237u {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ra2 f15971a;

                public rc1(ra2 ra2Var) {
/* 4 */             this.f15971a = ra2Var;
                }

                @Override // p000.AbstractC0936g, java.util.Collection
                public final /* bridge */ boolean contains(Object obj) {
/* 3 */             if (obj instanceof String) {
/* 9 */                 return super.contains((String) obj);
                    }
/* 5 */             return false;
                }

                @Override // java.util.List
                public final Object get(int i) {
/* 7 */             String strGroup = ((Matcher) this.f15971a.f15955a).group(i);
                    return strGroup == null ? HttpUrl.FRAGMENT_ENCODE_SET : strGroup;
                }

                @Override // p000.AbstractC0936g
                public final int getSize() {
/* 11 */            return ((Matcher) this.f15971a.f15955a).groupCount() + 1;
                }

                @Override // p000.AbstractC2237u, java.util.List
                public final /* bridge */ int indexOf(Object obj) {
/* 3 */             if (obj instanceof String) {
/* 9 */                 return super.indexOf((String) obj);
                    }
/* 5 */             return -1;
                }

                @Override // p000.AbstractC2237u, java.util.List
                public final /* bridge */ int lastIndexOf(Object obj) {
/* 3 */             if (obj instanceof String) {
/* 9 */                 return super.lastIndexOf((String) obj);
                    }
/* 5 */             return -1;
                }
            }
