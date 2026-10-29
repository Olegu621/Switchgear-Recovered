            package p000;

            import java.util.Iterator;
            import java.util.regex.Matcher;
            import kotlin.ranges.IntRange;
            import kotlin.text.MatchGroup;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class sc1 extends AbstractC0936g {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ra2 f16522a;

                public sc1(ra2 ra2Var) {
/* 4 */             this.f16522a = ra2Var;
                }

                /* JADX INFO: renamed from: a */
                public final MatchGroup m8477a(int i) {
/* 5 */             Matcher matcher = (Matcher) this.f16522a.f15955a;
/* 15 */            IntRange intRangeM8048e = r02.m8048e(matcher.start(i), matcher.end(i));
/* 21 */            if (intRangeM8048e.f12926a < 0) {
/* 36 */                return null;
                    }
/* 25 */            String strGroup = matcher.group(i);
/* 29 */            strGroup.getClass();
/* 32 */            return new MatchGroup(strGroup, intRangeM8048e);
                }

                @Override // p000.AbstractC0936g, java.util.Collection
                public final /* bridge */ boolean contains(Object obj) {
/* 7 */             if (obj == null ? true : obj instanceof MatchGroup) {
/* 13 */                return super.contains((MatchGroup) obj);
                    }
/* 9 */             return false;
                }

                @Override // p000.AbstractC0936g
                public final int getSize() {
/* 11 */            return ((Matcher) this.f16522a.f15955a).groupCount() + 1;
                }

                @Override // p000.AbstractC0936g, java.util.Collection
                public final boolean isEmpty() {
/* 1 */             return false;
                }

                @Override // java.util.Collection, java.lang.Iterable
                public final Iterator iterator() {
/* 31 */            return new fr2(new li0(new C2066pd(new IntRange(0, size() - 1, 1), 1), new C0899f(this, 2)));
                }
            }
