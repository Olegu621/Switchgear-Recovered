            package p000;

            import android.app.Application;
            import android.os.Bundle;
            import java.lang.reflect.Constructor;
            import java.util.LinkedHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class a72 implements s33 {

                /* JADX INFO: renamed from: a */
                public final Application f108a;

                /* JADX INFO: renamed from: b */
                public final r33 f109b;

                /* JADX INFO: renamed from: c */
                public final Bundle f110c;

                /* JADX INFO: renamed from: d */
                public final v61 f111d;

                /* JADX INFO: renamed from: e */
                public final x62 f112e;

                public a72(Application application, z62 z62Var, Bundle bundle) {
                    r33 r33Var;
/* 8 */             this.f112e = z62Var.getSavedStateRegistry();
/* 14 */            this.f111d = z62Var.getLifecycle();
/* 16 */            this.f110c = bundle;
/* 18 */            this.f108a = application;
/* 20 */            if (application != null) {
/* 24 */                if (r33.f15846d == null) {
/* 31 */                    r33.f15846d = new r33(application);
                        }
/* 33 */                r33Var = r33.f15846d;
/* 35 */                r33Var.getClass();
                    } else {
/* 42 */                r33Var = new r33(null);
                    }
/* 45 */            this.f109b = r33Var;
                }

                @Override // p000.s33
                /* JADX INFO: renamed from: a */
                public final q33 mo94a(Class cls) {
/* 1 */             String canonicalName = cls.getCanonicalName();
/* 5 */             if (canonicalName != null) {
/* 7 */                 return m96c(cls, canonicalName);
                    }
/* 14 */            C1951n4.m6859j("Local and anonymous classes can not be ViewModels");
/* 17 */            return null;
                }

                @Override // p000.s33
                /* JADX INFO: renamed from: b */
                public final q33 mo95b(Class cls, qk1 qk1Var) {
/* 1 */             xt0 xt0Var = xt0.f19358W;
/* 3 */             LinkedHashMap linkedHashMap = qk1Var.f13548a;
/* 9 */             String str = (String) linkedHashMap.get(xt0Var);
/* 12 */            if (str == null) {
/* 117 */               f42.m3656l("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
/* 11 */                return null;
                    }
/* 20 */            if (linkedHashMap.get(mn0.f13870e) == null || linkedHashMap.get(mn0.f13871f) == null) {
/* 102 */               if (this.f111d != null) {
/* 104 */                   return m96c(cls, str);
                        }
/* 111 */               f42.m3656l("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
/* 11 */                return null;
                    }
/* 36 */            Application application = (Application) linkedHashMap.get(dc0.f7097X);
/* 40 */            boolean zIsAssignableFrom = AbstractC2098q8.class.isAssignableFrom(cls);
/* 57 */            Constructor constructorM1293a = (!zIsAssignableFrom || application == null) ? b72.m1293a(b72.f2284b, cls) : b72.m1293a(b72.f2283a, cls);
/* 61 */            if (constructorM1293a == null) {
/* 65 */                return this.f109b.mo95b(cls, qk1Var);
                    }
                    return (!zIsAssignableFrom || application == null) ? b72.m1294b(cls, constructorM1293a, mn0.m6692h(qk1Var)) : b72.m1294b(cls, constructorM1293a, application, mn0.m6692h(qk1Var));
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: c */
                public final q33 m96c(Class cls, String str) {
                    Object obj;
                    Application application;
/* 1 */             v61 v61Var = this.f111d;
/* 3 */             if (v61Var == null) {
/* 181 */               C1951n4.m6866q("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
/* 184 */               return null;
                    }
/* 7 */             boolean zIsAssignableFrom = AbstractC2098q8.class.isAssignableFrom(cls);
/* 26 */            Constructor constructorM1293a = (!zIsAssignableFrom || this.f108a == null) ? b72.m1293a(b72.f2284b, cls) : b72.m1293a(b72.f2283a, cls);
/* 30 */            if (constructorM1293a == null) {
/* 34 */                if (this.f108a != null) {
/* 38 */                    return this.f109b.mo94a(cls);
                        }
/* 45 */                if (wm0.f18685b == null) {
/* 53 */                    wm0.f18685b = new wm0(2);
                        }
/* 55 */                wm0 wm0Var = wm0.f18685b;
/* 57 */                wm0Var.getClass();
/* 60 */                return wm0Var.mo94a(cls);
                    }
/* 65 */            x62 x62Var = this.f112e;
/* 67 */            x62Var.getClass();
/* 70 */            Bundle bundle = this.f110c;
/* 72 */            Bundle bundleM9722a = x62Var.m9722a(str);
/* 76 */            Class[] clsArr = n62.f14144f;
/* 78 */            n62 n62VarM5644d = j13.m5644d(bundleM9722a, bundle);
/* 84 */            o62 o62Var = new o62(str, n62VarM5644d);
/* 87 */            o62Var.m7106a(v61Var, x62Var);
/* 93 */            u61 u61Var = ((i71) v61Var).f9483c;
/* 97 */            if (u61Var == u61.f17375b || u61Var.compareTo(u61.f17377d) >= 0) {
/* 117 */               x62Var.m9725d();
                    } else {
/* 113 */               v61Var.mo4483a(new l60(v61Var, x62Var));
                    }
/* 139 */           q33 q33VarM1294b = (!zIsAssignableFrom || (application = this.f108a) == null) ? b72.m1294b(cls, constructorM1293a, n62VarM5644d) : b72.m1294b(cls, constructorM1293a, application, n62VarM5644d);
                    synchronized (q33VarM1294b.f15382a) {
                        try {
/* 150 */                   obj = q33VarM1294b.f15382a.get("androidx.lifecycle.savedstate.vm.tag");
/* 154 */                   if (obj == null) {
/* 158 */                       q33VarM1294b.f15382a.put("androidx.lifecycle.savedstate.vm.tag", o62Var);
                            }
                        } catch (Throwable th) {
/* 178 */                   throw th;
                        }
                    }
/* 165 */           if (obj != null) {
/* 168 */               o62Var = obj;
                    }
/* 171 */           if (q33VarM1294b.f15384c) {
/* 173 */               q33.m7694a(o62Var);
                    }
/* 176 */           return q33VarM1294b;
                }
            }
