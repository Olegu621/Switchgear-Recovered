            package p000;

            import java.io.Serializable;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class hk2 implements p51, Serializable {

                /* JADX INFO: renamed from: a */
                public Function0 f9124a;

                /* JADX INFO: renamed from: b */
                public volatile Object f9125b;

                /* JADX INFO: renamed from: c */
                public final Object f9126c;

                public hk2(Function0 function0, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 3 */             obj = (i & 2) != 0 ? null : obj;
/* 6 */             function0.getClass();
/* 12 */            this.f9124a = function0;
/* 16 */            this.f9125b = xw2.f19388a;
/* 21 */            this.f9126c = obj == null ? this : obj;
                }

                private final Object writeReplace() {
/* 7 */             return new vx0(getValue());
                }

                @Override // p000.p51
                public final Object getValue() {
                    Object objInvoke;
/* 1 */             Object obj = this.f9125b;
/* 3 */             xw2 xw2Var = xw2.f19388a;
/* 5 */             if (obj != xw2Var) {
/* 7 */                 return obj;
                    }
                    synchronized (this.f9126c) {
/* 11 */                objInvoke = this.f9125b;
/* 13 */                if (objInvoke == xw2Var) {
/* 16 */                    Function0 function0 = this.f9124a;
/* 18 */                    function0.getClass();
/* 21 */                    objInvoke = function0.invoke();
/* 25 */                    this.f9125b = objInvoke;
/* 28 */                    this.f9124a = null;
                        }
                    }
/* 31 */            return objInvoke;
                }

                @Override // p000.p51
                public final boolean isInitialized() {
                    return this.f9125b != xw2.f19388a;
                }

                public final String toString() {
                    return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
                }
            }
