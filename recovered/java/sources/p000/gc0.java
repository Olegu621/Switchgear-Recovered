            package p000;

            import android.graphics.RectF;
            import android.graphics.drawable.Drawable;
            import android.view.View;
            import com.google.android.material.tabs.TabLayout;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gc0 extends q62 {

                /* JADX INFO: renamed from: d0 */
                public final /* synthetic */ int f8536d0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ gc0(int i) {
/* 4 */             super(4);
/* 1 */             this.f8536d0 = i;
                }

                @Override // p000.q62
                /* JADX INFO: renamed from: f */
                public final void mo3909f(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
                    float fSin;
                    float fCos;
                    switch (this.f8536d0) {
                        case 0:
/* 61 */                    RectF rectFM7731b = q62.m7731b(tabLayout, view);
/* 65 */                    RectF rectFM7731b2 = q62.m7731b(tabLayout, view2);
/* 84 */                    if (rectFM7731b.left < rectFM7731b2.left) {
/* 88 */                        double d = (((double) f) * 3.141592653589793d) / 2.0d;
/* 94 */                        fSin = (float) (1.0d - Math.cos(d));
/* 99 */                        fCos = (float) Math.sin(d);
                            } else {
/* 103 */                       double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
/* 108 */                       fSin = (float) Math.sin(d2);
/* 114 */                       fCos = (float) (1.0d - Math.cos(d2));
                            }
/* 147 */                   drawable.setBounds(AbstractC2246u8.m8972c((int) rectFM7731b.left, fSin, (int) rectFM7731b2.left), drawable.getBounds().top, AbstractC2246u8.m8972c((int) rectFM7731b.right, fCos, (int) rectFM7731b2.right), drawable.getBounds().bottom);
                            break;
                        default:
/* 10 */                    if (f >= 0.5f) {
/* 13 */                        view = view2;
                            }
/* 14 */                    RectF rectFM7731b3 = q62.m7731b(tabLayout, view);
/* 28 */                    float fM8971b = f < 0.5f ? AbstractC2246u8.m8971b(1.0f, 0.0f, 0.0f, 0.5f, f) : AbstractC2246u8.m8971b(0.0f, 1.0f, 0.5f, 1.0f, f);
/* 50 */                    drawable.setBounds((int) rectFM7731b3.left, drawable.getBounds().top, (int) rectFM7731b3.right, drawable.getBounds().bottom);
/* 57 */                    drawable.setAlpha((int) (fM8971b * 255.0f));
                            break;
                    }
                }
            }
