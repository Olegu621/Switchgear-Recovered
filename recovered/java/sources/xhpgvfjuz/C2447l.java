            package xhpgvfjuz;

            import android.util.Log;
            import java.util.Iterator;
            import java.util.Timer;
            import java.util.TimerTask;
            
            /* JADX INFO: renamed from: xhpgvfjuz.l */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            class C2447l extends TimerTask {

                /* JADX INFO: renamed from: a */
                private static final String f19155a = "ShieldSDK";

                /* JADX INFO: renamed from: b */
                private static final int f19156b = 500;

                /* JADX INFO: renamed from: e */
                private static final Timer f19157e = new Timer("Pull Binding Cache Stats Logger");

                /* JADX INFO: renamed from: f */
                private static final int f19158f = 500;

                /* JADX INFO: renamed from: g */
                private static final int f19159g = 1500;

                /* JADX INFO: renamed from: c */
                private int f19160c = f19159g;

                /* JADX INFO: renamed from: d */
                private final InterfaceC2375G f19161d;

                /* JADX INFO: renamed from: h */
                private int f19162h;

                private C2447l(InterfaceC2375G interfaceC2375G) {
                    this.f19161d = interfaceC2375G;
                    this.f19162h = interfaceC2375G.mo9809c();
                }

                /* JADX INFO: renamed from: a */
                static void m9936a(InterfaceC2375G interfaceC2375G) {
                    f19157e.schedule(new C2447l(interfaceC2375G), 500L, 500L);
                }

                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (this.f19161d.mo9809c() == this.f19162h) {
                        int i = this.f19160c - 500;
                        this.f19160c = i;
                        if (i <= 0) {
                            cancel();
                            return;
                        }
                        return;
                    }
                    Log.d(f19155a, "Pull bindings " + this.f19161d.mo9805a());
                    Iterator it = this.f19161d.mo9808b().iterator();
                    while (it.hasNext()) {
                        Log.v(f19155a, "Pull bindings " + ((String) it.next()));
                    }
                    this.f19162h = this.f19161d.mo9809c();
                    this.f19160c = f19159g;
                }
            }
