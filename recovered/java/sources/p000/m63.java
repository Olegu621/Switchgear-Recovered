            package p000;

            import android.webkit.WebMessagePort;
            import java.lang.reflect.InvocationHandler;
            import java.lang.reflect.Proxy;
            import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
            import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public final class m63 extends l63 {

                /* JADX INFO: renamed from: a */
                public WebMessagePort f13605a;

                /* JADX INFO: renamed from: b */
                public WebMessagePortBoundaryInterface f13606b;

                public m63(InvocationHandler invocationHandler) {
/* 12 */            this.f13606b = (WebMessagePortBoundaryInterface) j13.m5642b(WebMessagePortBoundaryInterface.class, invocationHandler);
                }

                @Override // p000.l63
                /* JADX INFO: renamed from: a */
                public final void mo6351a(i63 i63Var) {
/* 1 */             C1823k9 c1823k9 = b73.f2318s;
/* 3 */             c1823k9.getClass();
/* 6 */             int i = i63Var.f9475d;
/* 8 */             if (i == 0) {
/* 18 */                AbstractC1993o9.m7121h(m6611c(), AbstractC1993o9.m7115b(i63Var));
                    } else {
/* 26 */                if (!c1823k9.mo97b() || (i != 0 && (i != 1 || !b73.f2320u.mo97b()))) {
/* 63 */                    throw b73.m1295a();
                        }
/* 55 */                m6610b().postMessage(new C2297vk(new h63(i63Var)));
                    }
                }

                /* JADX INFO: renamed from: b */
                public final WebMessagePortBoundaryInterface m6610b() {
/* 3 */             if (this.f13606b == null) {
/* 5 */                 er0 er0Var = c73.f2756a;
/* 25 */                this.f13606b = (WebMessagePortBoundaryInterface) j13.m5642b(WebMessagePortBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) er0Var.f7853b).convertWebMessagePort(this.f13605a));
                    }
/* 27 */            return this.f13606b;
                }

                /* JADX INFO: renamed from: c */
                public final WebMessagePort m6611c() {
/* 3 */             if (this.f13605a == null) {
/* 5 */                 er0 er0Var = c73.f2756a;
/* 23 */                this.f13605a = (WebMessagePort) ((WebkitToCompatConverterBoundaryInterface) er0Var.f7853b).convertWebMessagePort(Proxy.getInvocationHandler(this.f13606b));
                    }
/* 25 */            return this.f13605a;
                }

/* 14 */        public m63(WebMessagePort webMessagePort) {
/* 16 */            this.f13605a = webMessagePort;
                }
            }
