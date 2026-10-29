            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class it2 {
                public static final ht2 Companion = new ht2();

                /* JADX INFO: renamed from: a */
                public final et2 f11923a;

                /* JADX INFO: renamed from: b */
                public final et2 f11924b;

                /* JADX INFO: renamed from: c */
                public final et2 f11925c;

                /* JADX INFO: renamed from: d */
                public final et2 f11926d;

                /* JADX INFO: renamed from: e */
                public final et2 f11927e;

                public it2(et2 et2Var, et2 et2Var2, et2 et2Var3, et2 et2Var4, et2 et2Var5) {
/* 4 */             this.f11923a = et2Var;
/* 6 */             this.f11924b = et2Var2;
/* 8 */             this.f11925c = et2Var3;
/* 10 */            this.f11926d = et2Var4;
/* 12 */            this.f11927e = et2Var5;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 67 */                return true;
                    }
/* 6 */             if (!(obj instanceof it2)) {
/* 65 */                return false;
                    }
/* 9 */             it2 it2Var = (it2) obj;
                    return this.f11923a.equals(it2Var.f11923a) && this.f11924b.equals(it2Var.f11924b) && this.f11925c.equals(it2Var.f11925c) && this.f11926d.equals(it2Var.f11926d) && this.f11927e.equals(it2Var.f11927e);
                }

                public final int hashCode() {
/* 42 */            return this.f11927e.hashCode() + ((this.f11926d.hashCode() + ((this.f11925c.hashCode() + ((this.f11924b.hashCode() + (this.f11923a.hashCode() * 31)) * 31)) * 31)) * 31);
                }

                public final String toString() {
/* 58 */            return "UCButtonTheme(acceptAll=" + this.f11923a + ", denyAll=" + this.f11924b + ", manage=" + this.f11925c + ", save=" + this.f11926d + ", ok=" + this.f11927e + ")";
                }
            }
