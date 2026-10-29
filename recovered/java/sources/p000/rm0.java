            package p000;

            import androidx.fragment.app.AbstractC0111w;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rm0 {

                /* JADX INFO: renamed from: b */
                public static final le2 f16179b = new le2();

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ AbstractC0111w f16180a;

                public rm0(AbstractC0111w abstractC0111w) {
/* 4 */             this.f16180a = abstractC0111w;
                }

                /* JADX INFO: renamed from: a */
                public static Class m8205a(ClassLoader classLoader, String str) throws ClassNotFoundException {
/* 1 */             le2 le2Var = f16179b;
/* 8 */             le2 le2Var2 = (le2) le2Var.getOrDefault(classLoader, null);
/* 10 */            if (le2Var2 == null) {
/* 14 */                le2Var2 = new le2();
/* 17 */                le2Var.put(classLoader, le2Var2);
                    }
/* 24 */            Class cls = (Class) le2Var2.getOrDefault(str, null);
/* 26 */            if (cls != null) {
/* 37 */                return cls;
                    }
/* 29 */            Class<?> cls2 = Class.forName(str, false, classLoader);
/* 33 */            le2Var2.put(str, cls2);
/* 36 */            return cls2;
                }

                /* JADX INFO: renamed from: b */
                public static Class m8206b(ClassLoader classLoader, String str) {
                    try {
/* 3 */                 return m8205a(classLoader, str);
                    } catch (ClassCastException e) {
/* 20 */                throw new C2086px(fm0.m3784j("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
                    } catch (ClassNotFoundException e2) {
/* 33 */                throw new C2086px(fm0.m3784j("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
                    }
                }
            }
