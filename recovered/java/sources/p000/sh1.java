            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sh1 implements h72 {

                /* JADX INFO: renamed from: a */
                public final AbstractC2313w f16628a;

                /* JADX INFO: renamed from: b */
                public final tx2 f16629b;

                /* JADX INFO: renamed from: c */
                public final fg0 f16630c;

                public sh1(tx2 tx2Var, fg0 fg0Var, AbstractC2313w abstractC2313w) {
/* 4 */             this.f16629b = tx2Var;
/* 6 */             fg0Var.getClass();
/* 9 */             this.f16630c = fg0Var;
/* 11 */            this.f16628a = abstractC2313w;
                }

                @Override // p000.h72
                /* JADX INFO: renamed from: a */
                public final void mo4123a(Object obj, Object obj2) {
/* 3 */             l72.m6390w(this.f16629b, obj, obj2);
                }

                @Override // p000.h72
                /* JADX INFO: renamed from: b */
                public final void mo4124b(Object obj) {
/* 3 */             this.f16629b.getClass();
/* 12 */            ((sq0) obj).unknownFields.f16344e = false;
/* 16 */            this.f16630c.getClass();
/* 19 */            pm2.m7490m(obj);
/* 23 */            throw null;
                }

                @Override // p000.h72
                /* JADX INFO: renamed from: c */
                public final boolean mo4125c(Object obj) {
/* 3 */             this.f16630c.getClass();
/* 6 */             pm2.m7490m(obj);
/* 10 */            throw null;
                }

                @Override // p000.h72
                /* JADX INFO: renamed from: d */
                public final int mo4126d(sq0 sq0Var) {
/* 3 */             this.f16629b.getClass();
/* 6 */             rx2 rx2Var = sq0Var.unknownFields;
/* 8 */             int i = rx2Var.f16343d;
/* 11 */            if (i != -1) {
/* 13 */                return i;
                    }
/* 15 */            int iM5901a = 0;
/* 18 */            for (int i2 = 0; i2 < rx2Var.f16340a; i2++) {
/* 25 */                int i3 = rx2Var.f16341b[i2] >>> 3;
/* 54 */                iM5901a += C1808jw.m5901a(3, (AbstractC2298vl) rx2Var.f16342c[i2]) + C1808jw.m5909i(i3) + C1808jw.m5908h(2) + (C1808jw.m5908h(1) * 2);
                    }
/* 58 */            rx2Var.f16343d = iM5901a;
/* 60 */            return iM5901a;
                }

                @Override // p000.h72
                /* JADX INFO: renamed from: e */
                public final void mo4127e(Object obj, d52 d52Var) {
/* 3 */             this.f16630c.getClass();
/* 6 */             pm2.m7490m(obj);
/* 10 */            throw null;
                }

                @Override // p000.h72
                /* JADX INFO: renamed from: f */
                public final int mo4128f(sq0 sq0Var) {
/* 3 */             this.f16629b.getClass();
/* 8 */             return sq0Var.unknownFields.hashCode();
                }

                @Override // p000.h72
                /* JADX INFO: renamed from: g */
                public final void mo4129g(Object obj, C1771iw c1771iw, dg0 dg0Var) {
/* 3 */             this.f16629b.getClass();
/* 6 */             tx2.m8921a(obj);
/* 11 */            this.f16630c.getClass();
/* 14 */            obj.getClass();
/* 22 */            throw new ClassCastException();
                }

                @Override // p000.h72
                /* JADX INFO: renamed from: h */
                public final void mo4130h(Object obj, byte[] bArr, int i, int i2, C0176bd c0176bd) {
/* 2 */             sq0 sq0Var = (sq0) obj;
/* 8 */             if (sq0Var.unknownFields == rx2.f16339f) {
/* 14 */                sq0Var.unknownFields = rx2.m8318c();
                    }
/* 16 */            obj.getClass();
/* 24 */            throw new ClassCastException();
                }

                @Override // p000.h72
                /* JADX INFO: renamed from: i */
                public final boolean mo4131i(sq0 sq0Var, sq0 sq0Var2) {
/* 3 */             this.f16629b.getClass();
                    return sq0Var.unknownFields.equals(sq0Var2.unknownFields);
                }

                @Override // p000.h72
                public final Object newInstance() {
/* 1 */             AbstractC2313w abstractC2313w = this.f16628a;
                    return abstractC2313w instanceof sq0 ? ((sq0) abstractC2313w).m8623q() : abstractC2313w.mo8616d().m7232c();
                }
            }
