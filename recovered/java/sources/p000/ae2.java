            package p000;

            import androidx.window.sidecar.SidecarDisplayFeature;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ae2 extends b51 implements Function1 {

                /* JADX INFO: renamed from: a */
                public static final ae2 f203a = new ae2(1);

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
/* 1 */             sidecarDisplayFeature.getClass();
/* 8 */             boolean z = true;
/* 9 */             if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
/* 32 */                z = false;
                    }
/* 33 */            return Boolean.valueOf(z);
                }
            }
