            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Objects;
            import java.util.Set;
            import java.util.TreeMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class wy2 {

                /* JADX INFO: renamed from: d */
                public zy2 f18859d;

                /* JADX INFO: renamed from: e */
                public final zy2 f18860e;

                /* JADX INFO: renamed from: f */
                public zy2 f18861f;

                /* JADX INFO: renamed from: g */
                public C2069pg f18862g;

                /* JADX INFO: renamed from: h */
                public zy2 f18863h;

                /* JADX INFO: renamed from: i */
                public Rect f18864i;

                /* JADX INFO: renamed from: k */
                public InterfaceC2559zp f18866k;

                /* JADX INFO: renamed from: l */
                public InterfaceC2559zp f18867l;

                /* JADX INFO: renamed from: a */
                public final HashSet f18856a = new HashSet();

                /* JADX INFO: renamed from: b */
                public final Object f18857b = new Object();

                /* JADX INFO: renamed from: c */
                public int f18858c = 2;

                /* JADX INFO: renamed from: j */
                public Matrix f18865j = new Matrix();

                /* JADX INFO: renamed from: m */
                public fb2 f18868m = fb2.m3701a();

                /* JADX INFO: renamed from: n */
                public fb2 f18869n = fb2.m3701a();

                public wy2(zy2 zy2Var) {
/* 40 */            this.f18860e = zy2Var;
/* 42 */            this.f18861f = zy2Var;
                }

                /* JADX INFO: renamed from: A */
                public final void m9653A(List list) {
/* 5 */             if (list.isEmpty()) {
/* 79 */                return;
                    }
/* 15 */            this.f18868m = (fb2) list.get(0);
/* 22 */            if (list.size() > 1) {
/* 30 */                this.f18869n = (fb2) list.get(1);
                    }
/* 32 */            Iterator it = list.iterator();
/* 40 */            while (it.hasNext()) {
/* 60 */                for (d70 d70Var : ((fb2) it.next()).m3702b()) {
/* 70 */                    if (d70Var.f7035j == null) {
/* 76 */                        d70Var.f7035j = getClass();
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m9654a(InterfaceC2559zp interfaceC2559zp, InterfaceC2559zp interfaceC2559zp2, zy2 zy2Var, zy2 zy2Var2) {
                    synchronized (this.f18857b) {
/* 4 */                 this.f18866k = interfaceC2559zp;
/* 6 */                 this.f18867l = interfaceC2559zp2;
/* 10 */                this.f18856a.add(interfaceC2559zp);
/* 13 */                if (interfaceC2559zp2 != null) {
/* 17 */                    this.f18856a.add(interfaceC2559zp2);
                        }
                    }
/* 21 */            this.f18859d = zy2Var;
/* 23 */            this.f18863h = zy2Var2;
/* 37 */            this.f18861f = m9662l(interfaceC2559zp.mo8073m(), this.f18859d, this.f18863h);
/* 39 */            mo6442p();
                }

                /* JADX INFO: renamed from: b */
                public final InterfaceC2559zp m9655b() {
                    InterfaceC2559zp interfaceC2559zp;
                    synchronized (this.f18857b) {
/* 4 */                 interfaceC2559zp = this.f18866k;
                    }
/* 7 */             return interfaceC2559zp;
                }

                /* JADX INFO: renamed from: c */
                public final InterfaceC1972np m9656c() {
                    synchronized (this.f18857b) {
                        try {
/* 4 */                     InterfaceC2559zp interfaceC2559zp = this.f18866k;
/* 6 */                     if (interfaceC2559zp == null) {
/* 8 */                         return InterfaceC1972np.f14399a;
                            }
/* 14 */                    return interfaceC2559zp.mo8068e();
                        } catch (Throwable th) {
/* 21 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: d */
                public final String m9657d() {
/* 1 */             InterfaceC2559zp interfaceC2559zpM9655b = m9655b();
/* 19 */            de3.m3027i(interfaceC2559zpM9655b, "No camera attached to use case: " + this);
/* 26 */            return interfaceC2559zpM9655b.mo8073m().mo310b();
                }

                /* JADX INFO: renamed from: e */
                public abstract zy2 mo6439e(boolean z, cz2 cz2Var);

                /* JADX INFO: renamed from: f */
                public final String m9658f() {
/* 32 */            String str = (String) this.f18861f.mo7023b(rm2.f16183D, "<UnknownUseCase-" + hashCode() + ">");
/* 34 */            Objects.requireNonNull(str);
/* 37 */            return str;
                }

                /* JADX INFO: renamed from: g */
                public final int m9659g(InterfaceC2559zp interfaceC2559zp, boolean z) {
/* 13 */            int iMo313e = interfaceC2559zp.mo8073m().mo313e(((jw0) this.f18861f).m5923s());
                    return (interfaceC2559zp.mo8072k() || !z) ? iMo313e : cr2.m2876f(-iMo313e);
                }

                /* JADX INFO: renamed from: h */
                public final InterfaceC2559zp m9660h() {
                    InterfaceC2559zp interfaceC2559zp;
                    synchronized (this.f18857b) {
/* 4 */                 interfaceC2559zp = this.f18867l;
                    }
/* 7 */             return interfaceC2559zp;
                }

                /* JADX INFO: renamed from: i */
                public Set mo6440i() {
/* 1 */             return Collections.EMPTY_SET;
                }

                /* JADX INFO: renamed from: j */
                public abstract yy2 mo6441j(InterfaceC2235ty interfaceC2235ty);

                /* JADX INFO: renamed from: k */
                public final boolean m9661k(InterfaceC2559zp interfaceC2559zp) {
/* 18 */            int iIntValue = ((Integer) ((jw0) this.f18861f).mo7023b(jw0.f12522t, -1)).intValue();
/* 23 */            if (iIntValue == -1 || iIntValue == 0) {
/* 22 */                return false;
                    }
/* 28 */            if (iIntValue == 1) {
/* 27 */                return true;
                    }
/* 31 */            if (iIntValue == 2) {
                        return interfaceC2559zp.mo8073m().mo312d() == 0;
                    }
/* 51 */            C1951n4.m6856g(fm0.m3781g(iIntValue, "Unknown mirrorMode: "));
/* 22 */            return false;
                }

                /* JADX INFO: renamed from: l */
                public final zy2 m9662l(InterfaceC2469xp interfaceC2469xp, zy2 zy2Var, zy2 zy2Var2) {
                    uk1 uk1VarM9034j;
/* 1 */             if (zy2Var2 != null) {
/* 3 */                 uk1VarM9034j = uk1.m9035m(zy2Var2);
/* 11 */                uk1VarM9034j.f14411a.remove(rm2.f16183D);
                    } else {
/* 15 */                uk1VarM9034j = uk1.m9034j();
                    }
/* 19 */            TreeMap treeMap = uk1VarM9034j.f14411a;
/* 21 */            C1888lf c1888lf = jw0.f12519q;
/* 23 */            zy2 zy2Var3 = this.f18860e;
/* 29 */            if (zy2Var3.mo7028h(c1888lf) || zy2Var3.mo7028h(jw0.f12523u)) {
/* 39 */                C1888lf c1888lf2 = jw0.f12517A;
/* 45 */                if (treeMap.containsKey(c1888lf2)) {
/* 47 */                    treeMap.remove(c1888lf2);
                        }
                    }
/* 50 */            C1888lf c1888lf3 = jw0.f12517A;
/* 56 */            if (zy2Var3.mo7028h(c1888lf3)) {
/* 58 */                C1888lf c1888lf4 = jw0.f12525y;
/* 64 */                if (treeMap.containsKey(c1888lf4) && ((q32) zy2Var3.mo7025e(c1888lf3)).f15381b != null) {
/* 76 */                    treeMap.remove(c1888lf4);
                        }
                    }
/* 83 */            Iterator it = zy2Var3.mo7024c().iterator();
/* 91 */            while (it.hasNext()) {
/* 99 */                InterfaceC2235ty.m8923n(uk1VarM9034j, uk1VarM9034j, zy2Var3, (C1888lf) it.next());
                    }
/* 103 */           if (zy2Var != null) {
/* 117 */               for (C1888lf c1888lf5 : zy2Var.mo7024c()) {
/* 135 */                   if (!c1888lf5.f13218a.equals(rm2.f16183D.f13218a)) {
/* 138 */                       InterfaceC2235ty.m8923n(uk1VarM9034j, uk1VarM9034j, zy2Var, c1888lf5);
                            }
                        }
                    }
/* 148 */           if (treeMap.containsKey(jw0.f12523u)) {
/* 150 */               C1888lf c1888lf6 = jw0.f12519q;
/* 156 */               if (treeMap.containsKey(c1888lf6)) {
/* 158 */                   treeMap.remove(c1888lf6);
                        }
                    }
/* 161 */           C1888lf c1888lf7 = jw0.f12517A;
/* 167 */           if (treeMap.containsKey(c1888lf7)) {
/* 175 */               ((q32) uk1VarM9034j.mo7025e(c1888lf7)).getClass();
                    }
/* 182 */           return mo6443r(interfaceC2469xp, mo6441j(uk1VarM9034j));
                }

                /* JADX INFO: renamed from: m */
                public final void m9663m() {
/* 2 */             this.f18858c = 1;
/* 4 */             m9665o();
                }

                /* JADX INFO: renamed from: n */
                public final void m9664n() {
/* 3 */             Iterator it = this.f18856a.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                ((vy2) it.next()).mo8066b(this);
                    }
                }

                /* JADX INFO: renamed from: o */
                public final void m9665o() {
/* 3 */             int iM3520y = AbstractC0886en.m3520y(this.f18858c);
/* 7 */             HashSet hashSet = this.f18856a;
/* 9 */             if (iM3520y == 0) {
/* 35 */                Iterator it = hashSet.iterator();
/* 43 */                while (it.hasNext()) {
/* 51 */                    ((vy2) it.next()).mo8067d(this);
                        }
                    } else {
/* 12 */                if (iM3520y != 1) {
/* 55 */                    return;
                        }
/* 15 */                Iterator it2 = hashSet.iterator();
/* 23 */                while (it2.hasNext()) {
/* 31 */                    ((vy2) it2.next()).mo8074n(this);
                        }
                    }
                }

                /* JADX INFO: renamed from: p */
                public void mo6442p() {
                }

                /* JADX INFO: renamed from: q */
                public void mo9666q() {
                }

                /* JADX INFO: renamed from: r */
                public abstract zy2 mo6443r(InterfaceC2469xp interfaceC2469xp, yy2 yy2Var);

                /* JADX INFO: renamed from: s */
                public void mo6444s() {
                }

                /* JADX INFO: renamed from: t */
                public void mo6445t() {
                }

                /* JADX INFO: renamed from: u */
                public abstract C2069pg mo6446u(InterfaceC2235ty interfaceC2235ty);

                /* JADX INFO: renamed from: v */
                public abstract C2069pg mo6447v(C2069pg c2069pg, C2069pg c2069pg2);

                /* JADX INFO: renamed from: w */
                public abstract void mo6448w();

                /* JADX INFO: renamed from: x */
                public void mo7563x(Matrix matrix) {
/* 6 */             this.f18865j = new Matrix(matrix);
                }

                /* JADX INFO: renamed from: y */
                public void mo7564y(Rect rect) {
/* 1 */             this.f18864i = rect;
                }

                /* JADX INFO: renamed from: z */
                public final void m9667z(InterfaceC2559zp interfaceC2559zp) {
/* 1 */             mo6448w();
                    synchronized (this.f18857b) {
                        try {
/* 7 */                     InterfaceC2559zp interfaceC2559zp2 = this.f18866k;
/* 10 */                    if (interfaceC2559zp == interfaceC2559zp2) {
/* 14 */                        this.f18856a.remove(interfaceC2559zp2);
/* 17 */                        this.f18866k = null;
                            }
/* 22 */                    InterfaceC2559zp interfaceC2559zp3 = this.f18867l;
/* 24 */                    if (interfaceC2559zp == interfaceC2559zp3) {
/* 28 */                        this.f18856a.remove(interfaceC2559zp3);
/* 31 */                        this.f18867l = null;
                            }
                        } catch (Throwable th) {
/* 48 */                    throw th;
                        }
                    }
/* 34 */            this.f18862g = null;
/* 36 */            this.f18864i = null;
/* 40 */            this.f18861f = this.f18860e;
/* 42 */            this.f18859d = null;
/* 44 */            this.f18863h = null;
                }
            }
