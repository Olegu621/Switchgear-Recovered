            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class th1 implements i72 {

                /* JADX INFO: renamed from: a */
                public final AbstractC2350x f17106a;

                /* JADX INFO: renamed from: b */
                public final ux2 f17107b;

                /* JADX INFO: renamed from: c */
                public final gg0 f17108c;

                public th1(ux2 ux2Var, gg0 gg0Var, AbstractC2350x abstractC2350x) {
/* 4 */             this.f17107b = ux2Var;
/* 6 */             gg0Var.getClass();
/* 9 */             this.f17108c = gg0Var;
/* 11 */            this.f17106a = abstractC2350x;
                }

                @Override // p000.i72
                /* JADX INFO: renamed from: a */
                public final void mo4491a(Object obj, Object obj2) {
/* 3 */             n72.m6927k(this.f17107b, obj, obj2);
                }

                @Override // p000.i72
                /* JADX INFO: renamed from: b */
                public final void mo4492b(Object obj) {
/* 3 */             this.f17107b.getClass();
/* 9 */             sx2 sx2Var = ((tq0) obj).unknownFields;
/* 13 */            if (sx2Var.f16863e) {
/* 16 */                sx2Var.f16863e = false;
                    }
/* 20 */            this.f17108c.getClass();
/* 23 */            pm2.m7490m(obj);
/* 27 */            throw null;
                }

                @Override // p000.i72
                /* JADX INFO: renamed from: c */
                public final boolean mo4493c(Object obj) {
/* 3 */             this.f17108c.getClass();
/* 6 */             pm2.m7490m(obj);
/* 10 */            throw null;
                }

                @Override // p000.i72
                /* JADX INFO: renamed from: d */
                public final void mo4494d(Object obj, C1771iw c1771iw, eg0 eg0Var) {
/* 3 */             this.f17107b.getClass();
/* 6 */             ux2.m9144a(obj);
/* 11 */            this.f17108c.getClass();
/* 14 */            obj.getClass();
/* 22 */            throw new ClassCastException();
                }

                @Override // p000.i72
                /* JADX INFO: renamed from: e */
                public final boolean mo4495e(tq0 tq0Var, tq0 tq0Var2) {
/* 3 */             this.f17107b.getClass();
                    return tq0Var.unknownFields.equals(tq0Var2.unknownFields);
                }

                @Override // p000.i72
                /* JADX INFO: renamed from: f */
                public final int mo4496f(tq0 tq0Var) {
/* 3 */             this.f17107b.getClass();
/* 8 */             return tq0Var.unknownFields.hashCode();
                }

                @Override // p000.i72
                /* JADX INFO: renamed from: g */
                public final int mo4497g(tq0 tq0Var) {
/* 3 */             this.f17107b.getClass();
/* 6 */             sx2 sx2Var = tq0Var.unknownFields;
/* 8 */             int i = sx2Var.f16862d;
/* 11 */            if (i != -1) {
/* 13 */                return i;
                    }
/* 15 */            int iM6539f = 0;
/* 18 */            for (int i2 = 0; i2 < sx2Var.f16859a; i2++) {
/* 25 */                int i3 = sx2Var.f16860b[i2] >>> 3;
/* 54 */                iM6539f += C1905lw.m6539f(3, (C2259ul) sx2Var.f16861c[i2]) + C1905lw.m6542i(i3) + C1905lw.m6541h(2) + (C1905lw.m6541h(1) * 2);
                    }
/* 58 */            sx2Var.f16862d = iM6539f;
/* 60 */            return iM6539f;
                }

                @Override // p000.i72
                /* JADX INFO: renamed from: h */
                public final void mo4498h(Object obj, gr0 gr0Var) {
/* 3 */             this.f17108c.getClass();
/* 6 */             pm2.m7490m(obj);
/* 10 */            throw null;
                }

                @Override // p000.i72
                public final tq0 newInstance() {
/* 1 */             AbstractC2350x abstractC2350x = this.f17106a;
                    return abstractC2350x instanceof tq0 ? ((tq0) abstractC2350x).m8860i() : ((pq0) ((tq0) abstractC2350x).mo7066c(5)).m7537b();
                }
            }
