            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorListenerAdapter;
            import android.graphics.Matrix;
            import android.view.View;
            import androidx.transition.ChangeTransform;
            import androidx.transition.R$id;
            import java.util.WeakHashMap;
            
            /* JADX INFO: renamed from: ts */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2229ts extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public boolean f17240a;

                /* JADX INFO: renamed from: b */
                public final Matrix f17241b = new Matrix();

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f17242c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Matrix f17243d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ View f17244e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ C2342ws f17245f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ C2305vs f17246g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ ChangeTransform f17247h;

                public C2229ts(ChangeTransform changeTransform, boolean z, Matrix matrix, View view, C2342ws c2342ws, C2305vs c2305vs) {
/* 1 */             this.f17247h = changeTransform;
/* 3 */             this.f17242c = z;
/* 5 */             this.f17243d = matrix;
/* 7 */             this.f17244e = view;
/* 9 */             this.f17245f = c2342ws;
/* 11 */            this.f17246g = c2305vs;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
/* 2 */             this.f17240a = true;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
/* 1 */             boolean z = this.f17240a;
/* 3 */             C2342ws c2342ws = this.f17245f;
/* 6 */             View view = this.f17244e;
/* 8 */             if (!z) {
/* 12 */                if (this.f17242c && this.f17247h.f1866j0) {
/* 20 */                    Matrix matrix = this.f17241b;
/* 24 */                    matrix.set(this.f17243d);
/* 29 */                    view.setTag(R$id.transition_transform, matrix);
/* 32 */                    float f = c2342ws.f18788a;
/* 34 */                    float f2 = c2342ws.f18789b;
/* 36 */                    float f3 = c2342ws.f18790c;
/* 38 */                    float f4 = c2342ws.f18791d;
/* 40 */                    float f5 = c2342ws.f18792e;
/* 42 */                    float f6 = c2342ws.f18793f;
/* 44 */                    float f7 = c2342ws.f18794g;
/* 46 */                    float f8 = c2342ws.f18795h;
/* 48 */                    String[] strArr = ChangeTransform.f1862m0;
/* 50 */                    view.setTranslationX(f);
/* 53 */                    view.setTranslationY(f2);
/* 56 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 58 */                    s23.m8385w(view, f3);
/* 61 */                    view.setScaleX(f4);
/* 64 */                    view.setScaleY(f5);
/* 67 */                    view.setRotationX(f6);
/* 70 */                    view.setRotationY(f7);
/* 73 */                    view.setRotation(f8);
                        } else {
/* 79 */                    view.setTag(R$id.transition_transform, null);
/* 84 */                    view.setTag(R$id.parent_matrix, null);
                        }
                    }
/* 89 */            l53.f13119a.mo6890P(view, null);
/* 92 */            float f9 = c2342ws.f18788a;
/* 94 */            float f10 = c2342ws.f18789b;
/* 96 */            float f11 = c2342ws.f18790c;
/* 98 */            float f12 = c2342ws.f18791d;
/* 100 */           float f13 = c2342ws.f18792e;
/* 102 */           float f14 = c2342ws.f18793f;
/* 104 */           float f15 = c2342ws.f18794g;
/* 106 */           float f16 = c2342ws.f18795h;
/* 108 */           String[] strArr2 = ChangeTransform.f1862m0;
/* 110 */           view.setTranslationX(f9);
/* 113 */           view.setTranslationY(f10);
/* 116 */           WeakHashMap weakHashMap2 = e33.f7494a;
/* 118 */           s23.m8385w(view, f11);
/* 121 */           view.setScaleX(f12);
/* 124 */           view.setScaleY(f13);
/* 127 */           view.setRotationX(f14);
/* 130 */           view.setRotationY(f15);
/* 133 */           view.setRotation(f16);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
                public final void onAnimationPause(Animator animator) {
/* 3 */             Matrix matrix = this.f17246g.f18332a;
/* 5 */             Matrix matrix2 = this.f17241b;
/* 7 */             matrix2.set(matrix);
/* 10 */            int i = R$id.transition_transform;
/* 12 */            View view = this.f17244e;
/* 14 */            view.setTag(i, matrix2);
/* 17 */            C2342ws c2342ws = this.f17245f;
/* 19 */            float f = c2342ws.f18788a;
/* 21 */            float f2 = c2342ws.f18789b;
/* 23 */            float f3 = c2342ws.f18790c;
/* 25 */            float f4 = c2342ws.f18791d;
/* 27 */            float f5 = c2342ws.f18792e;
/* 29 */            float f6 = c2342ws.f18793f;
/* 31 */            float f7 = c2342ws.f18794g;
/* 33 */            float f8 = c2342ws.f18795h;
/* 35 */            String[] strArr = ChangeTransform.f1862m0;
/* 37 */            view.setTranslationX(f);
/* 40 */            view.setTranslationY(f2);
/* 43 */            WeakHashMap weakHashMap = e33.f7494a;
/* 45 */            s23.m8385w(view, f3);
/* 48 */            view.setScaleX(f4);
/* 51 */            view.setScaleY(f5);
/* 54 */            view.setRotationX(f6);
/* 57 */            view.setRotationY(f7);
/* 60 */            view.setRotation(f8);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
                public final void onAnimationResume(Animator animator) {
/* 1 */             String[] strArr = ChangeTransform.f1862m0;
/* 3 */             View view = this.f17244e;
/* 6 */             view.setTranslationX(0.0f);
/* 9 */             view.setTranslationY(0.0f);
/* 12 */            WeakHashMap weakHashMap = e33.f7494a;
/* 14 */            s23.m8385w(view, 0.0f);
/* 19 */            view.setScaleX(1.0f);
/* 22 */            view.setScaleY(1.0f);
/* 25 */            view.setRotationX(0.0f);
/* 28 */            view.setRotationY(0.0f);
/* 31 */            view.setRotation(0.0f);
                }
            }
