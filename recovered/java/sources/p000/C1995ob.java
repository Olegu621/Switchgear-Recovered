            package p000;

            import android.graphics.Typeface;
            import android.os.Build;
            import android.widget.TextView;
            import java.lang.ref.WeakReference;
            
            /* JADX INFO: renamed from: ob */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1995ob extends de3 {

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ int f14696h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ int f14697i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ WeakReference f14698j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ C2212tb f14699k;

                public C1995ob(C2212tb c2212tb, int i, int i2, WeakReference weakReference) {
/* 4 */             this.f14699k = c2212tb;
/* 6 */             this.f14696h = i;
/* 8 */             this.f14697i = i2;
/* 10 */            this.f14698j = weakReference;
                }

                @Override // p000.de3
                /* JADX INFO: renamed from: A */
                public final void mo1400A(int i) {
                }

                @Override // p000.de3
                /* JADX INFO: renamed from: B */
                public final void mo1401B(Typeface typeface) {
                    int i;
/* 5 */             if (Build.VERSION.SDK_INT >= 28 && (i = this.f14696h) != -1) {
/* 21 */                typeface = AbstractC2175sb.m8460a(typeface, i, (this.f14697i & 2) != 0);
                    }
/* 25 */            C2212tb c2212tb = this.f14699k;
/* 29 */            if (c2212tb.f17025m) {
/* 31 */                c2212tb.f17024l = typeface;
/* 39 */                TextView textView = (TextView) this.f14698j.get();
/* 41 */                if (textView != null) {
/* 43 */                    boolean zIsAttachedToWindow = textView.isAttachedToWindow();
/* 47 */                    int i2 = c2212tb.f17022j;
/* 49 */                    if (zIsAttachedToWindow) {
/* 56 */                        textView.post(new RunnableC2064pb(textView, typeface, i2));
                            } else {
/* 60 */                        textView.setTypeface(typeface, i2);
                            }
                        }
                    }
                }
            }
