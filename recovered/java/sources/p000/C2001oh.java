            package p000;
            
            /* JADX INFO: renamed from: oh */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2001oh {

                /* JADX INFO: renamed from: a */
                public final kq0 f14746a;

                /* JADX INFO: renamed from: b */
                public final gj0 f14747b;

                /* JADX INFO: renamed from: c */
                public final m82 f14748c;

                public C2001oh(kq0 kq0Var, gj0 gj0Var, m82 m82Var) {
/* 4 */             this.f14746a = kq0Var;
/* 6 */             this.f14747b = gj0Var;
/* 8 */             this.f14748c = m82Var;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 45 */                return true;
                    }
/* 6 */             if (!(obj instanceof C2001oh)) {
/* 43 */                return false;
                    }
/* 9 */             C2001oh c2001oh = (C2001oh) obj;
                    return this.f14746a.equals(c2001oh.f14746a) && this.f14747b.equals(c2001oh.f14747b) && this.f14748c.equals(c2001oh.f14748c);
                }

                public final int hashCode() {
/* 25 */            return (this.f14748c.hashCode() + ((this.f14747b.hashCode() + (this.f14746a.hashCode() * 31)) * 31)) * 31;
                }

                public final String toString() {
/* 38 */            return "BannerSettings(generalStyleSettings=" + this.f14746a + ", firstLayerStyleSettings=" + this.f14747b + ", secondLayerStyleSettings=" + this.f14748c + ", variantName=null)";
                }
            }
