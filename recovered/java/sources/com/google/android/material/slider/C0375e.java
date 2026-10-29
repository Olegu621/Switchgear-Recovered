            package com.google.android.material.slider;

            import android.graphics.Rect;
            import android.os.Bundle;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.widget.SeekBar;
            import com.google.android.material.R$string;
            import java.util.ArrayList;
            import java.util.List;
            import okhttp3.HttpUrl;
            import okio.Segment;
            import p000.C0901f1;
            import p000.C2518z0;
            import p000.sf0;
            
            /* JADX INFO: renamed from: com.google.android.material.slider.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0375e extends sf0 {

                /* JADX INFO: renamed from: q */
                public final BaseSlider f4935q;

                /* JADX INFO: renamed from: r */
                public final Rect f4936r;

                public C0375e(BaseSlider baseSlider) {
/* 1 */             super(baseSlider);
/* 9 */             this.f4936r = new Rect();
/* 11 */            this.f4935q = baseSlider;
                }

                @Override // p000.sf0
                /* JADX INFO: renamed from: n */
                public final int mo2375n(float f, float f2) {
/* 1 */             int i = 0;
                    while (true) {
/* 2 */                 BaseSlider baseSlider = this.f4935q;
/* 12 */                if (i >= baseSlider.getValues().size()) {
/* 31 */                    return -1;
                        }
/* 14 */                Rect rect = this.f4936r;
/* 16 */                baseSlider.m2372v(i, rect);
/* 25 */                if (rect.contains((int) f, (int) f2)) {
/* 27 */                    return i;
                        }
/* 28 */                i++;
                    }
                }

                @Override // p000.sf0
                /* JADX INFO: renamed from: o */
                public final void mo2376o(ArrayList arrayList) {
/* 12 */            for (int i = 0; i < this.f4935q.getValues().size(); i++) {
/* 18 */                arrayList.add(Integer.valueOf(i));
                    }
                }

                @Override // p000.sf0
                /* JADX INFO: renamed from: s */
                public final boolean mo2377s(int i, int i2, Bundle bundle) {
/* 1 */             BaseSlider baseSlider = this.f4935q;
/* 7 */             if (!baseSlider.isEnabled()) {
/* 152 */               return false;
                    }
/* 16 */            if (i2 != 4096 && i2 != 8192) {
/* 23 */                if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
/* 152 */                   return false;
                        }
/* 39 */                float f = bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
/* 43 */                int i3 = BaseSlider.f4867N0;
/* 49 */                if (!baseSlider.m2370t(f, i)) {
/* 152 */                   return false;
                        }
/* 51 */                baseSlider.m2373w();
/* 54 */                baseSlider.postInvalidate();
/* 57 */                m8495p(i);
/* 13 */                return true;
                    }
/* 61 */            int i4 = BaseSlider.f4867N0;
/* 63 */            float fRound = baseSlider.f4916x0;
/* 68 */            if (fRound == 0.0f) {
/* 70 */                fRound = 1.0f;
                    }
/* 77 */            float f2 = (baseSlider.f4910t0 - baseSlider.f4909s0) / fRound;
/* 82 */            if (f2 > 20.0f) {
/* 91 */                fRound *= Math.round(f2 / 20.0f);
                    }
/* 92 */            if (i2 == 8192) {
/* 94 */                fRound = -fRound;
                    }
/* 99 */            if (baseSlider.m2361k()) {
/* 101 */               fRound = -fRound;
                    }
/* 116 */           float fFloatValue = baseSlider.getValues().get(i).floatValue() + fRound;
/* 117 */           float valueFrom = baseSlider.getValueFrom();
/* 121 */           float valueTo = baseSlider.getValueTo();
/* 127 */           if (fFloatValue < valueFrom) {
/* 129 */               fFloatValue = valueFrom;
                    } else if (fFloatValue > valueTo) {
/* 135 */               fFloatValue = valueTo;
                    }
/* 140 */           if (!baseSlider.m2370t(fFloatValue, i)) {
/* 152 */               return false;
                    }
/* 142 */           baseSlider.m2373w();
/* 145 */           baseSlider.postInvalidate();
/* 148 */           m8495p(i);
/* 13 */            return true;
                }

                @Override // p000.sf0
                /* JADX INFO: renamed from: u */
                public final void mo2378u(int i, C0901f1 c0901f1) {
                    String string;
/* 1 */             AccessibilityNodeInfo accessibilityNodeInfo = c0901f1.f7961a;
/* 5 */             c0901f1.m3622b(C2518z0.f19882o);
/* 8 */             BaseSlider baseSlider = this.f4935q;
/* 10 */            List<Float> values = baseSlider.getValues();
/* 20 */            float fFloatValue = values.get(i).floatValue();
/* 24 */            float valueFrom = baseSlider.getValueFrom();
/* 28 */            float valueTo = baseSlider.getValueTo();
/* 36 */            if (baseSlider.isEnabled()) {
/* 40 */                if (fFloatValue > valueFrom) {
/* 44 */                    c0901f1.m3621a(Segment.SIZE);
                        }
/* 49 */                if (fFloatValue < valueTo) {
/* 53 */                    c0901f1.m3621a(4096);
                        }
                    }
/* 61 */            accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue));
/* 70 */            c0901f1.m3628i(SeekBar.class.getName());
/* 75 */            StringBuilder sb = new StringBuilder();
/* 82 */            if (baseSlider.getContentDescription() != null) {
/* 88 */                sb.append(baseSlider.getContentDescription());
/* 93 */                sb.append(",");
                    }
/* 100 */           if (values.size() > 1) {
/* 111 */               if (i == baseSlider.getValues().size() - 1) {
/* 119 */                   string = baseSlider.getContext().getString(R$string.material_slider_range_end);
                        } else {
/* 137 */                   string = i == 0 ? baseSlider.getContext().getString(R$string.material_slider_range_start) : HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 139 */               sb.append(string);
/* 146 */               sb.append(baseSlider.m2356f(fFloatValue));
                    }
/* 153 */           accessibilityNodeInfo.setContentDescription(sb.toString());
/* 156 */           Rect rect = this.f4936r;
/* 158 */           baseSlider.m2372v(i, rect);
/* 161 */           accessibilityNodeInfo.setBoundsInParent(rect);
                }
            }
