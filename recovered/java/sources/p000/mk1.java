            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorInflater;
            import android.animation.AnimatorSet;
            import android.animation.ObjectAnimator;
            import android.animation.PropertyValuesHolder;
            import android.animation.TimeInterpolator;
            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.Property;
            import android.view.animation.AccelerateDecelerateInterpolator;
            import android.view.animation.AccelerateInterpolator;
            import android.view.animation.DecelerateInterpolator;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mk1 {

                /* JADX INFO: renamed from: a */
                public final le2 f13836a = new le2();

                /* JADX INFO: renamed from: b */
                public final le2 f13837b = new le2();

                /* JADX INFO: renamed from: a */
                public static mk1 m6667a(Context context, TypedArray typedArray, int i) {
                    int resourceId;
/* 5 */             if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
/* 19 */                return null;
                    }
/* 14 */            return m6668b(context, resourceId);
                }

                /* JADX INFO: renamed from: b */
                public static mk1 m6668b(Context context, int i) {
                    try {
/* 2 */                 Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
/* 8 */                 if (animatorLoadAnimator instanceof AnimatorSet) {
/* 16 */                    return m6669c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
                        }
/* 23 */                if (animatorLoadAnimator == null) {
/* 1 */                     return null;
                        }
/* 27 */                ArrayList arrayList = new ArrayList();
/* 30 */                arrayList.add(animatorLoadAnimator);
/* 33 */                return m6669c(arrayList);
                    } catch (Exception e) {
/* 59 */                AbstractC1245n0.m4891s("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
/* 1 */                 return null;
                    }
                }

                /* JADX INFO: renamed from: c */
                public static mk1 m6669c(ArrayList arrayList) {
/* 3 */             mk1 mk1Var = new mk1();
/* 6 */             int size = arrayList.size();
/* 12 */            for (int i = 0; i < size; i++) {
/* 18 */                Animator animator = (Animator) arrayList.get(i);
/* 22 */                if (!(animator instanceof ObjectAnimator)) {
/* 114 */                   s80.m8430k(animator, "Animator must be an ObjectAnimator: ");
/* 117 */                   return null;
                        }
/* 24 */                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
/* 34 */                mk1Var.m6674h(objectAnimator.getPropertyName(), objectAnimator.getValues());
/* 37 */                String propertyName = objectAnimator.getPropertyName();
/* 43 */                long startDelay = objectAnimator.getStartDelay();
/* 47 */                long duration = objectAnimator.getDuration();
/* 51 */                TimeInterpolator interpolator = objectAnimator.getInterpolator();
/* 57 */                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
/* 76 */                    interpolator = AbstractC2246u8.f17411b;
                        } else if (interpolator instanceof AccelerateInterpolator) {
/* 66 */                    interpolator = AbstractC2246u8.f17412c;
                        } else if (interpolator instanceof DecelerateInterpolator) {
/* 73 */                    interpolator = AbstractC2246u8.f17413d;
                        }
/* 78 */                nk1 nk1Var = new nk1();
/* 81 */                nk1Var.f14335d = 0;
/* 84 */                nk1Var.f14336e = 1;
/* 86 */                nk1Var.f14332a = startDelay;
/* 88 */                nk1Var.f14333b = duration;
/* 90 */                nk1Var.f14334c = interpolator;
/* 96 */                nk1Var.f14335d = objectAnimator.getRepeatCount();
/* 102 */               nk1Var.f14336e = objectAnimator.getRepeatMode();
/* 106 */               mk1Var.f13836a.put(propertyName, nk1Var);
                    }
/* 119 */           return mk1Var;
                }

                /* JADX INFO: renamed from: d */
                public final ObjectAnimator m6670d(String str, Object obj, Property property) {
/* 5 */             ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, m6671e(str));
/* 9 */             objectAnimatorOfPropertyValuesHolder.setProperty(property);
/* 16 */            m6672f(str).m6995a(objectAnimatorOfPropertyValuesHolder);
/* 19 */            return objectAnimatorOfPropertyValuesHolder;
                }

                /* JADX INFO: renamed from: e */
                public final PropertyValuesHolder[] m6671e(String str) {
/* 6 */             if (!m6673g(str)) {
/* 35 */                f42.m3649e();
/* 5 */                 return null;
                    }
/* 14 */            PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) this.f13837b.getOrDefault(str, null);
/* 17 */            PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
/* 21 */            for (int i = 0; i < propertyValuesHolderArr.length; i++) {
/* 29 */                propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
                    }
/* 34 */            return propertyValuesHolderArr2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof mk1) {
/* 17 */                return this.f13836a.equals(((mk1) obj).f13836a);
                    }
/* 9 */             return false;
                }

                /* JADX INFO: renamed from: f */
                public final nk1 m6672f(String str) {
/* 1 */             le2 le2Var = this.f13836a;
/* 8 */             if (le2Var.getOrDefault(str, null) != null) {
/* 14 */                return (nk1) le2Var.getOrDefault(str, null);
                    }
/* 17 */            f42.m3649e();
/* 3 */             return null;
                }

                /* JADX INFO: renamed from: g */
                public final boolean m6673g(String str) {
                    return this.f13837b.getOrDefault(str, null) != null;
                }

                /* JADX INFO: renamed from: h */
                public final void m6674h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
/* 3 */             this.f13837b.put(str, propertyValuesHolderArr);
                }

                public final int hashCode() {
/* 3 */             return this.f13836a.hashCode();
                }

                public final String toString() {
/* 48 */            return "\n" + mk1.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f13836a + "}\n";
                }
            }
