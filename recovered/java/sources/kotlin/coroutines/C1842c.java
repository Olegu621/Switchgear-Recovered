            package kotlin.coroutines;

            import java.io.InvalidObjectException;
            import java.io.ObjectInputStream;
            import java.io.Serializable;
            import kotlin.Unit;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.C0859dx;
            import p000.C0933fx;
            import p000.f22;
            import p000.f42;
            
            /* JADX INFO: renamed from: kotlin.coroutines.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1842c implements CoroutineContext, Serializable {

                /* JADX INFO: renamed from: a */
                public final CoroutineContext f12916a;

                /* JADX INFO: renamed from: b */
                public final CoroutineContext.Element f12917b;

                public C1842c(CoroutineContext.Element element, CoroutineContext coroutineContext) {
/* 1 */             coroutineContext.getClass();
/* 4 */             element.getClass();
/* 10 */            this.f12916a = coroutineContext;
/* 12 */            this.f12917b = element;
                }

                private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
/* 8 */             throw new InvalidObjectException("Deserialization is supported via proxy only");
                }

                private final Object writeReplace() {
/* 1 */             int iM6212a = m6212a();
/* 5 */             final CoroutineContext[] coroutineContextArr = new CoroutineContext[iM6212a];
/* 9 */             final f22 f22Var = new f22();
/* 19 */            fold(Unit.f12910a, new Function2() { // from class: cx
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
/* 3 */                     CoroutineContext.Element element = (CoroutineContext.Element) obj2;
/* 5 */                     ((Unit) obj).getClass();
/* 8 */                     element.getClass();
/* 11 */                    f22 f22Var2 = f22Var;
/* 13 */                    int i = f22Var2.f7976a;
/* 17 */                    f22Var2.f7976a = i + 1;
/* 21 */                    coroutineContextArr[i] = element;
/* 23 */                    return Unit.f12910a;
                        }
                    });
/* 24 */            if (f22Var.f7976a == iM6212a) {
/* 28 */                return new C0933fx(coroutineContextArr);
                    }
/* 34 */            f42.m3656l("Check failed.");
/* 37 */            return null;
                }

                /* JADX INFO: renamed from: a */
                public final int m6212a() {
/* 1 */             int i = 2;
                    while (true) {
/* 2 */                 CoroutineContext coroutineContext = this.f12916a;
/* 11 */                this = coroutineContext instanceof C1842c ? (C1842c) coroutineContext : null;
/* 12 */                if (this == null) {
/* 14 */                    return i;
                        }
/* 15 */                i++;
                    }
                }

                public final boolean equals(Object obj) {
                    boolean zM6216a;
/* 1 */             if (this == obj) {
/* 68 */                return true;
                    }
/* 6 */             if (obj instanceof C1842c) {
/* 8 */                 C1842c c1842c = (C1842c) obj;
/* 18 */                if (c1842c.m6212a() == m6212a()) {
                            while (true) {
/* 20 */                        CoroutineContext.Element element = this.f12917b;
/* 34 */                        if (!Intrinsics.m6216a(c1842c.get(element.getKey()), element)) {
/* 36 */                            zM6216a = false;
                                    break;
                                }
/* 38 */                        CoroutineContext coroutineContext = this.f12916a;
/* 42 */                        if (!(coroutineContext instanceof C1842c)) {
/* 47 */                            coroutineContext.getClass();
/* 50 */                            CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext;
/* 60 */                            zM6216a = Intrinsics.m6216a(c1842c.get(element2.getKey()), element2);
                                    break;
                                }
/* 44 */                        this = (C1842c) coroutineContext;
                            }
/* 64 */                    if (zM6216a) {
/* 68 */                        return true;
                            }
                        }
                    }
/* 5 */             return false;
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final Object fold(Object obj, Function2 function2) {
/* 9 */             return function2.invoke(this.f12916a.fold(obj, function2), this.f12917b);
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final CoroutineContext.Element get(InterfaceC1845f interfaceC1845f) {
/* 1 */             interfaceC1845f.getClass();
                    while (true) {
/* 6 */                 CoroutineContext.Element element = this.f12917b.get(interfaceC1845f);
/* 10 */                if (element != null) {
/* 12 */                    return element;
                        }
/* 13 */                CoroutineContext coroutineContext = this.f12916a;
/* 17 */                if (!(coroutineContext instanceof C1842c)) {
/* 22 */                    return coroutineContext.get(interfaceC1845f);
                        }
/* 19 */                this = (C1842c) coroutineContext;
                    }
                }

                public final int hashCode() {
/* 13 */            return this.f12917b.hashCode() + this.f12916a.hashCode();
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final CoroutineContext minusKey(InterfaceC1845f interfaceC1845f) {
/* 1 */             interfaceC1845f.getClass();
/* 4 */             CoroutineContext.Element element = this.f12917b;
/* 6 */             CoroutineContext.Element element2 = element.get(interfaceC1845f);
/* 10 */            CoroutineContext coroutineContext = this.f12916a;
/* 12 */            if (element2 != null) {
/* 14 */                return coroutineContext;
                    }
/* 15 */            CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(interfaceC1845f);
/* 19 */            if (coroutineContextMinusKey == coroutineContext) {
/* 21 */                return this;
                    }
                    return coroutineContextMinusKey == C1846g.f12919a ? element : new C1842c(element, coroutineContextMinusKey);
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final CoroutineContext plus(CoroutineContext coroutineContext) {
/* 1 */             coroutineContext.getClass();
                    return coroutineContext == C1846g.f12919a ? this : (CoroutineContext) coroutineContext.fold(this, new C0859dx(1));
                }

                public final String toString() {
/* 30 */            return "[" + ((String) fold(HttpUrl.FRAGMENT_ENCODE_SET, new C0859dx(0))) + ']';
                }
            }
