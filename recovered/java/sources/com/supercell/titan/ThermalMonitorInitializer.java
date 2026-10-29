            package com.supercell.titan;

            import android.content.Context;
            import java.util.Collections;
            import java.util.List;
            import p000.wx0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ThermalMonitorInitializer implements wx0 {
                @Override // p000.wx0
                public ThermalMonitor create(Context context) {
/* 1 */             ThermalMonitor thermalMonitor = ThermalMonitor.getInstance();
/* 5 */             thermalMonitor.init(context);
/* 8 */             return thermalMonitor;
                }

                @Override // p000.wx0
                public List<Class<? extends wx0>> dependencies() {
/* 1 */             return Collections.EMPTY_LIST;
                }
            }
