            package p000;

            import kotlin.jvm.functions.Function1;
            import kotlinx.serialization.KSerializer;
            
            /* JADX INFO: renamed from: fv */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0931fv extends ClassValue {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C0210cb f8360a;

                public C0931fv(C0210cb c0210cb) {
/* 1 */             this.f8360a = c0210cb;
                }

                @Override // java.lang.ClassValue
                public final Object computeValue(Class cls) {
/* 1 */             cls.getClass();
/* 22 */            return new C1798jm((KSerializer) ((Function1) this.f8360a.f2804b).invoke(j22.m5667a(cls)));
                }
            }
