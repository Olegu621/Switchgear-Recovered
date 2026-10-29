            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ux2 {
                /* JADX INFO: renamed from: a */
                public static sx2 m9144a(Object obj) {
/* 1 */             tq0 tq0Var = (tq0) obj;
/* 3 */             sx2 sx2Var = tq0Var.unknownFields;
/* 7 */             if (sx2Var != sx2.f16858f) {
/* 24 */                return sx2Var;
                    }
/* 19 */            sx2 sx2Var2 = new sx2(0, new int[8], new Object[8], true);
/* 22 */            tq0Var.unknownFields = sx2Var2;
/* 24 */            return sx2Var2;
                }

                /* JADX INFO: renamed from: b */
                public static boolean m9145b(int i, C1771iw c1771iw, Object obj) throws nz0, qz0 {
/* 3 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) c1771iw.f11948e;
/* 5 */             int i2 = c1771iw.f11945b;
/* 7 */             int i3 = i2 >>> 3;
/* 9 */             int i4 = i2 & 7;
/* 14 */            if (i4 == 0) {
/* 157 */               c1771iw.m5581R(0);
/* 172 */               ((sx2) obj).m8659c(i3 << 3, Long.valueOf(abstractC1006hw.mo3268v()));
/* 12 */                return true;
                    }
/* 16 */            if (i4 == 1) {
/* 137 */               c1771iw.m5581R(1);
/* 153 */               ((sx2) obj).m8659c((i3 << 3) | 1, Long.valueOf(abstractC1006hw.mo3265s()));
/* 12 */                return true;
                    }
/* 19 */            if (i4 == 2) {
/* 133 */               ((sx2) obj).m8659c((i3 << 3) | 2, c1771iw.m5592j());
/* 12 */                return true;
                    }
/* 21 */            if (i4 != 3) {
/* 24 */                if (i4 == 4) {
/* 11 */                    return false;
                        }
/* 27 */                if (i4 != 5) {
/* 53 */                    throw qz0.m8030b();
                        }
/* 29 */                c1771iw.m5581R(5);
/* 45 */                ((sx2) obj).m8659c(5 | (i3 << 3), Integer.valueOf(abstractC1006hw.mo3264r()));
/* 12 */                return true;
                    }
/* 63 */            sx2 sx2Var = new sx2(0, new int[8], new Object[8], true);
/* 66 */            int i5 = i3 << 3;
/* 68 */            int i6 = i5 | 4;
/* 70 */            int i7 = i + 1;
/* 73 */            if (i7 >= 100) {
/* 123 */               throw new qz0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
/* 82 */            while (c1771iw.m5585c() != Integer.MAX_VALUE && m9145b(i7, c1771iw, sx2Var)) {
                    }
/* 92 */            if (i6 != c1771iw.f11945b) {
/* 115 */               throw new qz0("Protocol message end-group tag did not match expected tag.");
                    }
/* 96 */            if (sx2Var.f16863e) {
/* 98 */                sx2Var.f16863e = false;
                    }
/* 104 */           ((sx2) obj).m8659c(i5 | 3, sx2Var);
/* 12 */            return true;
                }
            }
