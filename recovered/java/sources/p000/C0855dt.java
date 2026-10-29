            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: renamed from: dt */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C0855dt extends C0892et {

                /* JADX INFO: renamed from: a */
                public final Throwable f7403a;

                public C0855dt(Throwable th) {
/* 4 */             this.f7403a = th;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof C0855dt) {
                        return Intrinsics.m6216a(this.f7403a, ((C0855dt) obj).f7403a);
                    }
/* 19 */            return false;
                }

                public final int hashCode() {
/* 1 */             Throwable th = this.f7403a;
/* 3 */             if (th != null) {
/* 5 */                 return th.hashCode();
                    }
/* 10 */            return 0;
                }

                @Override // p000.C0892et
                public final String toString() {
/* 18 */            return "Closed(" + this.f7403a + ')';
                }
            }
