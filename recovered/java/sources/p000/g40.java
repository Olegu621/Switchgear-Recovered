            package p000;

            import io.sentry.C1697u2;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 16 */    public final class g40 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8461a = 2;

                /* JADX INFO: renamed from: b */
                public int f8462b;

                /* JADX INFO: renamed from: c */
                public Object f8463c;

                /* JADX INFO: renamed from: d */
                public Object f8464d;

                /* JADX INFO: renamed from: e */
                public /* synthetic */ Object f8465e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Object f8466f;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ Object f8467i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g40(e70 e70Var, WeakReference weakReference, Function2 function2, Function2 function3, Function1 function1, c10 c10Var) {
/* 14 */            super(2, c10Var);
/* 4 */             this.f8463c = e70Var;
/* 6 */             this.f8464d = weakReference;
/* 8 */             this.f8465e = function2;
/* 10 */            this.f8466f = function3;
/* 12 */            this.f8467i = function1;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 1 */             int i = this.f8461a;
/* 3 */             Object obj2 = this.f8467i;
/* 5 */             Object obj3 = this.f8466f;
                    switch (i) {
                        case 0:
/* 68 */                    g40 g40Var = new g40((List) obj3, (ArrayList) obj2, c10Var);
/* 71 */                    g40Var.f8465e = obj;
/* 73 */                    return g40Var;
                        case 1:
/* 57 */                    return new g40((Function1) this.f8464d, (e70) this.f8465e, (Function1) obj3, (Function0) obj2, c10Var);
                        default:
/* 34 */                    return new g40((e70) this.f8463c, (WeakReference) this.f8464d, (Function2) this.f8465e, (Function2) obj3, (Function1) obj2, c10Var);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f8461a) {
                        case 0:
/* 50 */                    return ((g40) create(obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 1:
/* 35 */                    return ((g40) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        default:
/* 18 */                    return ((g40) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                    }
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
                    List list;
                    Iterator it;
                    Function1 function1;
                    Object obj2;
                    Function2 function2;
                    Function2 function3;
/* 1 */             int i = this.f8461a;
/* 3 */             Object obj3 = this.f8466f;
/* 7 */             Object obj4 = this.f8467i;
                    switch (i) {
                        case 0:
/* 199 */                   z10 z10Var = z10.f19902a;
/* 201 */                   int i2 = this.f8462b;
/* 203 */                   if (i2 == 0) {
/* 268 */                       pg3.m7417A(obj);
/* 271 */                       obj = this.f8465e;
/* 278 */                       Iterator it2 = ((List) obj3).iterator();
/* 276 */                       list = (ArrayList) obj4;
/* 284 */                       it = it2;
                            } else if (i2 == 1) {
/* 226 */                       Object obj5 = this.f8464d;
/* 230 */                       Iterator it3 = (Iterator) this.f8463c;
/* 234 */                       List list2 = (List) this.f8465e;
/* 236 */                       pg3.m7417A(obj);
/* 245 */                       if (((Boolean) obj).booleanValue()) {
/* 256 */                           list2.add(new f40(1, null));
/* 259 */                           this.f8465e = list2;
/* 261 */                           this.f8463c = it3;
/* 263 */                           this.f8464d = null;
/* 265 */                           this.f8462b = 2;
/* 267 */                           throw null;
                                }
/* 247 */                       obj = obj5;
/* 248 */                       it = it3;
/* 249 */                       list = list2;
                            } else {
/* 208 */                       if (i2 != 2) {
/* 222 */                           f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                                }
/* 212 */                       it = (Iterator) this.f8463c;
/* 216 */                       list = (List) this.f8465e;
/* 218 */                       pg3.m7417A(obj);
                            }
/* 289 */                   if (!it.hasNext()) {
/* 291 */                       return obj;
                            }
/* 297 */                   if (it.next() != null) {
/* 299 */                       C1697u2.m5431g();
/* 10 */                        return null;
                            }
/* 303 */                   this.f8465e = list;
/* 305 */                   this.f8463c = it;
/* 307 */                   this.f8464d = obj;
/* 309 */                   this.f8462b = 1;
/* 311 */                   throw null;
                        case 1:
/* 121 */                   Function0 function0 = (Function0) obj4;
/* 123 */                   z10 z10Var2 = z10.f19902a;
/* 125 */                   int i3 = this.f8462b;
                            try {
/* 127 */                       if (i3 == 0) {
/* 147 */                           pg3.m7417A(obj);
/* 152 */                           Function1 function4 = (Function1) this.f8464d;
/* 156 */                           e70 e70Var = (e70) this.f8465e;
/* 158 */                           this.f8463c = function4;
/* 160 */                           this.f8462b = 1;
/* 162 */                           Object objAwait = e70Var.await(this);
/* 166 */                           if (objAwait == z10Var2) {
/* 168 */                               return z10Var2;
                                    }
/* 171 */                           obj = objAwait;
/* 172 */                           function1 = function4;
                                } else {
/* 129 */                           if (i3 != 1) {
/* 143 */                               f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 10 */                                return null;
                                    }
/* 133 */                           function1 = (Function1) this.f8463c;
/* 135 */                           pg3.m7417A(obj);
                                }
/* 173 */                       function1.invoke(obj);
/* 176 */                       if (function0 != null) {
                                }
                            } catch (Exception e) {
/* 184 */                       ((Function1) obj3).invoke(e);
                            } finally {
/* 193 */                       if (function0 != null) {
/* 195 */                           function0.invoke();
                                }
                            }
/* 190 */                   return Unit.f12910a;
                        default:
/* 14 */                    Function1 function5 = (Function1) obj4;
/* 18 */                    WeakReference weakReference = (WeakReference) this.f8464d;
/* 20 */                    z10 z10Var3 = z10.f19902a;
/* 22 */                    int i4 = this.f8462b;
                            try {
/* 24 */                        if (i4 == 0) {
/* 40 */                            pg3.m7417A(obj);
/* 45 */                            e70 e70Var2 = (e70) this.f8463c;
/* 47 */                            this.f8462b = 1;
/* 49 */                            obj = e70Var2.await(this);
/* 53 */                            if (obj == z10Var3) {
/* 55 */                                return z10Var3;
                                    }
                                } else {
/* 26 */                            if (i4 != 1) {
/* 36 */                                f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 10 */                                return null;
                                    }
/* 28 */                            pg3.m7417A(obj);
                                }
/* 57 */                        Object obj6 = weakReference.get();
/* 61 */                        if (obj6 != null && (function3 = (Function2) this.f8465e) != null) {
/* 69 */                            function3.invoke(obj6, obj);
                                }
/* 72 */                        obj2 = weakReference.get();
/* 76 */                        if (obj2 != null && function5 != null) {
/* 80 */                            function5.invoke(obj2);
                                }
                                break;
                            } catch (Exception e2) {
/* 84 */                        Object obj7 = weakReference.get();
/* 88 */                        if (obj7 != null && (function2 = (Function2) obj3) != null) {
/* 94 */                            function2.invoke(obj7, e2);
                                }
/* 97 */                        obj2 = weakReference.get();
/* 101 */                       if (obj2 != null && function5 != null) {
                                }
                                break;
                            } finally {
/* 109 */                       Object obj8 = weakReference.get();
/* 113 */                       if (obj8 != null && function5 != null) {
/* 117 */                           function5.invoke(obj8);
                                }
                            }
/* 106 */                   return Unit.f12910a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 17 */        public g40(List list, ArrayList arrayList, c10 c10Var) {
                    super(2, c10Var);
/* 18 */            this.f8466f = list;
                    this.f8467i = arrayList;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 18 */        public g40(Function1 function1, e70 e70Var, Function1 function2, Function0 function0, c10 c10Var) {
                    super(2, c10Var);
/* 19 */            this.f8464d = function1;
                    this.f8465e = e70Var;
                    this.f8466f = function2;
                    this.f8467i = function0;
                }
            }
