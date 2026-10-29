            package com.supercell.titan;

            import android.content.Context;
            import p000.tn2;
            
            /* JADX INFO: renamed from: com.supercell.titan.l */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0805l implements BackgroundObserver.Listener {

                /* JADX INFO: renamed from: a */
                public boolean f6012a = false;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ tn2 f6013b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ThermalMonitor f6014c;

                public C0805l(ThermalMonitor thermalMonitor, tn2 tn2Var) {
/* 4 */             this.f6014c = thermalMonitor;
/* 6 */             this.f6013b = tn2Var;
                }

                @Override // com.supercell.titan.BackgroundObserver.Listener
                public final void onBackground(Context context) {
/* 3 */             if (this.f6012a) {
/* 1 */                 this.f6014c.f5934j.removeThermalStatusListener(this.f6013b);
/* 15 */                this.f6012a = false;
                    }
                }

                @Override // com.supercell.titan.BackgroundObserver.Listener
                public final void onForeground(Context context) {
/* 1 */             System.nanoTime();
/* 4 */             int currentThermalStatus = ThermalMonitor.getCurrentThermalStatus(context);
/* 8 */             ThermalMonitor thermalMonitor = this.f6014c;
/* 10 */            thermalMonitor.f5931g = currentThermalStatus;
/* 12 */            thermalMonitor.f5930f = currentThermalStatus;
/* 16 */            if (this.f6012a) {
/* 28 */                return;
                    }
/* 1 */             thermalMonitor.f5934j.addThermalStatusListener(this.f6013b);
/* 26 */            this.f6012a = true;
                }
            }
