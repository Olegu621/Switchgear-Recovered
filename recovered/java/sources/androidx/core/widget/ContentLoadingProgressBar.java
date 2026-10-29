            package androidx.core.widget;

            import android.content.Context;
            import android.util.AttributeSet;
            import android.widget.ProgressBar;
            import androidx.core.widget.ContentLoadingProgressBar;
            import p000.m00;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ContentLoadingProgressBar extends ProgressBar {

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ int f1256c = 0;

                /* JADX INFO: renamed from: a */
                public final m00 f1257a;

                /* JADX INFO: renamed from: b */
                public final m00 f1258b;

                /* JADX WARN: Type inference failed for: r2v1, types: [m00] */
                /* JADX WARN: Type inference failed for: r2v2, types: [m00] */
                public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
/* 2 */             super(context, attributeSet, 0);
/* 7 */             final int i = 0;
/* 11 */            this.f1257a = new Runnable(this) { // from class: m00

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ ContentLoadingProgressBar f13542b;

                        {
/* 3 */                     this.f13542b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
/* 1 */                     int i2 = i;
/* 3 */                     ContentLoadingProgressBar contentLoadingProgressBar = this.f13542b;
                            switch (i2) {
                                case 0:
/* 18 */                            int i3 = ContentLoadingProgressBar.f1256c;
/* 22 */                            contentLoadingProgressBar.setVisibility(8);
                                    break;
                                default:
/* 8 */                             int i4 = ContentLoadingProgressBar.f1256c;
/* 10 */                            System.currentTimeMillis();
/* 14 */                            contentLoadingProgressBar.setVisibility(0);
                                    break;
                            }
                        }
                    };
/* 15 */            final int i2 = 1;
/* 19 */            this.f1258b = new Runnable(this) { // from class: m00

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ ContentLoadingProgressBar f13542b;

                        {
/* 3 */                     this.f13542b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
/* 1 */                     int i3 = i2;
/* 3 */                     ContentLoadingProgressBar contentLoadingProgressBar = this.f13542b;
                            switch (i3) {
                                case 0:
/* 18 */                            int i4 = ContentLoadingProgressBar.f1256c;
/* 22 */                            contentLoadingProgressBar.setVisibility(8);
                                    break;
                                default:
/* 8 */                             int i5 = ContentLoadingProgressBar.f1256c;
/* 10 */                            System.currentTimeMillis();
/* 14 */                            contentLoadingProgressBar.setVisibility(0);
                                    break;
                            }
                        }
                    };
                }

                @Override // android.widget.ProgressBar, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 6 */             removeCallbacks(this.f1257a);
/* 11 */            removeCallbacks(this.f1258b);
                }

                @Override // android.widget.ProgressBar, android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
/* 6 */             removeCallbacks(this.f1257a);
/* 11 */            removeCallbacks(this.f1258b);
                }
            }
