            package p000;

            import java.io.Serializable;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class l40 extends tj2 implements Function1 {

                /* JADX INFO: renamed from: a */
                public Object f13093a;

                /* JADX INFO: renamed from: b */
                public Serializable f13094b;

                /* JADX INFO: renamed from: c */
                public Object f13095c;

                /* JADX INFO: renamed from: d */
                public Object f13096d;

                /* JADX INFO: renamed from: e */
                public Iterator f13097e;

                /* JADX INFO: renamed from: f */
                public int f13098f;

                /* JADX INFO: renamed from: i */
                public int f13099i;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ b50 f13100v;

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ ra2 f13101w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public l40(b50 b50Var, ra2 ra2Var, c10 c10Var) {
/* 6 */             super(1, c10Var);
/* 1 */             this.f13100v = b50Var;
/* 3 */             this.f13101w = ra2Var;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(c10 c10Var) {
/* 7 */             return new l40(this.f13100v, this.f13101w, c10Var);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 11 */            return ((l40) create((c10) obj)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code duplicated, block: B:23:0x00a5  */
                /* JADX WARN: Code duplicated, block: B:30:0x00d9  */
                /* JADX WARN: Code duplicated, block: B:34:0x00e6  */
                /* JADX WARN: Code duplicated, block: B:35:0x00eb  */
                /* JADX WARN: Code duplicated, block: B:39:0x0101  */
                /* JADX WARN: Code duplicated, block: B:48:0x0100 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:21:0x009f->B:50:?, LOOP_END, SYNTHETIC] */
                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
                    dl1 gl1Var;
                    e22 e22Var;
                    h22 h22Var;
                    h22 h22Var2;
                    Iterator it;
                    dl1 dl1Var;
                    e22 e22Var2;
                    h22 h22Var3;
                    k40 k40Var;
                    gl1 gl1Var2;
                    h22 h22Var4;
                    e22 e22Var3;
                    Function2 function2;
                    dl1 dl1Var2;
                    Object obj2;
                    int iHashCode;
                    Integer numM7782a;
                    Object obj3;
                    int i;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i2 = this.f13099i;
/* 5 */             ra2 ra2Var = this.f13101w;
/* 10 */            b50 b50Var = this.f13100v;
/* 14 */            if (i2 == 0) {
/* 98 */                pg3.m7417A(obj);
/* 103 */               gl1Var = new gl1();
/* 108 */               e22Var = new e22();
/* 113 */               h22Var = new h22();
/* 116 */               this.f13093a = gl1Var;
/* 118 */               this.f13094b = e22Var;
/* 120 */               this.f13095c = h22Var;
/* 122 */               this.f13096d = h22Var;
/* 124 */               this.f13099i = 1;
/* 126 */               obj = b50.m1284f(b50Var, true, this);
/* 130 */               if (obj != z10Var) {
/* 134 */                   h22Var2 = h22Var;
                        }
/* 257 */               return z10Var;
                    }
/* 16 */            if (i2 == 1) {
/* 80 */                h22Var = (h22) this.f13096d;
/* 84 */                h22Var2 = (h22) this.f13095c;
/* 88 */                e22Var = (e22) this.f13094b;
/* 92 */                gl1Var = (dl1) this.f13093a;
/* 94 */                pg3.m7417A(obj);
                    } else {
/* 18 */                if (i2 == 2) {
/* 56 */                    it = this.f13097e;
/* 60 */                    k40Var = (k40) this.f13096d;
/* 64 */                    h22Var3 = (h22) this.f13095c;
/* 68 */                    e22Var2 = (e22) this.f13094b;
/* 72 */                    dl1Var = (dl1) this.f13093a;
/* 74 */                    pg3.m7417A(obj);
/* 164 */                   while (it.hasNext()) {
/* 170 */                       function2 = (Function2) it.next();
/* 172 */                       this.f13093a = dl1Var;
/* 174 */                       this.f13094b = e22Var2;
/* 176 */                       this.f13095c = h22Var3;
/* 178 */                       this.f13096d = k40Var;
/* 180 */                       this.f13097e = it;
/* 182 */                       this.f13099i = 2;
/* 188 */                       if (function2.invoke(k40Var, this) == z10Var) {
/* 257 */                           return z10Var;
                                }
                            }
/* 191 */                   h22Var2 = h22Var3;
/* 192 */                   e22Var = e22Var2;
/* 193 */                   gl1Var = dl1Var;
/* 194 */                   ra2Var.f15957c = null;
/* 196 */                   this.f13093a = e22Var;
/* 198 */                   this.f13094b = h22Var2;
/* 200 */                   this.f13095c = gl1Var;
/* 202 */                   this.f13096d = null;
/* 204 */                   this.f13097e = null;
/* 206 */                   this.f13099i = 3;
/* 209 */                   gl1Var2 = (gl1) gl1Var;
/* 215 */                   if (gl1Var2.m3967d(this) != z10Var) {
/* 218 */                       h22Var4 = h22Var2;
/* 219 */                       e22Var3 = e22Var;
                                dl1Var2 = gl1Var2;
/* 220 */                       e22Var3.f7490a = true;
/* 224 */                       ((gl1) dl1Var2).m3970g(null);
/* 227 */                       obj2 = h22Var4.f8873a;
/* 229 */                       if (obj2 != null) {
/* 231 */                           iHashCode = obj2.hashCode();
                                } else {
/* 236 */                           iHashCode = 0;
                                }
/* 237 */                       qe2 qe2VarM1286g = b50Var.m1286g();
/* 241 */                       this.f13093a = obj2;
/* 243 */                       this.f13094b = null;
/* 245 */                       this.f13095c = null;
/* 247 */                       this.f13098f = iHashCode;
/* 249 */                       this.f13099i = 4;
/* 251 */                       numM7782a = qe2VarM1286g.m7782a();
/* 255 */                       if (numM7782a != z10Var) {
/* 259 */                           obj = numM7782a;
/* 260 */                           obj3 = obj2;
/* 261 */                           i = iHashCode;
                                }
                            }
/* 257 */                   return z10Var;
                        }
/* 20 */                if (i2 == 3) {
/* 41 */                    dl1 dl1Var3 = (dl1) this.f13095c;
/* 45 */                    h22Var4 = (h22) this.f13094b;
/* 49 */                    e22Var3 = (e22) this.f13093a;
/* 51 */                    pg3.m7417A(obj);
                            dl1Var2 = dl1Var3;
                            try {
/* 220 */                       e22Var3.f7490a = true;
/* 224 */                       ((gl1) dl1Var2).m3970g(null);
/* 227 */                       obj2 = h22Var4.f8873a;
/* 229 */                       if (obj2 != null) {
/* 231 */                           iHashCode = obj2.hashCode();
                                } else {
/* 236 */                           iHashCode = 0;
                                }
/* 237 */                       qe2 qe2VarM1286g2 = b50Var.m1286g();
/* 241 */                       this.f13093a = obj2;
/* 243 */                       this.f13094b = null;
/* 245 */                       this.f13095c = null;
/* 247 */                       this.f13098f = iHashCode;
/* 249 */                       this.f13099i = 4;
/* 251 */                       numM7782a = qe2VarM1286g2.m7782a();
/* 255 */                       if (numM7782a != z10Var) {
/* 259 */                           obj = numM7782a;
/* 260 */                           obj3 = obj2;
/* 261 */                           i = iHashCode;
                                }
/* 257 */                       return z10Var;
                            } catch (Throwable th) {
/* 277 */                       ((gl1) dl1Var2).m3970g(null);
/* 280 */                       throw th;
                            }
                        }
/* 22 */                if (i2 != 4) {
/* 35 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 13 */                    return null;
                        }
/* 24 */                i = this.f13098f;
/* 26 */                obj3 = this.f13093a;
/* 28 */                pg3.m7417A(obj);
                    }
/* 270 */           return new x30(obj3, i, ((Number) obj).intValue());
/* 139 */           h22Var.f8873a = ((x30) obj).f18924b;
/* 143 */           k40 k40Var2 = new k40(gl1Var, e22Var, h22Var2, b50Var);
/* 148 */           List list = (List) ra2Var.f15957c;
/* 150 */           if (list != null) {
/* 152 */               it = list.iterator();
/* 156 */               dl1Var = gl1Var;
/* 157 */               e22Var2 = e22Var;
/* 158 */               h22Var3 = h22Var2;
/* 159 */               k40Var = k40Var2;
/* 164 */               while (it.hasNext()) {
/* 170 */                   function2 = (Function2) it.next();
/* 172 */                   this.f13093a = dl1Var;
/* 174 */                   this.f13094b = e22Var2;
/* 176 */                   this.f13095c = h22Var3;
/* 178 */                   this.f13096d = k40Var;
/* 180 */                   this.f13097e = it;
/* 182 */                   this.f13099i = 2;
/* 188 */                   if (function2.invoke(k40Var, this) == z10Var) {
                            }
                        }
/* 191 */               h22Var2 = h22Var3;
/* 192 */               e22Var = e22Var2;
/* 193 */               gl1Var = dl1Var;
/* 194 */               ra2Var.f15957c = null;
/* 196 */               this.f13093a = e22Var;
/* 198 */               this.f13094b = h22Var2;
/* 200 */               this.f13095c = gl1Var;
/* 202 */               this.f13096d = null;
/* 204 */               this.f13097e = null;
/* 206 */               this.f13099i = 3;
/* 209 */               gl1Var2 = (gl1) gl1Var;
/* 215 */               if (gl1Var2.m3967d(this) != z10Var) {
/* 218 */                   h22Var4 = h22Var2;
/* 219 */                   e22Var3 = e22Var;
                            dl1Var2 = gl1Var2;
/* 220 */                   e22Var3.f7490a = true;
/* 224 */                   ((gl1) dl1Var2).m3970g(null);
/* 227 */                   obj2 = h22Var4.f8873a;
/* 229 */                   if (obj2 != null) {
/* 231 */                       iHashCode = obj2.hashCode();
                            } else {
/* 236 */                       iHashCode = 0;
                            }
/* 237 */                   qe2 qe2VarM1286g3 = b50Var.m1286g();
/* 241 */                   this.f13093a = obj2;
/* 243 */                   this.f13094b = null;
/* 245 */                   this.f13095c = null;
/* 247 */                   this.f13098f = iHashCode;
/* 249 */                   this.f13099i = 4;
/* 251 */                   numM7782a = qe2VarM1286g3.m7782a();
/* 255 */                   if (numM7782a != z10Var) {
/* 259 */                       obj = numM7782a;
/* 260 */                       obj3 = obj2;
/* 261 */                       i = iHashCode;
/* 270 */                       return new x30(obj3, i, ((Number) obj).intValue());
                            }
                        }
                    } else {
/* 194 */               ra2Var.f15957c = null;
/* 196 */               this.f13093a = e22Var;
/* 198 */               this.f13094b = h22Var2;
/* 200 */               this.f13095c = gl1Var;
/* 202 */               this.f13096d = null;
/* 204 */               this.f13097e = null;
/* 206 */               this.f13099i = 3;
/* 209 */               gl1Var2 = (gl1) gl1Var;
/* 215 */               if (gl1Var2.m3967d(this) != z10Var) {
/* 218 */                   h22Var4 = h22Var2;
/* 219 */                   e22Var3 = e22Var;
                            dl1Var2 = gl1Var2;
/* 220 */                   e22Var3.f7490a = true;
/* 224 */                   ((gl1) dl1Var2).m3970g(null);
/* 227 */                   obj2 = h22Var4.f8873a;
/* 229 */                   if (obj2 != null) {
/* 231 */                       iHashCode = obj2.hashCode();
                            } else {
/* 236 */                       iHashCode = 0;
                            }
/* 237 */                   qe2 qe2VarM1286g4 = b50Var.m1286g();
/* 241 */                   this.f13093a = obj2;
/* 243 */                   this.f13094b = null;
/* 245 */                   this.f13095c = null;
/* 247 */                   this.f13098f = iHashCode;
/* 249 */                   this.f13099i = 4;
/* 251 */                   numM7782a = qe2VarM1286g4.m7782a();
/* 255 */                   if (numM7782a != z10Var) {
/* 259 */                       obj = numM7782a;
/* 260 */                       obj3 = obj2;
/* 261 */                       i = iHashCode;
/* 270 */                       return new x30(obj3, i, ((Number) obj).intValue());
                            }
                        }
                    }
/* 257 */           return z10Var;
                }
            }
