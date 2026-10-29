            package p000;

            import android.app.Application;
            import java.lang.reflect.InvocationTargetException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class r33 extends wm0 {

                /* JADX INFO: renamed from: d */
                public static r33 f15846d;

                /* JADX INFO: renamed from: c */
                public final Application f15847c;

                public r33(Application application) {
/* 2 */             super(2);
/* 5 */             this.f15847c = application;
                }

                @Override // p000.wm0, p000.s33
                /* JADX INFO: renamed from: a */
                public final q33 mo94a(Class cls) {
/* 1 */             Application application = this.f15847c;
/* 3 */             if (application != null) {
/* 5 */                 return m8061c(cls, application);
                    }
/* 12 */            C1951n4.m6866q("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
/* 15 */            return null;
                }

                @Override // p000.s33
                /* JADX INFO: renamed from: b */
                public final q33 mo95b(Class cls, qk1 qk1Var) {
/* 3 */             if (this.f15847c != null) {
/* 5 */                 return mo94a(cls);
                    }
/* 18 */            Application application = (Application) qk1Var.f13548a.get(dc0.f7097X);
/* 20 */            if (application != null) {
/* 22 */                return m8061c(cls, application);
                    }
/* 33 */            if (!AbstractC2098q8.class.isAssignableFrom(cls)) {
/* 35 */                return super.mo94a(cls);
                    }
/* 42 */            C1951n4.m6859j("CreationExtras must have an application by `APPLICATION_KEY`");
/* 45 */            return null;
                }

                /* JADX INFO: renamed from: c */
                public final q33 m8061c(Class cls, Application application) {
/* 9 */             if (!AbstractC2098q8.class.isAssignableFrom(cls)) {
/* 60 */                return super.mo94a(cls);
                    }
                    try {
/* 30 */                q33 q33Var = (q33) cls.getConstructor(Application.class).newInstance(application);
/* 32 */                q33Var.getClass();
/* 35 */                return q33Var;
                    } catch (IllegalAccessException e) {
/* 52 */                f42.m3658n("Cannot create an instance of ", cls, e);
/* 11 */                return null;
                    } catch (InstantiationException e2) {
/* 48 */                f42.m3658n("Cannot create an instance of ", cls, e2);
/* 11 */                return null;
                    } catch (NoSuchMethodException e3) {
/* 56 */                f42.m3658n("Cannot create an instance of ", cls, e3);
/* 11 */                return null;
                    } catch (InvocationTargetException e4) {
/* 44 */                f42.m3658n("Cannot create an instance of ", cls, e4);
/* 11 */                return null;
                    }
                }
            }
