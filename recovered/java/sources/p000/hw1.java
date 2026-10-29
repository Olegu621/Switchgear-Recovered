            package p000;

            import android.content.Context;
            import java.util.List;
            import kotlin.collections.C1839a;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hw1 implements w02 {

                /* JADX INFO: renamed from: a */
                public final Function1 f9340a;

                /* JADX INFO: renamed from: b */
                public final y10 f9341b;

                /* JADX INFO: renamed from: c */
                public final Object f9342c = new Object();

                /* JADX INFO: renamed from: d */
                public volatile gw1 f9343d;

                public hw1(Function1 function1, y10 y10Var) {
/* 4 */             this.f9340a = function1;
/* 6 */             this.f9341b = y10Var;
                }

                @Override // p000.w02
                /* JADX INFO: renamed from: a */
                public final Object mo4392a(Object obj, u21 u21Var) {
                    gw1 gw1Var;
/* 1 */             Context context = (Context) obj;
/* 3 */             context.getClass();
/* 6 */             u21Var.getClass();
/* 9 */             gw1 gw1Var2 = this.f9343d;
/* 11 */            if (gw1Var2 != null) {
/* 103 */               return gw1Var2;
                    }
                    synchronized (this.f9342c) {
                        try {
/* 18 */                    if (this.f9343d == null) {
/* 20 */                        Context applicationContext = context.getApplicationContext();
/* 24 */                        Function1 function1 = this.f9340a;
/* 26 */                        applicationContext.getClass();
/* 33 */                        List list = (List) function1.invoke(applicationContext);
/* 35 */                        y10 y10Var = this.f9341b;
/* 39 */                        cb1 cb1Var = new cb1(applicationContext, this);
/* 42 */                        list.getClass();
/* 89 */                        this.f9343d = new gw1(new gw1(new b50(new qh0(new C0908f8(cb1Var, 6)), C1839a.m6210b(new C2223tm(list, null, 3)), new zb0(23), y10Var)));
                            }
/* 94 */                    gw1Var = this.f9343d;
/* 96 */                    gw1Var.getClass();
                        } catch (Throwable th) {
/* 102 */                   throw th;
                        }
                    }
/* 100 */           return gw1Var;
                }
            }
