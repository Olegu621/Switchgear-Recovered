            package p000;

            import android.view.animation.Interpolator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class g12 implements Interpolator {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8431a;

                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f) {
                    switch (this.f8431a) {
                    }
/* 8 */             float f2 = f - 1.0f;
/* 14 */            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
                }
            }
