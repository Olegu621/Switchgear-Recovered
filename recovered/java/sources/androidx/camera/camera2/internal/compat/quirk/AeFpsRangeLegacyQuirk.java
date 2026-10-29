            package androidx.camera.camera2.internal.compat.quirk;

            import android.hardware.camera2.CameraCharacteristics;
            import android.util.Range;
            import p000.C0962gp;
            import p000.h02;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AeFpsRangeLegacyQuirk implements h02 {

                /* JADX INFO: renamed from: a */
                public final Range f779a;

                public AeFpsRangeLegacyQuirk(C0962gp c0962gp) {
/* 10 */            Range[] rangeArr = (Range[]) c0962gp.m3981a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
/* 12 */            Range range = null;
/* 13 */            if (rangeArr != null && rangeArr.length != 0) {
/* 22 */                for (Range range2 : rangeArr) {
/* 105 */                   Range range3 = new Range(Integer.valueOf(((Integer) range2.getLower()).intValue() >= 1000 ? ((Integer) range2.getLower()).intValue() / 1000 : ((Integer) range2.getLower()).intValue()), Integer.valueOf(((Integer) range2.getUpper()).intValue() >= 1000 ? ((Integer) range2.getUpper()).intValue() / 1000 : ((Integer) range2.getUpper()).intValue()));
/* 120 */                   if (((Integer) range3.getUpper()).intValue() == 30 && (range == null || ((Integer) range3.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
/* 148 */                       range = range3;
                            }
                        }
                    }
/* 153 */           this.f779a = range;
                }
            }
