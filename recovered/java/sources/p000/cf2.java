            package p000;

            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class cf2 extends j42 implements Function2 {

                /* JADX INFO: renamed from: a */
                public Object f2875a;

                /* JADX INFO: renamed from: b */
                public Iterator f2876b;

                /* JADX INFO: renamed from: c */
                public int f2877c;

                /* JADX INFO: renamed from: d */
                public int f2878d;

                /* JADX INFO: renamed from: e */
                public int f2879e;

                /* JADX INFO: renamed from: f */
                public /* synthetic */ Object f2880f;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ Iterator f2881i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public cf2(Iterator it, c10 c10Var) {
/* 4 */             super(2, c10Var);
/* 1 */             this.f2881i = it;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 5 */             cf2 cf2Var = new cf2(this.f2881i, c10Var);
/* 8 */             cf2Var.f2880f = obj;
/* 10 */            return cf2Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((cf2) create((r92) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
                    int i;
                    int i2;
                    ArrayList arrayList;
                    Iterator it;
                    int i3;
                    int i4;
                    int i5;
                    b52 b52Var;
/* 5 */             r92 r92Var = (r92) this.f2880f;
/* 7 */             z10 z10Var = z10.f19902a;
/* 9 */             int i6 = this.f2879e;
/* 14 */            boolean z = true;
/* 16 */            if (i6 != 0) {
/* 18 */                if (i6 != 1) {
/* 20 */                    if (i6 != 2) {
/* 25 */                        if (i6 == 3) {
/* 62 */                            i4 = this.f2878d;
/* 64 */                            int i7 = this.f2877c;
/* 66 */                            Iterator it2 = this.f2876b;
/* 70 */                            b52 b52Var2 = (b52) this.f2875a;
/* 72 */                            pg3.m7417A(obj);
/* 75 */                            b52Var2.m1290a();
                                    while (true) {
/* 78 */                                int i8 = b52Var2.f2229b;
/* 80 */                                Object[] objArr = b52Var2.f2228a;
/* 86 */                                if (!it2.hasNext()) {
/* 197 */                                   i5 = i7;
/* 198 */                                   b52Var = b52Var2;
                                            break;
                                        }
/* 88 */                                Object next = it2.next();
/* 92 */                                boolean z2 = z;
/* 98 */                                if (b52Var2.size() == i8) {
/* 193 */                                   f42.m3656l("ring buffer is full");
/* 15 */                                    return null;
                                        }
/* 110 */                               objArr[(b52Var2.size() + b52Var2.f2230c) % i8] = next;
/* 118 */                               b52Var2.f2231d = b52Var2.size() + 1;
/* 124 */                               if (b52Var2.size() == i8) {
/* 130 */                                   if (b52Var2.size() >= 20) {
/* 170 */                                       ArrayList arrayList2 = new ArrayList(b52Var2);
/* 173 */                                       this.f2880f = r92Var;
/* 175 */                                       this.f2875a = b52Var2;
/* 177 */                                       this.f2876b = it2;
/* 179 */                                       this.f2877c = i7;
/* 181 */                                       this.f2878d = i4;
/* 183 */                                       this.f2879e = 3;
/* 185 */                                       r92Var.mo7741a(arrayList2, this);
/* 188 */                                       z10 z10Var2 = z10.f19902a;
/* 190 */                                       return z10Var;
                                            }
/* 135 */                                   int i9 = i8 + (i8 >> 1) + 1;
/* 137 */                                   if (i9 > 20) {
/* 139 */                                       i9 = 20;
                                            }
/* 161 */                                   b52Var2 = new b52(b52Var2.f2230c == 0 ? Arrays.copyOf(objArr, i9) : b52Var2.toArray(new Object[i9]), b52Var2.size());
                                        }
/* 165 */                               z = z2;
                                    }
                                } else if (i6 == 4) {
/* 46 */                            i4 = this.f2878d;
/* 48 */                            i5 = this.f2877c;
/* 52 */                            b52Var = (b52) this.f2875a;
/* 54 */                            pg3.m7417A(obj);
/* 57 */                            b52Var.m1290a();
                                } else {
/* 29 */                            if (i6 != 5) {
/* 42 */                                f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 15 */                                return null;
                                    }
                                }
/* 203 */                       if (b52Var.size() > 20) {
/* 207 */                           ArrayList arrayList3 = new ArrayList(b52Var);
/* 210 */                           this.f2880f = r92Var;
/* 212 */                           this.f2875a = b52Var;
/* 214 */                           this.f2876b = null;
/* 216 */                           this.f2877c = i5;
/* 218 */                           this.f2878d = i4;
/* 220 */                           this.f2879e = 4;
/* 222 */                           r92Var.mo7741a(arrayList3, this);
/* 225 */                           z10 z10Var3 = z10.f19902a;
/* 227 */                           return z10Var;
                                }
/* 232 */                       if (!b52Var.isEmpty()) {
/* 234 */                           this.f2880f = null;
/* 236 */                           this.f2875a = null;
/* 238 */                           this.f2876b = null;
/* 240 */                           this.f2877c = i5;
/* 242 */                           this.f2878d = i4;
/* 244 */                           this.f2879e = 5;
/* 246 */                           r92Var.mo7741a(b52Var, this);
/* 249 */                           z10 z10Var4 = z10.f19902a;
/* 251 */                           return z10Var;
                                }
                            }
/* 35 */                    pg3.m7417A(obj);
                        } else {
/* 260 */                   i = this.f2878d;
/* 262 */                   int i10 = this.f2877c;
/* 264 */                   Iterator it3 = this.f2876b;
/* 270 */                   pg3.m7417A(obj);
/* 275 */                   arrayList = new ArrayList(20);
/* 279 */                   it = it3;
/* 280 */                   i3 = i10;
/* 281 */                   i2 = i;
                        }
/* 368 */               return Unit.f12910a;
                    }
/* 285 */           pg3.m7417A(obj);
/* 295 */           i = 0;
/* 296 */           i2 = 0;
/* 290 */           arrayList = new ArrayList(20);
/* 293 */           it = this.f2881i;
/* 299 */           i3 = 20;
/* 304 */           while (it.hasNext()) {
/* 306 */               Object next2 = it.next();
/* 310 */               if (i > 0) {
/* 312 */                   i--;
                        } else {
/* 315 */                   arrayList.add(next2);
/* 322 */                   if (arrayList.size() == 20) {
/* 324 */                       this.f2880f = r92Var;
/* 326 */                       this.f2875a = arrayList;
/* 328 */                       this.f2876b = it;
/* 330 */                       this.f2877c = i3;
/* 332 */                       this.f2878d = i2;
/* 336 */                       this.f2879e = 1;
/* 338 */                       r92Var.mo7741a(arrayList, this);
/* 341 */                       z10 z10Var5 = z10.f19902a;
/* 343 */                       return z10Var;
                            }
                        }
                    }
/* 348 */           if (!arrayList.isEmpty()) {
/* 350 */               this.f2880f = null;
/* 352 */               this.f2875a = null;
/* 354 */               this.f2876b = null;
/* 356 */               this.f2877c = i3;
/* 358 */               this.f2878d = i2;
/* 360 */               this.f2879e = 2;
/* 362 */               r92Var.mo7741a(arrayList, this);
/* 365 */               z10 z10Var6 = z10.f19902a;
/* 367 */               return z10Var;
                    }
/* 368 */           return Unit.f12910a;
                }
            }
