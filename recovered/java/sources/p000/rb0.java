            package p000;

            import android.hardware.camera2.params.DynamicRangeProfiles;
            import java.util.Collections;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rb0 implements pb0 {

                /* JADX INFO: renamed from: a */
                public static final qc3 f15960a = new qc3(new rb0(), 22);

                /* JADX INFO: renamed from: b */
                public static final Set f15961b = Collections.singleton(mb0.f13671d);

                @Override // p000.pb0
                /* JADX INFO: renamed from: a */
                public final DynamicRangeProfiles mo7380a() {
/* 1 */             return null;
                }

                @Override // p000.pb0
                /* JADX INFO: renamed from: b */
                public final Set mo7381b() {
/* 1 */             return f15961b;
                }

                @Override // p000.pb0
                /* JADX INFO: renamed from: c */
                public final Set mo7382c(mb0 mb0Var) {
/* 21 */            de3.m3023e("DynamicRange is not supported: " + mb0Var, mb0.f13671d.equals(mb0Var));
/* 24 */            return f15961b;
                }
            }
