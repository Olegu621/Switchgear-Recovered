            package p000;

            import com.usercentrics.sdk.services.tcf.interfaces.TCFStack;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class eg2 {

                /* JADX INFO: renamed from: a */
                public final boolean f7682a;

                /* JADX INFO: renamed from: b */
                public final TCFStack f7683b;

                public eg2(boolean z, TCFStack tCFStack) {
/* 1 */             tCFStack.getClass();
/* 7 */             this.f7682a = z;
/* 9 */             this.f7683b = tCFStack;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof eg2)) {
/* 7 */                 return false;
                    }
/* 11 */            eg2 eg2Var = (eg2) obj;
                    return this.f7682a == eg2Var.f7682a && Intrinsics.m6216a(this.f7683b, eg2Var.f7683b);
                }

                public final int hashCode() {
/* 15 */            return this.f7683b.hashCode() + (Boolean.hashCode(this.f7682a) * 31);
                }

                public final String toString() {
/* 28 */            return "StackProps(checked=" + this.f7682a + ", stack=" + this.f7683b + ")";
                }
            }
