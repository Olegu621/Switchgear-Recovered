            package p000;

            import com.usercentrics.sdk.p009v2.location.data.UsercentricsLocation;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class k91 {

                /* JADX INFO: renamed from: a */
                public final Object f12656a;

                /* JADX INFO: renamed from: b */
                public final UsercentricsLocation f12657b;

                /* JADX INFO: renamed from: c */
                public final boolean f12658c;

                public k91(Object obj, UsercentricsLocation usercentricsLocation, boolean z) {
/* 1 */             usercentricsLocation.getClass();
/* 7 */             this.f12656a = obj;
/* 9 */             this.f12657b = usercentricsLocation;
/* 11 */            this.f12658c = z;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof k91)) {
/* 7 */                 return false;
                    }
/* 11 */            k91 k91Var = (k91) obj;
                    return Intrinsics.m6216a(this.f12656a, k91Var.f12656a) && Intrinsics.m6216a(this.f12657b, k91Var.f12657b) && this.f12658c == k91Var.f12658c;
                }

                public final int hashCode() {
/* 1 */             Object obj = this.f12656a;
/* 7 */             int iHashCode = obj == null ? 0 : obj.hashCode();
/* 28 */            return Boolean.hashCode(this.f12658c) + ((this.f12657b.hashCode() + (iHashCode * 31)) * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("LocationAwareResponse(data=");
/* 10 */            sb.append(this.f12656a);
/* 15 */            sb.append(", location=");
/* 20 */            sb.append(this.f12657b);
/* 25 */            sb.append(", languageEtagChanged=");
/* 32 */            return AbstractC0886en.m3511o(sb, this.f12658c, ")");
                }
            }
