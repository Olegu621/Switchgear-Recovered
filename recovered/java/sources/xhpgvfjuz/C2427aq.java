            package xhpgvfjuz;

            import android.hardware.display.DisplayManager;
            
            /* JADX INFO: renamed from: xhpgvfjuz.aq */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class C2427aq implements DisplayManager.DisplayListener {
                /* JADX INFO: renamed from: a */
                public static native void m9902a(int i);

                /* JADX INFO: renamed from: b */
                public static native void m9903b(int i);

                /* JADX INFO: renamed from: c */
                public static native void m9904c(int i);

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayAdded(int i) {
                    m9904c(i);
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayChanged(int i) {
                    m9903b(i);
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayRemoved(int i) {
                    m9902a(i);
                }
            }
