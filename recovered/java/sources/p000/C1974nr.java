            package p000;

            import java.util.UUID;
            
            /* JADX INFO: renamed from: nr */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 303 */   public final class C1974nr implements uf0, yy2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14412a;

                /* JADX INFO: renamed from: b */
                public final uk1 f14413b;

                public C1974nr(uk1 uk1Var, int i) {
                    Object objMo7025e;
                    Object objMo7025e2;
                    Object objMo7025e3;
/* 1 */             this.f14412a = i;
/* 9 */             Object objMo7025e4 = null;
                    switch (i) {
                        case 2:
/* 219 */                   this.f14413b = uk1Var;
                            try {
/* 223 */                       objMo7025e = uk1Var.mo7025e(rm2.f16184E);
                                break;
                            } catch (IllegalArgumentException unused) {
/* 228 */                       objMo7025e = null;
                            }
/* 229 */                   Class cls = (Class) objMo7025e;
/* 233 */                   if (cls != null && !cls.equals(zv0.class)) {
/* 242 */                       ds0.m3196m("Invalid target class configuration for ", this, ": ", cls);
/* 245 */                       throw null;
                            }
/* 252 */                   this.f14413b.m9037p(zy2.f20392O, bz2.f2639a);
/* 255 */                   uk1 uk1Var2 = this.f14413b;
/* 259 */                   uk1Var2.m9037p(rm2.f16184E, zv0.class);
                            try {
/* 264 */                       objMo7025e4 = uk1Var2.mo7025e(rm2.f16183D);
                                break;
                            } catch (IllegalArgumentException unused2) {
                            }
/* 268 */                   if (objMo7025e4 == null) {
/* 300 */                       this.f14413b.m9037p(rm2.f16183D, zv0.class.getCanonicalName() + "-" + UUID.randomUUID());
/* 303 */                       return;
                            }
/* 303 */                   return;
                        case 3:
/* 102 */                   this.f14413b = uk1Var;
                            try {
/* 106 */                       objMo7025e2 = uk1Var.mo7025e(rm2.f16184E);
                                break;
                            } catch (IllegalArgumentException unused3) {
/* 111 */                       objMo7025e2 = null;
                            }
/* 112 */                   Class cls2 = (Class) objMo7025e2;
/* 116 */                   if (cls2 != null && !cls2.equals(vw1.class)) {
/* 125 */                       ds0.m3196m("Invalid target class configuration for ", this, ": ", cls2);
/* 128 */                       throw null;
                            }
/* 135 */                   this.f14413b.m9037p(zy2.f20392O, bz2.f2640b);
/* 138 */                   uk1 uk1Var3 = this.f14413b;
/* 142 */                   uk1Var3.m9037p(rm2.f16184E, vw1.class);
                            try {
/* 147 */                       objMo7025e4 = uk1Var3.mo7025e(rm2.f16183D);
                                break;
                            } catch (IllegalArgumentException unused4) {
                            }
/* 151 */                   if (objMo7025e4 == null) {
/* 183 */                       this.f14413b.m9037p(rm2.f16183D, vw1.class.getCanonicalName() + "-" + UUID.randomUUID());
                            }
/* 189 */                   Object objMo7025e5 = -1;
                            try {
/* 193 */                       objMo7025e5 = uk1Var.mo7025e(jw0.f12522t);
                                break;
                            } catch (IllegalArgumentException unused5) {
                            }
/* 203 */                   if (((Integer) objMo7025e5).intValue() == -1) {
/* 212 */                       uk1Var.m9037p(jw0.f12522t, 2);
/* 215 */                       return;
                            }
/* 215 */                   return;
                        default:
/* 16 */                    this.f14413b = uk1Var;
                            try {
/* 20 */                        objMo7025e3 = uk1Var.mo7025e(rm2.f16184E);
                                break;
                            } catch (IllegalArgumentException unused6) {
/* 25 */                        objMo7025e3 = null;
                            }
/* 26 */                    Class cls3 = (Class) objMo7025e3;
/* 30 */                    if (cls3 != null && !cls3.equals(pv0.class)) {
/* 39 */                        ds0.m3196m("Invalid target class configuration for ", this, ": ", cls3);
/* 42 */                        throw null;
                            }
/* 49 */                    this.f14413b.m9037p(zy2.f20392O, bz2.f2641c);
/* 52 */                    uk1 uk1Var4 = this.f14413b;
/* 56 */                    uk1Var4.m9037p(rm2.f16184E, pv0.class);
                            try {
/* 61 */                        objMo7025e4 = uk1Var4.mo7025e(rm2.f16183D);
                                break;
                            } catch (IllegalArgumentException unused7) {
                            }
/* 65 */                    if (objMo7025e4 == null) {
/* 95 */                        uk1Var4.m9037p(rm2.f16183D, pv0.class.getCanonicalName() + "-" + UUID.randomUUID());
/* 98 */                        return;
                            }
/* 98 */                    return;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static C1974nr m7034b(InterfaceC2235ty interfaceC2235ty) {
/* 4 */             C1974nr c1974nr = new C1974nr(0);
/* 13 */            interfaceC2235ty.mo7022a(new C2076pn(1, c1974nr, interfaceC2235ty));
/* 16 */            return c1974nr;
                }

                /* JADX INFO: renamed from: a */
                public vw1 m7035a() {
/* 9 */             ww1 ww1Var = new ww1(nq1.m7021d(this.f14413b));
/* 12 */            jw0.m5922y(ww1Var);
/* 17 */            vw1 vw1Var = new vw1(ww1Var);
/* 22 */            vw1Var.f18375p = vw1.f18373w;
/* 24 */            return vw1Var;
                }

                @Override // p000.uf0
                /* JADX INFO: renamed from: m */
                public final uk1 mo2939m() {
                    switch (this.f14412a) {
                        case 0:
/* 16 */                    throw null;
                        case 1:
/* 12 */                    return this.f14413b;
                        case 2:
/* 9 */                     return this.f14413b;
                        default:
/* 6 */                     return this.f14413b;
                    }
                }

                @Override // p000.yy2
                /* JADX INFO: renamed from: o */
                public zy2 mo7036o() {
/* 1 */             int i = this.f14412a;
/* 3 */             uk1 uk1Var = this.f14413b;
                    switch (i) {
                        case 1:
/* 34 */                    return new tv0(nq1.m7021d(uk1Var));
                        case 2:
/* 24 */                    return new aw0(nq1.m7021d(uk1Var));
                        default:
/* 14 */                    return new ww1(nq1.m7021d(uk1Var));
                    }
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 304 */       public C1974nr(int i) {
/* 307 */           this(uk1.m9034j(), 3);
                    this.f14412a = i;
                    switch (i) {
                        case 1:
/* 309 */                   this(uk1.m9034j(), 1);
                            break;
                        case 2:
/* 308 */                   this(uk1.m9034j(), 2);
                            break;
                        case 3:
                            break;
                        default:
/* 306 */                   this.f14413b = uk1.m9034j();
                            break;
                    }
                }
            }
