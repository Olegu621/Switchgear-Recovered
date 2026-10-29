            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import com.supercell.titan.ThermalMonitor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class un2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17604a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ThermalMonitor f17605b;

                public /* synthetic */ un2(ThermalMonitor thermalMonitor, int i) {
/* 1 */             this.f17604a = i;
/* 3 */             this.f17605b = thermalMonitor;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f17604a;
/* 3 */             ThermalMonitor thermalMonitor = this.f17605b;
                    switch (i) {
                        case 0:
/* 18 */                    thermalMonitor.f5925a = System.nanoTime();
/* 28 */                    thermalMonitor.f5926b = thermalMonitor.f5934j.getThermalHeadroom(thermalMonitor.f5927c);
/* 45 */                    new Handler(Looper.getMainLooper()).post(new un2(thermalMonitor, 1));
                            break;
                        default:
/* 10 */                    thermalMonitor.updatePrediction(thermalMonitor.f5926b);
                            break;
                    }
                }
            }
