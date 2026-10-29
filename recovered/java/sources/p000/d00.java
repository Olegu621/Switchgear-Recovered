            package p000;

            import java.lang.reflect.InvocationHandler;
            import java.lang.reflect.Method;
            import kotlin.Unit;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class d00 implements InvocationHandler {

                /* JADX INFO: renamed from: a */
                public final C0857dv f6946a;

                /* JADX INFO: renamed from: b */
                public final kg0 f6947b;

                public d00(C0857dv c0857dv, kg0 kg0Var) {
/* 4 */             this.f6946a = c0857dv;
/* 6 */             this.f6947b = kg0Var;
                }

                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr) {
/* 1 */             obj.getClass();
/* 4 */             method.getClass();
/* 13 */            boolean zM6216a = Intrinsics.m6216a(method.getName(), "accept");
/* 17 */            kg0 kg0Var = this.f6947b;
/* 21 */            if (zM6216a && objArr != null && objArr.length == 1) {
/* 28 */                Object obj2 = objArr[0];
/* 32 */                xe2.m9767e(this.f6946a, obj2);
/* 35 */                kg0Var.invoke(obj2);
/* 38 */                return Unit.f12910a;
                    }
/* 51 */            if (Intrinsics.m6216a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
/* 75 */                return Boolean.valueOf(obj == objArr[0]);
                    }
/* 90 */            if (Intrinsics.m6216a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
/* 110 */               return Integer.valueOf(kg0Var.hashCode());
                    }
/* 125 */           if (Intrinsics.m6216a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
/* 141 */               return kg0Var.toString();
                    }
/* 181 */           throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
                }
            }
