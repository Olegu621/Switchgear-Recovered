            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class tx2 {
                /* JADX INFO: renamed from: a */
                public static rx2 m8921a(Object obj) {
/* 1 */             sq0 sq0Var = (sq0) obj;
/* 3 */             rx2 rx2Var = sq0Var.unknownFields;
/* 7 */             if (rx2Var != rx2.f16339f) {
/* 15 */                return rx2Var;
                    }
/* 9 */             rx2 rx2VarM8318c = rx2.m8318c();
/* 13 */            sq0Var.unknownFields = rx2VarM8318c;
/* 15 */            return rx2VarM8318c;
                }

                /* JADX INFO: renamed from: b */
                public static boolean m8922b(Object obj, C1771iw c1771iw) throws oz0, pz0 {
/* 1 */             int i = c1771iw.f11945b;
/* 5 */             AbstractC1006hw abstractC1006hw = (AbstractC1006hw) c1771iw.f11948e;
/* 7 */             int i2 = i >>> 3;
/* 9 */             int i3 = i & 7;
/* 14 */            if (i3 == 0) {
/* 133 */               c1771iw.m5581R(0);
/* 148 */               ((rx2) obj).m8321d(i2 << 3, Long.valueOf(abstractC1006hw.mo3268v()));
/* 12 */                return true;
                    }
/* 16 */            if (i3 == 1) {
/* 113 */               c1771iw.m5581R(1);
/* 129 */               ((rx2) obj).m8321d((i2 << 3) | 1, Long.valueOf(abstractC1006hw.mo3265s()));
/* 12 */                return true;
                    }
/* 19 */            if (i3 == 2) {
/* 109 */               ((rx2) obj).m8321d((i2 << 3) | 2, c1771iw.m5593k());
/* 12 */                return true;
                    }
/* 21 */            if (i3 != 3) {
/* 24 */                if (i3 == 4) {
/* 11 */                    return false;
                        }
/* 27 */                if (i3 != 5) {
/* 53 */                    throw pz0.m7624c();
                        }
/* 29 */                c1771iw.m5581R(5);
/* 45 */                ((rx2) obj).m8321d((i2 << 3) | 5, Integer.valueOf(abstractC1006hw.mo3264r()));
/* 12 */                return true;
                    }
/* 55 */            rx2 rx2VarM8318c = rx2.m8318c();
/* 59 */            int i4 = i2 << 3;
/* 61 */            int i5 = i4 | 4;
/* 70 */            while (c1771iw.m5585c() != Integer.MAX_VALUE && m8922b(rx2VarM8318c, c1771iw)) {
                    }
/* 80 */            if (i5 != c1771iw.f11945b) {
/* 99 */                throw new pz0("Protocol message end-group tag did not match expected tag.");
                    }
/* 82 */            rx2VarM8318c.f16344e = false;
/* 88 */            ((rx2) obj).m8321d(i4 | 3, rx2VarM8318c);
/* 12 */            return true;
                }
            }
