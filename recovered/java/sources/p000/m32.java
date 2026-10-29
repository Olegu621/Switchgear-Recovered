            package p000;

            import android.os.Process;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class m32 extends Thread {

                /* JADX INFO: renamed from: a */
                public final int f13556a;

                public m32(Runnable runnable) {
/* 3 */             super(runnable, "fonts-androidx");
/* 8 */             this.f13556a = 10;
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
/* 3 */             Process.setThreadPriority(this.f13556a);
/* 6 */             super.run();
                }
            }
