            package androidx.profileinstaller;

            import android.content.Context;
            import java.util.Collections;
            import java.util.List;
            import p000.RunnableC0873ea;
            import p000.cy1;
            import p000.ec0;
            import p000.wx0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ProfileInstallerInitializer implements wx0 {
                @Override // p000.wx0
                public final Object create(Context context) {
/* 10 */            cy1.m2897a(new RunnableC0873ea(this, context.getApplicationContext()));
/* 17 */            return new ec0(27);
                }

                @Override // p000.wx0
                public final List dependencies() {
/* 1 */             return Collections.EMPTY_LIST;
                }
            }
