            package p000;

            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class k40 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ dl1 f12582a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ e22 f12583b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ h22 f12584c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ b50 f12585d;

                public k40(dl1 dl1Var, e22 e22Var, h22 h22Var, b50 b50Var) {
/* 4 */             this.f12582a = dl1Var;
/* 6 */             this.f12583b = e22Var;
/* 8 */             this.f12584c = h22Var;
/* 10 */            this.f12585d = b50Var;
                }

                /* JADX WARN: Code duplicated, block: B:37:0x00b2 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #1 {all -> 0x0052, blocks: (B:21:0x004e, B:35:0x00aa, B:37:0x00b2), top: B:53:0x004e }] */
                /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
                /* JADX WARN: Code duplicated, block: B:42:0x00c7  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: a */
                public final Object m5947a(g40 g40Var, d10 d10Var) throws Throwable {
                    j40 j40Var;
                    e22 e22Var;
                    h22 h22Var;
                    b50 b50Var;
                    gl1 gl1Var;
                    dl1 dl1Var;
                    Function2 function2;
                    dl1 dl1Var2;
                    dl1 dl1Var3;
                    h22 h22Var2;
                    Object obj;
                    dl1 dl1Var4;
/* 3 */             if (d10Var instanceof j40) {
/* 6 */                 j40Var = (j40) d10Var;
/* 8 */                 int i = j40Var.f12070v;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    j40Var.f12070v = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    j40Var = new j40(this, d10Var);
                        }
                    } else {
/* 22 */                j40Var = new j40(this, d10Var);
                    }
