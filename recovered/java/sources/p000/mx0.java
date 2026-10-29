            package p000;

            import java.util.Iterator;
            import kotlin.text.C1849b;
            import kotlinx.serialization.internal.EnumDescriptor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class mx0 implements Iterable, r21 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14057a;

                /* JADX INFO: renamed from: b */
                public final Object f14058b;

                public /* synthetic */ mx0(Object obj, int i) {
/* 1 */             this.f14057a = i;
/* 3 */             this.f14058b = obj;
                }

                @Override // java.lang.Iterable
                public final Iterator iterator() {
/* 1 */             int i = this.f14057a;
/* 3 */             Object obj = this.f14058b;
                    switch (i) {
                        case 0:
/* 36 */                    return new sa0(py0.m7610q0((Object[]) ((C1997od) obj).f14714b));
                        case 1:
/* 20 */                    return new C1849b((q70) obj);
                        default:
/* 12 */                    return new C2126r((EnumDescriptor) obj);
                    }
                }
            }
