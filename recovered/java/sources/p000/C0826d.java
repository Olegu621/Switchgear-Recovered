            package p000;
            
            /* JADX INFO: renamed from: d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0826d extends lq1 {

                /* JADX INFO: renamed from: a */
                public static final C0826d f6944a = new C0826d();

                private Object readResolve() {
/* 1 */             return f6944a;
                }

                @Override // p000.lq1
                /* JADX INFO: renamed from: a */
                public final Object mo2901a() {
/* 8 */             throw new IllegalStateException("Optional.get() cannot be called on an absent value");
                }

                @Override // p000.lq1
                /* JADX INFO: renamed from: b */
                public final boolean mo2902b() {
/* 1 */             return false;
                }

                public final boolean equals(Object obj) {
                    return obj == this;
                }

                public final int hashCode() {
/* 1 */             return 2040732332;
                }

                public final String toString() {
/* 1 */             return "Optional.absent()";
                }
            }
