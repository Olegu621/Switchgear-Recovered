            package p000;

            import android.view.Choreographer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class cy1 {
                /* JADX INFO: renamed from: a */
                public static void m2897a(final Runnable runnable) {
/* 10 */            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: by1
                        @Override // android.view.Choreographer.FrameCallback
                        public final void doFrame(long j) {
/* 3 */                     runnable.run();
                        }
                    });
                }
            }
