            package androidx.fragment.app;

            import android.R;
            import android.animation.Animator;
            import android.animation.AnimatorInflater;
            import android.content.Context;
            import android.content.res.Resources;
            import android.view.ViewGroup;
            import android.view.animation.Animation;
            import android.view.animation.AnimationUtils;
            import androidx.fragment.R$animator;
            import androidx.fragment.R$id;
            import p000.mn0;
            import p000.wc0;
            
            /* JADX INFO: renamed from: androidx.fragment.app.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0092d extends AbstractC0094f {

                /* JADX INFO: renamed from: b */
                public final boolean f1420b;

                /* JADX INFO: renamed from: c */
                public boolean f1421c;

                /* JADX INFO: renamed from: d */
                public wc0 f1422d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0092d(C0091c0 c0091c0, boolean z) {
/* 4 */             super(c0091c0);
/* 1 */             c0091c0.getClass();
/* 7 */             this.f1420b = z;
                }

                /* JADX WARN: Code duplicated, block: B:74:0x00f4 A[Catch: RuntimeException -> 0x00fa, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00fa, blocks: (B:72:0x00ee, B:74:0x00f4), top: B:85:0x00ee }] */
                /* JADX INFO: renamed from: b */
                public final wc0 m647b(Context context) {
                    int enterAnim;
                    wc0 wc0Var;
                    Animator animatorLoadAnimator;
                    int iM6677A;
/* 1 */             context.getClass();
/* 6 */             if (this.f1421c) {
/* 8 */                 return this.f1422d;
                    }
/* 11 */            C0091c0 c0091c0 = this.f1425a;
/* 13 */            Fragment fragment = c0091c0.f1410c;
/* 24 */            boolean z = c0091c0.f1408a == 2;
/* 25 */            int nextTransition = fragment.getNextTransition();
/* 31 */            if (this.f1420b) {
/* 40 */                enterAnim = z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
                    } else {
/* 52 */                enterAnim = z ? fragment.getEnterAnim() : fragment.getExitAnim();
                    }
/* 56 */            fragment.setAnimations(0, 0, 0, 0);
/* 59 */            ViewGroup viewGroup = fragment.mContainer;
/* 61 */            wc0 wc0Var2 = null;
/* 62 */            if (viewGroup != null && viewGroup.getTag(R$id.visible_removing_fragment_view_tag) != null) {
/* 76 */                fragment.mContainer.setTag(R$id.visible_removing_fragment_view_tag, null);
                    }
/* 79 */            ViewGroup viewGroup2 = fragment.mContainer;
/* 81 */            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
/* 91 */                Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z, enterAnim);
/* 95 */                int i = 8;
/* 97 */                if (animationOnCreateAnimation != null) {
/* 101 */                   wc0Var2 = new wc0(animationOnCreateAnimation, i);
                        } else {
/* 106 */                   Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z, enterAnim);
/* 110 */                   if (animatorOnCreateAnimator != null) {
/* 114 */                       wc0Var2 = new wc0(animatorOnCreateAnimator);
                            } else {
/* 119 */                       if (enterAnim == 0 && nextTransition != 0) {
/* 125 */                           if (nextTransition == 4097) {
/* 203 */                               iM6677A = z ? R$animator.fragment_open_enter : R$animator.fragment_open_exit;
                                    } else if (nextTransition == 8194) {
/* 195 */                               iM6677A = z ? R$animator.fragment_close_enter : R$animator.fragment_close_exit;
                                    } else if (nextTransition == 8197) {
/* 185 */                               iM6677A = z ? mn0.m6677A(context, R.attr.activityCloseEnterAnimation) : mn0.m6677A(context, R.attr.activityCloseExitAnimation);
                                    } else if (nextTransition == 4099) {
/* 169 */                               iM6677A = z ? R$animator.fragment_fade_enter : R$animator.fragment_fade_exit;
                                    } else if (nextTransition != 4100) {
/* 143 */                               iM6677A = -1;
                                    } else {
/* 159 */                               iM6677A = z ? mn0.m6677A(context, R.attr.activityOpenEnterAnimation) : mn0.m6677A(context, R.attr.activityOpenExitAnimation);
                                    }
/* 144 */                           enterAnim = iM6677A;
                                }
/* 206 */                       if (enterAnim != 0) {
/* 218 */                           boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
/* 222 */                           if (zEquals) {
                                        try {
/* 224 */                                   Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
/* 228 */                                   if (animationLoadAnimation != null) {
/* 232 */                                       wc0Var = new wc0(animationLoadAnimation, i);
/* 235 */                                       wc0Var2 = wc0Var;
                                            }
                                        } catch (Resources.NotFoundException e) {
/* 238 */                                   throw e;
                                        } catch (RuntimeException unused) {
                                            try {
/* 239 */                                       animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
/* 243 */                                       if (animatorLoadAnimator != null) {
/* 247 */                                           wc0Var = new wc0(animatorLoadAnimator);
/* 235 */                                           wc0Var2 = wc0Var;
                                                }
                                            } catch (RuntimeException e2) {
/* 252 */                                       if (zEquals) {
/* 266 */                                           throw e2;
                                                }
/* 254 */                                       Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
/* 258 */                                       if (animationLoadAnimation2 != null) {
/* 262 */                                           wc0Var2 = new wc0(animationLoadAnimation2, i);
                                                }
                                            }
                                        }
                                    } else {
/* 239 */                               animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
/* 243 */                               if (animatorLoadAnimator != null) {
/* 247 */                                   wc0Var = new wc0(animatorLoadAnimator);
/* 235 */                                   wc0Var2 = wc0Var;
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 267 */           this.f1422d = wc0Var2;
/* 269 */           this.f1421c = true;
/* 271 */           return wc0Var2;
                }
            }
