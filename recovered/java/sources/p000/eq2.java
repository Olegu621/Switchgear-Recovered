            package p000;

            import android.content.Context;
            import java.util.concurrent.Executor;
            import javax.inject.Provider;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class eq2 implements sg0 {

                /* JADX INFO: renamed from: a */
                public Object f7832a;

                /* JADX INFO: renamed from: b */
                public Object f7833b;

                /* JADX INFO: renamed from: c */
                public Object f7834c;

                /* JADX INFO: renamed from: d */
                public Object f7835d;

                /* JADX INFO: renamed from: e */
                public Object f7836e;

                /* JADX INFO: renamed from: f */
                public Object f7837f;

                /* JADX INFO: renamed from: i */
                public Object f7838i;

                @Override // javax.inject.Provider
                public Object get() {
/* 9 */             Context context = (Context) ((Provider) this.f7832a).get();
/* 19 */            ei1 ei1Var = (ei1) ((Provider) this.f7833b).get();
/* 29 */            s52 s52Var = (s52) ((Provider) this.f7834c).get();
/* 39 */            C0875ec c0875ec = (C0875ec) ((ac1) this.f7835d).get();
/* 49 */            Executor executor = (Executor) ((Provider) this.f7836e).get();
/* 59 */            s52 s52Var2 = (s52) ((Provider) this.f7837f).get();
/* 65 */            q62 q62Var = new q62(9);
/* 72 */            p62 p62Var = new p62(8);
/* 83 */            s52 s52Var3 = (s52) ((Provider) this.f7838i).get();
/* 87 */            f31 f31Var = new f31();
/* 90 */            f31Var.f7983a = context;
/* 92 */            f31Var.f7984b = ei1Var;
/* 94 */            f31Var.f7985c = s52Var;
/* 96 */            f31Var.f7986d = c0875ec;
/* 98 */            f31Var.f7987e = executor;
/* 100 */           f31Var.f7988f = s52Var2;
/* 102 */           f31Var.f7989g = q62Var;
/* 104 */           f31Var.f7990h = p62Var;
/* 106 */           f31Var.f7991i = s52Var3;
/* 108 */           return f31Var;
                }
            }
