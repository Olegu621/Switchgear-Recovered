            package p000;

            import java.lang.reflect.Constructor;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            import kotlin.Pair;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            import kotlin.text.StringsKt;
            
            /* JADX INFO: renamed from: dv */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C0857dv implements o21, InterfaceC0194bv {

                /* JADX INFO: renamed from: b */
                public static final C0821cv f7417b = new C0821cv(null);

                /* JADX INFO: renamed from: c */
                public static final Map f7418c;

                /* JADX INFO: renamed from: a */
                public final Class f7419a;

                static {
/* 59 */            List listM7566e = C2085pw.m7566e(Function0.class, Function1.class, Function2.class, lo0.class, mo0.class, no0.class, oo0.class, po0.class, qo0.class, ro0.class, xn0.class, yn0.class, zn0.class, ao0.class, bo0.class, co0.class, do0.class, eo0.class, fo0.class, go0.class, io0.class, jo0.class, ko0.class);
/* 71 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(listM7566e, 10));
/* 78 */            int i = 0;
/* 83 */            for (Object obj : listM7566e) {
/* 89 */                int i2 = i + 1;
/* 91 */                if (i < 0) {
/* 109 */                   C2085pw.m7568g();
/* 112 */                   throw null;
                        }
/* 104 */               arrayList.add(new Pair((Class) obj, Integer.valueOf(i)));
/* 107 */               i = i2;
                    }
/* 117 */           f7418c = oc1.m7133g(arrayList);
                }

                public C0857dv(Class cls) {
/* 1 */             cls.getClass();
/* 7 */             this.f7419a = cls;
                }

                @Override // p000.InterfaceC0194bv
                /* JADX INFO: renamed from: a */
                public final Class mo1447a() {
/* 1 */             return this.f7419a;
                }

                /* JADX INFO: renamed from: b */
                public final String m3242b() {
                    String strM2892b;
/* 3 */             f7417b.getClass();
/* 6 */             Class cls = this.f7419a;
/* 8 */             cls.getClass();
/* 15 */            String strConcat = null;
/* 16 */            if (cls.isAnonymousClass()) {
/* 15 */                return null;
                    }
/* 23 */            if (!cls.isLocalClass()) {
/* 116 */               if (!cls.isArray()) {
/* 152 */                   String strM2892b2 = C0821cv.m2892b(cls.getName());
                            return strM2892b2 == null ? cls.getSimpleName() : strM2892b2;
                        }
/* 118 */               Class<?> componentType = cls.getComponentType();
/* 128 */               if (componentType.isPrimitive() && (strM2892b = C0821cv.m2892b(componentType.getName())) != null) {
/* 140 */                   strConcat = strM2892b.concat("Array");
                        }
                        return strConcat == null ? "Array" : strConcat;
                    }
/* 25 */            String simpleName = cls.getSimpleName();
/* 29 */            Method enclosingMethod = cls.getEnclosingMethod();
/* 35 */            if (enclosingMethod != null) {
/* 56 */                return StringsKt.m6237M(simpleName, enclosingMethod.getName() + '$', simpleName);
                    }
/* 61 */            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
/* 65 */            if (enclosingConstructor == null) {
/* 93 */                int iM6226B = StringsKt.m6226B(simpleName, '$', 0, 6);
                        return iM6226B == -1 ? simpleName : simpleName.substring(iM6226B + 1, simpleName.length());
                    }
/* 86 */            return StringsKt.m6237M(simpleName, enclosingConstructor.getName() + '$', simpleName);
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof C0857dv) && yy1.m10225t(this).equals(yy1.m10225t((o21) obj));
                }

                public final int hashCode() {
/* 5 */             return yy1.m10225t(this).hashCode();
                }

                public final String toString() {
/* 16 */            return this.f7419a + " (Kotlin reflection is not available)";
                }
            }