/* 25 */            Object obj2 = j40Var.f12068f;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = j40Var.f12070v;
                    try {
/* 35 */                if (i2 == 0) {
/* 111 */                   pg3.m7417A(obj2);
/* 114 */                   j40Var.f12063a = g40Var;
/* 116 */                   dl1 dl1Var5 = this.f12582a;
/* 118 */                   j40Var.f12064b = dl1Var5;
/* 120 */                   e22Var = this.f12583b;
/* 122 */                   j40Var.f12065c = e22Var;
/* 124 */                   h22Var = this.f12584c;
/* 126 */                   j40Var.f12066d = h22Var;
/* 128 */                   b50Var = this.f12585d;
/* 130 */                   j40Var.f12067e = b50Var;
/* 132 */                   j40Var.f12070v = 1;
/* 134 */                   gl1Var = (gl1) dl1Var5;
/* 140 */                   if (gl1Var.m3967d(j40Var) != z10Var) {
                            }
                            function2 = g40Var;
                            dl1Var = gl1Var;
/* 194 */                   return z10Var;
                        }
/* 37 */                if (i2 != 1) {
/* 39 */                    if (i2 != 2) {
/* 41 */                        if (i2 != 3) {
/* 63 */                            f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 34 */                            return null;
                                }
/* 43 */                        obj = j40Var.f12065c;
/* 47 */                        h22Var2 = (h22) j40Var.f12064b;
/* 51 */                        dl1Var2 = (dl1) j40Var.f12063a;
                                try {
/* 53 */                            pg3.m7417A(obj2);
                                    dl1Var4 = dl1Var2;
/* 197 */                           h22Var2.f8873a = obj;
                                    dl1Var2 = dl1Var4;
/* 201 */                           Object obj3 = h22Var2.f8873a;
/* 205 */                           ((gl1) dl1Var2).m3970g(null);
/* 208 */                           return obj3;
                                } catch (Throwable th) {
/* 58 */                            th = th;
/* 222 */                           ((gl1) dl1Var2).m3970g(null);
/* 225 */                           throw th;
                                }
                            }
/* 69 */                    b50Var = (b50) j40Var.f12065c;
/* 73 */                    h22Var2 = (h22) j40Var.f12064b;
/* 77 */                    dl1Var3 = (dl1) j40Var.f12063a;
                            try {
/* 79 */                        pg3.m7417A(obj2);
                                dl1Var3 = dl1Var3;
/* 177 */                       if (!Intrinsics.m6216a(obj2, h22Var2.f8873a)) {
/* 179 */                           j40Var.f12063a = dl1Var3;
/* 181 */                           j40Var.f12064b = h22Var2;
/* 183 */                           j40Var.f12065c = obj2;
/* 185 */                           j40Var.f12070v = 3;
/* 192 */                           if (b50Var.m1289j(obj2, false, j40Var) != z10Var) {
/* 195 */                               obj = obj2;
/* 196 */                               dl1Var4 = dl1Var3;
/* 197 */                               h22Var2.f8873a = obj;
                                        dl1Var2 = dl1Var4;
                                    }
                                    function2 = g40Var;
                                    dl1Var = gl1Var;
/* 194 */                           return z10Var;
                                }
/* 200 */                       dl1Var2 = dl1Var3;
/* 201 */                       Object obj4 = h22Var2.f8873a;
/* 205 */                       ((gl1) dl1Var2).m3970g(null);
/* 208 */                       return obj4;
                            } catch (Throwable th2) {
/* 83 */                        th = th2;
/* 84 */                        dl1Var2 = dl1Var3;
/* 222 */                       ((gl1) dl1Var2).m3970g(null);
/* 225 */                       throw th;
                            }
                        }
/* 87 */                b50Var = j40Var.f12067e;
/* 89 */                h22 h22Var3 = j40Var.f12066d;
/* 93 */                e22Var = (e22) j40Var.f12065c;
/* 97 */                dl1 dl1Var6 = (dl1) j40Var.f12064b;
/* 101 */               Function2 function3 = (Function2) j40Var.f12063a;
/* 103 */               pg3.m7417A(obj2);
/* 107 */               h22Var = h22Var3;
/* 108 */               function2 = function3;
/* 109 */               dl1Var = dl1Var6;
                        function2 = g40Var;
                        dl1Var = gl1Var;
/* 145 */               if (e22Var.f7490a) {
/* 219 */                   throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                        }
/* 147 */               Object obj5 = h22Var.f8873a;
/* 149 */               j40Var.f12063a = dl1Var;
/* 151 */               j40Var.f12064b = h22Var;
/* 153 */               j40Var.f12065c = b50Var;
/* 155 */               j40Var.f12066d = null;
/* 157 */               j40Var.f12067e = null;
/* 159 */               j40Var.f12070v = 2;
/* 161 */               Object objInvoke = function2.invoke(obj5, j40Var);
/* 165 */               if (objInvoke != z10Var) {
/* 168 */                   dl1Var3 = dl1Var;
/* 169 */                   obj2 = objInvoke;
/* 170 */                   h22Var2 = h22Var;
/* 177 */                   if (!Intrinsics.m6216a(obj2, h22Var2.f8873a)) {
/* 179 */                       j40Var.f12063a = dl1Var3;
/* 181 */                       j40Var.f12064b = h22Var2;
/* 183 */                       j40Var.f12065c = obj2;
/* 185 */                       j40Var.f12070v = 3;
/* 192 */                       if (b50Var.m1289j(obj2, false, j40Var) != z10Var) {
/* 195 */                           obj = obj2;
/* 196 */                           dl1Var4 = dl1Var3;
/* 197 */                           h22Var2.f8873a = obj;
                                    dl1Var2 = dl1Var4;
                                }
                            } else {
/* 200 */                       dl1Var2 = dl1Var3;
                            }
/* 201 */                   Object obj6 = h22Var2.f8873a;
/* 205 */                   ((gl1) dl1Var2).m3970g(null);
/* 208 */                   return obj6;
                        }
                        function2 = g40Var;
                        dl1Var = gl1Var;
/* 194 */               return z10Var;
                    } catch (Throwable th3) {
/* 209 */               th = th3;
/* 210 */               dl1Var2 = dl1Var;
/* 222 */               ((gl1) dl1Var2).m3970g(null);
/* 225 */               throw th;
                    }
                }
            }
