            package p000;

            import java.util.Set;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class qh2 {

                /* JADX INFO: renamed from: a */
                public static final Set f15564a;

                static {
/* 3 */             mw2.f14054b.getClass();
/* 8 */             sw2.f16829b.getClass();
/* 13 */            ts2.f17251b.getClass();
/* 18 */            ax2.f2137b.getClass();
/* 48 */            f15564a = C2103qd.m7780o(new SerialDescriptor[]{qw2.f15787b, ww2.f18848b, xs2.f19354b, ex2.f7916b});
                }

                /* JADX INFO: renamed from: a */
                public static final boolean m7852a(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
                    return serialDescriptor.isInline() && f15564a.contains(serialDescriptor);
                }
            }
