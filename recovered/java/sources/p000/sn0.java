            package p000;

            import android.util.SparseIntArray;
            import android.view.FrameMetrics;
            import android.view.Window;
            import androidx.core.app.NotificationCompat;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sn0 implements Window.OnFrameMetricsAvailableListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ur3 f16714a;

                public sn0(ur3 ur3Var) {
/* 4 */             this.f16714a = ur3Var;
                }

                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
/* 1 */             ur3 ur3Var = this.f16714a;
/* 3 */             int i2 = ur3Var.f17703a;
/* 10 */            if ((i2 & 1) != 0) {
/* 22 */                ur3.m9132b(((SparseIntArray[]) ur3Var.f17704b)[0], frameMetrics.getMetric(8));
                    }
/* 27 */            if ((i2 & 2) != 0) {
/* 40 */                ur3.m9132b(((SparseIntArray[]) ur3Var.f17704b)[1], frameMetrics.getMetric(1));
                    }
/* 47 */            if ((i2 & 4) != 0) {
/* 59 */                ur3.m9132b(((SparseIntArray[]) ur3Var.f17704b)[2], frameMetrics.getMetric(3));
                    }
/* 65 */            if ((i2 & 8) != 0) {
/* 77 */                ur3.m9132b(((SparseIntArray[]) ur3Var.f17704b)[3], frameMetrics.getMetric(4));
                    }
/* 83 */            if ((i2 & 16) != 0) {
/* 95 */                ur3.m9132b(((SparseIntArray[]) ur3Var.f17704b)[4], frameMetrics.getMetric(5));
                    }
/* 102 */           if ((i2 & 64) != 0) {
/* 114 */               ur3.m9132b(((SparseIntArray[]) ur3Var.f17704b)[6], frameMetrics.getMetric(7));
                    }
/* 119 */           if ((i2 & 32) != 0) {
/* 131 */               ur3.m9132b(((SparseIntArray[]) ur3Var.f17704b)[5], frameMetrics.getMetric(6));
                    }
/* 136 */           if ((i2 & 128) != 0) {
/* 148 */               ur3.m9132b(((SparseIntArray[]) ur3Var.f17704b)[7], frameMetrics.getMetric(0));
                    }
/* 153 */           if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
/* 165 */               ur3.m9132b(((SparseIntArray[]) ur3Var.f17704b)[8], frameMetrics.getMetric(2));
                    }
                }
            }
