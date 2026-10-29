            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bu0 extends l73 {
                @Override // p000.s70
                /* JADX INFO: renamed from: a */
                public final void mo1441a(s70 s70Var) {
/* 3 */             C2294vh c2294vh = (C2294vh) this.f13136b;
/* 5 */             int i = c2294vh.f18177w0;
/* 7 */             v70 v70Var = this.f13142h;
/* 11 */            Iterator it = v70Var.f17892l.iterator();
/* 16 */            int i2 = 0;
/* 17 */            int i3 = -1;
/* 22 */            while (it.hasNext()) {
/* 30 */                int i4 = ((v70) it.next()).f17887g;
/* 32 */                if (i3 == -1 || i4 < i3) {
/* 36 */                    i3 = i4;
                        }
/* 37 */                if (i2 < i4) {
/* 39 */                    i2 = i4;
                        }
                    }
/* 41 */            if (i == 0 || i == 2) {
/* 57 */                v70Var.mo6945d(i3 + c2294vh.f18179y0);
                    } else {
/* 50 */                v70Var.mo6945d(i2 + c2294vh.f18179y0);
                    }
                }

                @Override // p000.l73
                /* JADX INFO: renamed from: d */
                public final void mo1442d() {
/* 1 */             C2569zz c2569zz = this.f13136b;
/* 5 */             if (c2569zz instanceof C2294vh) {
/* 7 */                 v70 v70Var = this.f13142h;
/* 10 */                v70Var.f17882b = true;
/* 12 */                ArrayList arrayList = v70Var.f17892l;
/* 14 */                C2294vh c2294vh = (C2294vh) c2569zz;
/* 16 */                int i = c2294vh.f18177w0;
/* 18 */                boolean z = c2294vh.f18178x0;
/* 22 */                int i2 = 0;
/* 23 */                if (i == 0) {
/* 192 */                   v70Var.f17885e = 4;
/* 196 */                   while (i2 < c2294vh.f6907v0) {
/* 200 */                       C2569zz c2569zz2 = c2294vh.f6906u0[i2];
/* 202 */                       if (z || c2569zz2.f20438i0 != 8) {
/* 211 */                           v70 v70Var2 = c2569zz2.f20427d.f13142h;
/* 215 */                           v70Var2.f17891k.add(v70Var);
/* 218 */                           arrayList.add(v70Var2);
                                }
/* 221 */                       i2++;
                            }
/* 230 */                   m1446m(this.f13136b.f20427d.f13142h);
/* 239 */                   m1446m(this.f13136b.f20427d.f13143i);
/* 242 */                   return;
                        }
/* 25 */                if (i == 1) {
/* 140 */                   v70Var.f17885e = 5;
/* 144 */                   while (i2 < c2294vh.f6907v0) {
/* 148 */                       C2569zz c2569zz3 = c2294vh.f6906u0[i2];
/* 150 */                       if (z || c2569zz3.f20438i0 != 8) {
/* 159 */                           v70 v70Var3 = c2569zz3.f20427d.f13143i;
/* 163 */                           v70Var3.f17891k.add(v70Var);
/* 166 */                           arrayList.add(v70Var3);
                                }
/* 169 */                       i2++;
                            }
/* 178 */                   m1446m(this.f13136b.f20427d.f13142h);
/* 187 */                   m1446m(this.f13136b.f20427d.f13143i);
/* 190 */                   return;
                        }
/* 28 */                if (i == 2) {
/* 88 */                    v70Var.f17885e = 6;
/* 92 */                    while (i2 < c2294vh.f6907v0) {
/* 96 */                        C2569zz c2569zz4 = c2294vh.f6906u0[i2];
/* 98 */                        if (z || c2569zz4.f20438i0 != 8) {
/* 107 */                           v70 v70Var4 = c2569zz4.f20429e.f13142h;
/* 111 */                           v70Var4.f17891k.add(v70Var);
/* 114 */                           arrayList.add(v70Var4);
                                }
/* 117 */                       i2++;
                            }
/* 126 */                   m1446m(this.f13136b.f20429e.f13142h);
/* 135 */                   m1446m(this.f13136b.f20429e.f13143i);
/* 138 */                   return;
                        }
/* 31 */                if (i != 3) {
/* 242 */                   return;
                        }
/* 36 */                v70Var.f17885e = 7;
/* 40 */                while (i2 < c2294vh.f6907v0) {
/* 44 */                    C2569zz c2569zz5 = c2294vh.f6906u0[i2];
/* 46 */                    if (z || c2569zz5.f20438i0 != 8) {
/* 55 */                        v70 v70Var5 = c2569zz5.f20429e.f13143i;
/* 59 */                        v70Var5.f17891k.add(v70Var);
/* 62 */                        arrayList.add(v70Var5);
                            }
/* 65 */                    i2++;
                        }
/* 74 */                m1446m(this.f13136b.f20429e.f13142h);
/* 83 */                m1446m(this.f13136b.f20429e.f13143i);
                    }
                }

                @Override // p000.l73
                /* JADX INFO: renamed from: e */
                public final void mo1443e() {
/* 1 */             C2569zz c2569zz = this.f13136b;
/* 5 */             if (c2569zz instanceof C2294vh) {
/* 10 */                int i = ((C2294vh) c2569zz).f18177w0;
/* 12 */                v70 v70Var = this.f13142h;
/* 14 */                if (i == 0 || i == 1) {
/* 27 */                    c2569zz.f20422a0 = v70Var.f17887g;
                        } else {
/* 22 */                    c2569zz.f20424b0 = v70Var.f17887g;
                        }
                    }
                }

                @Override // p000.l73
                /* JADX INFO: renamed from: f */
                public final void mo1444f() {
/* 2 */             this.f13137c = null;
/* 6 */             this.f13142h.m9227c();
                }

                @Override // p000.l73
                /* JADX INFO: renamed from: k */
                public final boolean mo1445k() {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: m */
                public final void m1446m(v70 v70Var) {
/* 1 */             v70 v70Var2 = this.f13142h;
/* 5 */             v70Var2.f17891k.add(v70Var);
/* 10 */            v70Var.f17892l.add(v70Var2);
                }
            }
