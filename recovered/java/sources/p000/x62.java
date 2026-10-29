            package p000;

            import android.os.Bundle;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.Map;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class x62 {

                /* JADX INFO: renamed from: b */
                public boolean f18974b;

                /* JADX INFO: renamed from: c */
                public Bundle f18975c;

                /* JADX INFO: renamed from: d */
                public boolean f18976d;

                /* JADX INFO: renamed from: e */
                public C2527z9 f18977e;

                /* JADX INFO: renamed from: a */
                public final e62 f18973a = new e62();

                /* JADX INFO: renamed from: f */
                public boolean f18978f = true;

                /* JADX INFO: renamed from: a */
                public final Bundle m9722a(String str) {
/* 4 */             if (!this.f18976d) {
/* 38 */                f42.m3656l("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
/* 3 */                 return null;
                    }
/* 6 */             Bundle bundle = this.f18975c;
/* 8 */             if (bundle == null) {
/* 3 */                 return null;
                    }
/* 10 */            Bundle bundle2 = bundle.getBundle(str);
/* 14 */            Bundle bundle3 = this.f18975c;
/* 16 */            if (bundle3 != null) {
/* 18 */                bundle3.remove(str);
                    }
/* 21 */            Bundle bundle4 = this.f18975c;
/* 23 */            if (bundle4 != null && !bundle4.isEmpty()) {
/* 31 */                return bundle2;
                    }
/* 32 */            this.f18975c = null;
/* 34 */            return bundle2;
                }

                /* JADX INFO: renamed from: b */
                public final w62 m9723b() {
                    String str;
                    w62 w62Var;
/* 3 */             Iterator it = this.f18973a.iterator();
/* 43 */            do {
/* 8 */                 a62 a62Var = (a62) it;
/* 14 */                if (!a62Var.hasNext()) {
/* 46 */                    return null;
                        }
/* 20 */                Map.Entry entry = (Map.Entry) a62Var.next();
/* 22 */                entry.getClass();
/* 29 */                str = (String) entry.getKey();
/* 35 */                w62Var = (w62) entry.getValue();
/* 43 */            } while (!Intrinsics.m6216a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
/* 45 */            return w62Var;
                }

                /* JADX INFO: renamed from: c */
                public final void m9724c(String str, w62 w62Var) {
                    Object obj;
/* 1 */             w62Var.getClass();
/* 4 */             e62 e62Var = this.f18973a;
/* 6 */             b62 b62VarMo3333a = e62Var.mo3333a(str);
/* 10 */            if (b62VarMo3333a != null) {
/* 12 */                obj = b62VarMo3333a.f2240b;
                    } else {
/* 17 */                b62 b62Var = new b62(str, w62Var);
/* 24 */                e62Var.f7559d++;
/* 26 */                b62 b62Var2 = e62Var.f7557b;
/* 28 */                if (b62Var2 == null) {
/* 30 */                    e62Var.f7556a = b62Var;
/* 32 */                    e62Var.f7557b = b62Var;
                        } else {
/* 35 */                    b62Var2.f2241c = b62Var;
/* 37 */                    b62Var.f2242d = b62Var2;
/* 39 */                    e62Var.f7557b = b62Var;
                        }
/* 41 */                obj = null;
                    }
/* 44 */            if (((w62) obj) == null) {
/* 46 */                return;
                    }
/* 49 */            C1951n4.m6859j("SavedStateProvider with the given key is already registered");
                }

                /* JADX INFO: renamed from: d */
                public final void m9725d() {
/* 5 */             if (!this.f18978f) {
/* 70 */                f42.m3656l("Can not perform this action after onSaveInstanceState");
/* 73 */                return;
                    }
/* 7 */             C2527z9 c2527z9 = this.f18977e;
/* 9 */             if (c2527z9 == null) {
/* 13 */                c2527z9 = new C2527z9(this);
                    }
/* 16 */            this.f18977e = c2527z9;
                    try {
/* 19 */                l61.class.getDeclaredConstructor(null);
/* 22 */                C2527z9 c2527z10 = this.f18977e;
/* 24 */                if (c2527z10 != null) {
/* 34 */                    ((LinkedHashSet) c2527z10.f19993b).add(l61.class.getName());
                        }
                    } catch (NoSuchMethodException e) {
/* 67 */                throw new IllegalArgumentException("Class " + l61.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
                    }
                }
            }
