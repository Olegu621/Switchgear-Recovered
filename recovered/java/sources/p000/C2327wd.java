            package p000;
            
            /* JADX INFO: renamed from: wd */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2327wd implements bz1 {

                /* JADX INFO: renamed from: b */
                public final int f18584b;

                public C2327wd(int i) {
/* 4 */             this.f18584b = i;
                }

                @Override // java.lang.annotation.Annotation
                public final Class annotationType() {
/* 1 */             return bz1.class;
                }

                @Override // java.lang.annotation.Annotation
                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 31 */                return true;
                    }
/* 6 */             if (!(obj instanceof bz1)) {
/* 33 */                return false;
                    }
/* 9 */             bz1 bz1Var = (bz1) obj;
                    return this.f18584b == bz1Var.tag() && zy1.f20382a.equals(bz1Var.intEncoding());
                }

                @Override // java.lang.annotation.Annotation
                public final int hashCode() {
/* 17 */            return (this.f18584b ^ 14552422) + (zy1.f20382a.hashCode() ^ 2041407134);
                }

                @Override // p000.bz1
                public final zy1 intEncoding() {
/* 1 */             return zy1.f20382a;
                }

                @Override // p000.bz1
                public final int tag() {
/* 1 */             return this.f18584b;
                }

                @Override // java.lang.annotation.Annotation
                public final String toString() {
/* 28 */            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f18584b + "intEncoding=" + zy1.f20382a + ')';
                }
            }
