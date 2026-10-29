            package kotlin.text;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.ranges.IntRange;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m6176d2 = {"Lkotlin/text/MatchGroup;", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, m6177k = 1, m6178mv = {2, 2, 0}, m6180xi = 48)
            public final /* data */ class MatchGroup {

                /* JADX INFO: renamed from: a */
                public final String f12935a;

                /* JADX INFO: renamed from: b */
                public final IntRange f12936b;

                public MatchGroup(String str, IntRange intRange) {
/* 1 */             str.getClass();
/* 7 */             this.f12935a = str;
/* 9 */             this.f12936b = intRange;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof MatchGroup)) {
/* 32 */                return false;
                    }
/* 9 */             MatchGroup matchGroup = (MatchGroup) obj;
                    return Intrinsics.m6216a(this.f12935a, matchGroup.f12935a) && this.f12936b.equals(matchGroup.f12936b);
                }

                public final int hashCode() {
/* 15 */            return this.f12936b.hashCode() + (this.f12935a.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "MatchGroup(value=" + this.f12935a + ", range=" + this.f12936b + ')';
                }
            }
