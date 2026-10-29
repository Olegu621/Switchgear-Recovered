            package p000;

            import android.content.Context;
            import android.graphics.Rect;
            import android.util.TypedValue;
            import android.view.TouchDelegate;
            import android.view.View;
            import com.usercentrics.sdk.p008ui.components.cards.UCCard;
            
            /* JADX INFO: renamed from: i1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC1012i1 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9387a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ View f9388b;

                public /* synthetic */ RunnableC1012i1(View view, int i) {
/* 1 */             this.f9387a = i;
/* 3 */             this.f9388b = view;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f9387a;
/* 3 */             View view = this.f9388b;
                    switch (i) {
                        case 0:
/* 14 */                    view.getClass();
/* 19 */                    Rect rect = new Rect();
/* 22 */                    view.getHitRect(rect);
/* 25 */                    Context context = view.getContext();
/* 29 */                    context.getClass();
/* 43 */                    float fApplyDimension = TypedValue.applyDimension(1, 48.0f, context.getResources().getDisplayMetrics());
/* 47 */                    int i2 = rect.bottom;
/* 49 */                    int i3 = rect.top;
/* 51 */                    float f = i2 - i3;
/* 58 */                    if (fApplyDimension > f) {
/* 64 */                        int i4 = ((int) ((fApplyDimension - f) / 2.0f)) + 1;
/* 66 */                        rect.top = i3 - i4;
/* 69 */                        rect.bottom = i2 + i4;
                            }
/* 71 */                    int i5 = rect.right;
/* 73 */                    int i6 = rect.left;
/* 75 */                    float f2 = i5 - i6;
/* 80 */                    if (fApplyDimension > f2) {
/* 85 */                        int i7 = ((int) ((fApplyDimension - f2) / 2.0f)) + 1;
/* 87 */                        rect.left = i6 - i7;
/* 90 */                        rect.right = i5 + i7;
                            }
/* 92 */                    Object parent = view.getParent();
/* 103 */                   View view2 = parent instanceof View ? (View) parent : null;
/* 104 */                   if (view2 != null) {
/* 111 */                       view2.setTouchDelegate(new TouchDelegate(rect, view));
                            }
                            break;
                        default:
/* 8 */                     int i8 = UCCard.f6254e0;
/* 10 */                    xe2.m9765c(view);
                            break;
                    }
                }
            }
