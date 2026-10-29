            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cs0 extends l73 {
                @Override // p000.s70
                /* JADX INFO: renamed from: a */
                public final void mo1441a(s70 s70Var) {
/* 1 */             v70 v70Var = this.f13142h;
/* 5 */             if (v70Var.f17883c && !v70Var.f17890j) {
/* 36 */                v70Var.mo6945d((int) ((((v70) v70Var.f17892l.get(0)).f17887g * ((bs0) this.f13136b).f2586u0) + 0.5f));
                    }
                }

                @Override // p000.l73
                /* JADX INFO: renamed from: d */
                public final void mo1442d() {
/* 1 */             C2569zz c2569zz = this.f13136b;
/* 4 */             bs0 bs0Var = (bs0) c2569zz;
/* 6 */             int i = bs0Var.f2587v0;
/* 8 */             int i2 = bs0Var.f2588w0;
/* 10 */            int i3 = bs0Var.f2590y0;
/* 13 */            v70 v70Var = this.f13142h;
/* 16 */            if (i3 == 1) {
/* 18 */                if (i != -1) {
/* 28 */                    v70Var.f17892l.add(c2569zz.f20416V.f20427d.f13142h);
/* 41 */                    this.f13136b.f20416V.f20427d.f13142h.f17891k.add(v70Var);
/* 44 */                    v70Var.f17886f = i;
                        } else if (i2 != -1) {
/* 57 */                    v70Var.f17892l.add(c2569zz.f20416V.f20427d.f13143i);
/* 70 */                    this.f13136b.f20416V.f20427d.f13143i.f17891k.add(v70Var);
/* 74 */                    v70Var.f17886f = -i2;
                        } else {
/* 77 */                    v70Var.f17882b = true;
/* 87 */                    v70Var.f17892l.add(c2569zz.f20416V.f20427d.f13143i);
/* 100 */                   this.f13136b.f20416V.f20427d.f13143i.f17891k.add(v70Var);
                        }
/* 109 */               m2883m(this.f13136b.f20427d.f13142h);
/* 118 */               m2883m(this.f13136b.f20427d.f13143i);
/* 121 */               return;
                    }
/* 122 */           if (i != -1) {
/* 132 */               v70Var.f17892l.add(c2569zz.f20416V.f20429e.f13142h);
/* 145 */               this.f13136b.f20416V.f20429e.f13142h.f17891k.add(v70Var);
/* 148 */               v70Var.f17886f = i;
                    } else if (i2 != -1) {
/* 161 */               v70Var.f17892l.add(c2569zz.f20416V.f20429e.f13143i);
/* 174 */               this.f13136b.f20416V.f20429e.f13143i.f17891k.add(v70Var);
/* 178 */               v70Var.f17886f = -i2;
                    } else {
/* 181 */               v70Var.f17882b = true;
/* 191 */               v70Var.f17892l.add(c2569zz.f20416V.f20429e.f13143i);
/* 204 */               this.f13136b.f20416V.f20429e.f13143i.f17891k.add(v70Var);
                    }
/* 213 */           m2883m(this.f13136b.f20429e.f13142h);
/* 222 */           m2883m(this.f13136b.f20429e.f13143i);
                }

                @Override // p000.l73
                /* JADX INFO: renamed from: e */
                public final void mo1443e() {
/* 1 */             C2569zz c2569zz = this.f13136b;
/* 6 */             int i = ((bs0) c2569zz).f2590y0;
/* 9 */             v70 v70Var = this.f13142h;
/* 11 */            if (i == 1) {
/* 15 */                c2569zz.f20422a0 = v70Var.f17887g;
                    } else {
/* 20 */                c2569zz.f20424b0 = v70Var.f17887g;
                    }
                }

                @Override // p000.l73
                /* JADX INFO: renamed from: f */
                public final void mo1444f() {
/* 3 */             this.f13142h.m9227c();
                }

                @Override // p000.l73
                /* JADX INFO: renamed from: k */
                public final boolean mo1445k() {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: m */
                public final void m2883m(v70 v70Var) {
/* 1 */             v70 v70Var2 = this.f13142h;
/* 5 */             v70Var2.f17891k.add(v70Var);
/* 10 */            v70Var.f17892l.add(v70Var2);
                }
            }
