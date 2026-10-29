            package p000;

            import com.supercell.titan.VirtualKeyboardHandler;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ap2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2053a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f2054b;

                public ap2(int i, int i2) {
/* 4 */             this.f2053a = i;
/* 6 */             this.f2054b = i2;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 5 */             VirtualKeyboardHandler.inputSelectionChanged(this.f2053a, this.f2054b);
                }
            }
