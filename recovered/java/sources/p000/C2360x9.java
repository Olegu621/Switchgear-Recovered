            package p000;

            import android.animation.ValueAnimator;
            import android.graphics.drawable.Drawable;
            import com.google.android.material.appbar.AppBarLayout;
            import java.util.Iterator;
            
            /* JADX INFO: renamed from: x9 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2360x9 implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18992a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f18993b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f18994c;

                public /* synthetic */ C2360x9(int i, Object obj, Object obj2) {
/* 1 */             this.f18992a = i;
/* 3 */             this.f18994c = obj;
/* 5 */             this.f18993b = obj2;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
/* 1 */             int i = this.f18992a;
/* 3 */             Object obj = this.f18993b;
/* 5 */             Object obj2 = this.f18994c;
                    switch (i) {
                        case 0:
/* 41 */                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
/* 47 */                    ((fd1) obj).m3741m(fFloatValue);
/* 50 */                    AppBarLayout appBarLayout = (AppBarLayout) obj2;
/* 52 */                    Drawable drawable = appBarLayout.f4333f0;
/* 56 */                    if (drawable instanceof fd1) {
/* 60 */                        ((fd1) drawable).m3741m(fFloatValue);
                            }
/* 65 */                    Iterator it = appBarLayout.f4329d0.iterator();
/* 73 */                    if (it.hasNext()) {
/* 80 */                        throw fm0.m3780f(it);
                            }
/* 75 */                    return;
                        default:
/* 16 */                    float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
/* 20 */                    C2231tu c2231tu = (C2231tu) obj2;
/* 22 */                    C2194su c2194su = (C2194su) obj;
/* 24 */                    C2231tu.m8913d(fFloatValue2, c2194su);
/* 28 */                    c2231tu.m8914a(fFloatValue2, c2194su, false);
/* 31 */                    c2231tu.invalidateSelf();
/* 34 */                    return;
                    }
                }
            }
