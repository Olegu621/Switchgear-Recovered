            package p000;

            import android.content.Context;
            import com.google.android.datatransport.cct.CctBackendFactory;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ei1 {

                /* JADX INFO: renamed from: a */
                public final wc0 f7695a;

                /* JADX INFO: renamed from: b */
                public final C0875ec f7696b;

                /* JADX INFO: renamed from: c */
                public final HashMap f7697c;

                public ei1(Context context, C0875ec c0875ec) {
/* 5 */             wc0 wc0Var = new wc0(context, 17);
/* 16 */            this.f7697c = new HashMap();
/* 18 */            this.f7695a = wc0Var;
/* 20 */            this.f7696b = c0875ec;
                }

                /* JADX INFO: renamed from: a */
                public final synchronized vr2 m3446a(String str) {
/* 8 */             if (this.f7697c.containsKey(str)) {
/* 16 */                return (vr2) this.f7697c.get(str);
                    }
/* 24 */            CctBackendFactory cctBackendFactoryM9546u = this.f7695a.m9546u(str);
/* 28 */            if (cctBackendFactoryM9546u == null) {
/* 31 */                return null;
                    }
/* 33 */            C0875ec c0875ec = this.f7696b;
/* 52 */            vr2 vr2VarCreate = cctBackendFactoryM9546u.create(new C1925mf((Context) c0875ec.f7615d, (InterfaceC2512yv) c0875ec.f7613b, (InterfaceC2512yv) c0875ec.f7614c, str));
/* 58 */            this.f7697c.put(str, vr2VarCreate);
/* 62 */            return vr2VarCreate;
                }
            }
