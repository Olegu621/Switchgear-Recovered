            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xz2 extends yz2 {
                public static final wz2 Companion = new wz2();

                /* JADX INFO: renamed from: a */
                public final String f19426a;

                public xz2(String str) {
/* 4 */             this.f19426a = str;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 23 */                return true;
                    }
                    return (obj instanceof xz2) && this.f19426a.equals(((xz2) obj).f19426a);
                }

                public final int hashCode() {
/* 3 */             return this.f19426a.hashCode();
                }

                public final String toString() {
/* 7 */             return fm0.m3784j("ImageUrl(imageUrl=", this.f19426a, ")");
                }
            }
