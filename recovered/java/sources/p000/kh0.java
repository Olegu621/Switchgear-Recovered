            package p000;

            import java.io.File;
            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class kh0 {

                /* JADX INFO: renamed from: a */
                public final File f12763a;

                /* JADX INFO: renamed from: b */
                public final List f12764b;

                public kh0(File file, List list) {
/* 1 */             list.getClass();
/* 7 */             this.f12763a = file;
/* 9 */             this.f12764b = list;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof kh0)) {
/* 32 */                return false;
                    }
/* 9 */             kh0 kh0Var = (kh0) obj;
                    return this.f12763a.equals(kh0Var.f12763a) && Intrinsics.m6216a(this.f12764b, kh0Var.f12764b);
                }

                public final int hashCode() {
/* 15 */            return this.f12764b.hashCode() + (this.f12763a.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "FilePathComponents(root=" + this.f12763a + ", segments=" + this.f12764b + ')';
                }
            }
