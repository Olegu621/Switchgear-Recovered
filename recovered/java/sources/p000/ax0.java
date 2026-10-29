            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ax0 {

                /* JADX INFO: renamed from: a */
                public final Object f2132a;

                /* JADX INFO: renamed from: b */
                public final Object f2133b;

                /* JADX INFO: renamed from: c */
                public final Object f2134c;

                public ax0(Object obj, Object obj2, Object obj3) {
/* 4 */             this.f2132a = obj;
/* 6 */             this.f2133b = obj2;
/* 8 */             this.f2134c = obj3;
                }

                /* JADX INFO: renamed from: a */
                public final IllegalArgumentException m1177a() {
/* 3 */             Object obj = this.f2132a;
/* 5 */             String strValueOf = String.valueOf(obj);
/* 11 */            String strValueOf2 = String.valueOf(this.f2133b);
/* 15 */            String strValueOf3 = String.valueOf(obj);
/* 21 */            String strValueOf4 = String.valueOf(this.f2134c);
/* 48 */            StringBuilder sb = new StringBuilder(strValueOf4.length() + strValueOf3.length() + strValueOf2.length() + strValueOf.length() + 39);
/* 53 */            sb.append("Multiple entries with same key: ");
/* 56 */            sb.append(strValueOf);
/* 61 */            sb.append("=");
/* 64 */            sb.append(strValueOf2);
/* 73 */            return new IllegalArgumentException(fm0.m3791q(sb, " and ", strValueOf3, "=", strValueOf4));
                }
            }
