            package p000;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ny1 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14561a;

                /* JADX INFO: renamed from: b */
                public Function1 f14562b;

                /* JADX INFO: renamed from: c */
                public int f14563c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function1 f14564d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ e70 f14565e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ ny1(int i, c10 c10Var, e70 e70Var, Function1 function1) {
/* 8 */             super(2, c10Var);
/* 1 */             this.f14561a = i;
/* 3 */             this.f14564d = function1;
/* 5 */             this.f14565e = e70Var;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
                    switch (this.f14561a) {
                        case 0:
/* 68 */                    return new ny1(0, c10Var, this.f14565e, this.f14564d);
                        case 1:
/* 57 */                    return new ny1(1, c10Var, this.f14565e, this.f14564d);
                        case 2:
/* 46 */                    return new ny1(2, c10Var, this.f14565e, this.f14564d);
                        case 3:
/* 35 */                    return new ny1(3, c10Var, this.f14565e, this.f14564d);
                        case 4:
/* 24 */                    return new ny1(4, c10Var, this.f14565e, this.f14564d);
                        default:
/* 13 */                    return new ny1(5, c10Var, this.f14565e, this.f14564d);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             y10 y10Var = (y10) obj;
/* 5 */             c10 c10Var = (c10) obj2;
                    switch (this.f14561a) {
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
/* 18 */            return ((ny1) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             int i = this.f14561a;
/* 4 */             e70 e70Var = this.f14565e;
/* 6 */             Function1 function1 = this.f14564d;
                    switch (i) {
                        case 0:
/* 244 */                   z10 z10Var = z10.f19902a;
/* 246 */                   int i2 = this.f14563c;
                            try {
/* 248 */                       if (i2 == 0) {
/* 262 */                           pg3.m7417A(obj);
/* 265 */                           this.f14562b = function1;
/* 267 */                           this.f14563c = 1;
/* 269 */                           obj = e70Var.await(this);
/* 273 */                           if (obj == z10Var) {
/* 275 */                               return z10Var;
                                    }
                                } else {
/* 250 */                           if (i2 != 1) {
/* 258 */                               f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 11 */                                return null;
                                    }
/* 252 */                           function1 = this.f14562b;
/* 254 */                           pg3.m7417A(obj);
                                }
/* 277 */                       function1.invoke(obj);
                                break;
                            } catch (Exception unused) {
                            }
/* 280 */                   return Unit.f12910a;
                        case 1:
/* 205 */                   z10 z10Var2 = z10.f19902a;
/* 207 */                   int i3 = this.f14563c;
                            try {
/* 209 */                       if (i3 == 0) {
/* 223 */                           pg3.m7417A(obj);
/* 226 */                           this.f14562b = function1;
/* 228 */                           this.f14563c = 1;
/* 230 */                           obj = e70Var.await(this);
/* 234 */                           if (obj == z10Var2) {
/* 236 */                               return z10Var2;
                                    }
                                } else {
/* 211 */                           if (i3 != 1) {
/* 219 */                               f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 11 */                                return null;
                                    }
/* 213 */                           function1 = this.f14562b;
/* 215 */                           pg3.m7417A(obj);
                                }
/* 238 */                       function1.invoke(obj);
                                break;
                            } catch (Exception unused2) {
                            }
/* 241 */                   return Unit.f12910a;
                        case 2:
/* 167 */                   z10 z10Var3 = z10.f19902a;
/* 169 */                   int i4 = this.f14563c;
/* 171 */                   if (i4 == 0) {
/* 185 */                       pg3.m7417A(obj);
/* 188 */                       this.f14562b = function1;
/* 190 */                       this.f14563c = 1;
/* 192 */                       obj = e70Var.await(this);
/* 196 */                       if (obj == z10Var3) {
/* 198 */                           return z10Var3;
                                }
                            } else {
/* 173 */                       if (i4 != 1) {
/* 181 */                           f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 175 */                       function1 = this.f14562b;
/* 177 */                       pg3.m7417A(obj);
                            }
/* 200 */                   return function1.invoke(obj);
                        case 3:
/* 110 */                   z10 z10Var4 = z10.f19902a;
/* 112 */                   int i5 = this.f14563c;
/* 114 */                   if (i5 == 0) {
/* 135 */                       pg3.m7417A(obj);
/* 138 */                       this.f14562b = function1;
/* 140 */                       this.f14563c = 1;
/* 142 */                       obj = e70Var.await(this);
/* 146 */                       if (obj != z10Var4) {
                                }
/* 165 */                       return z10Var4;
                            }
/* 116 */                   if (i5 != 1) {
/* 118 */                       if (i5 == 2) {
/* 120 */                           pg3.m7417A(obj);
/* 166 */                           return obj;
                                }
/* 124 */                       f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 11 */                        return null;
                            }
/* 129 */                   function1 = this.f14562b;
/* 131 */                   pg3.m7417A(obj);
/* 153 */                   e70 e70Var2 = (e70) function1.invoke(obj);
/* 155 */                   this.f14562b = null;
/* 157 */                   this.f14563c = 2;
/* 159 */                   Object objAwait = e70Var2.await(this);
/* 163 */                   if (objAwait != z10Var4) {
/* 166 */                       return objAwait;
                            }
/* 165 */                   return z10Var4;
                        case 4:
/* 53 */                    z10 z10Var5 = z10.f19902a;
/* 55 */                    int i6 = this.f14563c;
/* 57 */                    if (i6 == 0) {
/* 78 */                        pg3.m7417A(obj);
/* 81 */                        this.f14562b = function1;
/* 83 */                        this.f14563c = 1;
/* 85 */                        obj = e70Var.await(this);
/* 89 */                        if (obj != z10Var5) {
                                }
/* 108 */                       return z10Var5;
                            }
/* 59 */                    if (i6 != 1) {
/* 61 */                        if (i6 == 2) {
/* 63 */                            pg3.m7417A(obj);
/* 109 */                           return obj;
                                }
/* 67 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 11 */                        return null;
                            }
/* 72 */                    function1 = this.f14562b;
/* 74 */                    pg3.m7417A(obj);
/* 96 */                    e70 e70Var3 = (e70) function1.invoke(obj);
/* 98 */                    this.f14562b = null;
/* 100 */                   this.f14563c = 2;
/* 102 */                   Object objAwait2 = e70Var3.await(this);
/* 106 */                   if (objAwait2 != z10Var5) {
/* 109 */                       return objAwait2;
                            }
/* 108 */                   return z10Var5;
                        default:
/* 15 */                    z10 z10Var6 = z10.f19902a;
/* 17 */                    int i7 = this.f14563c;
/* 19 */                    if (i7 == 0) {
/* 33 */                        pg3.m7417A(obj);
/* 36 */                        this.f14562b = function1;
/* 38 */                        this.f14563c = 1;
/* 40 */                        obj = e70Var.await(this);
/* 44 */                        if (obj == z10Var6) {
/* 46 */                            return z10Var6;
                                }
                            } else {
/* 21 */                        if (i7 != 1) {
/* 29 */                            f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 23 */                        function1 = this.f14562b;
/* 25 */                        pg3.m7417A(obj);
                            }
/* 48 */                    return function1.invoke(obj);
                    }
                }
            }
