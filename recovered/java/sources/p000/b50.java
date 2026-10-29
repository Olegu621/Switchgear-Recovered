            package p000;

            import java.util.List;
            import kotlin.Pair;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class b50 implements h40 {

                /* JADX INFO: renamed from: a */
                public final qh0 f2216a;

                /* JADX INFO: renamed from: b */
                public final zb0 f2217b;

                /* JADX INFO: renamed from: c */
                public final y10 f2218c;

                /* JADX INFO: renamed from: d */
                public final ts0 f2219d;

                /* JADX INFO: renamed from: e */
                public final gl1 f2220e;

                /* JADX INFO: renamed from: f */
                public int f2221f;

                /* JADX INFO: renamed from: g */
                public ig2 f2222g;

                /* JADX INFO: renamed from: h */
                public final gr0 f2223h;

                /* JADX INFO: renamed from: i */
                public final ra2 f2224i;

                /* JADX INFO: renamed from: j */
                public final hk2 f2225j;

                /* JADX INFO: renamed from: k */
                public final hk2 f2226k;

                /* JADX INFO: renamed from: l */
                public final ra2 f2227l;

                public b50(qh0 qh0Var, List list, zb0 zb0Var, y10 y10Var) {
/* 1 */             list.getClass();
/* 7 */             this.f2216a = qh0Var;
/* 9 */             this.f2217b = zb0Var;
/* 11 */            this.f2218c = y10Var;
/* 24 */            this.f2219d = new ts0(new C2562zs(this, null));
/* 31 */            this.f2220e = new gl1();
/* 40 */            this.f2223h = new gr0(19);
/* 44 */            ra2 ra2Var = new ra2();
/* 47 */            list.getClass();
/* 50 */            ra2Var.f15958d = this;
/* 57 */            ra2Var.f15955a = new gl1();
/* 64 */            ra2Var.f15956b = new C1869kx();
/* 70 */            ra2Var.f15957c = CollectionsKt.m6192K(list);
/* 72 */            this.f2224i = ra2Var;
/* 84 */            this.f2225j = r51.m8065b(new m40(this, 1));
/* 96 */            this.f2226k = r51.m8065b(new m40(this, 0));
/* 103 */           C1983o c1983o = new C1983o(this, 6);
/* 109 */           C2223tm c2223tm = new C2223tm(this, null, 5);
/* 112 */           ra2 ra2Var2 = new ra2();
/* 115 */           ra2Var2.f15955a = y10Var;
/* 117 */           ra2Var2.f15956b = c2223tm;
/* 126 */           ra2Var2.f15957c = hu0.m4311F(AbstractC0208c9.API_PRIORITY_OTHER, null, 6);
/* 135 */           ra2Var2.f15958d = new qc3(10);
/* 147 */           h01 h01Var = (h01) y10Var.mo4406c().get(xt0.f19368w);
/* 149 */           if (h01Var != null) {
/* 158 */               h01Var.invokeOnCompletion(new C1996oc(8, c1983o, ra2Var2));
                    }
/* 161 */           this.f2227l = ra2Var2;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: b */
                public static final Object m1280b(b50 b50Var, d10 d10Var) {
                    q40 q40Var;
                    gl1 gl1Var;
/* 3 */             if (d10Var instanceof q40) {
/* 6 */                 q40Var = (q40) d10Var;
/* 8 */                 int i = q40Var.f15392e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    q40Var.f15392e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    q40Var = new q40(b50Var, d10Var);
                        }
                    } else {
/* 22 */                q40Var = new q40(b50Var, d10Var);
                    }
/* 25 */            Object obj = q40Var.f15390c;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = q40Var.f15392e;
/* 33 */            if (i2 == 0) {
/* 53 */                pg3.m7417A(obj);
/* 56 */                gl1Var = b50Var.f2220e;
/* 58 */                q40Var.f15388a = b50Var;
/* 60 */                q40Var.f15389b = gl1Var;
/* 62 */                q40Var.f15392e = 1;
/* 68 */                if (gl1Var.m3967d(q40Var) == z10Var) {
/* 70 */                    return z10Var;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 49 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 32 */                    return null;
                        }
/* 37 */                gl1 gl1Var2 = q40Var.f15389b;
/* 39 */                b50 b50Var2 = q40Var.f15388a;
/* 41 */                pg3.m7417A(obj);
/* 44 */                gl1Var = gl1Var2;
/* 45 */                b50Var = b50Var2;
                    }
                    try {
/* 73 */                int i3 = b50Var.f2221f - 1;
/* 75 */                b50Var.f2221f = i3;
/* 77 */                if (i3 == 0) {
/* 79 */                    ig2 ig2Var = b50Var.f2222g;
/* 81 */                    if (ig2Var != null) {
/* 83 */                        ig2Var.cancel(null);
                            }
/* 89 */                    b50Var.f2222g = null;
                        }
/* 94 */                return Unit.f12910a;
                    } finally {
/* 97 */                gl1Var.m3970g(null);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
                
                    if (r9 == r1) goto L50;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
                
                    r8 = r11;
                    r11 = r9;
                    r9 = r8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
                
                    if (r9 == r1) goto L50;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r9v0, types: [b50] */
                /* JADX WARN: Type inference failed for: r9v1 */
                /* JADX WARN: Type inference failed for: r9v12 */
                /* JADX WARN: Type inference failed for: r9v14 */
                /* JADX WARN: Type inference failed for: r9v16 */
                /* JADX WARN: Type inference failed for: r9v17, types: [b50] */
                /* JADX WARN: Type inference failed for: r9v2 */
                /* JADX WARN: Type inference failed for: r9v23 */
                /* JADX WARN: Type inference failed for: r9v24 */
                /* JADX WARN: Type inference failed for: r9v25 */
                /* JADX WARN: Type inference failed for: r9v26 */
                /* JADX WARN: Type inference failed for: r9v27 */
                /* JADX WARN: Type inference failed for: r9v3 */
                /* JADX INFO: renamed from: c */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object m1281c(b50 b50Var, kh1 kh1Var, d10 d10Var) {
                    r40 r40Var;
                    ?? r9;
                    C1869kx c1869kx;
                    Object objM7783b;
                    ?? r10;
                    Function2 function2;
                    CoroutineContext coroutineContext;
/* 3 */             if (d10Var instanceof r40) {
/* 6 */                 r40Var = (r40) d10Var;
/* 8 */                 int i = r40Var.f15873f;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    r40Var.f15873f = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    r40Var = new r40(b50Var, d10Var);
                        }
                    } else {
/* 22 */                r40Var = new r40(b50Var, d10Var);
                    }
/* 25 */            Object n42Var = r40Var.f15871d;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = r40Var.f15873f;
/* 34 */            boolean z = true;
                    try {
                        try {
/* 35 */                    if (i2 != 0) {
/* 37 */                        if (i2 != 1) {
/* 39 */                            if (i2 == 2) {
/* 61 */                                C1869kx c1869kx2 = r40Var.f15870c;
/* 63 */                                b50 b50Var2 = r40Var.f15869b;
/* 67 */                                kh1 kh1Var2 = (kh1) r40Var.f15868a;
/* 69 */                                pg3.m7417A(n42Var);
/* 72 */                                c1869kx = c1869kx2;
/* 73 */                                r10 = b50Var2;
/* 74 */                                kh1Var = kh1Var2;
                                    } else if (i2 != 3) {
/* 57 */                                f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                                return null;
                                    }
                                }
/* 45 */                        InterfaceC1809jx interfaceC1809jx = (InterfaceC1809jx) r40Var.f15868a;
/* 47 */                        pg3.m7417A(n42Var);
                                b50Var = interfaceC1809jx;
/* 185 */                       m42 m42Var = o42.f14612b;
                                r9 = b50Var;
/* 220 */                       Throwable thM7099a = o42.m7099a(n42Var);
/* 224 */                       C1869kx c1869kx3 = (C1869kx) r9;
/* 226 */                       if (thM7099a == null) {
/* 228 */                           c1869kx3.m10238D(n42Var);
                                } else {
/* 232 */                           c1869kx3.m6289U(thM7099a);
                                }
/* 235 */                       return Unit.f12910a;
                            }
/* 76 */                    pg3.m7417A(n42Var);
/* 79 */                    c1869kx = kh1Var.f12766b;
                            try {
/* 81 */                        m42 m42Var2 = o42.f14612b;
/* 85 */                        og2 og2VarM4001r = b50Var.f2223h.m4001r();
/* 91 */                        if (og2VarM4001r instanceof x30) {
/* 93 */                            Function2 function3 = kh1Var.f12765a;
/* 95 */                            CoroutineContext coroutineContext2 = kh1Var.f12768d;
/* 97 */                            r40Var.f15868a = c1869kx;
/* 99 */                            r40Var.f15873f = 1;
                                    try {
/* 110 */                               objM7783b = b50Var.m1286g().m7783b(new y40((b50) b50Var, coroutineContext2, function3, (c10) null), r40Var);
                                    } catch (Throwable th) {
/* 123 */                               th = th;
/* 121 */                               th = th;
/* 125 */                               b50Var = c1869kx;
/* 213 */                               m42 m42Var3 = o42.f14612b;
/* 217 */                               n42Var = new n42(th);
                                        r9 = b50Var;
                                    }
                                } else {
/* 131 */                           if (!(og2VarM4001r instanceof v02)) {
/* 134 */                               z = og2VarM4001r instanceof hx2;
                                    }
/* 136 */                           if (!z) {
/* 200 */                               if (og2VarM4001r instanceof mi0) {
/* 206 */                                   throw ((mi0) og2VarM4001r).f13790b;
                                        }
/* 212 */                               throw new pn1();
                                    }
/* 140 */                           if (og2VarM4001r != kh1Var.f12767c) {
/* 190 */                               og2VarM4001r.getClass();
/* 197 */                               throw ((v02) og2VarM4001r).f17824b;
                                    }
/* 142 */                           r40Var.f15868a = kh1Var;
/* 144 */                           r40Var.f15869b = b50Var;
/* 146 */                           r40Var.f15870c = c1869kx;
/* 148 */                           r40Var.f15873f = 2;
/* 154 */                           if (b50Var.m1287h(r40Var) == z10Var) {
                                        r10 = b50Var;
                                    }
                                }
/* 184 */                       return z10Var;
                            } catch (Throwable th2) {
/* 127 */                       th = th2;
/* 125 */                       b50Var = c1869kx;
/* 213 */                       m42 m42Var4 = o42.f14612b;
/* 217 */                       n42Var = new n42(th);
                                r9 = b50Var;
                            }
/* 178 */                   objM7783b = r10.m1286g().m7783b(new y40((b50) r10, coroutineContext, function2, (c10) null), r40Var);
                        } catch (Throwable th3) {
/* 188 */                   th = th3;
/* 121 */                   th = th;
/* 125 */                   b50Var = c1869kx;
/* 213 */                   m42 m42Var5 = o42.f14612b;
/* 217 */                   n42Var = new n42(th);
                            r9 = b50Var;
                        }
                        r10 = b50Var;
/* 157 */               function2 = kh1Var.f12765a;
/* 159 */               coroutineContext = kh1Var.f12768d;
/* 161 */               r40Var.f15868a = c1869kx;
/* 163 */               r40Var.f15869b = null;
/* 165 */               r40Var.f15870c = null;
/* 167 */               r40Var.f15873f = 3;
                    } catch (Throwable th4) {
/* 52 */                th = th4;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: d */
                public static final Object m1282d(b50 b50Var, d10 d10Var) {
                    s40 s40Var;
                    gl1 gl1Var;
/* 3 */             if (d10Var instanceof s40) {
/* 6 */                 s40Var = (s40) d10Var;
/* 8 */                 int i = s40Var.f16421e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    s40Var.f16421e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    s40Var = new s40(b50Var, d10Var);
                        }
                    } else {
/* 22 */                s40Var = new s40(b50Var, d10Var);
                    }
/* 25 */            Object obj = s40Var.f16419c;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = s40Var.f16421e;
/* 31 */            int i3 = 1;
/* 32 */            c10 c10Var = null;
/* 33 */            if (i2 == 0) {
/* 53 */                pg3.m7417A(obj);
/* 56 */                gl1Var = b50Var.f2220e;
/* 58 */                s40Var.f16417a = b50Var;
/* 60 */                s40Var.f16418b = gl1Var;
/* 62 */                s40Var.f16421e = 1;
/* 68 */                if (gl1Var.m3967d(s40Var) == z10Var) {
/* 70 */                    return z10Var;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 49 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 32 */                    return null;
                        }
/* 37 */                gl1 gl1Var2 = s40Var.f16418b;
/* 39 */                b50 b50Var2 = s40Var.f16417a;
/* 41 */                pg3.m7417A(obj);
/* 44 */                gl1Var = gl1Var2;
/* 45 */                b50Var = b50Var2;
                    }
                    try {
/* 73 */                int i4 = b50Var.f2221f + 1;
/* 74 */                b50Var.f2221f = i4;
/* 76 */                if (i4 == 1) {
/* 90 */                    b50Var.f2222g = i13.m4443w(b50Var.f2218c, null, new n40(b50Var, c10Var, i3), 3);
                        }
/* 98 */                return Unit.f12910a;
                    } finally {
/* 101 */               gl1Var.m3970g(null);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: e */
                public static final Object m1283e(b50 b50Var, boolean z, c10 c10Var) {
                    u40 u40Var;
                    b50 b50Var2;
                    og2 og2Var;
                    b50 b50Var3;
                    Pair pair;
                    og2 og2Var2;
/* 3 */             if (c10Var instanceof u40) {
/* 6 */                 u40Var = (u40) c10Var;
/* 8 */                 int i = u40Var.f17353f;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    u40Var.f17353f = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    u40Var = new u40(b50Var, c10Var);
                        }
                    } else {
/* 22 */                u40Var = new u40(b50Var, c10Var);
                    }
/* 25 */            Object objM7784c = u40Var.f17351d;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = u40Var.f17353f;
/* 34 */            c10 c10Var2 = null;
/* 35 */            if (i2 == 0) {
/* 72 */                pg3.m7417A(objM7784c);
/* 77 */                og2 og2VarM4001r = b50Var.f2223h.m4001r();
/* 83 */                if (og2VarM4001r instanceof hx2) {
/* 203 */                   f42.m3656l("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
/* 34 */                    return null;
                        }
/* 85 */                qe2 qe2VarM1286g = b50Var.m1286g();
/* 89 */                u40Var.f17348a = b50Var;
/* 91 */                u40Var.f17349b = og2VarM4001r;
/* 93 */                u40Var.f17350c = z;
/* 95 */                u40Var.f17353f = 1;
/* 97 */                Integer numM7782a = qe2VarM1286g.m7782a();
/* 101 */               if (numM7782a != z10Var) {
/* 105 */                   b50Var2 = b50Var;
/* 106 */                   og2Var = og2VarM4001r;
/* 107 */                   objM7784c = numM7782a;
                        }
/* 177 */               return z10Var;
                    }
/* 37 */            if (i2 != 1) {
/* 39 */                if (i2 == 2) {
/* 56 */                    b50Var3 = u40Var.f17348a;
/* 58 */                    pg3.m7417A(objM7784c);
/* 152 */                   pair = (Pair) objM7784c;
/* 183 */                   og2Var2 = (og2) pair.f12908a;
/* 193 */                   if (((Boolean) pair.f12909b).booleanValue()) {
/* 197 */                       b50Var3.f2223h.m4003u(og2Var2);
                            }
/* 200 */                   return og2Var2;
                        }
/* 41 */                if (i2 != 3) {
/* 52 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 34 */                    return null;
                        }
/* 43 */                b50Var3 = u40Var.f17348a;
/* 45 */                pg3.m7417A(objM7784c);
/* 179 */               pair = (Pair) objM7784c;
/* 183 */               og2Var2 = (og2) pair.f12908a;
/* 193 */               if (((Boolean) pair.f12909b).booleanValue()) {
/* 197 */                   b50Var3.f2223h.m4003u(og2Var2);
                        }
/* 200 */               return og2Var2;
                    }
/* 62 */            z = u40Var.f17350c;
/* 64 */            og2Var = u40Var.f17349b;
/* 66 */            b50Var2 = u40Var.f17348a;
/* 68 */            pg3.m7417A(objM7784c);
/* 110 */           int iIntValue = ((Number) objM7784c).intValue();
/* 114 */           boolean z2 = og2Var instanceof x30;
/* 121 */           int i3 = z2 ? og2Var.f14743a : -1;
/* 122 */           if (z2 && iIntValue == i3) {
/* 126 */               return og2Var;
                    }
/* 127 */           if (z) {
/* 129 */               qe2 qe2VarM1286g2 = b50Var2.m1286g();
/* 135 */               v40 v40Var = new v40(b50Var2, null);
/* 138 */               u40Var.f17348a = b50Var2;
/* 140 */               u40Var.f17349b = null;
/* 142 */               u40Var.f17353f = 2;
/* 144 */               objM7784c = qe2VarM1286g2.m7783b(v40Var, u40Var);
/* 148 */               if (objM7784c != z10Var) {
/* 151 */                   b50Var3 = b50Var2;
/* 152 */                   pair = (Pair) objM7784c;
/* 183 */                   og2Var2 = (og2) pair.f12908a;
/* 193 */                   if (((Boolean) pair.f12909b).booleanValue()) {
/* 197 */                       b50Var3.f2223h.m4003u(og2Var2);
                            }
/* 200 */                   return og2Var2;
                        }
                    } else {
/* 155 */               qe2 qe2VarM1286g3 = b50Var2.m1286g();
/* 162 */               w40 w40Var = new w40(b50Var2, i3, c10Var2, 0);
/* 165 */               u40Var.f17348a = b50Var2;
/* 167 */               u40Var.f17349b = null;
/* 169 */               u40Var.f17353f = 3;
/* 171 */               objM7784c = qe2VarM1286g3.m7784c(w40Var, u40Var);
/* 175 */               if (objM7784c != z10Var) {
/* 178 */                   b50Var3 = b50Var2;
/* 179 */                   pair = (Pair) objM7784c;
/* 183 */                   og2Var2 = (og2) pair.f12908a;
/* 193 */                   if (((Boolean) pair.f12909b).booleanValue()) {
/* 197 */                       b50Var3.f2223h.m4003u(og2Var2);
                            }
/* 200 */                   return og2Var2;
                        }
                    }
/* 177 */           return z10Var;
                }

                /* JADX WARN: Code duplicated, block: B:27:0x0089  */
                /* JADX WARN: Code duplicated, block: B:57:0x00e4 A[Catch: d20 -> 0x00a6, TryCatch #1 {d20 -> 0x00a6, blocks: (B:36:0x00a1, B:70:0x013d, B:41:0x00af, B:67:0x0120, B:49:0x00cc, B:57:0x00e4, B:58:0x00e8, B:53:0x00d5, B:64:0x010e), top: B:75:0x0021 }] */
                /* JADX WARN: Code duplicated, block: B:61:0x00fe  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x013a, code lost:
                
                    if (r11 == r1) goto L69;
                 */
                /* JADX INFO: renamed from: f */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object m1284f(b50 b50Var, boolean z, d10 d10Var) {
                    x40 x40Var;
                    int iHashCode;
                    Integer numM7782a;
                    Object obj;
                    b50 b50Var2;
                    int i;
                    d20 d20Var;
                    Object objM7783b;
                    f22 f22Var;
                    h22 h22Var;
/* 3 */             if (d10Var instanceof x40) {
/* 6 */                 x40Var = (x40) d10Var;
/* 8 */                 int i2 = x40Var.f18944w;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    x40Var.f18944w = i2 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    x40Var = new x40(b50Var, d10Var);
                        }
                    } else {
/* 22 */                x40Var = new x40(b50Var, d10Var);
                    }
/* 25 */            Object objM7782a = x40Var.f18942i;
/* 27 */            z10 z10Var = z10.f19902a;
/* 31 */            int i3 = 1;
/* 33 */            c10 c10Var = null;
                    try {
                        switch (x40Var.f18944w) {
                            case 0:
/* 209 */                       pg3.m7417A(objM7782a);
/* 212 */                       if (!z) {
/* 271 */                           qe2 qe2VarM1286g = b50Var.m1286g();
/* 275 */                           x40Var.f18936a = b50Var;
/* 277 */                           x40Var.f18940e = z;
/* 280 */                           x40Var.f18944w = 3;
/* 282 */                           objM7782a = qe2VarM1286g.m7782a();
/* 286 */                           if (objM7782a != z10Var) {
/* 291 */                               int iIntValue = ((Number) objM7782a).intValue();
/* 295 */                               qe2 qe2VarM1286g2 = b50Var.m1286g();
/* 301 */                               w40 w40Var = new w40(b50Var, iIntValue, c10Var, i3);
/* 304 */                               x40Var.f18936a = b50Var;
/* 306 */                               x40Var.f18940e = z;
/* 309 */                               x40Var.f18944w = 4;
/* 311 */                               objM7782a = qe2VarM1286g2.m7784c(w40Var, x40Var);
                                        break;
                                    }
                                } else {
/* 214 */                           x40Var.f18936a = b50Var;
/* 216 */                           x40Var.f18940e = z;
/* 218 */                           x40Var.f18944w = 1;
/* 220 */                           objM7782a = b50Var.m1288i(x40Var);
/* 224 */                           if (objM7782a != z10Var) {
/* 229 */                               iHashCode = objM7782a != null ? objM7782a.hashCode() : 0;
/* 233 */                               qe2 qe2VarM1286g3 = b50Var.m1286g();
/* 237 */                               x40Var.f18936a = b50Var;
/* 239 */                               x40Var.f18937b = objM7782a;
/* 241 */                               x40Var.f18940e = z;
/* 243 */                               x40Var.f18941f = iHashCode;
/* 246 */                               x40Var.f18944w = 2;
/* 248 */                               numM7782a = qe2VarM1286g3.m7782a();
/* 252 */                               if (numM7782a != z10Var) {
/* 255 */                                   obj = objM7782a;
/* 256 */                                   objM7782a = numM7782a;
/* 257 */                                   b50Var2 = b50Var;
/* 258 */                                   i = iHashCode;
/* 267 */                                   return new x30(obj, i, ((Number) objM7782a).intValue());
                                        }
                                    }
                                }
/* 317 */                       return z10Var;
                            case 1:
/* 199 */                       z = x40Var.f18940e;
/* 203 */                       b50Var = (b50) x40Var.f18936a;
/* 205 */                       pg3.m7417A(objM7782a);
/* 229 */                       if (objM7782a != null) {
                                }
/* 233 */                       qe2 qe2VarM1286g4 = b50Var.m1286g();
/* 237 */                       x40Var.f18936a = b50Var;
/* 239 */                       x40Var.f18937b = objM7782a;
/* 241 */                       x40Var.f18940e = z;
/* 243 */                       x40Var.f18941f = iHashCode;
/* 246 */                       x40Var.f18944w = 2;
/* 248 */                       numM7782a = qe2VarM1286g4.m7782a();
/* 252 */                       if (numM7782a != z10Var) {
/* 255 */                           obj = objM7782a;
/* 256 */                           objM7782a = numM7782a;
/* 257 */                           b50Var2 = b50Var;
/* 258 */                           i = iHashCode;
/* 267 */                           return new x30(obj, i, ((Number) objM7782a).intValue());
                                }
/* 317 */                       return z10Var;
                            case 2:
/* 181 */                       i = x40Var.f18941f;
/* 183 */                       z = x40Var.f18940e;
/* 185 */                       obj = x40Var.f18937b;
/* 189 */                       b50Var2 = (b50) x40Var.f18936a;
                                try {
/* 191 */                           pg3.m7417A(objM7782a);
/* 267 */                           return new x30(obj, i, ((Number) objM7782a).intValue());
                                } catch (d20 e) {
/* 195 */                           e = e;
/* 196 */                           b50Var = b50Var2;
/* 323 */                           h22 h22Var2 = new h22();
/* 326 */                           zb0 zb0Var = b50Var.f2217b;
/* 328 */                           x40Var.f18936a = b50Var;
/* 330 */                           x40Var.f18937b = e;
/* 332 */                           x40Var.f18938c = h22Var2;
/* 334 */                           x40Var.f18939d = h22Var2;
/* 336 */                           x40Var.f18940e = z;
/* 339 */                           x40Var.f18944w = 5;
/* 341 */                           throw e;
                                }
                            case 3:
/* 170 */                       z = x40Var.f18940e;
/* 174 */                       b50Var = (b50) x40Var.f18936a;
/* 176 */                       pg3.m7417A(objM7782a);
/* 291 */                       int iIntValue2 = ((Number) objM7782a).intValue();
/* 295 */                       qe2 qe2VarM1286g5 = b50Var.m1286g();
/* 301 */                       w40 w40Var2 = new w40(b50Var, iIntValue2, c10Var, i3);
/* 304 */                       x40Var.f18936a = b50Var;
/* 306 */                       x40Var.f18940e = z;
/* 309 */                       x40Var.f18944w = 4;
/* 311 */                       objM7782a = qe2VarM1286g5.m7784c(w40Var2, x40Var);
                                break;
                            case 4:
/* 156 */                       boolean z2 = x40Var.f18940e;
/* 162 */                       pg3.m7417A(objM7782a);
/* 318 */                       return (x30) objM7782a;
                            case 5:
/* 61 */                        boolean z3 = x40Var.f18940e;
/* 63 */                        h22 h22Var3 = x40Var.f18939d;
/* 67 */                        h22 h22Var4 = (h22) x40Var.f18938c;
/* 71 */                        d20 d20Var2 = (d20) x40Var.f18937b;
/* 75 */                        b50 b50Var3 = (b50) x40Var.f18936a;
/* 77 */                        pg3.m7417A(objM7782a);
/* 80 */                        h22Var3.f8873a = objM7782a;
/* 84 */                        f22 f22Var2 = new f22();
                                try {
/* 89 */                            y40 y40Var = new y40(h22Var4, b50Var3, f22Var2, (c10) null);
/* 92 */                            x40Var.f18936a = d20Var2;
/* 94 */                            x40Var.f18937b = h22Var4;
/* 96 */                            x40Var.f18938c = f22Var2;
/* 98 */                            x40Var.f18939d = null;
/* 101 */                           x40Var.f18944w = 6;
/* 103 */                           if (z3) {
/* 105 */                               b50Var3.getClass();
/* 108 */                               objM7783b = y40Var.invoke(x40Var);
                                    } else {
/* 122 */                               objM7783b = b50Var3.m1286g().m7783b(new C2241u3(y40Var, c10Var, i3), x40Var);
                                    }
/* 126 */                           if (objM7783b != z10Var) {
/* 130 */                               f22Var = f22Var2;
/* 131 */                               h22Var = h22Var4;
/* 134 */                               Object obj2 = h22Var.f8873a;
/* 144 */                               return new x30(obj2, obj2 != null ? obj2.hashCode() : 0, f22Var.f7976a);
                                    }
/* 317 */                           return z10Var;
                                } catch (Throwable th) {
/* 150 */                           th = th;
/* 148 */                           d20Var = d20Var2;
/* 152 */                           jf0.m5798a(d20Var, th);
/* 155 */                           throw d20Var;
                                }
                            case 6:
/* 45 */                        f22Var = (f22) x40Var.f18938c;
/* 49 */                        h22Var = (h22) x40Var.f18937b;
/* 53 */                        d20Var = (d20) x40Var.f18936a;
                                try {
/* 55 */                            pg3.m7417A(objM7782a);
/* 134 */                           Object obj3 = h22Var.f8873a;
/* 144 */                           return new x30(obj3, obj3 != null ? obj3.hashCode() : 0, f22Var.f7976a);
                                } catch (Throwable th2) {
/* 59 */                            th = th2;
/* 152 */                           jf0.m5798a(d20Var, th);
/* 155 */                           throw d20Var;
                                }
                            default:
/* 39 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 33 */                        return null;
                        }
                    } catch (d20 e2) {
/* 167 */               e = e2;
                    }
                }

                @Override // p000.h40
                /* JADX INFO: renamed from: a */
                public final Object mo1285a(Function2 function2, c10 c10Var) {
/* 11 */            ry2 ry2Var = (ry2) c10Var.getContext().get(xt0.f19357V);
/* 13 */            if (ry2Var != null) {
/* 15 */                ry2Var.m8335a(this);
                    }
/* 30 */            return i13.m4422D(new ry2(ry2Var, this), new C2562zs(this, function2, null, 2), c10Var);
                }

                /* JADX INFO: renamed from: g */
                public final qe2 m1286g() {
/* 7 */             return (qe2) this.f2226k.getValue();
                }

                @Override // p000.h40
                public final fk0 getData() {
/* 1 */             return this.f2219d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
                
                    if (r2.m8114s(r0) == r1) goto L26;
                 */
                /* JADX INFO: renamed from: h */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object m1287h(d10 d10Var) throws Throwable {
                    t40 t40Var;
                    int iIntValue;
                    b50 b50Var;
                    int i;
                    Throwable th;
/* 3 */             if (d10Var instanceof t40) {
/* 6 */                 t40Var = (t40) d10Var;
/* 8 */                 int i2 = t40Var.f16917e;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    t40Var.f16917e = i2 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    t40Var = new t40(this, d10Var);
                        }
                    } else {
/* 22 */                t40Var = new t40(this, d10Var);
                    }
/* 25 */            Object objM7782a = t40Var.f16915c;
/* 27 */            Object obj = z10.f19902a;
/* 29 */            int i3 = t40Var.f16917e;
                    try {
/* 33 */                if (i3 == 0) {
/* 62 */                    pg3.m7417A(objM7782a);
/* 65 */                    qe2 qe2VarM1286g = m1286g();
/* 69 */                    t40Var.f16913a = this;
/* 71 */                    t40Var.f16917e = 1;
/* 73 */                    objM7782a = qe2VarM1286g.m7782a();
/* 77 */                    if (objM7782a != obj) {
                            }
/* 100 */                   return obj;
                        }
/* 35 */                if (i3 != 1) {
/* 37 */                    if (i3 != 2) {
/* 51 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 54 */                        return null;
                            }
/* 39 */                    i = t40Var.f16914b;
/* 41 */                    b50Var = t40Var.f16913a;
                            try {
/* 43 */                        pg3.m7417A(objM7782a);
/* 101 */                       return Unit.f12910a;
                            } catch (Throwable th2) {
/* 47 */                        th = th2;
/* 116 */                       b50Var.f2223h.m4003u(new v02(i, th));
/* 119 */                       throw th;
                            }
                        }
/* 56 */                this = t40Var.f16913a;
/* 58 */                pg3.m7417A(objM7782a);
/* 86 */                ra2 ra2Var = this.f2224i;
/* 88 */                t40Var.f16913a = this;
/* 90 */                t40Var.f16914b = iIntValue;
/* 92 */                t40Var.f16917e = 2;
                    } catch (Throwable th3) {
/* 106 */               b50Var = this;
/* 107 */               i = iIntValue;
/* 108 */               th = th3;
/* 116 */               b50Var.f2223h.m4003u(new v02(i, th));
/* 119 */               throw th;
                    }
/* 82 */            iIntValue = ((Number) objM7782a).intValue();
                }

                /* JADX INFO: renamed from: i */
                public final Object m1288i(d10 d10Var) {
/* 16 */            return ((th0) this.f2225j.getValue()).m8789a(new o40(3, (c10) null), d10Var);
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: j */
                public final Object m1289j(Object obj, boolean z, d10 d10Var) {
                    z40 z40Var;
                    f22 f22Var;
/* 3 */             if (d10Var instanceof z40) {
/* 6 */                 z40Var = (z40) d10Var;
/* 8 */                 int i = z40Var.f19928d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    z40Var.f19928d = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    z40Var = new z40(this, d10Var);
                        }
                    } else {
/* 22 */                z40Var = new z40(this, d10Var);
                    }
/* 25 */            Object obj2 = z40Var.f19926b;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = z40Var.f19928d;
/* 32 */            if (i2 == 0) {
/* 49 */                pg3.m7417A(obj2);
/* 54 */                f22 f22Var2 = new f22();
/* 63 */                th0 th0Var = (th0) this.f2225j.getValue();
/* 71 */                a50 a50Var = new a50(f22Var2, this, obj, z, null);
/* 74 */                z40Var.f19925a = f22Var2;
/* 76 */                z40Var.f19928d = 1;
/* 82 */                if (th0Var.m8790b(a50Var, z40Var) == z10Var) {
/* 84 */                    return z10Var;
                        }
/* 85 */                f22Var = f22Var2;
                    } else {
/* 34 */                if (i2 != 1) {
/* 44 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 36 */                f22Var = z40Var.f19925a;
/* 38 */                pg3.m7417A(obj2);
                    }
/* 90 */            return new Integer(f22Var.f7976a);
                }
            }
