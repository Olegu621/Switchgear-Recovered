            package p000;

            import java.io.Serializable;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            
            /* JADX INFO: renamed from: bi */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 10 */    public abstract class AbstractC0181bi implements c10, a20, Serializable {
                private final c10 completion;

                public AbstractC0181bi(c10 c10Var) {
/* 4 */             this.completion = c10Var;
                }

                public c10 create(c10 c10Var) {
/* 1 */             c10Var.getClass();
/* 11 */            throw new UnsupportedOperationException("create(Continuation) has not been overridden");
                }

                @Override // p000.a20
                public a20 getCallerFrame() {
/* 1 */             c10 c10Var = this.completion;
/* 5 */             if (c10Var instanceof a20) {
/* 7 */                 return (a20) c10Var;
                    }
/* 10 */            return null;
                }

                public final c10 getCompletion() {
/* 1 */             return this.completion;
                }

                public StackTraceElement getStackTraceElement() {
                    int iIntValue;
                    String strM5707c;
                    Method method;
                    Object objInvoke;
                    Method method2;
                    Object objInvoke2;
/* 11 */            j50 j50Var = (j50) getClass().getAnnotation(j50.class);
/* 13 */            String str = null;
/* 14 */            if (j50Var == null) {
/* 13 */                return null;
                    }
/* 17 */            int iM5711v = j50Var.m5711v();
/* 22 */            if (iM5711v > 1) {
/* 260 */               throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iM5711v + ". Please update the Kotlin standard library.").toString());
                    }
                    try {
/* 31 */                Field declaredField = getClass().getDeclaredField("label");
/* 35 */                declaredField.setAccessible(true);
/* 38 */                Object obj = declaredField.get(this);
/* 49 */                Integer num = obj instanceof Integer ? (Integer) obj : null;
/* 58 */                iIntValue = (num != null ? num.intValue() : 0) - 1;
                    } catch (Exception unused) {
/* 60 */                iIntValue = -1;
                    }
/* 68 */            int i = iIntValue >= 0 ? j50Var.m5709l()[iIntValue] : -1;
/* 72 */            sj1.f16656a.getClass();
/* 75 */            rj1 rj1Var = sj1.f16658c;
/* 77 */            rj1 rj1Var2 = sj1.f16657b;
/* 79 */            if (rj1Var == null) {
                        try {
/* 131 */                   rj1 rj1Var3 = new rj1(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
/* 134 */                   sj1.f16658c = rj1Var3;
/* 136 */                   rj1Var = rj1Var3;
                        } catch (Exception unused2) {
/* 138 */                   sj1.f16658c = rj1Var2;
/* 140 */                   rj1Var = rj1Var2;
                        }
                    }
/* 141 */           if (rj1Var != rj1Var2 && (method = rj1Var.f16118a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = rj1Var.f16119b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
/* 170 */               Method method3 = rj1Var.f16120c;
/* 179 */               Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
/* 182 */               if (objInvoke3 instanceof String) {
/* 185 */                   str = (String) objInvoke3;
                        }
                    }
/* 187 */           if (str == null) {
/* 189 */               strM5707c = j50Var.m5707c();
                    } else {
/* 214 */               strM5707c = str + '/' + j50Var.m5707c();
                    }
/* 228 */           return new StackTraceElement(strM5707c, j50Var.m5710m(), j50Var.m5708f(), i);
                }

                public abstract Object invokeSuspend(Object obj);

                public void releaseIntercepted() {
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v1 */
                /* JADX WARN: Type inference failed for: r2v4 */
                /* JADX WARN: Type inference failed for: r2v5 */
                @Override // p000.c10
                public final void resumeWith(Object obj) {
                    ?? r2 = this;
                    while (true) {
/* 1 */                 AbstractC0181bi abstractC0181bi = (AbstractC0181bi) r2;
/* 3 */                 c10 c10Var = abstractC0181bi.completion;
/* 5 */                 c10Var.getClass();
                        try {
/* 8 */                     obj = abstractC0181bi.invokeSuspend(obj);
/* 14 */                    if (obj == z10.f19902a) {
/* 16 */                        return;
                            } else {
/* 17 */                        m42 m42Var = o42.f14612b;
                            }
                        } catch (Throwable th) {
/* 21 */                    m42 m42Var2 = o42.f14612b;
/* 25 */                    obj = new n42(th);
                        }
/* 29 */                abstractC0181bi.releaseIntercepted();
/* 34 */                if (!(c10Var instanceof AbstractC0181bi)) {
/* 38 */                    c10Var.resumeWith(obj);
/* 41 */                    return;
                        }
/* 36 */                r2 = c10Var;
                    }
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Continuation at ");
/* 8 */             Object stackTraceElement = getStackTraceElement();
/* 12 */            if (stackTraceElement == null) {
/* 18 */                stackTraceElement = getClass().getName();
                    }
/* 22 */            sb.append(stackTraceElement);
/* 25 */            return sb.toString();
                }

/* 11 */        public c10 create(Object obj, c10 c10Var) {
                    c10Var.getClass();
/* 12 */            throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
                }
            }
